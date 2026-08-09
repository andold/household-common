# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 프로젝트 개요

가계부([household](https://github.com/andold/household)) 프로젝트의 공통 도메인 모듈. `kr.andold:utils`와 함께 Maven으로 빌드되어 GitHub Packages(`andold/household-common`)에 발행되는 라이브러리이며, 단독 실행 애플리케이션이 아니다.

## 빌드 / 테스트 명령

```bash
mvn compile           # 컴파일
mvn test               # 전체 테스트 실행
mvn test -Dtest=ShinhanCardParserTest         # 클래스 단위 테스트
mvn test -Dtest=ShinhanCardParserTest#testXxx # 메서드 단위 테스트
mvn install            # 로컬 .m2 저장소에 설치
mvn deploy              # GitHub Packages에 발행 (deploy.bat / deploy.sh)
```

- Java 21, Maven 기반. Lombok(`provided` scope)을 사용하므로 어노테이션 프로세싱이 필요하다.
- `kr.andold:utils` 의존성은 GitHub Packages(`https://maven.pkg.github.com/andold/utils`)에서 resolve된다. 로컬 `~/.m2/settings.xml`에 `github` 프로파일(저장소) + `github` 서버 자격증명(GitHub 사용자명 + PAT)이 설정되어 있지 않으면 빌드 자체가 실패한다. 설정 예시는 README.md 참고.

## 아키텍처

### 패키지 구조 (household 본체에서 그대로 이식)

- `kr.andold.household.entity` — JPA 엔티티(`Account`, `Category`, `Statement`, `StatsData`, `StatsTitle`). DB 매핑 전용, `jakarta.persistence` 어노테이션 사용.
- `kr.andold.household.domain` — 파싱 결과/enum 등 보조 도메인 클래스(`AccountParsed`, `AccountType`, `ParserResult`, `Result`, `StatementParsed`, ...).
- `kr.andold.household.web` — 요청/응답 DTO. 엔티티를 `@SuperBuilder`로 상속·확장하는 `*Form` 클래스가 핵심 패턴이다 (예: `StatementForm extends Statement`, `AccountForm extends Account`). 이 Form 클래스들은 파싱 결과를 담는 정적 싱글턴/컬렉션을 갖는다: `AccountForm.ACCOUNT`, `StatementForm.STATEMENT`, `StatementForm.LIST_STATEMENT`. **이 정적 필드들은 테스트 간에 공유되는 전역 상태이므로 각 테스트 `@BeforeEach`에서 반드시 `LIST_STATEMENT.clear()` 등으로 초기화한다** (기존 테스트 패턴 참고).
- `kr.andold.household.antlr` — 은행/카드/증권/영수증 명세서 파싱용 ANTLR4 생성 Lexer/Parser/Listener/Visitor. **생성 코드이며 직접 수정하지 않는다.**
- `kr.andold.household.service.parser` — 파싱 서비스 계층. `HouseholdParserService`가 `producer`(발급기관명, 예: "신한은행", "국민은행") 문자열을 보고 어떤 ANTLR lexer/parser 조합을 실행할지 디스패치한다(`executeParser(content, producer)`). producer가 없거나 매칭되지 않으면 등록된 파서를 순서대로 시도해 첫 성공(`LIST_STATEMENT`에 결과가 쌓인 경우)을 채택하는 폴백 체인을 탄다. `HtmlParserService`는 Jsoup으로 HTML에서 파싱 대상 텍스트를 추출한다.

### ANTLR 문법과 생성 코드의 관계 (중요)

- 문법 소스는 `src/main/resources/antlr/*.g4`, 생성된 산출물은 `src/main/java/kr/andold/household/antlr/`에 위치한다.
- **`.g4`를 수정한 뒤에는 반드시 재생성한다.** Windows는 `antlr.bat`, Linux는 `antlr.sh`를 실행하며(출력 디렉터리를 비운 뒤 목록에 있는 문법을 전량 재생성), 둘 다 `src/main/resources/scripts/antlr-4.13.0-complete.jar`를 사용한다. 새 문법 파일을 추가/제거하면 **두 스크립트 모두**에 해당 라인을 반영해야 한다.
- `household`(본체, 애플리케이션)와 달리 이 저장소는 라이브러리이므로 생성된 `kr.andold.household.antlr` 산출물을 `.gitignore`하지 않고 그대로 커밋한다 — 클론 직후 코드 생성 없이 바로 빌드 가능해야 하기 때문.
- `src/main/resources/antlr/`에는 `antlr.bat`/`antlr.sh` 생성 목록에 없는 문법 파일(`Etc.g4`, `Hyundai.g4`, `Kookmin.g4`)이 존재한다 — 이들은 전용 생성 파서가 없고, `Household.g4`가 ANTLR `import`로 끌어와 `HouseholdLexer`/`HouseholdParser`에 병합되거나 `HouseholdParserService`의 폴백 체인 파서로 처리된다. 대응하는 테스트(`EtcTest`, `HyundaiTest`, `KookminTest`)도 전용 Lexer/Parser가 아니라 `HouseholdParserService.testHtmlFile/testTextFile`을 통해 검증한다.
- `Common.g4`는 여러 문법이 공유하는 공통 규칙을 담은 문법으로, 개별 문법 재생성 시 함께 참조된다.

### 파서 테스트 패턴

- 테스트는 `src/test/java/kr/andold/household/antlr/`에 있고, 은행/카드/증권/영수증별 샘플 픽스처(HTML/텍스트/엑셀)는 `src/test/resources/samples-*/`에 있다.
- 새 명세서 포맷을 추가할 때는 이 저장소에 **문법(`.g4`) + 샘플 픽스처 + 테스트 클래스**를 함께 추가하고, 전용 파서를 만드는 경우 `antlr.bat`/`antlr.sh`와 `HouseholdParserService`의 producer 스위치에도 등록한다.
- 테스트는 `HouseholdParserService.testHtmlFile(filename[, producer])` / `testTextFile(...)` / `testExcelFile(...)`를 호출해 파싱을 실행하고, 결과는 정적 `StatementForm.LIST_STATEMENT`에 누적되므로 `assertEquals(expectedCount, LIST_STATEMENT.size())` 형태로 검증한다.

### 로깅 관례

`kr.andold.utils.Utility`(외부 `utils` 라이브러리)의 `Utility.indentStart()/indentMiddle()/indentEnd()`를 사용해 메서드 진입/중간/종료 시점을 트레이스 로그로 남기는 관례가 서비스 계층 전반에 일관되게 쓰인다. 새 서비스 메서드를 추가할 때 기존 메서드(`HouseholdParserService` 등)의 로깅 스타일을 따른다.

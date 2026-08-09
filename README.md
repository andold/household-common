# household-common

가계부([household](https://github.com/andold/household)) 프로젝트의 공통 도메인 모듈. `kr.andold:utils`와 동일하게 Maven으로 빌드하여 GitHub Packages에 발행한다.

## 포함 클래스

패키지 경로는 `household` 본체에서 쓰던 것을 그대로 유지한다 (`kr.andold.household.entity`, `kr.andold.household.domain`).

- `kr.andold.household.entity` — JPA 엔티티: `Account`, `Category`, `Statement`, `StatsData`, `StatsTitle`
- `kr.andold.household.domain` — 파싱 결과/enum 등 보조 도메인 클래스: `AccountParsed`, `AccountType`, `MultipleDateEditor`, `ParserResult`, `Result`, `StatementParsed`, `StatsTitleDataResponse`
- `kr.andold.household.web` — 요청/응답 DTO: `AccountForm`, `CategoryForm`, `HouseholdParam`, `StatementForm`, `StatementSearchRequest`, `StatsTitleDataForm`
- `kr.andold.household.antlr` — 은행/카드/증권/영수증 명세서 파싱용 ANTLR4 생성 Lexer/Parser/Listener/Visitor (문법 소스는 `src/main/resources/antlr/*.g4`)
- `kr.andold.household.service.parser` — `HouseholdV2ParserService`(producer 문자열 기준 ANTLR lexer/parser 디스패치), `HtmlParserService`(Jsoup 기반 HTML → 텍스트 추출)

## ANTLR 파서 재생성

문법 소스는 `src/main/resources/antlr/*.g4`에 있으며, 생성된 lexer/parser/visitor는 `src/main/java/kr/andold/household/antlr/`에 있다. **생성된 `*.java`/`.tokens`/`.interp` 파일을 직접 수정하지 말고**, `.g4` 문법을 수정한 뒤 재생성한다. Windows에서는 `antlr.bat`을, Linux에서는 `antlr.sh`를 실행한다(둘 다 출력 디렉터리를 비운 뒤 전체 재생성). 두 스크립트 모두 `antlr-4.13.0-complete.jar`(`src/main/resources/scripts/`에 번들됨)를 래핑한다.

`household`와 달리 이 저장소는 라이브러리이므로, 재생성한 `kr.andold.household.antlr` 패키지 산출물은 (gitignore하지 않고) 그대로 git에 커밋한다 — 클론 직후 별도 코드 생성 없이 바로 빌드할 수 있어야 하기 때문이다. 새 문법 파일을 추가하면 두 스크립트 모두에 해당 생성 라인을 추가한다.

## 테스트

ANTLR 파서/`HouseholdV2ParserService`/`HtmlParserService`에 대한 테스트는 `src/test/java/kr/andold/household/antlr/` 아래에 있으며, 픽스처(은행/카드/증권/영수증 샘플 HTML/텍스트/엑셀 파일)는 `src/test/resources/samples-*/`에 있다. `mvn test`로 실행한다. 새 소스 포맷을 추가할 때는 이 저장소에 문법(`.g4`) + 픽스처 + 테스트 클래스를 함께 추가한다.

## 빌드 / 발행

```bash
mvn compile      # 컴파일
mvn install      # 로컬 .m2 저장소에 설치
mvn deploy       # GitHub Packages(andold/household-common)에 발행 — deploy.bat / deploy.sh 참고
```

GitHub Packages 인증은 `~/.m2/settings.xml`의 `github` 서버 설정을 사용한다.

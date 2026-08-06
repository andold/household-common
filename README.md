# household-common

가계부([household](https://github.com/andold/household)) 프로젝트의 공통 도메인 모듈. `kr.andold:utils`와 동일하게 Maven으로 빌드하여 GitHub Packages에 발행한다.

## 포함 클래스

패키지 경로는 `household` 본체에서 쓰던 것을 그대로 유지한다 (`kr.andold.household.entity`, `kr.andold.household.domain`).

- `kr.andold.household.entity` — JPA 엔티티: `Account`, `Category`, `Statement`, `StatsData`, `StatsTitle`
- `kr.andold.household.domain` — 파싱 결과/enum 등 보조 도메인 클래스: `AccountParsed`, `AccountType`, `MultipleDateEditor`, `ParserResult`, `Result`, `StatementParsed`, `StatsTitleDataResponse`

## 빌드 / 발행

```bash
mvn compile      # 컴파일
mvn install      # 로컬 .m2 저장소에 설치
mvn deploy       # GitHub Packages(andold/household-common)에 발행 — deploy.bat / deploy.sh 참고
```

GitHub Packages 인증은 `~/.m2/settings.xml`의 `github` 서버 설정을 사용한다.

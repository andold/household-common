
SET FILE_NAME_ANTLR_JAR=%CD%\src\main\resources\scripts\antlr-4.13.0-complete.jar
SET PACKAGE_ANTLR4=kr.andold.household.antlr
SET INPUT_DIR=%CD%\src\main\resources\antlr
SET OUTPUT_DIR=%CD%\src\main\java\kr\andold\household\antlr


TIME /T


DEL /Q %OUTPUT_DIR%\*


java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\Household.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\Naver.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\KoreaInvest.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\ShinhanInvest.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\ShinhanCard.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\Hana.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\Receipt.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\Kdb.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\ShinhanBank.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\SamsungInsure.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\JbBank.g4

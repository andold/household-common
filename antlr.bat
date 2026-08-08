
SET FILE_NAME_ANTLR_JAR=%CD%\src\main\resources\scripts\antlr-4.13.0-complete.jar
SET PACKAGE_ANTLR4=kr.andold.household.antlr
SET INPUT_DIR=%CD%\src\main\resources\antlr
SET OUTPUT_DIR=%CD%\src\main\java\kr\andold\household\antlr


TIME /T


DEL /Q %OUTPUT_DIR%\*


java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\HouseholdV2.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\NaverV2.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\KoreaInvest.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\ShinhanInvest.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\ShinhanCard.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\HanaV2.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\ReceiptV2.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\KdbV2.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\ShinhanBank.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\SamsungInsure.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR4% -visitor -o %OUTPUT_DIR% %INPUT_DIR%\JbBank.g4

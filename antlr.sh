#!/bin/bash
#
#
HOME_DIR=/home/andold
SOURCE_DIR=$HOME_DIR/eclipse-workspace/household-common
FILE_NAME_ANTLR_JAR=$SOURCE_DIR/src/main/resources/scripts/antlr-4.13.0-complete.jar
PACKAGE_ANTLR4=kr.andold.household.antlr
PATH_ANTLR4=$SOURCE_DIR/src/main/java/kr/andold/household/antlr
#
rm -f $PATH_ANTLR4/*
#
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/HouseholdV2.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/NaverV2.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/KoreaInvest.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/ShinhanInvest.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/ShinhanCard.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/HanaV2.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/ReceiptV2.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/KdbV2.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/ShinhanBank.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/SamsungInsure.g4
java -jar $FILE_NAME_ANTLR_JAR -encoding UTF8 -package $PACKAGE_ANTLR4 -visitor -o $PATH_ANTLR4 $SOURCE_DIR/src/main/resources/antlr/JbBank.g4

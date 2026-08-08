/**
 * 신한카드
 */
grammar ShinhanCard;
import	CommonV2;

@header {
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.utils.Utility;
import kr.andold.household.web.StatementForm;
}

@members	{
	private final Logger log = LoggerFactory.getLogger(getClass());

	private final AccountForm ACCOUNT = AccountForm.ACCOUNT;
	private final List<StatementForm> LIST_STATEMENT = StatementForm.LIST_STATEMENT;
	private final StatementForm STATEMENT = StatementForm.STATEMENT;
}

shinhanCardDocument
	:	trafficBus	//	신한카드 > 마이 > 교통카드 이용내역 > 지하철 버스
	;



//	신한카드 > 마이 > 교통카드 이용내역 > 지하철 버스
trafficBus:
	line+

	WORD NUMBER WORD										NEWLINE		//	총 3 건 
	(
		WORD onplace=word onplace1=word? onplace2=word? onplace3=word? onplace4=word? onplace5=word? onplace6=word? onplace7=word* DATE geton=TIME			NEWLINE
				//	출발지: 정자사거리 2024.06.16 14:43 
		WORD offplace=word? offplace1=word? offplace2=word? offplace3=word? offplace4=word? offplace5=word? offplace6=word? offplace7=word* getoff=TIME?	NEWLINE
				//	도착지: 경남아너스빌.서 14:52 
		ttype=word bname=word? bname1=word? bname2=word? bname3=word? bname4=word? bname5=word? bname6=word? bname7=word*									NEWLINE
				//	버스 310번 
				//	지하철 
		word+ outcome=NUMBER WORD						NEWLINE		//	본인 마스터 카드 969 1,450 원 
		{	
			log.info("{} 신한카드...지하철 버스(『{} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {} {}』 『{}』)"
				, Utility.indentMiddle()
				, $DATE.text, $geton.text, $getoff.text
				, $onplace.text, $onplace1.text, $onplace2.text, $onplace3.text, $onplace4.text, $onplace5.text, $onplace6.text, $onplace7.text
				, $offplace.text, $offplace1.text, $offplace2.text, $offplace3.text, $offplace4.text, $offplace5.text, $offplace6.text, $offplace7.text
				, $ttype.text, $bname.text, $bname1.text, $bname2.text, $bname3.text, $bname4.text, $bname5.text, $bname6.text, $bname7.text
				, $outcome.text);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, $getoff.text == null ? $geton.text : $getoff.text);
			statement.setTitle($ttype.text
					, $bname.text, $bname1.text, $bname2.text, $bname3.text, $bname4.text, $bname5.text, $bname6.text, $bname7.text
					, $offplace.text, $offplace1.text, $offplace2.text, $offplace3.text, $offplace4.text, $offplace5.text, $offplace6.text, $offplace7.text
					, "⇦"
					, $onplace.text, $onplace1.text, $onplace2.text, $onplace3.text, $onplace4.text, $onplace5.text, $onplace6.text, $onplace7.text);
			statement.setDescription($geton.text);
			statement.setOutcome($outcome.text);
			statement.setCategoryName("분류.지출.교통/차량.대중교통비");
		}
	)+
	WORD WORD										NEWLINE		//	인쇄 엑셀저장 

	eof
{
	log.info("{} 신한카드 > 마이 > 교통카드 이용내역 > 지하철 버스", Utility.indentMiddle());

	ACCOUNT.setProducer("신한카드");
	ACCOUNT.setNumber("신한 교통카드");

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};

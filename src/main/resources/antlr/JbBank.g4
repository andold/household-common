/**
 * 전북은행 문법
 */
grammar JbBank;
import	Common;

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

/**
 * 전북은행
 */
jbBankDocument
	:	jbOrdinary		//	보통예금 HTML
	|	jbFixedDeposite	//	정기예금 EXCEL
	;


//	보통예금
jbOrdinary:
	line+

	KEYWORD TAB bnumber=WORD WORD TAB WORD TAB WORD word+ TAB		NEWLINE
			//	계좌번호 	 1021-02-2178282 계좌상세 	 계좌명 	 JB 주거래통장(저축) 	 

	line+

	WORD					NEWLINE		//	거래일자 
	WORD					NEWLINE		//	거래시간 
	WORD					NEWLINE		//	출금금액 
	WORD					NEWLINE		//	입금금액 
	WORD					NEWLINE		//	거래후잔액 
	WORD					NEWLINE		//	적요 
	WORD					NEWLINE		//	메모 
	WORD					NEWLINE		//	취급은행(지점) 
	(
		DATE				NEWLINE		//	2024.09.28 			거래일자
		TIME				NEWLINE		//	01:30:58 			거래시간
		outcome=NUMBER		NEWLINE		//	0 					출금금액
		income=NUMBER		NEWLINE		//	2 					입금금액
		balance=NUMBER		NEWLINE		//	100,027 			거래후잔액
		title=word? title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE		//	결산이자 			적요
		memo=word? memo1=word? memo2=word? memo3=word? memo4=word? memo5=word? memo6=word? memo7=word*			NEWLINE		//	메모 				메모
		place=word? place1=word? place2=word? place3=word? place4=word? place5=word? place6=word? place7=word*	NEWLINE		//	전북(디지털고객부) 	취급은행(지점)
		{	
			log.info("{} 전북은행 보통예금(『{} {}』 『{} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
				, $DATE.text, $TIME.text
				, $outcome.text, $income.text, $balance.text
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $memo.text, $memo1.text, $memo2.text, $memo3.text, $memo4.text, $memo5.text, $memo6.text, $memo7.text
				, $place.text, $place1.text, $place2.text, $place3.text, $place4.text, $place5.text, $place6.text, $place7.text
			);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, $TIME.text);
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription(
				$memo.text, $memo1.text, $memo2.text, $memo3.text, $memo4.text, $memo5.text, $memo6.text, $memo7.text
				, $place.text, $place1.text, $place2.text, $place3.text, $place4.text, $place5.text, $place6.text, $place7.text
			);
			statement.setIncome($income.text);
			statement.setOutcome($outcome.text);
			statement.setBalance($balance.text);
			statement.setCategoryName("분류.수입.부수입.이자/배당금");
		}
	)+
	WORD					NEWLINE		//	인쇄/저장하기 
	WORD word+				NEWLINE		//	메모를 입력해 주세요 

	eof
{
	log.info("{} 전북은행 보통예금 『{}』", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("전북은행");
	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};



// 엑셀. 전북은행 > 조회 > 예금거래내역 > 거래내역조회 > 조회 > 인쇄/저장하기 > EXCEL 저장
jbFixedDeposite:
	line+

	TAB TAB TAB TAB TAB WORD WORD DATE TIME TAB TAB TAB		NEWLINE		//		 	 	 	 	 조회기준일시 : 2023.11.01 19:01:37 	 	 	 

	line+

	TAB WORD TAB TAB WORD TAB TAB KEYWORD TAB bnumber=WORD TAB TAB			NEWLINE		//		 예금주명 	 	 박영선 	 	 계좌번호 	 1024-02-1820890 	 	 

	line+

	TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//		 거래일자 	 거래시간 	 출금금액 	 입금금액 	 거래후잔액 	 적요 	 취급은행(지점) 	 
	jbFixedDepositeItem+
	TAB WORD WORD WORD WORD WORD WORD TAB TAB TAB TAB WORD WORD WORD WORD WORD WORD TAB TAB TAB		NEWLINE		//		 출금건수 : 0건 / 출금합계 :0원 	 	 	 	 입금건수 : 1건 / 입금합계 :50,000,000원 	 	 	 
{
	log.info("{} 전북은행 정기예금(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
jbFixedDepositeItem:
	TAB DATE TAB TIME TAB outcome=NUMBER TAB income=NUMBER TAB balance=NUMBER TAB
		title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		place=word place1=word? place2=word? place3=word? place4=word? place5=word? place6=word? place7=word* TAB		NEWLINE	
		//		 2023.11.01 	 18:51:07 	 0.000000 	 50000000.000000 	 50000000.000000 	 한투이체한도우회 	 한국(고객센터) 	 
{
	log.info("{} 전북은행 적요(『{} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』 『{} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $outcome.text, $income.text
		, $place.text, $place1.text, $place2.text, $place3.text, $place4.text, $place5.text, $place6.text, $place7.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($place.text, $place1.text, $place2.text, $place3.text, $place4.text, $place5.text, $place6.text, $place7.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};

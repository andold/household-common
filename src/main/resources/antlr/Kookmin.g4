/**
 * 국민은행 문법
 */
grammar Kookmin;

import	Common;

/**
 * 하나은행
 */
kookminDocument
	:	kookminGeneralDeposite
	;


/**
 * HTML. 국민은행 > 조회 > 계좌조회 > 예금 > 간편조회
 * @author andold
 * @since 2022-03-22
 */
kookminGeneralDeposite:
	line+

	KEYWORD TAB bankbookNumber=WORD word+ TAB	NEWLINE		//	계좌번호 	 079-21-0654-548 : KB종합통장-저축예금 	 

	line+

	(WORD TAB)+									NEWLINE
	//	거래일시 	 적요 	 보낸분/받는분 	 출금액(원) 	 입금액(원) 	 잔액(원) 	 송금메모 	 거래점 	 
	kookminGeneralDepositeItem+
	(NUMBER										NEWLINE)?	//	1 
	WORD WORD WORD word+						NEWLINE		//	저장 인쇄 목록 

	eof
{
	log.info("{} kookmin보통예금", Utility.indentMiddle());

	ACCOUNT.setProducer("국민은행");
	ACCOUNT.setNumber($bankbookNumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
kookminGeneralDepositeItem:
	NUMBER? TAB DATE TIME TAB title=word* TAB opposite=word* TAB outcome=word* TAB income=word* TAB balance=NUMBER TAB memo=word* TAB place=word+ TAB		NEWLINE		//	2022.03.21 19:53:24 	 지로출금 	 ＳＫＴＩＮＴＥＲＮＥＴ 	 30,340 	 0 	 140,617 	 	 수신상 	 
{	
	log.info("{} kookmin보통예금적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $DATE.text, $TIME.text, $title.text, $opposite.text, $outcome.text, $income.text, $balance.text, $memo.text, $place.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($opposite.text);
	statement.setDescription($title.text, $memo.text, $place.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};


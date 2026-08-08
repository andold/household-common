grammar EtcV2;

import	CommonV2;

/**
 * 기타
 */
etcDocument
	:	etcNextree
	|	etcApartnerMaintenaceFee
	;


// 아파트너 관리비 https://honors0455.aptner.com/fee/view/?year=2022&month=6
etcApartnerMaintenaceFee:
	line+
	WORD WORD year=WORD month=WORD title=WORD				NEWLINE		//	1402동 1001호 2022년 6월 관리비 
	WORD TAB WORD WORD TAB WORD WORD TAB WORD WORD TAB WORD TAB		NEWLINE		//	항목 	 당월 평균금액 	 당월 고지금액 	 전월 고지금액 	 증감액 	 
	WORD TAB mean=NUMBER WORD TAB total=NUMBER WORD TAB prev=NUMBER WORD TAB delta=NUMBER WORD TAB		NEWLINE		//	청구금액 	 363,072 원 	 352,850 원 	 331,470 원 	 21,380 원 	 
	WORD TAB NUMBER WORD TAB NUMBER WORD TAB NUMBER WORD TAB NUMBER WORD TAB		NEWLINE		//	당월부과액 	 363,072 원 	 352,850 원 	 331,470 원 	 21,380 원 	 
	
	etcApartnerMaintenaceFeeItem+
	WORD										NEWLINE		//	목록 

	eof
{
	log.info("{} 아파트너 관리비 - (『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle(), $year.text, $month.text, $title.text, $total.text, $delta.text);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("아파트관리비 (아파트너)");

	Calendar calendar = Calendar.getInstance();
	STATEMENT.setTime($year.text + $month.text, "1일");
	//	4월분은 5월말일에 나온다.
	calendar.setTime(STATEMENT.getTime());
	calendar.add(Calendar.MONTH, 2);
	calendar.add(Calendar.HOUR_OF_DAY, -1);
	STATEMENT.setTime(calendar.getTime());
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	
	STATEMENT.setDescription("관리비 명세서", $year.text, $month.text, "∴", $total.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("관리비 명세서", $year.text, $month.text, $total.text, $delta.text);
	statement.setDescription("관리비 명세서", $year.text, $month.text, $delta.text);
	statement.setIncome($total.text);
	statement.setOutcome(0);
};
etcApartnerMaintenaceFeeItem:
title=WORD title0=WORD? TAB other=NUMBER? WORD TAB current=NUMBER WORD TAB previous=NUMBER WORD TAB delta=NUMBER WORD TAB		NEWLINE		//	일반관리비 	 58,800 원 	 58,840 원 	 59,980 원 	 -1,140 원 	 
{
	log.info("{} 아파트너 관리비 적요 - (『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $title.text, $title0.text, $other.text, $current.text, $previous.text, $delta.text
	);

	if (($current.text == null || $current.text.equals("0")) && $previous.text.equals("0") && $delta.text.equals("0")) {
	} else {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($title.text, $title0.text);
		statement.setIncome(0);
		statement.setOutcome($current.text);
		statement.setCategoryName("분류.지출.주거/통신.관리비");
		statement.setDescription("전월보다: ", $delta.text, ", 남들은: ", $other.text);
	}
};


// HTML 넥스트리 급여명세서 2023-11-07 확인
etcNextree:
	line+

	WORD company=WORD WORD TAB WORD DATE TAB		NEWLINE		//	회사명 넥스트리 주식회사 	 지급일 2022.11.25 	 

	line+

	WORD+ TAB WORD+ TAB WORD+ TAB (WORD* TAB)+ 								NEWLINE		//	구분 	 임금항목 	 지급 금액 	 	 공제 항목 	 공제 금액 	 
	etcNextreeItem+
	TAB																		NEWLINE		//		 
	key1=WORD+ TAB value1=NUMBER TAB TAB key2=WORD+ TAB value2=NUMBER TAB	NEWLINE		//	지급총액 	 7,134,000 	 	 공제총액 	 1,398,850 	 
	key3=WORD+ value3=NUMBER WORD+											NEWLINE		//	실지급액 5,735,150 계산방법 

	eof
{
	log.info("{} 넥스트리({}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle(), $key1.text, $value1.text, $key2.text, $value2.text, $key3.text, $value3.text);

	ACCOUNT.setProducer("넥스트리컨설팅㈜");
	ACCOUNT.setNumber("넥스트리컨설팅㈜ 급여명세서");

	STATEMENT.setTime($DATE.text, "00:00:00");
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription($DATE.text, $company.text, $key1.text, $value1.text, $key2.text, $value2.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($company.text, $key3.text);
	statement.setOutcome($value3.text);
	statement.setCategoryName("분류.지출.이체/대체.기타");
};
etcNextreeItem:
WORD* TAB key1=WORD* TAB value1=NUMBER? TAB TAB key2=WORD* TAB value2=NUMBER? TAB		NEWLINE
		//	매월 	 기본급 	 4,846,229 	 	 국민연금 	 235,800 	 
{	
	log.info("{} 넥스트리 적요(『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $key1.text, $value1.text, $key2.text, $value2.text);

	if ($key1.text != null) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($key1.text);
		statement.setIncome($value1.text);
		statement.setCategoryName("분류.수입.주수입.급여");
	}

	if ($key2.text != null) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($key2.text);
		statement.setOutcome($value2.text);
		statement.setCategoryName("분류.지출.세금/이자.세금");
	}
};


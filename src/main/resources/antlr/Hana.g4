/**
 * 하나은행 문법
 */
grammar Hana;

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
 * 하나은행
 */
hanaDocument
	:	hanaISACloseBill	//	ISA 해지계산서
	|	hanaFixedExpire		//	정기예금 해지계산서
	|	hanaIsa				//	ISA :: 하나은행 > 저축예금 > 거래내역조회
	|	hanaRsp				//	연금저축 :: 하나은행 > 저축예금 > 거래내역조회	estimated	appraisement
	|	hanaGeneralDeposite	//	보통예금
	|	hanaFixedDeposite	//	정기예금
	|	hanaExpiredAccount	//	해지계좌거래내역
	|	hanaBusCard			//	버스카드
	|	hanaExpireBill		//	해지계좌조회
	;


// HTML. 하나은행 > ... > 해지계좌조회 > 해지계산서(ISA)
hanaISACloseBill:
	line+

	WORD TAB WORD WORD TAB KEYWORD TAB bnumber=WORD TAB									NEWLINE		//	상품명 	 하나 개인종합자산관리계좌(ISA) 	 계좌번호 	 253-910146-53452 	 
	WORD TAB open=DATE TAB WORD TAB close=DATE TAB WORD TAB act=DATE TAB				NEWLINE		//	신규일자 	 2023-07-25 	 만기일자 	 2028-07-25 	 해지일자 	 2024-08-13 	 
	WORD TAB origin=NUMBER WORD TAB WORD TAB NUMBER WORD TAB WORD TAB NUMBER WORD TAB	NEWLINE		//	해지원금 	 20,000,000 원 	 신탁이익합계 	 877,430 원 	 세후신탁이익 	 877,430 원 	 
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		balance=NUMBER WORD TAB WORD TAB NUMBER WORD TAB								NEWLINE		//	해지후 받으시는 금액 	 20,877,430 원 	 공제세금 	 0 원 	 

	eof
{
	log.info("{} 하나은행 ISA 해지계산서(『{}』『{} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
		, $bnumber.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
	);

	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setTime($act.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($act.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($open.text, "~", $close.text);
	statement.setOutcome($balance.text);
	statement.setCategoryName("분류.지출.이체/대체.기타");
};


// HTML. 하나은행 > ... > 해지계좌조회 > 해지계산서
hanaFixedExpire:
	line+

	WORD TAB WORD TAB KEYWORD TAB bnumber=WORD TAB		NEWLINE		//	성명 	 박영선 	 계좌번호 	 455-910254-70111 	 

	line+

	WORD TAB DATE TAB WORD TAB DATE TAB WORD TAB date=DATE TAB									NEWLINE		//	신규일자 	 2022-08-04 	 만기일자 	 2023-08-04 	 해지일자 	 2023-08-04 	 
	WORD TAB NUMBER WORD TAB intitle=WORD TAB income=NUMBER WORD TAB WORD TAB NUMBER WORD TAB	NEWLINE		//	해지원금 	 16,000,000 원 	 이자합계 	 528,000 원 	 세후이자 	 446,690 원 	 
	WORD WORD WORD TAB balance=NUMBER WORD TAB outtitle=WORD TAB outcome=NUMBER WORD TAB		NEWLINE		//	해지후 받으신 금액 	 16,446,690 원 	 공제세금 	 81,310 원 	 

	eof
{
	log.info("{} 하나은행 정기예금 해지계산서(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setTime($date.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($intitle.text);
	statement.setIncome($income.text);
	statement.setCategoryName("분류.수입.부수입.이자/배당금");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($outtitle.text);
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.세금/이자.세금");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("해지");
	statement.setOutcome($balance.text);
	statement.setCategoryName("분류.지출.이체/대체.기타");
};


// HTML. 하나은행 > 저축예금 > 거래내역조회
hanaIsa:
	line+

	WORD WORD bnumber=WORD					NEWLINE		//	신탁형 ISA 253-910146-53452 
	KEYWORD word+							NEWLINE		//	이체가능금액 10,000원 현재잔액 10,000원 해지예상 더보기 

	line+

	WORD TAB (WORD TAB)+					NEWLINE		//	거래일시 	 구분 	 적요 	 출금액 	 입금액 	 잔액 	 거래점 	 
	KEYWORD TAB TAB WORD NUMBER TAB TAB		NEWLINE		//	합계 	 	 + 10,000 	 	 

	hanaIsaItem+

	WORD word+								NEWLINE		//	계좌내역 다운로드 인쇄하기 전체인쇄하기 

	eof
{
	log.info("{} 하나은행 ISA(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
hanaIsaItem:
	DATE TIME TAB
		type=word* TAB
		title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		WORD? outcome=NUMBER? TAB
		WORD? income=NUMBER? TAB
		balance=NUMBER TAB
		place=word* TAB						NEWLINE
		//	2023-07-25 12:40:16 	 연동대체 	 37489000016605 	 	 + 10,000 	 10,000 	 	 
{
	log.info("{} 하나은행 ISA 적요(『{} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』 『{} {}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $outcome.text, $income.text
		, $type.text, $place.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($place.text, $type.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};


// HTML. 하나은행 > 저축예금 > 거래내역조회	estimated	appraisement
hanaRsp:
	line+

	KEYWORD bnumber=WORD											NEWLINE		//	계좌번호 455-910002-07512 
	WORD key1=WORD value1=NUMBER WORD key2=WORD value2=NUMBER WORD	NEWLINE		//	연금계좌 평가금액 0 원 투자원금 0 원 

	line+

	WORD WORD WORD DATE WORD DATE									NEWLINE
		//	거래내역 조회기간 : 2023-05-03 ~ 2023-08-02 
	WORD TAB WORD TAB WORD TAB (WORD+ TAB)+							NEWLINE
		//	거래일시 	 거래내역 	 적요 	 출금(환매신청) 금액(원) 	 입금(매입신청) 금액(원) 	 거래점 	 
	((
		WORD WORD WORD WORD TAB										NEWLINE		//	조회기간 내 거래내역이 없습니다. 	 
	) | (
		hanaRspItem+
	))
	WORD WORD WORD+													NEWLINE		//	계좌내역 다운로드 인쇄하기 전체인쇄하기 

	eof
{
	log.info("{} 하나은행 연금계좌(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance($value2.text);
	STATEMENT.setDescription("");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime(Calendar.getInstance().getTime());
	statement.setTitle($key1.text, $key2.text, $value2.text);
	statement.setIncome(0);
	statement.setBalance($value1.text);
	statement.setDescription("");
	statement.setCategoryName("분류.수입.저축/보험.기타");
};
hanaRspItem:
	DATE TIME TAB type=WORD TAB
		title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		outcome=NUMBER? TAB
		income=NUMBER? TAB
		place=WORD TAB										NEWLINE
		//	2023-06-11 15:05 	 계좌신규 	 연금저축계좌 신규되었습니다. 	 	 0 	 분당금융센터 	 
	(TAB stype=WORD TAB
		secondary=word secondary1=word? secondary2=word? secondary3=word? secondary4=word? secondary5=word? secondary6=word? secondary7=word* TAB
		soutcome=NUMBER? TAB sincome=NUMBER? TAB WORD TAB			NEWLINE
	)?
		//		 입금 	 박영선 	 	 6,000,000 	 분당금융센터 	 
{
	log.info("{} 하나은행 연금계좌 거래내역(『{} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』 『{} {}』 『{} {} {}』 『{} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $outcome.text, $income.text
		, $type.text, $place.text
		, $stype.text, $sincome.text, $soutcome.text
		, $secondary.text, $secondary1.text, $secondary2.text, $secondary3.text, $secondary4.text, $secondary5.text, $secondary6.text, $secondary7.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($type.text, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($place.text);
	statement.setIncome(0);
	statement.setOutcome(0);
	statement.setBalance($income.text, $outcome.text);
	statement.setCategoryName("분류.수입.저축/보험.기타");

	if ($secondary.text != null) {
		statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text, $TIME.text);
		statement.setTitle($type.text, $stype.text, $secondary.text, $secondary1.text, $secondary2.text, $secondary3.text, $secondary4.text, $secondary5.text, $secondary6.text, $secondary7.text);
		statement.setDescription($place.text);
		statement.setIncome(0);
		statement.setOutcome(0);
		statement.setBalance($sincome.text, $soutcome.text);
		statement.setCategoryName("분류.수입.저축/보험.기타");
	}
};


/**
 * HTML. 하나은행 > 조회 > 해지계좌 조회 > 해지계좌조회 > 해지계좌조회
 */
hanaExpireBill:
title=WORD														NEWLINE		//	해지계산서 
WORD TAB owner=WORD TAB WORD TAB hnumber=WORD+ TAB							NEWLINE		//	성명 	 박영선 	 계좌번호 	 455-910213-30911 	 
WORD TAB WORD+ TAB										NEWLINE		//	상품명 	 e-플러스 정기예금 	 
WORD TAB DATE TAB WORD TAB DATE TAB WORD TAB expire=DATE TAB		NEWLINE		//	신규일자 	 2019-08-01 	 만기일자 	 2022-08-01 	 해지일자 	 2022-08-01 	 
WORD TAB base=NUMBER WORD TAB key3=WORD+ TAB value3=NUMBER WORD TAB WORD TAB NUMBER WORD TAB		NEWLINE		//	해지원금 	 25,000,000 원 	 이자합계 	 1,201,095 원 	 세후이자 	 1,016,135 원 	 
key1=WORD+ TAB value1=NUMBER WORD TAB key2=WORD+ TAB value2=NUMBER WORD TAB						NEWLINE		//	해지후 받으신 금액 	 26,016,135 원 	 공제세금 	 184,960 원 	 
eof
{
	log.info("{} hana해지계산서()", Utility.indentMiddle());

	ACCOUNT.setProducer("하나은행");
	ACCOUNT.setNumber($hnumber.text);
	ACCOUNT.setOwner($owner.text);

	STATEMENT.setTime($expire.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription($title.text, $owner.text, $hnumber.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title.text, $key3.text);
	statement.setIncome($value3.text);
	statement.setBalance($value1.text);
	statement.setCategoryName("분류.수입.부수입.이자/배당금");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title.text, $key2.text);
	statement.setOutcome($value2.text);
	statement.setBalance($value1.text);
	statement.setCategoryName("분류.지출.세금/이자.세금");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($expire.text, "00:01");
	statement.setTitle($title.text, $key1.text);
	statement.setOutcome($value1.text);
	statement.setBalance(0);
	statement.setCategoryName("분류.지출.이체/대체.기타");
};



/**
 * HTML. 하나카드 > 마이페이지 > 이용내역 > 교통후불하이패스이용내역 > 버스
 * @author andold
 * @since 2022-03-11
 */
hanaBusCard
:
	line+

	WORD NUMBER WORD KEYWORD NUMBER WORD+	NEWLINE		//	건수 4 건 합계 5,400 원 2022.03.05~2022.03.11 인쇄 엑셀 다운로드 
	hanaBusCardItem+
	(WORD									NEWLINE)?	//	더보기 
	WORD WORD WORD WORD WORD				NEWLINE		//	교통 · 후불하이패스 이용내역 안내 

	eof
{
	log.info("{} hana카드버스()", Utility.indentMiddle());

	ACCOUNT.setProducer("하나카드");
	ACCOUNT.setNumber("하나 교통카드");

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
hanaBusCardItem:
((
	date=DATE key1=WORD value1=DATE who=WORD departure=word+ geton=TIME arrival=word+ getoff=TIME	NEWLINE	//	2022.03.07 결제예정일자 2022.03.27 본인0274 판교퍼스트힐푸르 08:18:25 → SK플래닛.판교디 08:31:31
) | (
	date=DATE key1=WORD geton=TIME										NEWLINE		//	2022.07.27 V274본인 08:20:22 
))
	bus=word+																						NEWLINE	//	73 
	outcome=word+																					NEWLINE	//	1,350 원 
{	
	log.info("{} hana카드버스적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $date.text, $key1.text, $value1.text, $who.text, $departure.text, $geton.text, $arrival.text
		, $getoff.text, $bus.text, $outcome.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($date.text, $getoff.text == null ? $geton.text : $getoff.text);
	statement.setTitle($bus.text, $departure.text, $geton.text, $arrival.text, $getoff.text);
	statement.setDescription($who.text, $key1.text, $value1.text);
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.교통/차량.대중교통비");
};


/**
 * HTML. 하나은행 > 조회 > 해지계좌조회 > 해지계좌거래내역
 * @author andold
 * @since 2022-03-10
 */
hanaExpiredAccount:
	//	해지계좌
	line+

	(word+ TAB)+						NEWLINE		//	거래일자 	 구분 	 적요 	 입금액 	 출금액 	 잔액 	 거래시간 	 거래점 	 
	KEYWORD TAB word+ TAB word+ TAB TAB	NEWLINE		//	합계 	 161,639 	 4,161,639
	hanaExpiredAccountItem+ 	 	 

	eof
{
	log.info("{} hana해지계좌(『{}』)", Utility.indentMiddle(), "");

	ACCOUNT.setProducer("하나은행");

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
hanaExpiredAccountItem:
	DATE TAB type=word* TAB subject=word* TAB income=word* TAB outcome=word* TAB balance=NUMBER? TAB TIME TAB place=word+ TAB	NEWLINE		//	2008-05-13 	 예금이자 	 해지 	 161,639 	 	 4,161,639 	 15:50 	 서현역 	 
	{	
	log.info("{} hana해지계좌(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $DATE.text, $TIME.text, $type.text, $outcome.text, $income.text, $balance.text, $subject.text, $place.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($subject.text, $type.text);
	statement.setDescription($place.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};


/**
 * HTML. 하나은행 > 정기예금 > 거래내역조회
 * @author andold
 * @since 2022-03-10
 */
hanaFixedDeposite:
	//	정기예금
	line+

	WORD bankbookNumber=word+				NEWLINE		//	고단위－금리확정형 455-91 0223 -24111 
	KEYWORD WORD WORD WORD WORD WORD		NEWLINE		//	이체가능금액 15,357,437원 현재잔액 15,357,437원 해지예상 더보기 

	line+

	KEYWORD TAB TAB word* TAB TAB			NEWLINE		//	합계 	 	 + 179,777 	 	 
	hanaFixedDepositeItem+
	WORD+									NEWLINE		//	계좌내역 다운로드 인쇄하기 전체인쇄하기 
	
	eof
{
	log.info("{} hana정기예금(『{}』)", Utility.indentMiddle(), $bankbookNumber.text);

	ACCOUNT.setNumber($bankbookNumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
hanaFixedDepositeItem:
	DATE TIME TAB
		type=word* TAB
		subject=word* TAB
		outcome=word* TAB
		income=word* TAB
		balance=NUMBER? TAB
		place=word+ TAB					NEWLINE
	//	2021-03-03 03:16 	 예금이자 	 	 	 + 177,660 	 15,177,660 	 분당금융센터
{	
	log.info("{} hana정기예금 적요(『{} {}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $type.text, $outcome.text, $income.text, $balance.text, $subject.text, $place.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($subject.text, $type.text);
	statement.setDescription($place.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};


// HTML. 하나은행 > 보통예금 > 거래내역조회
hanaGeneralDeposite:
	line+

	WORD+ bnumber=WORD						NEWLINE		//	보통예금 374-890000-16605(구) 304-13-00300-4
	//WORD WORD								NEWLINE		//	보통예금 413-910095-78607 
	KEYWORD WORD WORD WORD+					NEWLINE		//	이체가능금액 9,320,726원 현재잔액 9,325,323원

	line+

	WORD TAB (WORD TAB)+					NEWLINE
			//	거래일시 	 구분 	 적요 	 출금액 	 입금액 	 잔액 	 거래점 	 
	hanaGeneralDepositeItem+
	KEYWORD TAB word+ TAB word* TAB TAB+		NEWLINE
			//	합계 	 - 282,704 	 + 100,000

	eof
{
	log.info("{} 하나은행 보통예금(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
hanaGeneralDepositeItem:
	DATE TIME TAB type=word* TAB title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE?
	TAB (WORD outcome=word)? TAB income=word* TAB balance=word* TAB place=word+ TAB											NEWLINE		//	2022-02-28 14:32:31 	 체크카드 	 태영홈마트 	 - 5,000 	 	 9,325,323 	 자금결제섹션
{
	log.info("{} hana보통예금적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(),
		$DATE.text, $TIME.text, $type.text, $outcome.text, $income.text, $balance.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $place.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	if (null == $title1.text) {
		statement.setTitle($type.text);
		statement.setDescription($place.text);
	} else {
		statement.setTitle($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
		statement.setDescription($place.text, $type.text);
	}
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
	statement.setCategoryName("분류.지출.생활용품.기타");

	if ("연금".equals($type.text)) {
		statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text, $TIME.text);
		if (null == $title1.text) {
			statement.setTitle($type.text);
			statement.setDescription($place.text);
		} else {
			statement.setTitle($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription($place.text, $type.text);
		}
		statement.setIncome(0);
		statement.setOutcome(0);
		statement.setBalance($balance.text);
		statement.setCategoryName("분류.수입.저축/보험.기타");
	}

};

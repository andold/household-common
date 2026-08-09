/**
 * 산업은행 문법
 */
grammar Kdb;

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
 * 산업은행
 */
kdbDocument
	:	kdbInstallmentSavingHelper	// 적금 거래내역조회 Helper Raw-HTML
	|	kdbGeneralDepositeByHelper	// 보통예금 거래내역조회 Helper Raw-HTML
	|	kdbGeneralDeposite			// 보통예금
	|	kdbGeneralDepositeExcel		// 보통예금 엑셀
	|	kdbFixedDepositeExcel		// 정기예금 엑셀
	|	kdbExpireFixedDeposite		// 정기예금 해지 자동 예치?
	|	kdbEarlyExpireFixedDeposite	// 정기예금 중도해지
	|	kdbInstallmentSaving		// 적금 엑셀, 산업은행 > 조회 > 거래내역조회 > 적금 > 인쇄 및 저장 > 엑셀
	|	kdbInstallmentSavingHtml	// 적금 html, 산업은행 > 조회 > 거래내역조회 > 적금 > 인쇄 및 저장 > 화면 복붙
	|	kdbFixedDepositeClosed		// 정기예금 해지상세정보, 조회 > 계좌조회 > 해지계좌조회 > 상세 > ctrl-s 저장(해지상세정보, 크롬)
	;


//	적금 거래내역조회 Helper Raw-HTML
kdbInstallmentSavingHelper:
	line+

	KEYWORD TAB WORD TAB WORD TAB									NEWLINE		//	계좌번호 	 신규일 	 만기일 	 
	bnumber=WORD TAB DATE TAB DATE TAB								NEWLINE		//	032-9203-8146-862 	 2022.11.16 	 2025.11.16 	 

	line+

	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE
			//	거래일시 	 거래구분/적요 	 출금(원) 	 입금(원) 	 잔액(원) 	 거래점 	 금리 	 
	(
		date=DATE time=TIME TAB
			title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
			outcome=NUMBER TAB
			income=NUMBER TAB
			balance=NUMBER TAB
			place=WORD TAB
			interest=WORD TAB										NEWLINE
					//	2024.09.25 12:40 	 정기적립금/ 02050135082862 	 0 	 250,000 	 39,250,000 	 분당지점 	 5.64% 	 
		{
			log.info("{} 산업은행 보통예금 적요(『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {}』『{} {}』)", Utility.indentMiddle()
				, $date.text, $time.text
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $income.text, $outcome.text, $balance.text
				, $place.text, $interest.text
			);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($date.text, $time.text);
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setIncome($income.text);
			statement.setOutcome($outcome.text);
			statement.setBalance($balance.text);
			statement.setDescription($place.text, $interest.text);
		}
	)+
	WORD word+									NEWLINE
			//	첫 페이지로 이동 이전 페이지로 이동 1 현재 선택된 페이지 다음 페이지로 이동 마지막 페이지로 이동 

	eof
{
	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};


//	보통예금 Helper Raw-HTML
kdbGeneralDepositeByHelper:
	line+

	KEYWORD TAB WORD TAB											NEWLINE		//	계좌번호 	 신규일 	 
	bnumber=WORD TAB DATE TAB										NEWLINE		//	020-5013-8848-862 	 2012.11.23 	 

	line+

	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE
			//	거래일시 	 거래구분 	 적요 	 출금(원) 	 입금(원) 	 잔액(원) 	 거래점 	 
	(
		date=DATE time=TIME TAB
			type=WORD TAB
			title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
			outcome=NUMBER TAB
			income=NUMBER TAB
			balance=NUMBER TAB
			place=WORD TAB											NEWLINE
				//	2024.09.30 03:11 	 이자원가 	 (이자: 6 세금: 0) 	 0 	 6 	 3,684 	 분당지점 	 
		{
			log.info("{} 산업은행 보통예금 적요(『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {}』『{} {}』)", Utility.indentMiddle()
				, $date.text, $time.text
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $income.text, $outcome.text, $balance.text
				, $place.text);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($date.text, $time.text);
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setIncome($income.text);
			statement.setOutcome($outcome.text);
			statement.setBalance($balance.text);
			statement.setDescription($type.text, $place.text);
		}
	)+
	WORD word+									NEWLINE
			//	첫 페이지로 이동 이전 페이지로 이동 1 현재 선택된 페이지 다음 페이지로 이동 마지막 페이지로 이동 

	eof
{
	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};


// 적금 html, 산업은행 > 조회 > 거래내역조회 > 적금 > 인쇄 및 저장 > 엑셀
kdbGeneralDepositeExcel:
	line+

	KEYWORD TAB TAB TAB bnumber=WORD TAB TAB TAB TAB WORD TAB TAB TAB TAB TAB TAB TAB WORD TAB TAB TAB			NEWLINE
			//	계좌번호 	 	 	 020-5013-5082-862 	 	 	 	 고객명 	 	 	 	 	 	 	 박영선 	 	 	 
	line+

	WORD TAB WORD TAB TAB TAB WORD TAB TAB WORD WORD TAB TAB WORD WORD TAB TAB TAB TAB WORD WORD TAB TAB TAB TAB TAB WORD		NEWLINE
			//	거래일시 	 거래구분 	 	 	 적요 	 	 출금 (원) 	 	 입금 (원) 	 	 	 	 잔액 (원) 	 	 	 	 	 거래점 
	(
		STRING TAB type=WORD TAB TAB TAB
				title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
				TAB outcome=NUMBER TAB
				TAB income=NUMBER TAB
				TAB TAB TAB balance=NUMBER TAB TAB TAB TAB TAB place=WORD				NEWLINE
				//	"2024.06.25\n12:39" 	 정기적립금 	 	 	 03292038146862 	 	 250,000 	 	 0 	 	 	 	 1,513 	 	 	 	 	 분당지점 
		{
			log.info("{} 산업은행 보통예금 엑셀 적요(『{}』『{} {} {} {} {} {} {} {}』『{} {} {}』『{}』)", Utility.indentMiddle()
				, $STRING.text
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $income.text, $outcome.text, $balance.text
				, $place.text);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($STRING.text);
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setIncome($income.text);
			statement.setOutcome($outcome.text);
			statement.setBalance($balance.text);
			statement.setDescription($place.text);
		}
	)+
	TAB+									NEWLINE		//		 	 	 
{
	log.info("{} 산업은행 보통예금 엑셀({})", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};


// 적금 html, 산업은행 > 조회 > 거래내역조회 > 적금 > 인쇄 및 저장 > 화면 복붙
kdbInstallmentSavingHtml:
	line+

	KEYWORD TAB bnumber=WORD TAB WORD TAB WORD	NEWLINE		//	계좌번호 	 032-9203-8146-862 	 고객명 	 박영선 

	line+

	WORD WORD TAB DATE TIME						NEWLINE		//	조회일시 : 	 2023.06.27 13:19:28 
	(WORD										NEWLINE)?	//	1/2 
	kdbInstallmentSavingHtmlItem+
{
	log.info("{} 산업은행 적금 html({})", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};
kdbInstallmentSavingHtmlItem:
DATE										NEWLINE		//	2023.06.09 
TIME										NEWLINE		//	16:10 
title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*			NEWLINE		//	인터넷뱅킹/ 
(title8=word title9=word? titlea=word? titleb=word? titlec=word? titled=word? titlee=word? titlef=word*			NEWLINE)?	//	박영선 
(title10=word title11=word? title12=word? title13=word? title14=word? title15=word? title16=word? title17=word*	NEWLINE)?
(title18=word title19=word? title1a=word? title1b=word? title1c=word? title1d=word? title1e=word? title1f=word*	NEWLINE)*outcome=NUMBER TAB income=NUMBER TAB balance=NUMBER TAB place=WORD TAB rate=WORD						NEWLINE		//	0 	 2,500,000 	 19,250,000 	 하나은행 	 5.64% 
{	
	log.info("{} 산업은행 적금 html 적요(『{} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {}』 『{} {}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $title8.text, $title9.text, $titlea.text, $titleb.text, $titlec.text, $titled.text, $titlee.text, $titlef.text
		, $title10.text, $title11.text, $title12.text, $title13.text, $title14.text, $title15.text, $title16.text, $title17.text
		, $title18.text, $title19.text, $title1a.text, $title1b.text, $title1c.text, $title1d.text, $title1e.text, $title1f.text
		, $income.text, $outcome.text, $balance.text
		, $place.text, $rate.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $rate.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
	statement.setDescription($place.text
		, $title8.text, $title9.text, $titlea.text, $titleb.text, $titlec.text, $titled.text, $titlee.text, $titlef.text
		, $title10.text, $title11.text, $title12.text, $title13.text, $title14.text, $title15.text, $title16.text, $title17.text
		, $title18.text, $title19.text, $title1a.text, $title1b.text, $title1c.text, $title1d.text, $title1e.text, $title1f.text
	);
};


/**
 * 산업은행 정기예금 - 해지상세정보
 */
kdbFixedDepositeClosed:
	line+
	WORD TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? TAB KEYWORD TAB bnumber=WORD TAB		NEWLINE		//	상품명(계좌별명) 	 KDB Hi 정기예금(정기예금1Y2.5) 	 계좌번호 	 057-9208-9714-862(001) 	 
	line+
	WORD TAB adate=DATE TAB WORD TAB prefix=WORD TAB				NEWLINE		//	해지일 	 2023.05.31 	 해지구분 	 일반해지(만기해지) 	 
	WORD TAB WORD TAB WORD TAB sdate=DATE TAB						NEWLINE		//	해지방법 	 영업점 	 신규일 	 2022.05.31 	 
	WORD TAB edate=DATE TAB WORD TAB WORD TAB						NEWLINE		//	만기일 	 2023.05.31 	 가입방법 	 인터넷뱅킹 	 
	line+

	WORD* TAB WORD* TAB													NEWLINE		//	해지금액 및 이자내역 	 공제내역 	 
	kdbFixedDepositeClosedItem+
	WORD TAB income=NUMBER WORD TAB WORD TAB outcome=NUMBER WORD TAB	NEWLINE		//	합계(A) 	 51,250,000 원 	 합계(B) 	 192,500 원 	 
	WORD TAB into=WORD TAB WORD WORD TAB balance=NUMBER WORD TAB		NEWLINE		//	입금계좌번호 	 020-5013-8848-862 	 받으실 금액(A-B) 	 51,057,500 원
	eof 	 

{
	log.info("{} 정기예금 해지상세정보 kdbFixedDepositeClosed(『{}』, 『{}』, 『{} {} {}』, 『{} {} {} {} {} {}』, 『{} {} {} {}』)", Utility.indentMiddle()
		, $bnumber.text
		, $prefix.text
		, $adate.text, $sdate.text, $edate.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text
		, $income, $outcome.text, $balance.text, $into.text
	);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setTime($adate.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("해지상세정보", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($prefix.text, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text);
	statement.setOutcome($balance.text);
	statement.setDescription($balance.text, "=", $income.text, "-", $outcome.text, "⇨", $into.text);
	statement.setCategoryName("분류.지출.이체/대체.기타");
};
kdbFixedDepositeClosedItem:
(ititle=WORD TAB income=NUMBER WORD TAB)? otitle=WORD TAB outcome=NUMBER WORD TAB		NEWLINE		//	해지원금 	 50,000,000 원 	 소득세 	 175,000 원 	 
{
	log.info("{} 정기예금 해지상세정보 kdbFixedDepositeClosedItem({})", Utility.indentMiddle());

	if (!($income.text == null || $income.text.equals("0") || $ititle.text == null || $ititle.text.contains("원금"))) {
		StatementForm istatement = new StatementForm();
		LIST_STATEMENT.add(istatement);
		istatement.setTitle($ititle.text);
		istatement.setIncome($income.text);
		istatement.setCategoryName("분류.수입.부수입.이자/배당금");
	}
	if (!($outcome.text == null || $outcome.text.equals("0"))) {
		StatementForm ostatement = new StatementForm();
		LIST_STATEMENT.add(ostatement);
		ostatement.setTitle($otitle.text);
		ostatement.setOutcome($outcome.text);
		ostatement.setCategoryName("분류.지출.세금/이자.세금");
	}
};


/**
 * 산업은행 정기예금 - 엑셀
 */
kdbFixedDepositeExcel:
	line+

	KEYWORD TAB+ bnumber=WORD TAB+ WORD TAB+ WORD TAB+	NEWLINE		//	계좌번호 	 057-9208-9714-862(001) 	 고객명 	 권과헌 

	line+

	WORD TAB+ DATE TAB+ WORD TAB+ balance=WORD TAB+		NEWLINE		//	신규일자 	 2022.05.31 	 현재잔액 	 50,000,000원 
	line+

	kdbFixedDepositeExcelItem+
	
	eof
{
	log.info("{} kdb정기예금엑셀({})", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance($balance.text);
	STATEMENT.setDescription($DATE.text, "~");
};
kdbFixedDepositeExcelItem:
st=NUMBER TAB status=WORD TAB incomeDate=DATE TAB+ income=NUMBER TAB+ endDate=WORD TAB+ expireDate=DATE TAB+		NEWLINE
//	1 	 정상 	 2023.05.19 	 	 	 	 100,000,000		12개월 	 	 	 	 2024.05.19 	 
{	
	log.info("{} kdb정기예금엑셀적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $incomeDate.text, $income.text, $st.text, $status.text, $endDate.text, $expireDate.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($incomeDate.text);
	statement.setTitle($st.text, "/", $endDate.text, "~", $expireDate.text);
	statement.setIncome($income.text);
};


/**
 * 산업은행 적금 - 엑셀
 */
kdbInstallmentSaving:
	line+

	KEYWORD TAB+ bnumber=WORD TAB+ WORD TAB+ WORD TAB+							NEWLINE		//	계좌번호 	 	 	 032-9203-8146-862 	 	 	 	 고객명 	 	 	 	 	 박영선 	 	 	 	 

	line+

	WORD+ TAB+ WORD+ TAB+ WORD+ TAB+ WORD+ TAB+ WORD+ TAB+ WORD+ TAB+ WORD+		NEWLINE		//	거래일시 	 거래구분/적요 	 	 	 출금 (원) 	 	 입금 (원) 	 	 잔액 (원) 	 	 	 거래점 	 	 	 	 	 금리 
	kdbInstallmentSavingItem+
	TAB+																		NEWLINE		//		 
{
	log.info("{} kdb적금({})", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
kdbInstallmentSavingItem:
	datetime=STRING TAB
		title=STRING TAB
		TAB TAB outcome=NUMBER TAB
		TAB income=NUMBER TAB
		TAB balance=NUMBER TAB
		TAB TAB place=WORD TAB
		TAB TAB TAB TAB rate=WORD				NEWLINE
			//	"2022.11.16\n10:35" 	 "신규/\n박영선" 	 	 	 0 	 	 2,500,000 	 	 2,500,000 	 	 	 분당지점 	 	 	 	 	 5.64% 
{	
	log.info("{} kdb적금적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $datetime.text, $title.text, $outcome.text, $income.text, $balance.text, $place.text, $rate.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($datetime.text);
	statement.setTitle($title.text, "/", $rate.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
	statement.setDescription($place.text);
};

/**
 * 산업은행 정기예금 중도해지
 */
kdbEarlyExpireFixedDeposite:
	line+

	WORD WORD DATE TIME WORD				NEWLINE		//	조회일시 : 2022.06.01 04:29:07 현재 
	WORD TAB word+							NEWLINE		//	상품명(계좌별명) 	 그린뉴딜 정기예금 (온라인)(1Y1.35) 
	TAB WORD TAB bnumber=WORD		NEWLINE		//		 계좌번호 	 053-9201-9052-862 

	line+

	kdbEarlyExpireFixedDepositeItem+
{
	log.info("{} kdb정기예금중도해지({})", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
kdbEarlyExpireFixedDepositeItem:
	st=NUMBER TAB status=WORD TAB incomeDate=DATE TAB outcomeDate=DATE TAB income=NUMBER TAB end=NUMBER TAB expireDate=DATE		NEWLINE	
//	1 	 해지 	 2022.05.27 	 2022.05.31 	 50,000,000 	 12 	 2023.05.27 
{	
	log.info("{} kdb정기예금중도해지적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $st.text, $status.text, $incomeDate.text, $outcomeDate.text, $income.text, $end.text, $expireDate.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($outcomeDate.text);
	statement.setTitle($status.text, $st.text, "/", $end.text);
	statement.setOutcome($income.text);
	statement.setDescription($incomeDate.text, $expireDate.text);
};


/**
 * 산업은행 정기예금해지
 */
kdbExpireFixedDeposite:
	line+

	WORD WORD DATE TIME WORD					NEWLINE		//	조회일시 : 2022.06.01 04:29:07 현재 
	WORD TAB word+ TAB KEYWORD TAB bnumber=WORD	NEWLINE		//	상품명(계좌별명) 	 KDB Hi 정기예금(정기예금 1Y2.3) 	 계좌번호 	 057-9208-9133-862(001) 

	line+

	WORD TAB WORD TAB WORD (TAB WORD)+			NEWLINE		//	회차 	 상태코드 	 입금일 	 지급일 	 입금금액(원) 	 계약월수 	 만기일 
	kdbExpireFixedDepositeItem+
{
	log.info("{} kdb정기예금해지({})", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text.split("\\(")[0]);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
kdbExpireFixedDepositeItem:
	NUMBER TAB title=WORD TAB startDate=DATE TAB endDate=DATE TAB outcome=NUMBER TAB info=NUMBER TAB org=DATE		NEWLINE
//	1 	 해지 	 2022.05.27 	 2022.05.31 	 50,000,000 	 12 	 2023.05.27 
{	
	log.info("{} kdb정기예금해지적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $title.text, $startDate.text, $endDate.text, $outcome.text, $info.text, $org.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($endDate.text);
	statement.setTitle($title.text, $startDate.text, "~");
	statement.setIncome(0);
	STATEMENT.setOutcome($outcome.text);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription($org.text);
};



/**
 * 산업은행 보통예금
 */
kdbGeneralDeposite
:
	line+

	WORD WORD TAB DATE TIME						NEWLINE		//	조회일시 : 	 2022.05.31 17:02:00 
	KEYWORD TAB bnumber=WORD TAB WORD TAB WORD	NEWLINE		//	계좌번호 	 020-5013-8848-862 	 고객명 	 권과헌 

	line+

	WORD (TAB WORD)+							NEWLINE		//	최신순 	 입/출금 	 전체 
	kdbGeneralDepositeItem+
{
	log.info("{} kdb보통예금({})", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("산업은행");
	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
kdbGeneralDepositeItem:
	DATE																	NEWLINE		//	2022.05.30 
	TIME																	NEWLINE		//	03:11 
	((
		t1=word t2=word? t3=word? t4=word? t5=word?								NEWLINE		//	이자원가/ 
		(t11=word t12=word? t13=word? t14=word? t15=word?						NEWLINE)?	//	(이자: 2,373 세금: 
		(t21=word t22=word? t23=word? t24=word? t25=word?						NEWLINE)?	//	360) 
		outcome=NUMBER TAB income=NUMBER TAB balance=NUMBER TAB place=WORD		NEWLINE		//	0 	 50,571,050 	 50,605,828 	 분당지점
	) | (
		t1=word t2=word? t3=word? t4=word? t5=word? TAB t11=word t12=word? t13=word? t14=word? t15=word? t21=word? t22=word? t23=word? t24=word? t25=word? TAB
		outcome=NUMBER TAB income=NUMBER TAB balance=NUMBER TAB place=WORD		NEWLINE		//	이자원가 	 (이자: 0 세금: 0) 	 0 	 0 	 505 	 분당지점 
	)) 
{	
	log.info("{} kdb보통예금적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $DATE.text, $TIME.text, $outcome.text, $income.text, $balance.text, $place.text
		, $t1.text, $t2.text, $t3.text, $t4.text, $t5.text
		, $t11.text, $t12.text, $t13.text, $t14.text, $t15.text
		, $t21.text, $t22.text, $t23.text, $t24.text, $t25.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($t1.text, $t2.text, $t3.text, $t4.text, $t5.text, $t11.text, $t12.text, $t13.text, $t14.text, $t15.text, $t21.text, $t22.text, $t23.text, $t24.text, $t25.text);
	statement.setDescription($place.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};


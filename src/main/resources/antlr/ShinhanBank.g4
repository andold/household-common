/**
 * 신한은행
 */
grammar ShinhanBank;
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

shinhanBankDocument
	:	shinhanLocalFund	//	신한은행 > 금융상품 > 펀드 > 조회/입금/해지 > 조회/입금/출금/해지 :: 국내펀드 > 파일저장
	|	shinhanExpire		//	신한은행 > 계좌조회 > 해지현황조회 > 해지계산서
	|	shinhanFund
	|	shinhanGeneralDepositeHtml	//	신한은행 > 예금/신탁 > 조회/입출금 > 계좌조회 > 거래내역조회 > 보통예금
	|	shinhanGeneralDeposite
	|	shinhanFixedDeposite
	;

//	HTML. 신한은행 > 예금/신탁 > 조회/입출금 > 계좌조회 > 거래내역조회 > 보통예금:: getPageSource()
shinhanGeneralDepositeHtml:
	line+

	WORD TAB WORD TAB KEYWORD TAB bnumber=WORD TAB				NEWLINE
			//	고객명 	 권과헌 	 계좌번호 	 110-100-782474 	 

	line+

	WORD+ TAB WORD TAB (WORD+ TAB)+			NEWLINE
			//	거래일자 오름차순 정렬 	 거래시간 	 적요 오름차순 정렬 	 출금(원) 오름차순 정렬 	 입금(원) 오름차순 정렬 	 내용 오름차순 정렬 	 잔액(원) 오름차순 정렬 	 거래점 오름차순 정렬 	 
	shinhanGeneralDepositeHtmlItem+
	TAB TAB TAB													NEWLINE		//		 	 	 

	eof
{
	log.info("{} 신한은행 보통예금(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("신한은행");
	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setTitle("신한은행", $bnumber.text);
	STATEMENT.setDescription("신한은행", $bnumber.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};
shinhanGeneralDepositeHtmlItem:
	DATE TAB TIME TAB
		type=word* TAB
		outcome=NUMBER? TAB
		income=NUMBER? TAB
		title=word? title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		balance=NUMBER TAB
		place=WORD TAB										NEWLINE
				//	2024-07-03 	 12:52:03 	 모바일 	 1 	 	 권과헌 	 2,351,431 	 네이버 	 
{
	log.info("{} 신한은행 보통예금(『{} {}』 『{}』 『{} {} {}』 『{} {} {} {} {} {} {} {}』 『{}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $type.text
		, $outcome.text, $income.text, $balance.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $place.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($type.text, $place.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};


//	신한은행 > 금융상품 > 펀드 > 조회/입금/해지 > 조회/입금/출금/해지 :: 국내펀드 > 파일저장
shinhanLocalFund:
	line+
	WORD TAB KEYWORD TAB STRING TAB WORD TAB WORD TAB WORD		NEWLINE		//	계좌명 	 계좌번호 	 "신규일\n만기일" 	 납입원금(원) 	 평가금액(원) 	 수익률 
	(
		title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
			bnumber=STRING TAB period=STRING TAB income=NUMBER TAB balance=NUMBER TAB
			description=word description1=word? description2=word? description3=word? description4=word? description5=word? description6=word? description7=word*		NEWLINE
				//	신한 미래설계 연금저축계좌(연금전용) 	 "250-163-311491\n" 	 "2023.08.02\n2028.08.02" 	 9,000,740 	 9,188,294 	 증가2.08% 
		{
			log.info("{} 신한은행 > 금융상품 > 펀드 > 조회/입금/해지 > 조회/입금/출금/해지 :: 국내펀드 > 파일저장(『{}』)", Utility.indentMiddle(), $bnumber.text);
		
			ACCOUNT.setProducer("신한은행");
			ACCOUNT.setNumber($bnumber.text);
		
			Calendar calendar = Calendar.getInstance();
			calendar.clear(Calendar.MILLISECOND);
			calendar.clear(Calendar.SECOND);
			STATEMENT.setTime(calendar.getTime());

			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTitle("평가금액", $description.text, $description1.text, $description2.text, $description3.text, $description4.text, $description5.text, $description6.text, $description7.text);
			if ($period.text == null) {
				statement.setDescription($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			} else {
				statement.setDescription($period.text.replaceAll("[\\\"]+", "").replaceAll("[\\n]+", "~"), $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			}
			statement.setIncome($income.text);
			statement.setOutcome(0);
			statement.setBalance($balance.text);
			statement.setCategoryName("분류.수입.저축/보험.기타");
		}
	)+
;


//	신한은행 > 계좌조회 > 해지현황조회 > 해지계산서
shinhanExpire:
	line+

	KEYWORD TAB bnumber=WORD TAB								NEWLINE		//	계좌번호 	 200-735-353232 	 
	WORD TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB	NEWLINE
			//	예금종류 	 쏠편한 정기예금 	 
	WORD TAB WORD TAB WORD TAB NUMBER TAB						NEWLINE		//	예금주명 	 박영선 	 통장잔액 	 50,000,000 	 
	WORD TAB open=DATE TAB WORD TAB close=DATE TAB				NEWLINE		//	신규일 	 2023.08.04 	 만기일 	 2024.08.04 	 
	WORD TAB WORD TAB intitle=WORD TAB income=NUMBER TAB		NEWLINE		//	거래구분 	 이자계산서재발행 	 이자합계 	 1,835,000 	 
	WORD TAB TAB WORD TAB TAB									NEWLINE		//	소득시작일 	 	 소득종료일 	 	 
	WORD TAB TAB outtitle=WORD TAB outcome=NUMBER TAB			NEWLINE		//	적용과세 	 	 공제세금 	 282,590 	 
	WORD TAB date=DATE TAB WORD TAB NUMBER TAB					NEWLINE		//	거래일자 	 2024.08.05 	 세후이자 	 1,552,410 	 
	WORD WORD WORD WORD											NEWLINE		//	받으신 금액(단위 : 원) 
	WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD		NEWLINE		//	받으신금액은(는) 원금 및 이자 금액,공제 금액,원금 및 이자합계,공제합계 을(를) 나타낸 표 
	WORD WORD WORD WORD TAB WORD WORD TAB						NEWLINE		//	원금 및 이자 금액 	 공제 금액 	 
	WORD WORD WORD WORD WORD WORD WORD TAB balance=NUMBER TAB	NEWLINE		//	받으신 금액 (원금 및 이자금액 - 공제금액)(원) 	 51,552,410 	 

	eof
{
	log.info("{} 신한은행 해지계산서(『{} {} {} {} {} {} {} {}』『{}』『{} {}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $bnumber.text
		, $open.text, $close.text);

	ACCOUNT.setProducer("신한은행");
	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setTime($date.text);
	STATEMENT.setBalance($balance.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("해지계산서"
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $bnumber.text
		, "『", $open.text, "~", $close.text, "』");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($date.text, "00:00:00");
	statement.setTitle($intitle.text);
	statement.setIncome($income.text);
	statement.setBalance($balance.text, $income.text);
	statement.setCategoryName("분류.수입.부수입.이자/배당금");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($date.text, "00:00:01");
	statement.setTitle($outtitle.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
	statement.setCategoryName("분류.지출.세금/이자.세금");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($date.text, "00:00:02");
	statement.setTitle($open.text, "~", $close.text);
	statement.setOutcome($balance.text);
	statement.setBalance(0);
	statement.setCategoryName("분류.수입.전월이월.이체");
};


//	엑셀. 신한은행 > 조회 > 계좌조회 > 펀드 > 조회 > 거래내역 > 파일저장
shinhanFund:
	line+

	KEYWORD TAB bnumber=WORD			NEWLINE		//	계좌번호 	 250-162-900482
	line
	WORD TAB WORD (TAB WORD)+			NEWLINE		//	거래일자 	 거래종류 	 취소여부 	 거래금액 	 거래좌수 	 평가금액 	 업무 
	shinhanFundItem+
{
	log.info("{} 신한은행 연금저축 펀드(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("신한은행");
	ACCOUNT.setNumber($bnumber.text);
};
shinhanFundItem:
	DATE TAB title=word title1=word? title2=word? title3=word* TAB cancel=word* TAB amount=NUMBER TAB ea=NUMBER TAB balance=NUMBER TAB job=word*			NEWLINE		//	2023.06.13 	 0원신규 	 	 0 	 0 	 0 	 
{
	log.info("{} 신한은행 연금저축 펀드 적요(『{}』 『{} {} {} {}』 『{}』 『{} {} {}』 『{}』)", Utility.indentMiddle()
		, $DATE.text
		, $title.text, $title1.text, $title2.text, $title3.text
		, $cancel.text
		, $amount.text, $ea.text, $balance.text
		, $job.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $cancel.text);
	statement.setDescription($ea.text, $job.text);
	statement.setIncome($amount.text);
	statement.setOutcome(0);
	statement.setBalance($balance.text);
};


//	엑셀. 신한은행 > 예금/신탁 > 조회/입출금 > 계좌조회 > 거래내역조회 > 보통예금. 
shinhanGeneralDeposite:
	line+

	KEYWORD TAB bankbookNumber=WORD			NEWLINE		//	계좌번호 	 110-100-782474

	line+

	WORD TAB WORD (TAB WORD)+				NEWLINE		//	거래일자 	 거래시간 	 적요 	 출금(원) 	 입금(원) 	 내용 	 잔액(원) 	 거래점
	shinhanGeneralDepositeItem+
{
	log.info("{} shinhan보통예금(『{}』)", Utility.indentMiddle(), $bankbookNumber.text);

	ACCOUNT.setProducer("신한은행");
	ACCOUNT.setNumber($bankbookNumber.text);
};
shinhanGeneralDepositeItem:
DATE TAB TIME TAB type=word* TAB outcome=NUMBER? TAB income=NUMBER? TAB title1=word? title2=word? title3=word* TAB balance=NUMBER? TAB place=word+		NEWLINE		//	2021-04-02 	 18:03:22 	 카드결 	 2000.000000 	 0.000000 	 남산1호터널 	 1850670.000000 	 원신한 
{
	log.info("{} shinhan보통예금내용(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text, $type.text, $outcome.text, $income.text, $title1.text, $title2.text, $title3.text, $balance.text, $place.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($title1.text, $title2.text, $title3.text);
	statement.setDescription($type.text, $place.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
};


//	엑셀. 신한은행 > 예금/신탁 > 조회/입출금 > 계좌조회 > 거래내역조회 > 정기예금. 
shinhanFixedDeposite:
	line+

	KEYWORD TAB bankbookNumber=WORD		NEWLINE		//	계좌번호 	 200-574-969161
	line
	line
	WORD TAB WORD (TAB WORD)+			NEWLINE		//	거래일자 	 적요 	 출금(원) 	 입금(원) 	 지급이자 	 잔액(원) 	 거래점 
	shinhanFixedDepositeItem+
{
	log.info("{} shinhan정기예금(『{}』)", Utility.indentMiddle(), $bankbookNumber.text);

	ACCOUNT.setProducer("신한은행");
	ACCOUNT.setNumber($bankbookNumber.text);
};
shinhanFixedDepositeItem:
	DATE TAB title=word* TAB outcome=NUMBER? TAB income=NUMBER? TAB profit=NUMBER? TAB balance=NUMBER? TAB place=word+	NEWLINE
	//	2021.04.15 	 인터넷 	 0.000000 	 50000000.000000 	 0.000000 	 50000000.000000 	 서현역 
{
	log.info("{} shinhan정기예금내용(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $DATE.text, $outcome.text, $income.text, $title.text, $balance.text, $place.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text);
	statement.setTitle($title.text);
	statement.setDescription($place.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);

	if ($profit.text != null && !$profit.text.startsWith("0")) {
		statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text);
		statement.setTitle("지급이자");
		statement.setDescription($place.text);
		statement.setIncome($profit.text);
		statement.setOutcome(0);
		statement.setBalance($balance.text);
	}
};


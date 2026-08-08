/**
 * 신한투자증권 문법
 */
grammar ShinhanInvest;

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


// 신한투자증권
shinhanInvestDocument
	:	shinhanInvestSummaryTradeHistory // CMA RP HTML. 신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역 > 한화면조회::종합거래내역
	|	shinhanInvestCma // CMA RP HTML. 신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역
	;


// CMA RP HTML. 신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역 > 한화면조회::종합거래내역
shinhanInvestSummaryTradeHistory:
	line+

	KEYWORD TAB bnumber=WORD WORD TAB WORD TAB DATE WORD DATE TAB		NEWLINE		//	계좌번호 	 270-70-157311 박영선(주로사용) 	 조회기간 	 2024.04.04 ~ 2024.05.04 	 

	line+

	WORD TAB WORD TAB (WORD+ TAB)+		NEWLINE		//	일자 	 구분 	 종목번호 	 수량 	 거래대금 	 수수료 	 미수발생/변제 	 과표금액 	 연체료 	 변동금액 	 대출일 	 처리자 	 
	WORD TAB WORD TAB (WORD+ TAB)+		NEWLINE		//	상품 	 적요 	 종목명(상대처) 	 가격 	 신용/대출금 	 제세금 	 신용/대출이자 	 예탁금 이용료 	 대체계좌/채널 	 최종금액 	 만기일 	 의뢰자명 	 
	shinhanInvestSummaryTradeHistoryItem+
//	WORD WORD							NEWLINE		//	인쇄하기 확인
	eof
{
	log.info("{} shinhanInvestSummaryTradeHistory::종합거래내역(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("신한투자증권");
	ACCOUNT.setNumber($bnumber.text);
};
shinhanInvestSummaryTradeHistoryItem:
	DATE TAB type=WORD TAB code=word? TAB amount=NUMBER TAB transationPrice=NUMBER TAB commission=NUMBER TAB NUMBER TAB assessment=NUMBER TAB NUMBER TAB changed=NUMBER TAB TAB word* TAB		NEWLINE
			//	2024.05.03 	 RP_매수 	 2000 	 618,850 	 618,850 	 0 	 0 	 0 	 0 	 618,850 	 	 	 
	sequence=NUMBER? TAB subTitle=WORD? TAB
		sname=word? sname1=word? sname2=word? sname3=word? sname4=word? sname5=word? sname6=word? sname7=word* TAB
		price=NUMBER TAB loan=NUMBER TAB tax=NUMBER TAB interest=NUMBER TAB useFee=NUMBER TAB word* TAB finalAmount=NUMBER TAB TAB WORD* TAB		NEWLINE
			//	01 	 매수 	 명품 CMA RP(개인) 	 2.95 	 0 	 0 	 0 	 0 	 GoldNet 	 618,850 	 	 	 
{
/*
	log.info("{} shinhanInvestSummaryTradeHistoryItem(『{} {} {}』 『{} {}』, 『{} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {}』 『{} {} {}』)", Utility.indentMiddle()
		, $DATE.text, $type.text, $code.text
		, $amount.text, $transationPrice.text
		, $commission.text, $changed.text, $sequence.text, $subTitle.text
		, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text
		, $price.text, $loan.text, $tax.text
		, $interest.text, $useFee.text, $finalAmount.text
	);
*/
	StatementForm statement = null;
	switch ($type.text) {
		case "예탁금이용료":
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text);
			statement.setTitle($type.text, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text);
			statement.setIncome(0);
			statement.setOutcome($changed.text);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.지출.이체/대체.기타");

		case "ETF분배금":
		case "배당금":
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text);
			statement.setTitle($type.text, "-", $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text);
			statement.setIncome($transationPrice.text);
			statement.setOutcome(0);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.수입.부수입.이자/배당금");
	
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text);
			statement.setTitle("[세금]", $type.text, "-", $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text, $transationPrice.text);
			statement.setIncome(0);
			statement.setOutcome($tax.text);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.지출.세금/이자.세금");
	
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, "00:00:01");
			statement.setTitle("[정산]", $type.text, "-", $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text, $transationPrice.text);
			statement.setIncome(0);
			statement.setOutcome($changed.text);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.지출.이체/대체.기타");
			break;
		case "배당세":
		case "RP_재투자환매":
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text);
			statement.setTitle("[세금]", $type.text, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text, $transationPrice.text);
			statement.setIncome(0);
			statement.setOutcome($tax.text);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.지출.세금/이자.세금");
			break;
		case "RP_매도":
		case "코스닥_매도":
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text);
			statement.setTitle("[세금]", $type.text, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text, $transationPrice.text);
			statement.setIncome(0);
			statement.setOutcome($tax.text);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.지출.세금/이자.세금");

			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text);
			statement.setTitle("[과표]", $type.text, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text, $transationPrice.text);
			statement.setIncome(0);
			statement.setOutcome($assessment.text);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.지출.세금/이자.기타");
			break;
		case "장내_매도":
		case "장내_매수":
		case "코스닥_매수":
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text);
			statement.setTitle("[수수료]", $type.text, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text, $transationPrice.text);
			statement.setIncome(0);
			statement.setOutcome($commission.text);
			statement.setBalance(0);
			statement.setDescription("");
			statement.setCategoryName("분류.지출.세금/이자.기타");
			break;
		case "RP_매수":
		case "은행이체출금":
		case "은행이체출금취소":
		case "RP_재투자매수":
		case "환전입금":
		case "환전출금":
			break;
		default:
			log.info("{} shinhanInvestSummaryTradeHistoryItem::DEFAULT NONE(『{} {} {}』 『{} {}』, 『{} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {}』 『{} {} {}』)", Utility.indentMiddle()
				, $DATE.text, $type.text, $code.text
				, $amount.text, $transationPrice.text
				, $commission.text, $changed.text, $sequence.text, $subTitle.text
				, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text
				, $price.text, $loan.text, $tax.text
				, $interest.text, $useFee.text, $finalAmount.text
			);
			break;
	}
};


// HTML. 신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역
shinhanInvestCma:
	line+

	KEYWORD																NEWLINE		//	계좌번호 
	bnumber=WORD WORD													NEWLINE		//	270-70-157311 박영선 

	line+

	WORD WORD															NEWLINE		//	조회 계좌정보 
	WORD TAB WORD TAB outcomeTitle=WORD WORD TAB						NEWLINE		//	순자산평가 	 총자산평가 	 출금가능금액 이체 	 
	income=NUMBER TAB balance=NUMBER TAB outcome=NUMBER TAB				NEWLINE		//	9,987,760 	 9,987,760 	 1,914,960 	 

	line+

	WORD TAB WORD TAB WORD TAB (WORD TAB)+								NEWLINE		//	거래일시 	 거래구분 	 출금(원) 	 입금(원) 	 내통장메모 	 잔액(원) 	 상대계좌
	((
		shinhanInvestCmaItem+
	) | (
		TAB																NEWLINE		//		 
	))
	WORD word+															NEWLINE		//	제출용 증명서 출력은 종합거래내역에서 출력가능합니다. 종합거래내역 해외 주식 배당금 등 자세한 내용은 종합거래내역에서 확인해 주세요. 

	eof
{
	log.info("{} shinhanInvestCma(『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $bnumber.text, $income.text, $outcome.text, $balance.text);

	ACCOUNT.setProducer("신한투자증권");
	ACCOUNT.setNumber($bnumber.text);

	StatementForm statement = new StatementForm();
	//	무효화
//	LIST_STATEMENT.add(statement);

	Calendar calendar = Calendar.getInstance();
	calendar.clear(Calendar.MILLISECOND);

	statement.setTime(calendar.getTime());
	statement.setTitle("평가금액", $income.text, "(", $outcomeTitle.text, $outcome.text, ")");
	statement.setIncome(0);
	statement.setOutcome(0);
	statement.setBalance($balance.text);
	statement.setCategoryName("분류.수입.저축/보험.기타");
};
shinhanInvestCmaItem:
	((
		date=DATE time=WORD TAB title=WORD TAB income=NUMBER? WORD? TAB balance=NUMBER? WORD? TAB
				you=word? you1=word? you2=word? you3=word? you4=word? you5=word? you6=word? you7=word* TAB
				memo=WORD* TAB																				NEWLINE
				//	2025.04.02 (15:04:22) 	 은행이체출금 	 	 	 30413003004 박영선 	 출금 	 
		sname=word? sname1=word? sname2=word? sname3=word? sname4=word? sname5=word? sname6=word? sname7=word* TAB outcome=NUMBER? WORD? TAB word* TAB TAB	NEWLINE
				//		 1,644,389 (KRW) 	 박영선 	 	 

//		DATE WORD TAB WORD TAB NUMBER WORD TAB NUMBER WORD TAB TAB WORD TAB		NEWLINE
				//	2025.04.01 (13:24:07) 	 ETF분배금 	 1,644,300 (KRW) 	 1,644,300 (KRW) 	 	 ETF분배금 	 
//		WORD WORD TAB TAB TAB TAB										NEWLINE
				//	SOL 미국30년국채커버드콜(합성) 	 	 	 	 
	)|(
		date=DATE time=WORD TAB title=WORD TAB outcome=NUMBER TAB income=NUMBER TAB memo=WORD* TAB balance=NUMBER TAB
			you=word? you1=word? you2=word? you3=word? you4=word? you5=word? you6=word? you7=word* TAB		NEWLINE
				//	2023.03.13 (14:10:41) 	 은행이체입금 	 0 	 9,999,999 	 ｆｒ신한은행ｐｙｓ 	 10,000,000 	 	 
	))
{	
	log.info("{} shinhanInvestCmaItem(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $date.text, $time.text, $income.text, $outcome.text, $balance.text
		, $you.text, $you1.text, $you2.text, $you3.text, $you4.text, $you5.text, $you6.text, $you7.text
	);

	if (!$title.text.contains("환전") && !$title.text.contains("증서")) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($date.text, $time.text);
		statement.setTitle(
			$memo.text == null ? $title.text : $memo.text
			, $sname.text == null ? "" : " - "
			, $sname.text, $sname1.text, $sname2.text, $sname3.text, $sname4.text, $sname5.text, $sname6.text, $sname7.text
		);
		statement.setIncome($income.text);
		statement.setOutcome($outcome.text);
		statement.setBalance($balance.text);
		statement.setDescription($title.text, $you.text, $you1.text, $you2.text, $you3.text, $you4.text, $you5.text, $you6.text, $you7.text);
		if ($title.text.contains("평가금액")) {
			statement.setDescription($title.text, "+", $income.text, "-", $outcome.text);
			statement.setIncome(0);
			statement.setOutcome(0);
			statement.setCategoryName("분류.수입.저축/보험.기타");
		}
	}
};

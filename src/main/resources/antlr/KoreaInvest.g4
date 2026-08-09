/**
 * 한국투자증권 문법
 */
grammar KoreaInvest;

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
 * 한국투자
 */
koreaInvestDocument
	:	koreaInvestAllTransaction	//	홈 > 뱅킹/청약/대출 > 조회 > 거래내역 > 계좌별거래내역 > 전체거래내역: (매도 | 세금)만! 나머진 입출금내역 사용하시오
	|	koreaInvestDayTradeComprehensiveEstimate	//	당일매매종합평가
	|	koreaInvestDayTradeComprehensiveEstimateBefore20220904
	|	koreaInvestInOutTransactionalInformation	// 입출금거래내역
	;


/**
 * HTML. 한국투자 > 홈 > 뱅킹/대출/청약 > 조회 > 거래내역 > 계좌별거래내역 > 전체거래내역
 */
koreaInvestAllTransaction:
	line+

	KEYWORD TAB KEYWORD WORD bnumber=WORD WORD KEYWORD TAB		NEWLINE		//	계좌번호 	 계좌번호 선택 71409599-01 (권과헌) 계좌번호
																			//	계좌번호 	 계좌번호 선택 72263703-01 (위탁2018) 계좌번호 	 
	
	line+

	word+		NEWLINE		//	계좌별거래내역 - 거래일, 거래종류, 입금액, 수수료, 잔액, 출금표시내용, 상대계좌, 상대금융기관, 거래시각, 출금액, 입금표시내용, 상대계좌명, 거래채널을 나타내는 테이블입니다. 
	koreaInvestAllTransactionItem+
	word+		NEWLINE		//	그리드에서 빠져나오시려면 ESC키를 눌러주세요. 
	
	eof
{
	log.info("{} koreaInvest전체거래내역(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("한국투자");
	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
koreaInvestAllTransactionItem:
	NUMBER? TAB DATE TAB title=word? title1=word? title2=word? title3=word? title4=word* TAB
		transactionQuantity=NUMBER TAB NUMBER TAB
		transactionAmount=NUMBER TAB fee=NUMBER TAB NUMBER TAB balance=NUMBER TAB word* TAB						NEWLINE
	//	1 	 2023.05.18 	 KODEX 200 	 7,047 	 0.00 	 230,155,020 	 33,720 	 0 	 230,121,300 	 	 
	//	1 	 2019.09.02 	 	 0 	 0.00 	 159 	 0 	 0 	 605,136 	 	 
	type=word+ TAB TAB unitPrice=NUMBER TAB dollarBalance=NUMBER TAB calculateAmount=NUMBER TAB
		tradeFee=NUMBER TAB tax=NUMBER TAB NUMBER TAB word* TAB	NEWLINE
	//	WTS거래소주식매도 	 	 32,660 	 0 	 230,121,300 	 0 	 0 	 0 	 홈페이지 	 
	//	예탁금이용료 	 	 0 	 0 	 139 	 0 	 20 	 0 	 	 
{	
	log.info("{} koreaInvest전체거래내역적요(『{} {} {} {} {}』 『{} {} {}』 『{} {} {} {} {} {}』 『{}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text
		, $transactionQuantity.text, $fee.text, $balance.text
		, $type.text, $unitPrice.text, $dollarBalance.text, $calculateAmount.text, $tradeFee.text, $tax.text
		, $DATE.text);

	if ($type.text.contains("매도") || $type.text.contains("매수")) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text);
		statement.setTitle("[수수료]", $type.text, "-", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, "-", $transactionAmount.text);
		statement.setDescription("");
		statement.setIncome(0);
		statement.setOutcome($fee.text);
		statement.setBalance(0);
		statement.setCategoryName("분류.지출.세금/이자.기타");
	} else if ($type.text.contains("분배금입금") && !"0".contentEquals($tax.text)) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text);
		statement.setTitle($type.text, "-", $title.text, $title1.text, $title2.text, $title3.text, $title4.text);
		statement.setDescription("");
		statement.setIncome($transactionAmount.text);
		statement.setOutcome(0);
		statement.setBalance(0);
		statement.setCategoryName("분류.수입.부수입.이자/배당금");

		statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text);
		statement.setTitle("[세금]", $type.text, "-", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, "-", $transactionAmount.text);
		statement.setDescription("");
		statement.setIncome(0);
		statement.setOutcome($tax.text);
		statement.setBalance(0);
		statement.setCategoryName("분류.지출.세금/이자.세금");
	
		statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text, "00:00:01");
		statement.setTitle("[정산]", $type.text, "-", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, "-", $transactionAmount.text);
		statement.setDescription("");
		statement.setIncome(0);
		statement.setOutcome($calculateAmount.text);
		statement.setBalance(0);
		statement.setCategoryName("분류.지출.이체/대체.기타");
	} else if ($type.text.contains("예탁금이용료")) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTime($DATE.text);
		statement.setTitle("[세금]", $type.text, "=", $transactionAmount.text);
		statement.setDescription("");
		statement.setIncome(0);
		statement.setOutcome($tax.text);
		statement.setBalance(0);
		statement.setCategoryName("분류.지출.세금/이자.세금");
	}
};


/**
 * HTML. 한국투자 > 홈 > 트레이딩 > 국내주식 > 주식 잔고/손익 > 당일매매종합평가
 * @author andold
 * @since 2022-09-04
 */
koreaInvestDayTradeComprehensiveEstimate:
	line+

	KEYWORD TAB bnumber=WORD WORD+ TAB?					NEWLINE		//	계좌번호 	 72263703-01 (위탁2018) 

	line+

	available=WORD TAB availableAmount=NUMBER TAB				NEWLINE		//	예수금 	 0 	 
	line															//	실현손익합계 	 0 	 
	line															//	제비용금액합계 	 0 	 
	line															//	실현실수익금액 	 0 	 
	line															//	실현실수익률 	 0.00% 	 
	line															//	총 융자/대출금액 	 0 	 
	line															//	당일매매종합평가의 익일정산액, 평가손익합계, 추정비용합계, 실평가손익합계, 실평가손익률, 총 대주매각대금 항목으로 구성된 테이블 입니다. 
	WORD TAB NUMBER TAB									NEWLINE		//	익일정산액 	 0 	 
	WORD TAB income=NUMBER TAB							NEWLINE		//	평가손익합계 	 -295,932 	 
	WORD TAB outcome=NUMBER TAB							NEWLINE		//	추정비용합계 	 36,340 	 
	WORD TAB value1=NUMBER TAB							NEWLINE		//	실평가손익합계 	 -332,272 	 
	WORD TAB rate=WORD TAB								NEWLINE		//	실평가손익률 	 -1.20% 	 
	WORD WORD TAB NUMBER TAB							NEWLINE		//	총 대주매각대금 	 0 	 
	WORD WORD WORD WORD WORD WORD WORD+					NEWLINE		//	당일매매종합평가의 D+2 정산액, 순자산액, 전일순자산액, 자산증감금액, 자산증감률, 매도비용차금 순자산액 항목으로 구성된 테이블 입니다. 
	WORD WORD TAB NUMBER TAB							NEWLINE		//	D+2 정산액 	 0 	 
	WORD TAB balance=NUMBER TAB							NEWLINE		//	순자산액 	 27,284,075 	 
	WORD TAB NUMBER TAB									NEWLINE		//	전일순자산액 	 27,436,500 	 
	WORD TAB NUMBER TAB									NEWLINE		//	자산증감금액 	 -152,425 	 
	WORD TAB WORD TAB									NEWLINE		//	자산증감률 	 -0.56% 	 
	WORD WORD TAB value2=NUMBER TAB						NEWLINE		//	매도비용차금 순자산액 	 27,247,735 	 

	line+
	WORD WORD+											NEWLINE		//	당일매매종합평가 목록 - 종목명, 종목번호, 보유수량, 매입금액, 평가금액, 대출일, 대출금액, 종목구분, 매입평균, 종가, 손익, 만기일, 외화결제매입금액 항목으로 구성되어있습니다. 
	koreaInvestDayTradeComprehensiveEstimateItem*
	WORD WORD+											NEWLINE		//	그리드에서 빠져나오시려면 ESC키를 눌러주세요. 

	eof
{
	log.info("{} 한국투자 당일매매종합평가(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $bnumber.text, $rate.text, $income.text, $outcome.text, $value1.text, $value2.text, $balance.text);

	ACCOUNT.setProducer("한국투자");
	ACCOUNT.setNumber($bnumber.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);

	Calendar calendar = Calendar.getInstance();
	calendar.clear(Calendar.MILLISECOND);

	statement.setTime(calendar.getTime());
	statement.setTitle("평가금액", $rate.text, $income.text, "(",  $available.text, $availableAmount.text, ")");
	statement.setDescription("");
	statement.setIncome(0);
	statement.setOutcome(0);
	statement.setBalance($value2.text);
	statement.setCategoryName("분류.수입.저축/보험.기타");
};
koreaInvestDayTradeComprehensiveEstimateItem:
	title=word title1=word? title2=word? title3=word? title4=word* TAB inumber=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB buyPrice=NUMBER TAB currentPrice=NUMBER TAB profit=NUMBER TAB NUMBER WORD TAB TAB		NEWLINE
	//	KODEX 200 	 069500 	 0 	 0 	 0 	 31,544 	 31,630 	 603,015 	 570,355 (0.25) 	 	 
	WORD TAB NUMBER TAB NUMBER TAB buyAmount=NUMBER TAB cost=NUMBER TAB rate=NUMBER TAB TAB										NEWLINE
	//	현금 	 0 	 0 	 7,047 	 32,660 	 0.27 	 	 
{
	log.info("{} koreaInvestDayTradeComprehensiveEstimateItem(『{} {} {} {} {}』 『{}』 『{} = ({} - {}) * {}』 『-{} ∴{}%』", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text
		, $inumber.text
		, $profit.text, $currentPrice.text, $buyPrice.text, $buyAmount.text
		, $cost.text, $rate.text
	);
};


/**
 * HTML. 한국투자 > 홈 > 뱅킹/대출/청약 > 조회 > 거래내역 > 계좌별거래내역 > 입출금거래내역.
 */
koreaInvestInOutTransactionalInformation:
	line+

	KEYWORD TAB KEYWORD WORD bnumber=WORD WORD KEYWORD TAB		NEWLINE		//	계좌번호 	 계좌번호 선택 71409599-01 (권과헌) 계좌번호 	 
	
	line+
	
	WORD+		NEWLINE		//	계좌별거래내역 - 거래일, 거래종류, 입금액, 수수료, 잔액, 출금표시내용, 상대계좌, 상대금융기관, 거래시각, 출금액, 입금표시내용, 상대계좌명, 거래채널을 나타내는 테이블입니다. 
	koreaInvestInOutTransactionalInformationItem+
	WORD+		NEWLINE		//	그리드에서 빠져나오시려면 ESC키를 눌러주세요. 
	
	line+
{
	log.info("{} koreaInvest입출금거래내역(『{}』)", Utility.indentMiddle(), $bnumber.text);

	ACCOUNT.setProducer("한국투자");
	ACCOUNT.setNumber($bnumber.text);

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
koreaInvestInOutTransactionalInformationItem:
	DATE TAB type=word* TAB income=NUMBER? TAB fee=NUMBER? TAB balance=NUMBER? TAB outmessage=word* TAB targetNumber=word* TAB targetProducer=word* TAB	NEWLINE	//	2021.12.28 	 당사이체입금 	 23,583,163 	 0 	 23,583,241 	 	 72263703-21 	 한국투자 	 
	TIME TAB outcome=NUMBER? TAB inmessage=WORD* TAB targetName=word* TAB channel=word* TAB																NEWLINE		//	14:04:52 	 0 	 권과헌 	 권과헌 	 홈페이지 	 
{	
	log.info("{} koreaInvest입출금거래내역적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $type.text, $DATE.text, $TIME.text, $income.text, $outcome.text, $balance.text, $outmessage.text, $inmessage.text, $targetNumber.text
		, $targetName.text, $targetProducer.text, $fee.text, $channel.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	if ($type.text.contains("출금")) {
		statement.setTitle($type.text, $outmessage.text);
		statement.setIncome($income.text);
		statement.setOutcome($outcome.text);
		statement.setBalance($balance.text);
		statement.setDescription($targetNumber.text, $targetName.text, $targetProducer.text, $inmessage.text);

		if (!"0".equals($fee.text)) {
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, $TIME.text);
			statement.setTitle("[수수료]", $type.text, $outmessage.text);
			statement.setIncome(0);
			statement.setOutcome($fee.text);
			statement.setBalance($balance.text);
			statement.setDescription($targetNumber.text, $targetName.text, $targetProducer.text, $inmessage.text);
			statement.setCategoryName("분류.지출.세금/이자.기타");
		}
	} else {
		statement.setTitle($type.text, $inmessage.text);
		statement.setIncome($income.text);
		statement.setOutcome($outcome.text);
		statement.setBalance($balance.text);
		statement.setDescription($targetNumber.text, $targetName.text, $targetProducer.text, $outmessage.text);
	}
};


// HTML. 한국투자 > 홈 > 트레이딩 > 주식 > 주식 잔고/손익 / 당일매매종합평가.
koreaInvestDayTradeComprehensiveEstimateBefore20220904
:
	line+
	WORD WORD WORD WORD WORD WORD WORD WORD WORD					NEWLINE		//	조회 정보입력 - 계좌번호, 비밀번호, 조회조건, 조회구분 항목으로 구성되어있습니다.
	WORD TAB bankbookNumber1=WORD WORD bankbookNumber2=WORD WORD	NEWLINE		//	계좌번호 	 71409599-01 (권과헌) 72263703-01 (위탁2018) 
	((
		WORD TAB word+ TAB word+ TAB word+ TAB						NEWLINE		//	조회조건 	 시간외 단일가   펀드결제분포함 	 조회구분 	 대출일별   종목별
	) | (
		TAB WORD TAB												NEWLINE		//	비밀번호
	))
	
	line+
	
	word+ TAB NUMBER? TAB											NEWLINE		//	익일정산액
	word+ TAB income=NUMBER TAB										NEWLINE		//	평가손익합계 	 4,777,643
	word+ TAB outcome=NUMBER TAB									NEWLINE		//	추정비용합계 	 38,090
	name1=word+ TAB value1=NUMBER TAB								NEWLINE		//	실평가손익합계 	 4,739,553
	name2=word+ TAB value2=word+ TAB								NEWLINE		//	실평가손익률 	 17.18%
	word+ TAB NUMBER? TAB											NEWLINE		//	총 대주매각대금
	
	line+
	
	WORD TAB word+ TAB												NEWLINE		//	자산증감률 	 1.91%
	word+ TAB balance=NUMBER TAB									NEWLINE		//	매도비용차금 순자산액 	 32,319,560
	WORD WORD+														NEWLINE		//	EXCEL   다음
	
	eof
{
	log.info("koreaInvest당일매매종합평가(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, $bankbookNumber1.text, $bankbookNumber2.text, $income.text, $outcome.text, $name1.text, $value1.text, $name2.text, $value2.text, $balance.text);

	ACCOUNT.setProducer("한국투자");
	if (Utility.parseInteger($balance.text) < 100000000) {
		ACCOUNT.setNumber($bankbookNumber1.text);
	} else {
		ACCOUNT.setNumber($bankbookNumber2.text);
	}

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);

	Calendar calendar = Calendar.getInstance();
	calendar.clear(Calendar.MILLISECOND);

	statement.setTime(calendar.getTime());
	statement.setTitle("평가금액 (" + $value1.text + ",", $value2.text + ")");
	statement.setDescription($name1.text + ":", $value1.text + ",", $name2.text + ":", $value2.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
	statement.setCategoryName("분류.수입.저축/보험.기타");
};


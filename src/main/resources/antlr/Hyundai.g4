grammar Hyundai;

import	Common;

/**
 * 현대카드
 */
hyundaiDocument
	:	hyundaiDeferredPaymentTrafficCard
	;

// 현대카드 > 카드 이용내역(매출전표조회) > 이용처=교통
hyundaiDeferredPaymentTrafficCard:
	line+

	WORD							NEWLINE		//	7,200원 
	hyundaiDeferredPaymentTrafficCardItem+
	WORD WORD						NEWLINE		//	3개월까지 더보기 

	eof
{
	log.info("{} hyundai후불교통카드(『{}』)", Utility.indentMiddle(), "현대카드 후불 하이패스 카드 실시간 승인 HTML");
	kr.andold.household.web.StatementForm STATEMENT = kr.andold.household.web.StatementForm.STATEMENT;
	kr.andold.household.web.AccountForm ACCOUNT = kr.andold.household.web.AccountForm.ACCOUNT;

	ACCOUNT.setProducer("현대카드");
	ACCOUNT.setOwner("권과헌");
	ACCOUNT.setNumber("9***-****-****-840*");
	ACCOUNT.setTitle("현대카드 M 하이패스");

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
};
hyundaiDeferredPaymentTrafficCardItem:
title=WORD year=NUMBER month=NUMBER day=NUMBER TIME extra=WORD outcome=WORD		NEWLINE		//	제이경인연결고속도로(미지정(입구)~북청계) 22. 2. 19 17:01 기타 1,200원
{
	log.info("{} hyundai후불교통카드적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}, 『{}, 『{}』)", Utility.indentMiddle(),
		$title.text, $year.text, $month.text, $day.text, $TIME.text, $extra.text, $outcome.text);
	kr.andold.household.web.StatementForm statement = new kr.andold.household.web.StatementForm();
	kr.andold.household.web.StatementForm.LIST_STATEMENT.add(statement);
	statement.setTime("20" + $year.text + $month.text + $day.text, $TIME.text);
	statement.setTitle($title.text, $extra.text);
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.교통/차량.대중교통비");
};

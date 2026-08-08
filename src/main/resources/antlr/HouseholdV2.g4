grammar HouseholdV2;

import	
		KookminV2			//	국민은행
	,	EtcV2				//	기타
	,	HyundaiV2			//	현대카드
;

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


// Parser Rules - global. include all document.
document
	:	generalStandard20251002		//	표준 2025-10-02 ~
	|	generalStandard		//	표준 deprecated
	|	kookminDocument		//	국민은행
	|	etcDocument			//	기타
	|	hyundaiDocument		//	현대카드
;


//	표준
generalStandard20251002:
	KEYWORD TAB bnumber=word bnumber1=word? bnumber2=word? bnumber3=word? bnumber4=word? bnumber5=word? bnumber6=word? bnumber7=word*	NEWLINE
		//	계좌번호 네이버페이
	WORD TAB
		//	기본값
	DATE TIME TAB
		//	2025-10-02 15:36
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		//	샘플 오브 새로운 표준 텍스트 문법
	description=word description1=word? description2=word? description3=word? description4=word? description5=word? description6=word? description7=word* TAB
		//	자세한 내용은 깃허브에
	income=NUMBER outcome=NUMBER balance=NUMBER TAB
		//	35 15000 0
	account=word account1=word? account2=word? account3=word? account4=word? account5=word? account6=word? account7=word* TAB
		//	네이버페이
	category=WORD				NEWLINE
		//	분류.지출.식비.기타
	generalStandardItem20251002+
	eof
{
	log.info("{} 표준 2025-10-02 ~ parsing done! - (『{} {} {} {} {} {} {} {}』『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {}』『{} {} {}』『{}』『{}』)", Utility.indentMiddle()
		, $bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text
		, $DATE.text, $TIME.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $description.text, $description1.text, $description2.text, $description3.text, $description4.text, $description5.text, $description6.text, $description7.text
		, $income.text, $outcome.text, $balance.text
		, $account.text, $account1.text, $account2.text, $account3.text, $account4.text, $account5.text, $account6.text, $account7.text
		, $category.text
	);

	ACCOUNT.setNumber($bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text);

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	STATEMENT.setDescription($description.text, $description1.text, $description2.text, $description3.text, $description4.text, $description5.text, $description6.text, $description7.text);
	STATEMENT.setIncome($income.text);
	STATEMENT.setOutcome($outcome.text);
	STATEMENT.setBalance($balance.text);
	STATEMENT.setAccountName($account.text, $account1.text, $account2.text, $account3.text, $account4.text, $account5.text, $account6.text, $account7.text);
	STATEMENT.setCategoryName($category.text);
};
generalStandardItem20251002:
	DATE TIME TAB
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
	description=word description1=word? description2=word? description3=word? description4=word? description5=word? description6=word? description7=word* TAB
	income=NUMBER outcome=NUMBER balance=NUMBER TAB
	bnumber=word bnumber1=word? bnumber2=word? bnumber3=word? bnumber4=word? bnumber5=word? bnumber6=word? bnumber7=word* TAB
	category=WORD				NEWLINE

{
	log.info("{} 표준 2025-10-02 ~ 적요(『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {}』『{} {} {}』『{} {} {} {} {} {} {} {}』『{}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $description.text, $description1.text, $description2.text, $description3.text, $description4.text, $description5.text, $description6.text, $description7.text
		, $income.text, $outcome.text, $balance.text
		, $bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text
		, $category.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($description.text, $description1.text, $description2.text, $description3.text, $description4.text, $description5.text, $description6.text, $description7.text);
	statement.setIncome($income.text);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
	statement.setAccountName($bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text);
	statement.setCategoryName($category.text);
};
generalStandard:
	line*

	KEYWORD bnumber=word bnumber1=word? bnumber2=word? bnumber3=word? bnumber4=word? bnumber5=word? bnumber6=word? bnumber7=word*	NEWLINE
	DATE TIME																														NEWLINE
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*							NEWLINE

	line*

	WORD WORD WORD+					NEWLINE
	generalStandardItem+

	eof
{
	log.info("{} 일반 표준 parsing done! - (『{} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {}』『{} {}』)", Utility.indentMiddle()
		, $bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $DATE.text, $TIME.text
	);

	ACCOUNT.setNumber($bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text);

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setDescription($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};
generalStandardItem:
//	WORD WORD WORD WORD				NEWLINE		//	상품(코드) 단가 수량 금액 분류 
	(DATE TIME)? title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
			(unit=NUMBER ea=NUMBER)? total=NUMBER	category=WORD?											NEWLINE		//	002 두부스낵 1 2,500
{
	log.info("{} 일반 표준 적요(『{} {} {} {} {} {} {} {}』『{} {} {}』『{}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $unit.text, $ea.text, $total.text
		, $category.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	if ($DATE.text != null) {
		statement.setTime($DATE.text, $TIME.text);
	}
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	if ($unit.text != null) {
		statement.setDescription($unit.text, "x", $ea.text);
	}
	statement.setOutcome($total.text);
	statement.setCategoryName($category.text);
};


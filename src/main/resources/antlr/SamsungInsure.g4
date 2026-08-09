/**
 * 삼성생명 문법
 */
grammar SamsungInsure;

import	Common;

@header {
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;
}

@members	{
	private final Logger log = LoggerFactory.getLogger(getClass());

	private final AccountForm ACCOUNT = AccountForm.ACCOUNT;
	private final List<StatementForm> LIST_STATEMENT = StatementForm.LIST_STATEMENT;
	private final StatementForm STATEMENT = StatementForm.STATEMENT;
}


/**
 * 삼성생명
 */
samsungInsureDocument
	:	samsungLifeInsurance
	;


/**
 * HTML. 삼성생명 > 나의계약 > 계약조회 > 상세보기.
 */
samsungLifeInsurance:
	line+

	//bankbookNumber=WORD		NEWLINE		//	無퓨처30+퍼펙트통합보장Ⅰ(1.1표)
	bnumber=word bnumber1=word? bnumber2=word? bnumber3=word? bnumber4=word? bnumber5=word? bnumber6=word? bnumber7=word*	NEWLINE
			//	삼성 슬기로운 취미생활 상해보험(2403)(무배당)1종(골절수술보장형) 
	paytotal=word+			NEWLINE		//	총 납입보험료19, 529, 080원 
	line								//	보험계약대출 보험료납입 최종유지년월 
	last=WORD				NEWLINE		//	2022.03(153회) 
	WORD					NEWLINE		//	계약일자 
	DATE					NEWLINE		//	2009.07.08 
	WORD					NEWLINE		//	납입기간 
	(
		period=WORD+		NEWLINE		//	20년 
	)?
	WORD					NEWLINE		//	주보험납기 
	line								//	20 년 
	WORD					NEWLINE		//	보험료 
	outcome=WORD WORD		NEWLINE		//	177,870원 (월납)
	(
		WORD				NEWLINE		//	계약상태 
		WORD				NEWLINE		//	정상 
	)?
	WORD					NEWLINE		//	납입상태 
	WORD					NEWLINE		//	정상 
	WORD					NEWLINE		//	피보험자 
	WORD					NEWLINE		//	박영선 
	WORD					NEWLINE		//	자세히보기 
	WORD					NEWLINE		//	납입방법 
	WORD					NEWLINE		//	자동이체(25일) 
	WORD					NEWLINE		//	이체계좌 
	line								//	하나은행 (304*****004) 
	title=WORD				NEWLINE		//	해지환급금 
	balance=WORD			NEWLINE		//	8,395,831원 
	WORD WORD				NEWLINE		//	보험계약대출 가능금액 
	word WORD				NEWLINE		//	5,920,000 원(5.25%) 

	eof
{
	log.info("{} 삼성생명 계약조회(『{} {} {} {} {} {} {} {}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text
		, $paytotal.text, $last.text, $period.text, $title.text, $balance.text
	);

	ACCOUNT.setProducer("삼성생명");
	ACCOUNT.setNumber($bnumber.text, $bnumber1.text, $bnumber2.text, $bnumber3.text, $bnumber4.text, $bnumber5.text, $bnumber6.text, $bnumber7.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);

	Calendar calendar = Calendar.getInstance();
	calendar.clear(java.util.Calendar.MILLISECOND);

	statement.setTime(calendar.getTime());
	statement.setTitle($title.text, $last.text);
	statement.setDescription($paytotal.text, $DATE.text, "+", $period.text);
	statement.setIncome(0);
	statement.setOutcome($outcome.text);
	statement.setBalance($balance.text);
	statement.setCategoryName("분류.수입.저축/보험.기타");
};

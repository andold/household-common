/**
 * 네이버 문법
 */
grammar Naver;

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
 * 네이버
 */
naverDocument
	:	naverNaverMailShillaBakery	//	네이버 > 메일 > 신라명과
	|	naverNaverMailNaverPay		//	네이버 > 메일 > 네이버페이 > 네이버페이로 결제
	|	naverNaverMailAuction		//	네이버 > 메일 > 옥션
	|	naverNaverPayCancelPay		//	네이버 > 메일 > 네이버페이 > 결제취소:환불
	|	naverNaverPayCancelPurchase	//	네이버 > 메일 > 네이버페이 > 구매취소
	|	naverNaverPay				//	네이버 > 메일 > 네이버페이 > 주문
	|	naverNaverPayDeliveryRace	//	네이버 > 메일 > 네이버페이 > 배달의민족
	|	naverNaverPayCancelSale		//	네이버 > 메일 > 네이버페이 > 판매취소
	|	naverNaverMail11Address		//	네이버 > 메일 > 11번가
	|	naverNaverMainGoogle		//	네이버 > 메일 > 구글
	|	naverNaverMailGMarket		//	네이버 > 메일 > 지마켓
	|	naverNaverMailReserveBuy	//	네이버메일 네이버페이 예약구매
	;


// 신라명과
naverNaverMailShillaBakery:
	line+

	WORD TAB WORD TAB WORD TAB					NEWLINE		//	주문자 	 주문번호 	 주문일자 	 
	WORD TAB WORD TAB DATE TIME TAB				NEWLINE		//	35849945@n(권과헌) 	 20240930-0000286 	 2024-09-30 13:16:17 	 
	TAB											NEWLINE		//		 

	line+

	WORD TAB WORD TAB WORD TAB WORD TAB			NEWLINE		//	상품명 	 수량 	 판매가 	 상품구매금액 	 
	naverNaverMailShillaBakeryItem+
	WORD WORD WORD WORD+ TAB					NEWLINE		//	총 상품구매금액 45,300원 + 총 배송비 0원 - 총 할인금액 0원 - 총 부가결제금액 3,410원 = 총 결제금액 41,890원 	 
	TAB											NEWLINE		//		 
	TAB											NEWLINE		//		 
	TAB WORD WORD TAB											NEWLINE		//		 결제 정보 	 
	WORD WORD TAB total=WORD TAB WORD TAB payby=WORD payby1=word? TAB		NEWLINE		//	총 결제금액 	 41,890원 	 결제수단 	 카카오페이(간편결제) 	 
	WORD TAB WORD TAB WORD WORD TAB WORD TAB					NEWLINE		//	쿠폰할인 	 0원 	 지급예정 적립금 	 200원 	 

	eof
{
	log.info("{} 네이버 메일 신라명과(『{} {}』 『{}』 『{} {}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $payby.text
		, $payby.text, $payby1.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("영수증 일반");

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setDescription("신라명과");
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle("신라명과", $payby.text, $payby1.text);
	statement.setIncome($total.text);
	statement.setCategoryName("분류.수입.전월이월.이체");
};
naverNaverMailShillaBakeryItem:
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		ea=NUMBER TAB unit=WORD TAB outcome=WORD TAB		NEWLINE		//	신라명과 오갓빵 소보루단팥빵 (냉동) 	 3 	 6,500원 	 19,500원 	 
{
	log.info("{} 네이버 메일 신라명과(『{} {} {} {} {} {} {} {} {}』, 『{}』『{}』『{}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $ea.text, $unit.text, $outcome.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle(
		$title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, "(", $ea.text, "x", $unit.text, ")"
	);
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.식비.부식");
};


// HTML. 네이버 > 메일 > 네이버페이 > 네이버페이로 결제
naverNaverMailNaverPay:
	line+

	TAB WORD TAB WORD TAB					NEWLINE		//		 고객명 	 권*헌님 	 
	WORD TAB WORD TAB						NEWLINE		//	결제번호 	 20240818NP9789254008 	 
	WORD TAB DATE TIME TAB					NEWLINE		//	결제일자 	 2024.08.18 21:55 	 
	TAB										NEWLINE		//		 
	TAB TAB									NEWLINE		//		 	 
	WORD TAB								NEWLINE		//	결제정보 	 
	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 
	WORD TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB		NEWLINE
														//	가맹점명 	 무무 아이스크림 할인점&카페 	 
	TAB										NEWLINE		//		 
	WORD WORD WORD TAB total=NUMBER WORD TAB	NEWLINE		//	총 결제 금액 	 14,400 원 	 
	TAB										NEWLINE		//		 
	WORD WORD TAB NUMBER WORD TAB			NEWLINE		//	ㄴ 상품금액 	 14,400 원 	 
	TAB										NEWLINE		//		 
	WORD TAB WORD WORD TAB					NEWLINE		//	결제수단 	 네이버페이 포인트·머니 	 
	TAB										NEWLINE		//		 
	WORD WORD WORD TAB outcome=NUMBER WORD TAB		NEWLINE		//	ㄴ 페이머니 사용 	 14,400 원 	 
	WORD WORD WORD TAB income=NUMBER WORD TAB		NEWLINE		//	ㄴ 페이포인트 사용 	 0 원 	 
	TAB												NEWLINE		//		 

	eof
{
	log.info("{} 네이버 메일 네이버페이(『{} {}』 『{} {} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $income.text, $outcome.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("네이버페이");

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setIncome($income.text);
	statement.setOutcome($total.text);
	statement.setBalance($outcome.text);
	statement.setCategoryName("분류.지출.생활용품.기타");
};


// HTML. 네이버 > 메일 > 옥션
naverNaverMailAuction:
	line+

	date=DATE ampm=WORD? time=TIME				NEWLINE		//	2022-03-11 (금) 18:26 

	line+

	TAB WORD WORD TAB							NEWLINE		//		 주문 내역 	 
	TAB											NEWLINE		//		 
	naverNaverMailAuctionItem+
	TAB											NEWLINE		//		 

	TAB word+ TAB word+ TAB						NEWLINE
															//		 배송방법 	 택배 (발송 후 1~3일 소요) 	 
															//		 배송방법 	 택배 	 
	TAB											NEWLINE		//		 
	TAB											NEWLINE		//		 
	WORD TAB seller=word seller1=word? seller2=word? seller3=word? seller4=word? seller5=word? seller6=word? seller7=word* TAB	NEWLINE
															//	판매자 	 블루오션 (대표자: 김유라)

	line+

	word TAB total=NUMBER WORD TAB							NEWLINE		//	신용카드 	 5,900 원 	 
	WORD TAB NUMBER WORD TAB								NEWLINE		//	스마일캐시 	 0 원 	 
	WORD KEYWORD WORD TAB NUMBER WORD TAB					NEWLINE		//	상품금액 합계 (+) 	 4,000 원 	 
	dtitle=WORD KEYWORD WORD TAB delivery=NUMBER WORD TAB	NEWLINE		//	배송비 합계 (+) 	 2,500 원 	 

	eof
{
	log.info("{} 네이버 메일 옥션(『{} {} {}』, 『{} {} {} {} {}』, 『{} {}』, 『{} {}』)", Utility.indentMiddle()
		, $date.text, $ampm.text, $time.text
		, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("옥션 구매 내역 (네이버 메일)");

	STATEMENT.setTime($date.text, $ampm.text, $time.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription($seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("옥션 구매 내역");
	statement.setIncome($total.text);
	statement.setCategoryName("분류.수입.전월이월.이체");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($dtitle.text);
	statement.setOutcome($delivery.text);
	statement.setCategoryName("분류.지출.생활용품.주방/욕실");
};
naverNaverMailAuctionItem:
	TAB TAB									NEWLINE		//		 	 
	WORD TAB NUMBER TAB						NEWLINE		//	주문번호 	 2363823777 	 
	WORD TAB outcome=WORD WORD WORD TAB		NEWLINE		//	상품금액 	 2,000원 (수량 1개) 	 
	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB?			NEWLINE
				//	트렁크네트 후크 원형 T자형 4P 자동차용 가정용 고리 
				//	WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD		NEWLINE
				//	(1+1 특가) 1+1 극세사 망토담요 똑딱이 단추 무릎 밍크 겨울 블랭킷 
	(option=word option1=word? option2=word? option3=word? option4=word? option5=word? option6=word? option7=word* TAB	NEWLINE)?
		//	· 타입 / T자형후크4P / 2,000원 / 	 
	TAB TAB									NEWLINE		//		 	 
	TAB										NEWLINE		//		 
{
	log.info("{} 네이버 메일 옥션 적요(『{} {} {} {} {} {} {} {} {}』, 『{}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $outcome.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle(
		$title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, "-", $option.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text
	);
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.생활용품.주방/욕실");
};


// 네이버 > 메일 > 네이버페이 > 결제취소:환불
naverNaverPayCancelPay:
	line+

	ndate=DATE nampm=WORD? ntime=TIME		NEWLINE		//	2023년 7월 3일 (월) 오후 12:53 

	line+

	WORD TAB word TAB						NEWLINE		//	결제번호 	 20230624NP6197120966 	 
	WORD TAB DATE TAB						NEWLINE		//	취소일자 	 2023.07.13 	 
	WORD TAB seller=word seller1=word? seller2=word? seller3=word? seller4=word? seller5=word? seller6=word? seller7=word* TAB	NEWLINE		//	판매자 	 AliExpress 	 
	WORD TAB word+ TAB						NEWLINE		//	상품정보 	 CREALITY 공식 Ender-3/Ender 3 V2 3D 프린터 고정밀 
	TAB										NEWLINE		//		 

	line+

	WORD TAB								NEWLINE		//	취소상품 	 
	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB					NEWLINE		//	CREALITY 공식 Ender-3/Ender 3 V2 3D 프린터 고정밀 데스크탑 이력서 인쇄 전문 대형 DIY FDM 프린터 	 
	TAB										NEWLINE		//		 
	WORD TAB price=NUMBER WORD TAB			NEWLINE		//	상품금액 	 112,459 원 	 
	WORD TAB ea=NUMBER TAB					NEWLINE		//	수량 	 1 	 
	TAB										NEWLINE		//		 

	eof
{
	log.info("{} 네이버 메일 페이 결제취소:환불(『{} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
		, $ndate.text, $nampm.text, $ntime.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text
		, $price.text, $ea.text
	);

	ACCOUNT.setNumber("네이버페이");

	STATEMENT.setTime($ndate.text, $nampm.text, $ntime.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
	STATEMENT.setCategoryName("분류.지출.식비.외식");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("[환불]", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text);
	statement.setIncome($price.text);
};


// HTML. 네이버 > 메일 > 네이버페이 > 구매취소
naverNaverPayCancelPurchase:
	line+

	ndate=DATE nampm=WORD? ntime=TIME		NEWLINE		//	2023년 7월 3일 (월) 오후 12:53 

	line+

	WORD TAB NUMBER TAB						NEWLINE		//	주문번호 	 2023070190643851 	 
	WORD TAB bdate=DATE TAB					NEWLINE		//	주문일자 	 2023.07.01 	 
	WORD TAB reason=WORD reason1=WORD? TAB	NEWLINE		//	취소사유 	 배송지연 	 

	line+

	WORD TAB								NEWLINE		//	취소상품 	 

	(
		TAB										NEWLINE		//		 
		TAB										NEWLINE		//		 
		TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB				NEWLINE
				//		 완도 활 전복 1kg 45 25 15미 12 8미 활꼬마전복 산소포장 	 
		WORD WORD option=word option1=word? option2=word? option3=word? option4=word? option5=word? option6=word? option7=word* TAB	NEWLINE
				//	옵션 : 명품수산물: 전복1K(15미) 	 
		TAB												NEWLINE		//		 
		TAB												NEWLINE		//		 
		WORD TAB price=NUMBER WORD TAB					NEWLINE		//	주문금액 	 26,900 원 	 
		WORD TAB ea=NUMBER TAB							NEWLINE		//	수량 	 1 	 
		(
			dname=WORD TAB dfee=WORD WORD WORD+ TAB		NEWLINE		//	배송비 	 3,500원(택배,등기,소포 / 선결제) 	 
			{
				log.info("{} 구매취소물품(『{} {}』)", Utility.indentMiddle(), $dname.text, $dfee.text);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle("[구매취소]", $dname.text);
				statement.setIncome($dfee.text.replaceAll("\\(.*", ""));
				statement.setCategoryName("분류.지출.생활용품.주방/욕실");
			}
		)?
		seller=word seller1=word? seller2=word? seller3=word? seller4=word? seller5=word? seller6=word? seller7=word* TAB		NEWLINE
				//	덕이네 | 사업자명 : 덕이네 | 대표자명 : 추상민 대표전화 : 010-3524-8217 | 대표주소 : (650-828) 경상남도 통영시 광도면 남해안대로 1102 시골밥상 판매자 특이사항: 특이사항 없음 	 
		{
			log.info("{} 구매취소물품(『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $option.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text
				, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text
				, $price.text, $ea.text
			);

			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTitle("[구매취소]", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription($option.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text
				, "-", $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text
			);
			statement.setIncome($price.text);
			statement.setCategoryName("분류.지출.생활용품.주방/욕실");
		}
	)+

	TAB                                     NEWLINE     //
	TAB                                     NEWLINE     //
	TAB                                     NEWLINE     //
	TAB                                     NEWLINE     //
	TAB                                     NEWLINE     //
	tname=WORD TAB tprice=NUMBER WORD TAB   NEWLINE     //  최종결제금액     14,680 원
	TAB                                     NEWLINE     //
	TAB                                     NEWLINE     //
	TAB                                     NEWLINE     //
	TAB                                     NEWLINE     //

	eof
{
	log.info("{} 네이버 메일 페이 구매취소(『{} {} {} {} {} {}』)", Utility.indentMiddle(), $ndate.text, $nampm.text, $ntime.text, $bdate.text, $reason.text, $reason1.text);

	ACCOUNT.setNumber("네이버페이");

	STATEMENT.setTime($ndate.text, $nampm.text, $ntime.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
	STATEMENT.setCategoryName("분류.지출.생활용품.주방/욕실");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("[구매취소]", $tname.text);
	statement.setOutcome($tprice.text);
	statement.setCategoryName("분류.지출.이체/대체.기타");
};


// HTML. 네이버 > 메일 > 구글
naverNaverMainGoogle:
	line+

	date=DATE dateBetweenTime=WORD? time=TIME										NEWLINE		//	2022년 12월 7일 (수) 오후 10:29 
	
	line+

	WORD WORD (NUMBER | WORD)+ TIME WORD WORD		NEWLINE		//	주문 날짜: 2022. 12. 7. 오후 10시 29분 10초 GMT+9 
	line		//	내 계정: andoldest@gmail.com 
	line		//	상품 	 가격 	 
	title1=WORD title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB WORD+ TAB		NEWLINE		//	월말 김어준 (팟빵 - 국내 1위 팟캐스트, 라디오, 오디오북) 	 매월 ₩9,900 	 
	line		//	자동 갱신되는 정기 결제 	 	 
	KEYWORD WORD+ value=WORD TAB										NEWLINE		//	합계 : 매월 ₩9,900 	 
	line		//	(VAT ₩900 포함) 	 
	line		//	결제 방법: 	 NAVER Pay: an******@naver.com 	 
	TAB										NEWLINE		//		 

	eof
{
	log.info("{} naver네이버메일구글(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $date.text, $time.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("구글 결제 내역 (네이버 메일)");

	STATEMENT.setTime($date.text, $dateBetweenTime.text, $time.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("구글", $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setIncome(0);
	statement.setOutcome($value.text);
	statement.setBalance(0);
	statement.setDescription("네이버 메일 > 구글 > 영수증");
};


// HTML. 네이버 > 메일 > 네이버페이 > 예약구매.
naverNaverMailReserveBuy:
	line+

	DATE ampm=WORD? TIME					NEWLINE		//	2022년 11월 13일 (일) 오후 2:54 

	line+

	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 
	TAB ddate=word ddate1=word? ddate2=word? ddate3=word? ddate4=word? ddate5=word? ddate6=word? ddate7=word* TAB		NEWLINE
			//		 [예약구매] 주문종료일: 12/11(일) | 발송예정일: 12/12(월)~12/20(화) 	 
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB			NEWLINE
			//	[예약판매] 유튜버 Peachy 단독! 파이토카나비노이드 CBD 햄프씨드 오일 	 
	option=word option1=word? option2=word? option3=word? option4=word? option5=word? option6=word? option7=word* TAB	NEWLINE
			//	옵션 : 수량 선택: [예약판매] CBD 햄프씨드 오일 	 
	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 

	line+

	TAB										NEWLINE		//		 
	WORD TAB NUMBER WORD TAB				NEWLINE		//	상품금액 	 279,000 원 	 
	WORD TAB NUMBER WORD TAB				NEWLINE		//	배송비 	 0 원 	 
	WORD TAB NUMBER WORD TAB				NEWLINE		//	쿠폰할인 	 -210,000 원 	 
	TAB										NEWLINE		//		 
	WORD TAB price=NUMBER WORD TAB			NEWLINE		//	주문금액 	 69,000 원 	 
	TAB										NEWLINE		//		 

	eof
{
	log.info("{} 네이버메일 네이버페이 예약구매(『{} {} {}』, 『{} {}  {}  {}  {}  {}  {}  {}』 『{} {}  {}  {}  {}  {}  {}  {}』 『{} {}  {}  {}  {}  {}  {}  {}』 『{}』)", Utility.indentMiddle()
		, $DATE.text, $ampm.text, $TIME.text
		, $ddate.text, $ddate1.text, $ddate2.text, $ddate3.text, $ddate4.text, $ddate5.text, $ddate6.text, $ddate7.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $option.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text
		, $price.text
	);

	ACCOUNT.setNumber("네이버페이");

	STATEMENT.setTime($DATE.text, $ampm.text, $TIME.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($option.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text, $ddate.text, $ddate1.text, $ddate2.text, $ddate3.text, $ddate4.text, $ddate5.text, $ddate6.text, $ddate7.text);
	statement.setIncome(0);
	statement.setOutcome($price.text);
	statement.setBalance(0);
	statement.setCategoryName("분류.지출.식비.외식");
};


//	HTML. 네이버 > 메일 > 지마켓
naverNaverMailGMarket:
	line+
	
	type=KEYWORD WORD WORD WORD TAB		NEWLINE		//	신용카드 [안심결제 - 408966**********] 	 
	TAB									NEWLINE		//		 
	date=DATE time=TIME WORD TAB		NEWLINE		//	2022년 3월 16일(수) 17시 32분 결제완료 	 
	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	key1=WORD TAB value1=WORD TAB		NEWLINE		//	주문금액 	 42,700원 	 
	TAB									NEWLINE		//		 
	key2=WORD TAB value2=word+ TAB		NEWLINE		//	할인금액 	 - 6,650원 	 
	TAB									NEWLINE		//		 
	key3=WORD TAB value3=word+ TAB		NEWLINE		//	배송비 	 무료배송 	 
	TAB TAB								NEWLINE		//		 	 
	TAB									NEWLINE		//		 
	key4=word+ TAB value4=word+ TAB		NEWLINE		//	스마일캐시 사용 	 - 0원 	 
	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	key5=WORD WORD TAB value5=WORD TAB	NEWLINE		//	총 결제금액 	 36,050원 	 

	line+

	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	TAB									NEWLINE		//		 
	naverNaverMailGMarketItem+
	seller=WORD TAB						NEWLINE		//	maximall 	 
	TAB									NEWLINE		//		 

	eof
{
	log.info("{} naver네이버메일지마켓(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $date.text, $time.text, $seller.text, $key1.text, $value1.text, $key2.text, $value2.text, $key3.text, $value3.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("G마켓 구매 내역 (네이버 메일)");

	STATEMENT.setTime($date.text, $time.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("G마켓", $seller.text, $key1.text, $value1.text, $key2.text, $value2.text, $key3.text, $value3.text, $key4.text, $value4.text, $key5.text, $value5.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("G마켓", $type.text);
	statement.setIncome($value5.text);

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($key3.text);
	statement.setOutcome($value3.text);
};
naverNaverMailGMarketItem:
	TAB										NEWLINE		//		 
	TAB title1=word title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* outcome=WORD WORD ea=WORD 		NEWLINE
														//		 실리콘 조리도구 이유식 국자 뒤집개 도마 주방용품 색상입력: 레드 (0원) 필수선택: 05.레벤쿠첸 실리콘 멀티 도마 중 (+5,400원) 10,900원 / 1개 
	WORD WORD WORD							NEWLINE		//	3/21일(월) 출발 예정 
	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 
{
	log.info("{} naver네이버메일지마켓적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $ea.text, $outcome.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("G마켓", $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $ea.text);
	statement.setOutcome($outcome.text);
};


// HTML. 네이버 > 메일 > 11번가
naverNaverMail11Address:
	line+

	date=DATE ampm=WORD? time=TIME						NEWLINE		//	2022-03-11 (금) 18:26 

	line+

	((
		WORD WORD TAB WORD WORD key2=WORD value2=WORD TAB	NEWLINE		//	총 결제금액 	 24,800원 11pay 계좌이체 24,800원 	 
	) | (
		WORD WORD TAB WORD key2=KEYWORD value2=WORD TAB		NEWLINE		//	총 결제금액 	 19,800원 신용카드 19,800원
	)) 	 

	line+

	DATE WORD NUMBER? TAB								NEWLINE		//	2022-03-14 주문번호 20220314393547943 	 
	naverNaverMail11AddressItem+
	WORD key3=WORD+ TAB value3=WORD TAB					NEWLINE		//	총 배송비 	 2,500원 	 
	WORD TAB seller=word seller1=word? seller2=word? seller3=word? seller4=word* TAB	NEWLINE		//	판매자 	 주식회사 가이드컴 	 
	WORD TAB WORD+ TAB									NEWLINE		//	대표번호 	 000-1544-1090 	 

	eof
{
	log.info("{} naver네이버메일11번가(『{} {} {}』, 『{} {} {} {} {}』, 『{} {}』, 『{} {}』)", Utility.indentMiddle()
		, $date.text, $ampm.text, $time.text
		, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text
		, $key2.text, $value2.text, $key3.text, $value3.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("11번가 구매 내역 (네이버 메일)");

	STATEMENT.setTime($date.text, $ampm.text, $time.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription($seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("11번가", "-", $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, "-", $key2.text);
	statement.setIncome($value2.text);
	statement.setCategoryName("분류.수입.전월이월.이체");

	statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($key3.text);
	statement.setOutcome($value3.text);
	statement.setCategoryName("분류.지출.생활용품.주방/욕실");
};
naverNaverMail11AddressItem:
((	//	garbage
	WORD WORD+ TAB WORD TAB				NEWLINE		//	총 배송비 	 무료 	 
	WORD TAB word+ TAB					NEWLINE		//	판매자 	 주식회사 지온패션 	 
	WORD TAB WORD+ TAB					NEWLINE		//	대표번호 	 051-637-2716 	 
	TAB									NEWLINE		//		 
) | (
	TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
		outcome=NUMBER WORD WORD ea=WORD TAB				NEWLINE		//		 팬틴 PRO-V 극손상 케어 샴푸 500ml 3개 16,800 원 / 1개 	 
	TAB														NEWLINE		//		 
{
	log.info("{} naver네이버메일11번가적요(『{} {} {} {} {} {} {} {} {}』, 『{}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $ea.text
		, $outcome.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $ea.text);
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.생활용품.주방/욕실");
}));


// HTML. 네이버 > 메일 > 네이버페이 > 배달의민족
naverNaverPayDeliveryRace:
	line+

	DATE ampm=WORD? TIME					NEWLINE		//	2022년 11월 16일 (수) 오후 12:15 

	line+

	WORD TAB DATE TAB						NEWLINE		//	결제일자 	 2022.03.11 	 
	WORD TAB seller=WORD seller1=word? seller2=word? seller3=word? seller4=word? seller5=word? seller6=word* TAB	NEWLINE		//	판매자 	 구글을 통한 구매 	 
	WORD TAB product1=word? product2=word? product3=word? product4=word? product5=word? product6=word* TAB			NEWLINE		//	상품정보 	 알탕외 2 	 
	TAB TAB									NEWLINE		//		 	 

	line+

	TAB										NEWLINE		//		 
	key1=WORD TAB value1=NUMBER WORD TAB	NEWLINE		//	주문금액 	 25,000 원 	 
	(WORD TAB NUMBER TAB					NEWLINE)?	//	수량 	 1 	 
	TAB										NEWLINE		//		 

	eof
{
	log.info("{} naver네이버메일페이배달의민족(『{} {} {}』, 『{} {} {} {} {} {}』, 『{} {} {} {} {} {} {}』, 『{} {}』)", Utility.indentMiddle()
		, $DATE.text, $ampm.text, $TIME.text
		, $product1.text, $product2.text, $product3.text, $product4.text, $product5.text, $product6.text
		, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text
		, $key1.text, $value1.text
	);

	ACCOUNT.setNumber("네이버페이");

	STATEMENT.setTime($DATE.text, $ampm.text, $TIME.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($product1.text, $product2.text, $product3.text, $product4.text, $product5.text, $product6.text);
	statement.setDescription($seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text);
	statement.setIncome(0);
	statement.setOutcome($value1.text);
	statement.setBalance(0);
	statement.setCategoryName("분류.지출.식비.외식");
};


// HTML. 네이버 > 메일 > 네이버페이 > 판매취소
naverNaverPayCancelSale:
	line+

	ndate=DATE nampm=WORD? ntime=TIME			NEWLINE		//	2022-02-04 (금) 12:26 

	line+

	WORD TAB bdate=DATE btime=TIME TAB			NEWLINE		//	주문일자 	 2022.01.13 03:33 	 
	TAB											NEWLINE		//		 
	WORD TAB									NEWLINE		//	사유/판매자메시지 	 
	reason=word reason1=word? reason2=word? reason3=word? reason4=word? reason5=word? reason6=word? reason7=word* TAB	NEWLINE		//	[배송지연] 택배사의 파업으로 취소합니다. 	 
	TAB											NEWLINE		//		 

	line+

	WORD TAB									NEWLINE		//	판매취소상품 	 
	TAB											NEWLINE		//		 
	(
		TAB										NEWLINE		//		 
		TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB					NEWLINE		//		 800154 여자 잠옷 수면잠옷 면기모 겨울파자마 면 국내생산 잠옷바지 	 
		WORD WORD option=word option1=word? option2=word? option3=word? option4=word? option5=word? option6=word? option7=word* TAB		NEWLINE		//	옵션 : 사이즈=3번와인 	 
		TAB										NEWLINE		//		 
		TAB										NEWLINE		//		 
		key1=WORD TAB value1=NUMBER WORD TAB	NEWLINE		//	주문금액 	 10,400 원 	 
		(WORD TAB NUMBER TAB					NEWLINE)?	//	수량 	 1 	 
		(WORD TAB word+ TAB						NEWLINE)?	//	배송비 	 2,500원(택배,등기,소포 / 선결제) 	 
		seller=word seller1=word? seller2=word? seller3=word? seller4=word? seller5=word? seller6=word? seller7=word* TAB?				NEWLINE		//	혀니미니 | 사업자명 : 혀니미니 |대표자명 : 조항미 대표전화 : 010-8723-0531 | 대표주소 : 서울특별시 성북구 인촌로17가길 64 (안암동1가, 래미안 안암 104동 1501호 
		(TAB									NEWLINE)?	//		 
		TAB										NEWLINE		//		 
		WORD WORD WORD WORD WORD TAB			NEWLINE		//	쇼핑몰 구매 약관 보기 > 	 
		TAB										NEWLINE		//		 
		{
			log.info("{} 네이버 메일 페이 판매취소 inner(『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』 『{} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text
				, $key2.text, $value2.text
			);

			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTitle("[판매취소]", $bdate.text, $btime.text
				, "-", $reason.text, $reason1.text, $reason2.text, $reason3.text, $reason4.text, $reason5.text, $reason6.text, $reason7.text
				, "-", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription($seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text
				, $option.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text);
			statement.setIncome($value1.text);
			statement.setCategoryName("분류.지출.식비.외식");
		}
	)+
	TAB										NEWLINE		//		 
	TAB TAB									NEWLINE		//		 	 

	line+

	TAB										NEWLINE		//		 
	WORD TAB NUMBER WORD TAB				NEWLINE		//	상품금액 	 40,900 원 	 
	key2=WORD TAB value2=word+ TAB			NEWLINE		//	배송비 	 0 원 	 
	WORD TAB NUMBER WORD TAB				NEWLINE		//	쿠폰할인 	 0 원 	 
	TAB										NEWLINE		//		 
	WORD TAB NUMBER WORD TAB				NEWLINE		//	주문금액 	 40,900 원 	 
	TAB										NEWLINE		//		 

	line+
{
	log.info("{} 네이버 메일 페이 판매취소(『{} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
		, $ndate.text, $nampm.text, $ntime.text, $bdate.text, $btime.text
		, $reason.text, $reason1.text, $reason2.text, $reason3.text, $reason4.text, $reason5.text, $reason6.text, $reason7.text
		, $key2.text, $value2.text
	);

	ACCOUNT.setNumber("네이버페이");

	STATEMENT.setTime($ndate.text, $nampm.text, $ntime.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("");
	STATEMENT.setCategoryName("분류.지출.식비.외식");

	if ($key2.text != null) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle("[판매취소]", $key2.text
			, "-", $bdate.text, $btime.text
			, "-", $reason.text, $reason1.text, $reason2.text, $reason3.text, $reason4.text, $reason5.text, $reason6.text, $reason7.text
			, "-", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
		statement.setIncome($value2.text.replaceAll("\\(.*", ""));
		statement.setDescription($option.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text
			, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text);
	}
};


// HTML. 네이버 > 메일 > 네이버페이 > 주문
naverNaverPay:
	line+

	DATE dateBetweenTime=WORD TIME				NEWLINE		//	2022-03-11 (금) 18:26 

	line+

	WORD TAB									NEWLINE		//	주문상품 	 
	TAB											NEWLINE		//		 
	naverNaverPayOrder+
	TAB											NEWLINE		//		 
	TAB TAB										NEWLINE		//		 	 
	TAB TAB										NEWLINE		//		 	 
	TAB											NEWLINE		//		 
	WORD TAB NUMBER WORD TAB					NEWLINE		//	상품금액 	 19,400 원 	 
	key2=WORD TAB value2=NUMBER WORD TAB		NEWLINE		//	배송비 	 +3,000 원 	 
	WORD TAB NUMBER WORD TAB					NEWLINE		//	쿠폰할인 	 -11,000 원 	 
	TAB											NEWLINE		//		 
	WORD TAB NUMBER WORD TAB					NEWLINE		//	주문금액 	 11,400 원 	 
	TAB											NEWLINE		//		 

	eof
{
	log.info("{} naver네이버메일페이(『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $DATE.text, $TIME.text, $key2.text, $value2.text
	);

	ACCOUNT.setNumber("네이버페이");

	STATEMENT.setTime($DATE.text, $dateBetweenTime.text, $TIME.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	//	배송비
	if ($key2.text != null && $value2.text != null && !$value2.text.equals("0")) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($key2.text);
		statement.setOutcome($value2.text);
		statement.setCategoryName("분류.지출.식비.외식");
	}
};
naverNaverPayOrder:
	TAB												NEWLINE		//		 
	TAB title1=word title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB	NEWLINE		//		 800154 여자 잠옷 수면잠옷 면기모 겨울파자마 면 국내생산 잠옷바지 	 
	WORD WORD option1=word option2=word? option3=word? option4=word? option5=word? option6=word? option7=word* TAB		NEWLINE		//	옵션 : 사이즈=3번와인 	 
	TAB										NEWLINE		//		 
	TAB										NEWLINE		//		 
	key1=WORD TAB value1=NUMBER WORD TAB	NEWLINE		//	주문금액 	 10,400 원 	 
	WORD TAB NUMBER TAB						NEWLINE		//	수량 	 1 	 
	(WORD TAB word+ TAB						NEWLINE)?	//	배송비 	 2,500원(택배,등기,소포 / 선결제) 	 
	seller=word word+ TAB					NEWLINE
			//	혀니미니 | 사업자명 : 혀니미니 |대표자명 : 조항미 대표전화 : 010-8723-0531 | 대표주소 : 서울특별시 성북구 인촌로17가길 64 (안암동1가, 래미안 안암 104동 1501호 
			//	3.9 SECONDS | 사업자명 : (주)에이치엔디컴퍼니 | 대표자명 : 이영훈 대표전화 : 070-4693-3455 | 대표주소 : (482-110) 경기도 양주시 삼숭동 삼숭로 66번길 10 판매자 특이사항: 특이사항 없음 	 
	TAB										NEWLINE		//		 
	naverNaverPayOrderAddition*	//	추가상품
	(	//	2023-09-17 추가된듯
		WORD WORD WORD WORD WORD TAB			NEWLINE		//	쇼핑몰 구매 약관 보기 > 	 
		TAB										NEWLINE		//		 
	)?
	naverNaverPayOrderAddition*	//	추가상품

{
	log.info("{} naver네이버메일페이주문상품(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $title1.text, $seller.text, $key1.text, $value1.text
	);

	STATEMENT.setDescription($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $seller.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($seller.text, $option1.text, $option2.text, $option3.text, $option4.text, $option5.text, $option6.text, $option7.text);
	statement.setOutcome($value1.text);
	statement.setCategoryName("분류.지출.식비.외식");
};
naverNaverPayOrderAddition:
	TAB										NEWLINE		//		 
	prefix=WORD TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB	NEWLINE
			//	추가상품 	 LR44배터리 	 
	WORD TAB outcome=NUMBER WORD TAB		NEWLINE	
		//	주문금액 	 150 원 	 
	WORD TAB ea=NUMBER TAB					NEWLINE
			//	수량 	 1 	 
	seller=word seller1=word? seller2=word? seller3=word? seller4=word? seller5=word? seller6=word? seller7=word* TAB		NEWLINE
			//	스마트마오르 | 사업자명 : 마오르 | 대표자명 : 신희정 대표전화 : 070-8274-0601 | 대표주소 : (12986) 경기도 하남시 초이로80번길 54 3동 302호 판매자 특이사항: 특이사항 없음 	 
	TAB										NEWLINE		//		 
	(	//	2023-09-17 추가된듯
		WORD WORD WORD WORD WORD TAB			NEWLINE		//	쇼핑몰 구매 약관 보기 > 	 
		TAB										NEWLINE		//		 
	)?
{
	log.info("{} 네이버 메일 페이 주문 추가상품(『{}』 『{} {} {} {} {} {} {} {}』 『{} {}』 『{} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
		, $prefix.text
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $outcome, $ea
		, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text
	);

	STATEMENT.setDescription($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $seller.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($prefix.text, "-", $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text);
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.식비.외식");
};

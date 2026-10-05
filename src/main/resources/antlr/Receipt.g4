/**
 * 영수증 문법
 */
grammar Receipt;

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
 * 영수증
 */
receiptDocument
	:	receiptNHHanaroTransationInquiry	// 농협하나로마트 거래내역조회
	|	receiptHanaro	// 하나로
	|	receiptHanaroDirectTrade	// 하나로 직거래
	|	exHipass				// 도로공사 고속도로 통행료
	|	hipass					// SMHiPlus:: MY PLUS > 카드 이용내역
	|	receiptEMart			//	이마트
	|	receiptSSg				//	SSG ssg.com 주문상세
	|	receiptTaeYoungHomeMart // 태영홈마트
	|	receiptDureSupplyHistoryDetail	//	두레생협 > 마이두레 > 공급내역 > 상세보기
	|	receiptICoorpHtml	//	두레생협 홈페이지 > 마이두레 > 장보기 > 주문내역 > 주문 상세보기
	|	receiptICoorp	// 두레생협 홈페이지 > 마이두레 > 장보기 > 매장구매내역 > 영수증출력
	|	receiptStandard	// 표준
	;


//	농협하나로마트 거래내역조회
receiptNHHanaroTransationInquiry:
	line+

	WORD WORD NUMBER WORD NUMBER							NEWLINE		//	기간별 조회 20260702 ~ 20260802 
	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB TAB		NEWLINE		//	번호 	 일시 	 내역 	 매장 	 구매금액(원)

	(
		NUMBER TAB DATE TAB
			title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
			place=word place1=word? place2=word? place3=word? place4=word? place5=word? place6=word? place7=word* TAB
			total=NUMBER TAB TAB		NEWLINE
			//	3 	 2026-07-11 	 [해마]해물모듬 300g 외 25건 	 (주)농협하나로유통 성남점(소매) 	 156,500 	 	 
		{
			log.info("{} 농협하나로마트 거래내역조회(『{} {}』)", Utility.indentMiddle()
				, $DATE.text, $total.text
			);
			STATEMENT.setTime($DATE.text);
			STATEMENT.setDescription("[농협하나로마트]", $total.text);
			STATEMENT.setIncome(0);
			STATEMENT.setOutcome(0);
			STATEMENT.setBalance(0);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, "12:00");
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription($place.text, $place1.text, $place2.text, $place3.text, $place4.text, $place5.text, $place6.text, $place7.text);
			statement.setIncome($total.text);
			statement.setOutcome(0);
			statement.setBalance(0);
			statement.setCategoryName("분류.수입.전월이월.이체");
		}
		receiptNHHanaroTransationInquiryItems+
		TAB		NEWLINE
	)+ 	 	 

	WORD NUMBER WORD										NEWLINE		//	처음 1 끝 
	WORD WORD WORD WORD WORD+							NEWLINE
			//	회사소개 이용약관 개인정보 처리방침 이메일 무단수집 거부 사이트맵 통합회원 탈퇴 주소 : 서울특별시 마포구 신촌로 66, 7층 (노고산동, 농협복합건물) 대표이사: 김주양 사업자번호 : 825-85-02030 
	eof
{
	log.info("{} 농협하나로마트 거래내역조회(『영수증』『하나로마트 구매 내역 (농협몰)』)", Utility.indentMiddle());
	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("하나로마트 구매 내역 (농협몰)");
};
receiptNHHanaroTransationInquiryItems:
	title=WORD title1=WORD? title2=WORD? title3=WORD? title4=WORD? title5=WORD? title6=WORD? title7=WORD* ea=WORD NUMBER
		//	[해마]해물모듬 300g 2ea 13,200
{
	log.info("{} 농협하나로마트 거래내역조회(『{} {} {} {} {} {} {} {}』『{} {}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $ea.text, $NUMBER.text
	);
	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime(STATEMENT.getTime());
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($ea.text);
	statement.setIncome(0);
	statement.setOutcome($NUMBER.text);
	statement.setBalance(0);
	statement.setCategoryName("분류.지출.식비.부식");
};


//	하나로 직거래
receiptHanaroDirectTrade:
	line+

	WORD DATE TIME WORD					NEWLINE		//	SI직*래1 2025-06-08 11:06:47 1088-00118 
	WORD WORD WORD WORD total=NUMBER	NEWLINE		//	총 구 매 액: 22,060 
	WORD								NEWLINE		//	--------------------------------- 
	line+
	NUMBER								NEWLINE		//	0000092506081088001180 
	WORD WORD WORD WORD					NEWLINE		//	GH상품(코드) 단가 수량 금액 
	(
		NUMBER title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE		//	001 Ｐ직거래장터 이병각/국산/성남농협 
		WORD unit=NUMBER ea=NUMBER amount=NUMBER																		NEWLINE		//	001*274721 10,000 1 10,000 
//		NUMBER WORD WORD				NEWLINE		//	002 Ｐ직거래장터 이병각/국산/성남농협 
//		WORD NUMBER NUMBER NUMBER		NEWLINE		//	002*274721 12,060 1 12,060 
		{
			log.info("{} 하나로 직거래 『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {}』", Utility.indentMiddle()
				, $DATE.text, $TIME.text
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $unit.text, $ea.text, $amount.text
			);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, $TIME.text);
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription($unit.text, "x", $ea.text);
			statement.setOutcome($amount.text);
			statement.setCategoryName("분류.지출.식비.부식");
		}
	)+
	WORD word*							NEWLINE		//	바코드앞 * 면세, # 영세, 상품명 Ｐ포인트 

	eof
{
	log.info("{} 하나로 직거래", Utility.indentMiddle());

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("하나로마트 구매 내역 (농협몰)");

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setDescription("하나로마트", $total.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle("하나로 직거래 영수증", $total.text);
	statement.setDescription("");
	statement.setIncome($total.text);
	statement.setOutcome(0);
	statement.setBalance(0);
	statement.setCategoryName("분류.수입.전월이월.이체");
};


// 텍스트. 하나로.
receiptHanaro:
	line+

	WORD DATE TIME WORD						NEWLINE		//	한신목 2022-05-08 14:42:41 1023-00091 
	WORD WORD WORD WORD						NEWLINE		//	상품(코드) 단가 수량 금액 
	receiptHanaroItem+
	WORD WORD WORD WORD NUMBER				NEWLINE		//	총 구 매 액: 134,243 

	line+

	WORD KEYWORD WORD WORD					NEWLINE		//	****** 신용카드 매출전표(고객용) ****** 
	WORD									NEWLINE		//	********************************************** 
	WORD WORD								NEWLINE		//	하나비자:40896670****365* (IC) 
	WORD WORD total=WORD					NEWLINE		//	할부:00개월 매출금액: 106,050원 

	eof
{
	log.info("{} 하나로 영수증(『{}』, 『{}』, 『{}』)", Utility.indentMiddle(), $DATE.text, $TIME.text, $total.text);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("하나로마트 구매 내역 (농협몰)");

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setDescription("하나로마트", $total.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTime($DATE.text, $TIME.text);
	statement.setTitle("하나로 영수증", $total.text);
	statement.setDescription("");
	statement.setIncome($total.text);
	statement.setOutcome(0);
	statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptHanaroItem:
seq=NUMBER title1=word title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE
		//	001 Ps. 롯데: 몽쉘카카오케이크 192g 192G 
((NUMBER NUMBER)|(WORD)) unit=NUMBER ea=NUMBER total=NUMBER 		NEWLINE		//	8801062273294 2,400 1 2,400 
(WORD+ NUMBER NUMBER?												NEWLINE)?	//	1,000원추가할인@청파수산_봉지 -2,000 
	//	WORD WORD WORD NUMBER										NEWLINE		//	농식품부 할인지원 행사(설명절 -340 
	//	WORD WORD WORD NUMBER NUMBER								NEWLINE		//	농축산물 할인쿠폰('24년 3월 4 -380 
{
	log.info("{} receipt하나로적요 parsing done! - (『{}』 / 『{}』, 『{}』, 『{}』, 『{}』, 『{}』 / 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $seq.text
		, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $unit.text, $ea.text, $total.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title1.text.replaceFirst("[0-9a-zA-Z\\.,&:\\s]*", ""), $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setDescription($unit.text, "x", $ea.text, "하나로");
	statement.setOutcome($total.text);
	statement.setCategoryName("분류.지출.식비.주식");
};


//	도로공사 고속도로 통행료
exHipass:
	line+

	TAB WORD+ TAB WORD+ TAB WORD+ TAB (WORD+ TAB)+		NEWLINE
			//		 No 	 거래일시 	 하이패스 카드 	 카드별칭 	 차종 	 입구영업소 	 출구영업소 	 이용차로 	 거래금액 	 청구일자 	 

	(
		NUMBER NUMBER NUMBER NUMBER+ TAB
			NUMBER TAB
			DATE TIME TAB
			word+ TAB
			word* TAB
			word+ TAB
			in=word in1=word? in2=word? in3=word? in4=word? in5=word? in6=word? in7=word* TAB
			out=word out1=word? out2=word? out3=word? out4=word? out5=word? out6=word? out7=word* TAB
			word+ TAB
			won=WORD TAB
			word+ TAB		NEWLINE
				//	0 1000 91 20 	 20 	 2024/09/25 13:42:40 	 [선불] 0020-****-****-9335 	 	 1종 	 - 	 서수지 	 선불Hi-pass 	 1,000원 	 - 	 
				//	4 2400 0 16 	 16 	 2024/09/23 18:40:12 	 [선불] 0020-****-****-9335 	 	 1종 	 동전주 	 남논산상 	 선불Hi-pass 	 2,400원 	 - 	 
		{
			log.info("{} 도로공사 하이패스 『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {}』『{}』", Utility.indentMiddle()
				, $DATE.text, $TIME.text
				, $out.text, $out1.text, $out2.text, $out3.text, $out4.text, $out5.text, $out6.text, $out7.text
				, $in.text, $in1.text, $in2.text, $in3.text, $in4.text, $in5.text, $in6.text, $in7.text
				, $won.text
			);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, $TIME.text);
			statement.setTitle(
				$out.text, $out1.text, $out2.text, $out3.text, $out4.text, $out5.text, $out6.text, $out7.text
				, "⇦"
				, $in.text, $in1.text, $in2.text, $in3.text, $in4.text, $in5.text, $in6.text, $in7.text
			);
			statement.setOutcome($won.text);
			statement.setCategoryName("분류.지출.교통/차량.대중교통비");
		}
	)+
	WORD												NEWLINE		//	스크롤 

	eof
{
	log.info("{} 도로공사 하이패스", Utility.indentMiddle());

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("영수증 일반");

	STATEMENT.setDescription("도로공사 고속도로 통행료 하이패스");
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};


// SMHiPlus:: MY PLUS > 카드 이용내역
hipass:
	line+
	WORD WORD NUMBER WORD										NEWLINE		//	50건 총 6 건 
	line+

	TAB WORD TAB WORD TAB WORD TAB WORD TAB (WORD+ TAB)+		NEWLINE
			//		 번호 	 카드번호 	 이용일시 	 거래유형 	 이용전 금액 	 이용 금액 	 이용후 금액 	 구분 	 입구 	 출구 	 
	hipassItem+
	WORD														NEWLINE		//	알아두세요! 

	eof
{
	log.info("{} 하이패스 자동충전카드", Utility.indentMiddle());

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("하이패스 자동충전카드");

	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
};
hipassItem:
	TAB sequence=NUMBER TAB cardNumber=WORD TAB DATE TIME TAB
		type=WORD TAB before=NUMBER TAB outcome=NUMBER TAB balance=NUMBER TAB
		producer=WORD TAB entrance=WORD TAB exit=WORD TAB							NEWLINE
			//		 1 	 0020-0101-5062-9335 	 2024-05-08 17:55:27 	 지불 	 56,600 	 1,000 	 55,600 	 민자 	 - 	 서수지영업소 	 
{
	log.info("{} 하이패스 자동충전카드(『{} {}』『{} {}』『{} {}』『{} {}』『{}』『{} {}』)", Utility.indentMiddle()
		, $sequence.text, $cardNumber.text
		, $DATE.text, $TIME.text
		, $type.text, $before.text
		, $outcome.text, $balance.text
		, $producer.text
		, $entrance.text, $exit.text
	);

	StatementForm statement = null;
	switch ($type.text) {
		case "자동충전":
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, $TIME.text);
			statement.setTitle($type.text);
			statement.setDescription($before.text, "+", $outcome.text, "=", $balance.text);
			statement.setIncome($outcome.text);
			statement.setBalance($balance.text);
			statement.setCategoryName("분류.수입.전월이월.이체");
			break;
		default:
			statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTime($DATE.text, $TIME.text);
			statement.setTitle($exit.text, "⇦", $entrance.text, $producer.text);
			statement.setDescription($before.text, "-", $outcome.text, "=", $balance.text);
			statement.setOutcome($outcome.text);
			statement.setBalance($balance.text);
			statement.setCategoryName("분류.지출.교통/차량.대중교통비");
			break;
	}
}
;


//	emart > My 이마트 > 영수증 보관함
receiptEMart:
	seller=word seller1=word? seller2=word? seller3=word? seller4=word? seller5=word? seller6=word? seller7=word* WORD		NEWLINE		//	이마트 광교점 T:(031)328-9123

	line+

	WORD datestring=WORD TIME WORD				NEWLINE		//	[구 매]2024-08-12 14:21 POS:2004-2447 
	WORD										NEWLINE		//	---------------------------------------------- 
	WORD WORD WORD WORD+						NEWLINE		//	상 품 명 단 가 수량 금 액 
	WORD										NEWLINE		//	---------------------------------------------- 

	receiptEMartItem+

	WORD+ NUMBER				NEWLINE		//	총 품목 수량 29 
	(WORD+ NUMBER				NEWLINE)+	//	공 병 100 
	WORD+ total=NUMBER			NEWLINE		//	결 제 대 상 금 액 172,040 
	WORD						NEWLINE		//	---------------------------------------------- 

	eof
{
	log.info("{} 이마트 『{} {} {} {} {} {} {} {}』", Utility.indentMiddle()
		, $seller.text, $seller1.text, $seller2.text, $seller3.text, $seller4.text, $seller5.text, $seller6.text, $seller7.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("SSG 이마트 구매 내역");

	STATEMENT.setTime($datestring.text.replaceAll(".*\\]", ""), $TIME.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("SSG 이마트 구매 내역");
	statement.setIncome($total.text);
	statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptEMartItem:
(
	WORD										NEWLINE		//	---------------------------------------------- 
) | (	//	노브랜드
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE
	     													//  03* 서귀포하우스감귤800g(팩)
	word unit=NUMBER ea=NUMBER sum=NUMBER		NEWLINE		//	2000000480053 8,980 2 17,960
	(word+ NUMBER								NEWLINE)?	//	s포인트 적립시 할인 -7,190
	{
		log.info("{} 이마트 『{} {} {} {} {} {} {} {}』『{} {} {}』", Utility.indentMiddle()
			, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
			, $unit.text, $ea.text, $sum.text
		);

		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
		statement.setDescription("[노브랜드] ", $unit.text, "x", $ea.text);
		statement.setOutcome($sum.text);
		statement.setCategoryName("분류.지출.식비.주식");
	}
) | (
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
		unit=NUMBER ea=NUMBER sum=NUMBER		NEWLINE
			//	CJ 비비고 플랜테이블 6,980 1 6,980 
	NUMBER										NEWLINE		//	8801007949109 
	(word+ NUMBER								NEWLINE)?	//	냉동_8월1차 -3,490 
															//	S-point 20% 할인 -3,140 
	{
		log.info("{} 이마트 『{} {} {} {} {} {} {} {}』『{} {} {}』", Utility.indentMiddle()
			, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
			, $unit.text, $ea.text, $sum.text
		);

		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
		statement.setDescription($unit.text, "x", $ea.text, "=", $sum.text);
		statement.setOutcome($sum.text);
		statement.setCategoryName("분류.지출.식비.주식");
	}
)
;

//	SSG 홈페이지 > MySSG > 나의 주문관리 > 구매내역 > 주문상세내역보기
receiptSSg:
	line+

	DATE WORD WORD WORD WORD WORD+			NEWLINE		//	2023.09.06 주문번호 20230906-882C9E 전자영수증 장바구니 담기 쓱배송 

	receiptSSgSSgDelivery?								//	쓱배송
	receiptSSgD2DDelivery?								//	택배배송

	line+

	KEYWORD									NEWLINE		//	신용카드 
	outcome=NUMBER WORD						NEWLINE		//	68,440 원 
	WORD WORD								NEWLINE		//	하나카드 4089-66**-****-**** 

	eof
{
	log.info("{} SSG 이마트몰 영수증 - (『{} {}』 『{} {}』)", Utility.indentMiddle()
		, $DATE.text, $outcome.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("SSG 이마트 구매 내역");

	STATEMENT.setTime($DATE.text);
	STATEMENT.setDescription("SSG 이마트 구매 내역", $DATE.text, $outcome.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("SSG 이마트", $outcome.text);
	statement.setTime($DATE.text);
	statement.setIncome($outcome.text);
	statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptSSgSSgDelivery:	//	쓱배송
	line+
	WORD word+				NEWLINE		//	※ 입력하신 정보는 배송목적으로만 사용되며, 배송 후 안전하게 폐기됩니다. 

	(
		TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		WORD total=NUMBER WORD WORD ea=NUMBER WORD TAB		NEWLINE
			//		 신선보장 [냉동][중국] 해물 모둠 (500g) 	 판매가격 8,880 원 수량 1 개 	 
		{
			log.info("{} SSG 이마트몰 쓱배송 적요(『{} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $ea.text, $total.text);
		
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription($ea.text);
			statement.setOutcome($total.text);
			statement.setCategoryName("분류.지출.식비.주식");
		}
	)+

	WORD word+										NEWLINE		//	함께 받아 볼 상품 주문더하기 추가 배송비 없이 빠뜨린 상품을 함께 받아보세요. 마감시간: 09월 07일 오전 05시 까지 주문취소 
;
receiptSSgD2DDelivery:	//	택배배송
	line+
	WORD word+										NEWLINE		//	받으시는 분 받으시는 분 성함 권과헌 받으시는 분 전화번호 010-6810-6479 (안심번호 사용안함) 받으시는 주소 주문자 주소[자택] [13540] 경기도 성남시 분당구 판교원로82번길60, 1402-1001 (운중동, 경남아너스빌아파트) 주문자 주소변경 배송메시지 부재 시 문 앞에 놓아주세요 배송메시지변경 
	(
		TAB title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
		TAB WORD total=NUMBER WORD WORD NUMBER WORD WORD WORD WORD ea=NUMBER WORD TAB				NEWLINE
			//		 하이패스내열투명강력양면테이프 	 판매가격 2,850 원 정상가격 3,000 원 가격 상세보기 수량 1 개
		{
			log.info("{} SSG 이마트몰 택배배송 적요(『{} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $ea.text, $total.text);
			StatementForm statement = new StatementForm();
			LIST_STATEMENT.add(statement);
			statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
			statement.setDescription($ea.text);
			statement.setOutcome($total.text);
			statement.setCategoryName("분류.지출.식비.주식");
		}
	)+ 	 
	WORD											NEWLINE		//	주문취소 
;


//	두레생협 > 마이두레 > 공급내역 > 상세보기
receiptDureSupplyHistoryDetail:
	line+

	word+ date=DATE time=TIME WORD DATE word+	NEWLINE
			//	주문번호 20260727-439 주문날짜 2026-07-27 (월) 13:37 출고일 2026-07-29 (수) 결제유형 장보기충전금 
	WORD WORD									NEWLINE
			//	생활재 정보 

	receiptDureSupplyHistoryDetailItem+

	WORD WORD								NEWLINE		//	결제 정보 
	oamount=WORD								NEWLINE		//	생활재주문금액60,400원 

	eof
{
	log.info("{} 영수증::두레생협 구매 내역(『{} {} {}』)", Utility.indentMiddle()
		, $date.text, $time.text, $oamount.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("두레생협 구매 내역");

	STATEMENT.setTime($date.text, $time.text);
	STATEMENT.setDescription("[두레생협]", $date.text, $time.text, $oamount.text.replaceAll("[^0-9,]", ""));
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("[두레생협]", $oamount.text.replaceAll("[^0-9,]", ""));
	statement.setTime($date.text, $time.text);
	statement.setIncome($oamount.text);
	statement.setDescription("[두레생협]");
	statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptDureSupplyHistoryDetailItem:
(
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
		WORD unit=NUMBER WORD+ ea=NUMBER WORD+ amount=NUMBER WORD+		NEWLINE
				//	삶은찰옥수수(3입/냉동) 단가 5,900 원 · 수량 2 개 11,800 원
{
	log.info("{} 영수증::두레생협 구매 내역(『{} {} {} {} {} {} {}』『{} {} {}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $unit.text, $ea.text, $amount.text
	);
	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setOutcome($amount.text);
	statement.setDescription($unit.text, "x", $ea.text);
	statement.setCategoryName("분류.지출.식비.주식");
}
)
|
(
	//	가격 없는 사은품(증정) - "증정"이라는 단어로만 끝나야 한다(결제 정보/생활재주문금액 등 다음 줄과 섞이지 않도록)
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
		gift=WORD {"증정".equals($gift.text)}?		NEWLINE
				//	구운유정란(10입) 증정
{
	log.info("{} 영수증::두레생협 구매 내역 - 증정(『{} {} {} {} {} {} {}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
	);
	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	statement.setOutcome(0);
	statement.setDescription($gift.text);
	statement.setCategoryName("분류.지출.식비.주식");
}
)
;


//	두레생협 홈페이지 > 마이두레 > 장보기 > 주문내역 > 주문 상세보기
receiptICoorpHtml:
	line+

	WORD date=DATE time=TIME key1=WORD value1=DATE WORD+ amount=NUMBER WORD+		NEWLINE
		//	주문날짜 2023-06-02 (금) 11:16 출고일 2023-06-05(월) 주문상태 주문 최종결제금액 71,303 원 결제유형 CMS/후불 
	WORD WORD																		NEWLINE		//	주문 정보 
	(receiptICoorpHtmlSummary receiptICoorpHtmlSummary+								NEWLINE)?
		//	WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD WORD					NEWLINE
		//	생활재주문금액 66,450원 적립쿠폰 0원 할인쿠폰 0원 결제쿠폰 0원 출자금 1,000원 배송비 0원 포인트 0원 
	WORD WORD																		NEWLINE		//	배송지 정보 

	line+

	WORD+										NEWLINE		//	생활재 정보 
	receiptICoorpHtmlItem+
	WORD+										NEWLINE		//	우리동네 가까운 매장을 찾아보세요! 

	eof
{
	log.info("{} receipt html 생협 parsing done! - (『{} {} {}』 『{} {}』)", Utility.indentMiddle()
		, $date.text, $time.text, $amount.text
		, $key1.text, $value1.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("두레생협 구매 내역");

	STATEMENT.setTime($date.text, $time.text);
	STATEMENT.setDescription("두레생협 영수증", $date.text, $time.text, $amount.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("두레생협(온라인)", $amount.text);
	statement.setTime($date.text, $time.text);
	statement.setIncome($amount.text);
	statement.setDescription($key1.text, $value1.text);
	statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptICoorpHtmlSummary:
 	key=WORD value=WORD
{
	log.info("{} 두레생협 요약 (『{} {}』)", Utility.indentMiddle(), $key.text, $value.text);

	if ($value.text != null && !$value.text.startsWith("0")) {
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($key.text);
		statement.setOutcome($value.text);
		statement.setCategoryName("분류.지출.이체/대체.기타");
	}
};
receiptICoorpHtmlItem:
((
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
		outcome=WORD WORD ea=NUMBER unit=WORD TAB TAB TAB TAB										NEWLINE		//	당근(500g/무농약) 증정 수량 1 개 	 	 	 	 
	{
		log.info("{} receipt html 생협적요(『{} {} {} {} {} {} {} {}』 『{} {} {}』)", Utility.indentMiddle()
			, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
			, $ea.text, $unit.text, $total.text);
	
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
		statement.setDescription($outcome.text, $ea.text, $unit.text);
		statement.setOutcome(0);
		statement.setCategoryName("분류.지출.식비.주식");
	}
) | (
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*
	 	unit=NUMBER WORD WORD ea=NUMBER WORD TAB NUMBER? TAB total=NUMBER WORD TAB WORD? TAB		NEWLINE
	//	두레생협 자연이 부친 해물파전 7,400 원 수량 1 개 	 1 	 7,400 원 	 삭제 	 
	{
		log.info("{} receipt html 생협적요(『{} {} {} {} {} {} {} {}』 『{} {} {}』)", Utility.indentMiddle()
			, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
			, $ea.text, $unit.text, $total.text);
	
		StatementForm statement = new StatementForm();
		LIST_STATEMENT.add(statement);
		statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
		statement.setDescription($unit.text + "x", $ea.text, "=", $total.text);
		statement.setOutcome($total.text);
		statement.setCategoryName("분류.지출.식비.주식");
	}
))
;


receiptStandard:
	line*

	title1=word title2=word? title3=word? title4=word? title5=word? DATE TIME NUMBER		NEWLINE		//	하나로 2022-05-08 14:42:41 10,091 

	line*

	WORD WORD WORD+					NEWLINE
	receiptStandardItem+

	eof
{
	log.info("{} receipt표준 parsing done! - (『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
		, Utility.indentMiddle(), $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $DATE.text, $TIME.text, $NUMBER.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("영수증 일반");

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setDescription($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, "영수증", $DATE.text, $TIME.text, $NUMBER.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, "영수증", $DATE.text, $TIME.text, $NUMBER.text);
	statement.setTime($DATE.text, $TIME.text);
	statement.setIncome($NUMBER.text);
	statement.setOutcome(0);
	//statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptStandardItem:
//	WORD WORD WORD WORD				NEWLINE		//	상품(코드) 단가 수량 금액 
	title1=word title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* unit=NUMBER ea=NUMBER total=NUMBER	NEWLINE		//	002 두부스낵 1 2,500
{
	log.info("{} receipt표준적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $unit.text, $ea.text, $total.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, "-", $ea.text, "EA");
	statement.setOutcome($total.text);
	//statement.setCategoryName("분류.지출.식비.외식");
};


//	텍스트. 생협.
//	두레생협 홈페이지 > 마이두레 > 장보기 > 매장구매내역 > 영수증출력
receiptICoorp:	//	2022-10-03
	(WORD place=WORD				NEWLINE)?	//	주민두레생협 서판교점 

	line+

	WORD+ DATE TIME WORD WORD+		NEWLINE		//	[일시] 2022/10/03 15:08 [ POS: 71-0032] 
	(WORD							NEWLINE)?	//	---------------------------------------- 
	WORD WORD WORD WORD+			NEWLINE		//	No. 생활재명 일반가 수량 조합원가 
	(WORD							NEWLINE)?	//	---------------------------------------- 
	receiptICoorpItem+
	(WORD							NEWLINE)?	//	---------------------------------------- 
	WORD NUMBER						NEWLINE		//	면세금액 36,800 

	line+

	((	// 카드결제
		WORD WORD WORD NUMBER		NEWLINE		//	[할부개월] 일시불 [승인번호] 14415775 
		WORD total=NUMBER			NEWLINE		//	[결제금액] 144,150 
	)|(	// 외상
		WORD						NEWLINE		//	++++++++++++++++++++++++++++++++++++++++ 
		WORD WORD total=NUMBER		NEWLINE		//	외 상 98,520 
		WORD NUMBER					NEWLINE		//	쿠폰결제 3,330 
		WORD						NEWLINE		//	---------------------------------------- 
	))

	eof
{
	log.info("{} receipt생협 parsing done! - (『{}』, 『{}』, 『{}』)", Utility.indentMiddle(), $DATE.text, $TIME.text, $total.text);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("두레생협 구매 내역");

	STATEMENT.setTime($DATE.text, $TIME.text);
	STATEMENT.setDescription("두레생협 영수증", $DATE.text, $TIME.text, $total.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("두레생협", $place.text, $total.text);
	statement.setTime($DATE.text, $TIME.text);
	statement.setIncome($total.text);
	statement.setOutcome(0);
	statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptICoorpItem:
((	//	2026-02-14
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE
		//	39837_사)경)친환경행주(2입)
	ea=NUMBER total=NUMBER																				NEWLINE
		//	1 5,200
) | (	//	2025-06-09
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* ea=NUMBER unit=NUMBER		NEWLINE
			//	*♧ 36575_깻잎(20장/ 2 1,400 
	total=NUMBER										NEWLINE
			//	2,800 
) | (	//	2025-03-08
	//	WORD WORD NUMBER NUMBER							NEWLINE		//	24972_유기농 초콜 1 7,500 
	//	NUMBER WORD NUMBER NUMBER						NEWLINE		//	824 _초코칩쿠키 1 4,300 
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* ea=NUMBER unit=NUMBER		NEWLINE
) | (	//	@Deprecated
	// 2022-10-03
	title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE		//	001 풀빛고운 거품세안제
	NUMBER display=NUMBER? ea=NUMBER unit=NUMBER															NEWLINE		//	20251 19,030 2 17,300 
	((WORD+ NUMBER)? total=NUMBER																			NEWLINE)?	//	34,600 
																														// 특판할인: 21% -3,200 12,000
))
{
	log.info("{} 영수증 두레 생협 적요(『{} {} {} {} {} {} {} {}』 『{} {} {} {}』)", Utility.indentMiddle()
		, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
		, $display.text, $ea.text, $unit.text, $total.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text);
	if ("1".equals($ea.text) && $unit.text == null) {
		statement.setDescription("두레생협", "x", $ea.text);
		statement.setOutcome($total.text);
	} else if ("1".equals($ea.text)) {
		statement.setDescription("두레생협", $unit.text, "(", $display.text, ") x", $ea.text, "=", $unit.text);
		statement.setOutcome($unit.text);
	} else {
		statement.setDescription("두레생협", $unit.text, "(", $display.text, ") x", $ea.text, "=", $total.text);
		statement.setOutcome($total.text);
	}
	statement.setCategoryName("분류.지출.식비.주식");
};


/**
 * 텍스트. 태영홈마트.
 * @author andold
 * @since 2022-04-01
 */
receiptTaeYoungHomeMart:
	seller=WORD							NEWLINE		//	태영홈마트 
	WORD WORD WORD WORD word+			NEWLINE		//	주 소: 분당구 운중동 산운13 단지 상가101-1호 

	line+

	WORD WORD WORD word+				NEWLINE		//	상 품 명 상품단가 수량 판매가 
	receiptTaeYoungHomeMartItem+
	key1=word+ value1=NUMBER			NEWLINE		//	종 품목수: 5 

	line+

	word+ DATE word+ TIME				NEWLINE		//	관리번호: 2022-04-01 001 00068 13:59 
	word+ date=DATE time=TIME word+		NEWLINE		//	구매일자: 2022-04-01 13:59:15 관리자 
	WORD word+							NEWLINE		//	[ 카드 승인] 
	key2=word+ value2=NUMBER			NEWLINE		//	승인금액: 18200 
	key3=WORD value3=word+				NEWLINE		//	카드사명: 하나카드 

	line+
{
	log.info("{} 태영홈마트(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $date.text, $time.text, $seller.text, $key1.text, $value1.text, $key2.text, $value2.text, $key3.text, $value3.text
	);

	ACCOUNT.setProducer("영수증");
	ACCOUNT.setNumber("태영홈마트 구매 내역");

	STATEMENT.setTime($date.text, $time.text);
	STATEMENT.setIncome(0);
	STATEMENT.setOutcome(0);
	STATEMENT.setBalance(0);
	STATEMENT.setDescription("태영홈마트 영수증", $seller.text, $value3.text);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle("영수증", $seller.text, $value3.text, $key1.text, $value1.text);
	statement.setIncome($value2.text);
	statement.setCategoryName("분류.수입.전월이월.이체");
};
receiptTaeYoungHomeMartItem:
	title1=word title2=word? title3=word? title4=word? title5=word? title6=word? title7=word*	NEWLINE
	word unit=NUMBER ea=NUMBER outcome=NUMBER				NEWLINE		//	8801030000000 6,000 1 6,000 
{
	log.info("{} receipt태영홈마트적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
		, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, $ea.text, $outcome.text
	);

	StatementForm statement = new StatementForm();
	LIST_STATEMENT.add(statement);
	statement.setTitle($title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text, "-", $ea.text, "EA");
	statement.setOutcome($outcome.text);
	statement.setCategoryName("분류.지출.식비.주식");
};


package kr.andold.household.antlr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.household.service.parser.HouseholdV2ParserService;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NaverV2Test {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testNaverMailAuctionPayCard() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-AuctionPayCard.html", "네이버");
		assertEquals(3, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailNaverPayCancelPurchaseMultipleProduct() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-CancelPurchaseMultipleProduct.html", "네이버");
		assertEquals(4, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverPayMoneyCoardText() throws Exception {
		HouseholdV2ParserService.testTextFile("samples-Naver/NaverPay-MoneyCard.txt", "기본");
		assertEquals(4, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailNaverPay20250717text() throws Exception {
		HouseholdV2ParserService.testTextFile("samples-Naver/Naver-Mail-NaverPay-NaverPay-20250717.txt", "네이버");
		assertEquals(2, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailNaverPay20250717() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-NaverPay-20250717.html", "네이버");
		assertEquals(11, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailShillaBakery() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-ShillaBakery.html", "네이버");
		assertEquals(4, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailNaverPay() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-NaverPay.html", "네이버");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailAuction() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-Auction.html");
		assertEquals(3, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailPayOrderAppend() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-Order-AdditionalProduct.html");
		assertEquals(2, LIST_STATEMENT.size());
	}

	@Test
	public void testnaverNaverPayCancelPay() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-CancelPaymemnt-Refund.html");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailPayCancelSell() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-CancelSale.html");
		assertEquals(3, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailPayCancelBuy() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-CancelPurchase.html");
		assertEquals(3, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMail11Street() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-11st.html", "네이버");
		assertEquals(5, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailPayOrderDeliberyError() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-DeliveryChargeError.html", "네이버");
		assertEquals(2, LIST_STATEMENT.size());
		assertEquals(19900, LIST_STATEMENT.get(1).getOutcome());
	}

	@Test
	public void testNaverMailPayOrder2() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-Order2.html");
		assertEquals(2, LIST_STATEMENT.size());
	}

	@Test
	public void testNaverMailPayOrder() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-Order.html");
		assertEquals(3, LIST_STATEMENT.size());
	}

	/**
	 * NaverMail NaverPay 구글
	 */
	@Test
	public void testNaverMailPayGoogle() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-Google.html");
		assertEquals(1, LIST_STATEMENT.size());
	}

	/**
	 * NaverMail NaverPay 예약구매
	 */
	@Test
	public void testNaverMailPayReserveOrder() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-PurchaseReservation.html");
		assertEquals(1, LIST_STATEMENT.size());
	}

	/**
	 * NaverMail NaverPay 배달의민족
	 */
	@Test
	public void testnaverNaverPayDeliveryRace() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-Naver/Naver-Mail-NaverPay-Baemin.html");
		assertEquals(1, LIST_STATEMENT.size());
	}

}

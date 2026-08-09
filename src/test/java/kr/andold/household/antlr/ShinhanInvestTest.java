package kr.andold.household.antlr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.household.service.parser.HouseholdParserService;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShinhanInvestTest {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	//	신한투자증권 > 나의 자산분석 > 거래내역 > 종합거래내역 > 한화면조회::종합거래내역
	@Test
	public void testShinhanInvestSummaryTradeHistory20260115() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanInvest/ShinhanInvest-TradeSummary-20260115.html", "신한투자");
		assertEquals(3, LIST_STATEMENT.size());
	}

	@Test
	public void testDummy() throws Exception {
		log.info("{}", "(12:23:99)".replaceAll("[\\(\\)]", ""));
	}

	//	신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역
	@Test
	public void testShinhanInvestCma20250408WithHint() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanInvest/ShinhanInvest-TradeSummary-20250408.html", "신한투자");
		assertEquals(2, LIST_STATEMENT.size());
	}

	//	신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역 > 한화면조회::종합거래내역
	@Test
	public void testShinhanInvestSummaryTradeHistoryWithHint() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanInvest/ShinhanInvest-TradeSummary.html", "신한투자");
		assertEquals(160, LIST_STATEMENT.size());
	}

	//	신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역 > 한화면조회::종합거래내역
	@Test
	public void testShinhanInvestSummaryTradeHistory() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanInvest/ShinhanInvest-TradeSummary.html");
		assertEquals(160, LIST_STATEMENT.size());
	}

	//	신한투자증권 > 나의 자산분석 > 거래내역 > 입출금(고)내역
	@Test
	public void testShinhanInvestCma() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanInvest/ShinhanInvest-CMA.html");
		assertEquals(17, LIST_STATEMENT.size());
	}

}

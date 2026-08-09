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
public class KoreaInvestTest {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	//	홈 > 뱅킹/청약/대출 > 조회 > 거래내역 > 계좌별거래내역 > 전체거래내역
	@Test
	public void testKoreaInvestAllTradeDetailWithHint20260115() throws Exception {
		long started = System.currentTimeMillis();
		HouseholdV2ParserService.testHtmlFile("samples-KoreaInvest/KoreaInvest-AllTradeDetail-20260115.html", "한국투자");
		assertEquals(18, LIST_STATEMENT.size());
		for (StatementForm statement : LIST_STATEMENT) {
			log.info("{} testKoreaInvestAllTradeDetailWithHint() - {}", Utility.indentMiddle(), statement);
		}
		log.info("{} testKoreaInvestAllTradeDetailWithHint() - {}", Utility.indentMiddle(), Utility.toStringPastTimeReadable(started));
	}

	//	홈 > 뱅킹/청약/대출 > 조회 > 거래내역 > 계좌별거래내역 > 전체거래내역
	@Test
	public void testKoreaInvestAllTradeDetailWithHint() throws Exception {
		long started = System.currentTimeMillis();
		HouseholdV2ParserService.testHtmlFile("samples-KoreaInvest/KoreaInvest-AllTradeDetail.html", "한국투자");
		assertEquals(1, LIST_STATEMENT.size());
		for (StatementForm statement : LIST_STATEMENT) {
			log.info("{} testKoreaInvestAllTradeDetailWithHint() - {}", Utility.indentMiddle(), statement);
		}
		log.info("{} testKoreaInvestAllTradeDetailWithHint() - {}", Utility.indentMiddle(), Utility.toStringPastTimeReadable(started));
	}

	//	홈 > 뱅킹/청약/대출 > 조회 > 거래내역 > 계좌별거래내역 > 전체거래내역
	@Test
	public void testKoreaInvestAllTradeDetail() throws Exception {
		long started = System.currentTimeMillis();
		HouseholdV2ParserService.testHtmlFile("samples-KoreaInvest/KoreaInvest-AllTradeDetail.html");
		assertEquals(1, LIST_STATEMENT.size());
		log.info("{} testtestKoreaInvestAllTradeDetail() - {}", Utility.indentMiddle(), Utility.toStringPastTimeReadable(started));
	}

	//	홈 > 트레이딩 > 국내주식 > 주식 잔고/손익 > 당일매매종합평가
	@Test
	public void testKoreaInvest당일매매종합평가WithHint() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-KoreaInvest/KoreaInvest-ThatDayTradeComprehenceEvaluate.html", "한국투자");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testKoreaInvest당일매매종합평가() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-KoreaInvest/KoreaInvest-ThatDayTradeComprehenceEvaluate.html");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testKoreaInvest입출금거래내역WithHint() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-KoreaInvest/KoreaInvest-InOutTradeDetail.html", "한국투자");
		assertEquals(19, LIST_STATEMENT.size());
	}

	@Test
	public void testKoreaInvest입출금거래내역() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-KoreaInvest/KoreaInvest-InOutTradeDetail.html");
		assertEquals(19, LIST_STATEMENT.size());
	}

}

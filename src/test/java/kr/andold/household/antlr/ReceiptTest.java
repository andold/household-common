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
public class ReceiptTest {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testExHipass() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-ExHipass.html", "영수증");
		assertEquals(16, LIST_STATEMENT.size());
	}

	@Test
	public void test() throws Exception {
		log.info("{}", "매]2024-08-12".replaceAll(".*\\]", ""));
	}

	//	이마트 노브랜드
	@Test
	public void testNoBrand() throws Exception {
		HouseholdParserService.testTextFile("samples-Receipt/Receipt-NoBrand.txt", "영수증");
		assertEquals(19, LIST_STATEMENT.size());
	}

	//	이마트
	@Test
	public void testEMart() throws Exception {
		HouseholdParserService.testTextFile("samples-Receipt/Receipt-EMart.txt", "영수증");
		assertEquals(26, LIST_STATEMENT.size());
	}

	//	이마트
	@Test
	public void testSsgOrderDetail() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-SSG-OrderDetail.html");
		assertEquals(10, LIST_STATEMENT.size());
	}

	//	표준
	@Test
	public void testStandard() throws Exception {
		HouseholdParserService.testText("...\n하나로 2022-05-08 14:42:41 10,091\nNo 생활재명 일반가 수량 조합원가\n002 두부스낵 2,500 1 2,500\n...\n");
		assertEquals(2, LIST_STATEMENT.size());
	}

	//	생협 공급내역
	@Test
	public void testSupplyHistoryDetailhtml() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-Dure-SupplyHistoryDetail-20260731.html", "영수증");
		assertEquals(6, LIST_STATEMENT.size());
	}
	@Test
	public void testECoopSupplyDetailhtml() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-ECoop-SupplyDetail.html");
		assertEquals(10, LIST_STATEMENT.size());
	}

	//	생협 매장구매내역
	@Test
	public void testECoopOfflinePurchaseDetailhtml20260214() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-Dure-OfflinePurchaseDetail-20260214.html", "영수증");
		assertEquals(8, LIST_STATEMENT.size());
	}
	@Test
	public void testECoopOfflinePurchaseDetailhtml20250609() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-Dure-OfflinePurchaseDetail-20250609.html", "영수증");
		assertEquals(6, LIST_STATEMENT.size());
	}
	@Test
	public void testECoopOfflinePurchaseDetailhtml20250308() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-Dure-OfflinePurchaseDetail-20250308.html", "영수증");
		assertEquals(7, LIST_STATEMENT.size());
	}
	@Deprecated
	@Test
	public void testECoopOfflinePurchaseDetailhtml() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-ECoop-OfflinePurchaseDetail.html");
		assertEquals(11, LIST_STATEMENT.size());
	}

	//	생협 구매내역
	@Test
	public void testECoophtml() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-ECoop.html", "영수증");
		assertEquals(12, LIST_STATEMENT.size());
	}

	//	농협하나로마트
	@Test
	public void testNHHanaroMartTranctionInquiry() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-NHHanaro-TransationInquiry.html", "영수증");
		assertEquals(48, LIST_STATEMENT.size());
		log.info("#{}", Utility.size(LIST_STATEMENT));
	}
	//	하나로마트
	@Test
	public void testHanaroOnline() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Receipt-Hanaro-Online.html");
		assertEquals(3, LIST_STATEMENT.size());
		log.info("#{}", Utility.size(LIST_STATEMENT));
	}

	//	아파트너
	@Test
	public void testApartner() throws Exception {
		HouseholdParserService.testHtmlFile("samples-Receipt/Apartner-MaintenanceCost.html");
		assertEquals(23, LIST_STATEMENT.size());
	}

	//	생협 텍스트
	@Test
	public void testECoop() throws Exception {
		HouseholdParserService.testTextFile("samples-Receipt/Receipt-ECoop.txt", "영수증");
		assertEquals(12, LIST_STATEMENT.size());
	}

}

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
public class KdbTest {
	private List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}
	
	@Test
	public void testIndustryBankInstallmentSavingHelper() throws Exception {
		HouseholdParserService.testHtmlFile("samples-IndustryBank/IndustryBank-InstallmentSaving-Raw-Html.html", "산업은행");
		assertEquals(3, LIST_STATEMENT.size());
	}

	@Test
	public void testIndustryBankOrdinaryAccountHelper() throws Exception {
		HouseholdParserService.testHtmlFile("samples-IndustryBank/IndustryBank-OrdinaryAccount-Raw-Html.html", "산업은행");
		assertEquals(4, LIST_STATEMENT.size());
	}

	@Test
	public void testIndustryBankOrdinaryAccountexcel() throws Exception {
		HouseholdParserService.testExcelFile("samples-IndustryBank/IndustryBank-OrdinaryAccount.xls");
		assertEquals(5, LIST_STATEMENT.size());
	}

	// 적금 html, 산업은행 > 조회 > 거래내역조회 > 적금 > 인쇄 및 저장 > 화면 복붙
	@Test
	public void testIndustryBankInstallmentSavinghtml() throws Exception {
		HouseholdParserService.testHtmlFile("samples-IndustryBank/IndustryBank-InstallmentSaving.html");
		assertEquals(13, LIST_STATEMENT.size());
	}

	// 산업은행 > 조회 > 계좌조회 > 해지계좌조회 > 상세 > ctrl-s 저장(해지상세정보, 크롬)
	@Test
	public void testIndustryBankFixedDepositCloseDetail() throws Exception {
		HouseholdParserService.testHtmlFile("samples-IndustryBank/IndustryBank-FixedDeposit-CloseDetail.html");
		assertEquals(4, LIST_STATEMENT.size());
	}

	@Test
	public void testIndustryBankFixedDeposit엑셀() throws Exception {
		HouseholdParserService.testExcelFile("samples-IndustryBank/IndustryBank-FixedDeposit.xls");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testIndustryBankInstallmentSaving() throws Exception {
		HouseholdParserService.testExcelFile("samples-IndustryBank/IndustryBank-InstallmentSaving.xls");
		assertEquals(2, LIST_STATEMENT.size());
	}

	@Test
	public void testIndustryBankOrdinaryAccount() throws Exception {
		HouseholdParserService.testHtmlFile("samples-IndustryBank/IndustryBank-OrdinaryAccount.html");
		assertEquals(5, LIST_STATEMENT.size());
	}

	@Test
	public void testIndustryBankFixedDepositClose() throws Exception {
		HouseholdParserService.testHtmlFile("samples-IndustryBank/IndustryBank-FixedDeposit-Close.html");
		assertEquals(1, LIST_STATEMENT.size());
	}

}

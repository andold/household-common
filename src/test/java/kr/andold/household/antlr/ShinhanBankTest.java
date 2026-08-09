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
public class ShinhanBankTest {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testShinhanBankCloseBillHtmlWithHint() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanBank/ShinhanBank-CloseBill.html", "신한은행");
		assertEquals(3, LIST_STATEMENT.size());
	}

	//	신한은행 일반예금
	@Test
	public void testShinhanBankOrdinaryAccountHtmlWithHint() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanBank/ShinhanBank-OrdinaryAccount.html", "신한은행");
		assertEquals(47, LIST_STATEMENT.size());
	}

	@Test
	public void testShinhanBankOrdinaryAccountHtml() throws Exception {
		HouseholdParserService.testHtmlFile("samples-ShinhanBank/ShinhanBank-OrdinaryAccount.html");
		assertEquals(47, LIST_STATEMENT.size());
	}

	@Test
	public void testShinhanLocalFund() throws Exception {
		HouseholdParserService.testExcelFile("samples-ShinhanBank/ShinhanBank-DomesticFund.xls");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testShinhanBankRspWithHint() throws Exception {
		HouseholdParserService.testExcelFile("samples-ShinhanBank/ShinhanBank-Rsp.xls", "신한은행");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testShinhanBankRsp() throws Exception {
		HouseholdParserService.testExcelFile("samples-ShinhanBank/ShinhanBank-Rsp.xls");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testShinhanBankFixedDepositWithHint() throws Exception {
		HouseholdParserService.testExcelFile("samples-ShinhanBank/ShinhanBank-FixedDeposit.xls", "신한은행");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testShinhanBankFixedDeposit() throws Exception {
		HouseholdParserService.testExcelFile("samples-ShinhanBank/ShinhanBank-FixedDeposit.xls");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testShinhanBankOrdinaryAccount() throws Exception {
		HouseholdParserService.testExcelFile("samples-ShinhanBank/ShinhanBank-OrdinaryAccount.xls");
		assertEquals(5, LIST_STATEMENT.size());
	}

}

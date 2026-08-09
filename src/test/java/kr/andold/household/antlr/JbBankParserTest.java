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
public class JbBankParserTest {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testJBFixed() throws Exception {
		HouseholdV2ParserService.testExcelFile("samples-JbBank/JbBank-FixedDeposit.xls");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testOrdinaryAccount() {
		HouseholdV2ParserService.testHtmlFile("samples-JbBank/JbBank-OrdinaryAccount.html", "전북은행");
		assertEquals(2, LIST_STATEMENT.size());
	}

	@Test
	public void testFixedDeposit() {
		HouseholdV2ParserService.testExcelFile("samples-JbBank/JbBank-FixedDeposit.xls", "전북은행");
		assertEquals(1, LIST_STATEMENT.size());
	}

}

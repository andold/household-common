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
public class KookminV2Test {
	private List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testKookminBankOrdinaryAccounttxt() throws Exception {
		HouseholdV2ParserService.testTextFile("samples-KookminBank/KookminBank-OrdinaryAccount.txt", "국민은행");
		assertEquals(9, LIST_STATEMENT.size());
	}

	@Test
	public void testKookminBankOrdinaryAccount() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-KookminBank/KookminBank-OrdinaryAccount.html");
		assertEquals(9, LIST_STATEMENT.size());
	}

}

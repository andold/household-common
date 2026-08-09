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
public class KookminTest {
	private List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testKookminBankOrdinaryAccounttxt() throws Exception {
		HouseholdParserService.testTextFile("samples-KookminBank/KookminBank-OrdinaryAccount.txt", "국민은행");
		assertEquals(9, LIST_STATEMENT.size());
	}

	@Test
	public void testKookminBankOrdinaryAccount() throws Exception {
		HouseholdParserService.testHtmlFile("samples-KookminBank/KookminBank-OrdinaryAccount.html");
		assertEquals(9, LIST_STATEMENT.size());
	}

}

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
public class HanaTest {
	private List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testHanaRSP20251116() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-Rsp-20251116.html", "하나은행");
		assertEquals(9, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaISACloseBill() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-ISA-CloseBill.html", "하나은행");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaFixedExpire() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-FixedDeposit-CloseBill.html", "하나은행");
		assertEquals(3, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaISA() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-ISA.html", "하나은행");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaIRP() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-IRP.html", "하나은행");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaRSP() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-Rsp.html", "하나은행");
		assertEquals(6, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaCardTraffic() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaCard-Bus.html");
		assertEquals(4, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaExpire() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-CloseAccount-20220310.html", "하나은행");
		assertEquals(2, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaOrdinary() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-OrdinaryAccount.html", "하나은행");
		assertEquals(15, LIST_STATEMENT.size());
	}

	@Test
	public void testHanaFix() throws Exception {
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-FixedDeposit-20230531.html", "하나은행");
		assertEquals(1, LIST_STATEMENT.size());

		LIST_STATEMENT.clear();
		HouseholdParserService.testHtmlFile("samples-HanaBank/HanaBank-FixedDeposit-20220310.html", "하나은행");
		assertEquals(1, LIST_STATEMENT.size());
	}

}

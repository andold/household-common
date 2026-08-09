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
public class EtcTest {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	// 하이패스-자동충전카드.html
	@Test
	public void testHiPass() throws Exception {
		HouseholdParserService.testHtmlFile("samples-etc/Hipass-AutoChargeCard.html");
		assertEquals(25, LIST_STATEMENT.size());
	}

	@Test
	public void testNetree20231107() throws Exception {
		HouseholdParserService.testHtmlFile("samples-etc/Nextree-Payslip-20231107.html");
		assertEquals(12, LIST_STATEMENT.size());
	}

}

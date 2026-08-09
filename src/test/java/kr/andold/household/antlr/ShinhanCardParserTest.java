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
public class ShinhanCardParserTest {
	private static final List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testTrafficBus() {
		HouseholdV2ParserService.testHtmlFile("samples-ShinhanCard/ShinhanCard-Bus.html");
		assertEquals(16, LIST_STATEMENT.size());
	}

}

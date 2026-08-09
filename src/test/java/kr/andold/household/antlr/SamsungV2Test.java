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
public class SamsungV2Test {
	private List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	@Test
	public void testSamsungInsure20250628() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-SamsungInsure/SamsungInsure-ContractDetail-20250628.html", "삼성생명");
		assertEquals(1, LIST_STATEMENT.size());
	}

	/**
	 * 삼성생명 > 나의계약 > 계약조회 > 상세보기
	 */
	@Test
	public void testSamsungInsure() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-SamsungInsure/SamsungInsure-ContractDetail.html", "삼성생명");
		assertEquals(1, LIST_STATEMENT.size());
	}

}

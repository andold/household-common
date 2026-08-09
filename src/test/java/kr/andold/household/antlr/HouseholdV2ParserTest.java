package kr.andold.household.antlr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.household.service.parser.HouseholdV2ParserService;
import kr.andold.household.service.parser.HtmlParserService;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HouseholdV2ParserTest {
	private List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	//	계좌번호가 여러단어인 경우
	@Test
	public void testStandard20251110() throws Exception {
		HouseholdV2ParserService.testTextFile("samples-etc/standard-20251110.txt", "모름");
		assertEquals(9, LIST_STATEMENT.size());
	}

	@Test
	public void testStandard20251002() throws Exception {
		HouseholdV2ParserService.testTextFile("samples-etc/standard-20251002.txt", "모름");
		assertEquals(1, LIST_STATEMENT.size());
	}

	@Test
	public void testJsoup() throws Exception {
		String filename = "samples-산업은행/산업은행-정기예금-해지.html";
		filename = "samples-네이버/네이버-메일-네이버페이-주문.html";
		filename = "samples-삼성생명/삼성생명-계약조회-상세보기.html";
		log.info("{} testJsoup(『{}』)", Utility.indentStart(), filename);

		String html = Utility.readClassPathFile(filename);
		log.info("\n\n{}\n\n", HtmlParserService.extractTextFromHtml(html));

		log.info("{} testJsoup(『{}』)", Utility.indentEnd(), filename);
	}

}

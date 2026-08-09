/*
 * @(#)HyundaiV2Test.java 2022-12-02
 *
 * Copyright 2021 andold@naver.com All rights Reserved. 
 * andold@naver.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

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
public class HyundaiV2Test {
	private List<StatementForm> LIST_STATEMENT = kr.andold.household.web.StatementForm.LIST_STATEMENT;

	/**
	 * @author andold
	 * @since 2022-03-22
	 */
	@BeforeEach
	public void setUp() throws Exception {
		log.info(Utility.HR);
		LIST_STATEMENT.clear();
	}

	/**
	 * @author 권과헌
	 * @since 2022-10-01
	 */
	@Test
	public void testHyundaiCard후불교통카드() throws Exception {
		HouseholdV2ParserService.testHtmlFile("samples-HyundaiCard/HyundaiCard-TraffixCard.html");
		assertEquals(6, LIST_STATEMENT.size());
	}

}

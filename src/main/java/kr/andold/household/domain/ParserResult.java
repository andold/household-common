/*
 * @(#)ParserResult.java $version 2018-01-09
 *
 * Copyright 2007 NAVER Corp. All rights Reserved. 
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package kr.andold.household.domain;

import java.util.List;

import lombok.Data;

/**
 * @author andold
 * @since 2018-01-09
 */
@Data
public class ParserResult {
	private List<StatementParsed> listStatementParsed;	//	parsed statement candidate.
	private List<AccountParsed> listAccountParsed;		//	parsed account candidate.
	private String content;		//	input.

}

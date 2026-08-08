// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanInvest.g4 by ANTLR 4.13.0
package kr.andold.household.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.utils.Utility;
import kr.andold.household.web.StatementForm;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShinhanInvestParser}.
 */
public interface ShinhanInvestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#shinhanInvestDocument}.
	 * @param ctx the parse tree
	 */
	void enterShinhanInvestDocument(ShinhanInvestParser.ShinhanInvestDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestDocument}.
	 * @param ctx the parse tree
	 */
	void exitShinhanInvestDocument(ShinhanInvestParser.ShinhanInvestDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#shinhanInvestSummaryTradeHistory}.
	 * @param ctx the parse tree
	 */
	void enterShinhanInvestSummaryTradeHistory(ShinhanInvestParser.ShinhanInvestSummaryTradeHistoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestSummaryTradeHistory}.
	 * @param ctx the parse tree
	 */
	void exitShinhanInvestSummaryTradeHistory(ShinhanInvestParser.ShinhanInvestSummaryTradeHistoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#shinhanInvestSummaryTradeHistoryItem}.
	 * @param ctx the parse tree
	 */
	void enterShinhanInvestSummaryTradeHistoryItem(ShinhanInvestParser.ShinhanInvestSummaryTradeHistoryItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestSummaryTradeHistoryItem}.
	 * @param ctx the parse tree
	 */
	void exitShinhanInvestSummaryTradeHistoryItem(ShinhanInvestParser.ShinhanInvestSummaryTradeHistoryItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#shinhanInvestCma}.
	 * @param ctx the parse tree
	 */
	void enterShinhanInvestCma(ShinhanInvestParser.ShinhanInvestCmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestCma}.
	 * @param ctx the parse tree
	 */
	void exitShinhanInvestCma(ShinhanInvestParser.ShinhanInvestCmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#shinhanInvestCmaItem}.
	 * @param ctx the parse tree
	 */
	void enterShinhanInvestCmaItem(ShinhanInvestParser.ShinhanInvestCmaItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestCmaItem}.
	 * @param ctx the parse tree
	 */
	void exitShinhanInvestCmaItem(ShinhanInvestParser.ShinhanInvestCmaItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(ShinhanInvestParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(ShinhanInvestParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ShinhanInvestParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ShinhanInvestParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanInvestParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(ShinhanInvestParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanInvestParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(ShinhanInvestParser.EofContext ctx);
}
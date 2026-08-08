// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanInvest.g4 by ANTLR 4.13.0
package kr.andold.household.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.utils.Utility;
import kr.andold.household.web.StatementForm;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShinhanInvestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShinhanInvestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanInvestDocument(ShinhanInvestParser.ShinhanInvestDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestSummaryTradeHistory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanInvestSummaryTradeHistory(ShinhanInvestParser.ShinhanInvestSummaryTradeHistoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestSummaryTradeHistoryItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanInvestSummaryTradeHistoryItem(ShinhanInvestParser.ShinhanInvestSummaryTradeHistoryItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestCma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanInvestCma(ShinhanInvestParser.ShinhanInvestCmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#shinhanInvestCmaItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanInvestCmaItem(ShinhanInvestParser.ShinhanInvestCmaItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(ShinhanInvestParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ShinhanInvestParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanInvestParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(ShinhanInvestParser.EofContext ctx);
}
// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanCard.g4 by ANTLR 4.13.0
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
 * {@link ShinhanCardParser}.
 */
public interface ShinhanCardListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShinhanCardParser#shinhanCardDocument}.
	 * @param ctx the parse tree
	 */
	void enterShinhanCardDocument(ShinhanCardParser.ShinhanCardDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanCardParser#shinhanCardDocument}.
	 * @param ctx the parse tree
	 */
	void exitShinhanCardDocument(ShinhanCardParser.ShinhanCardDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanCardParser#trafficBus}.
	 * @param ctx the parse tree
	 */
	void enterTrafficBus(ShinhanCardParser.TrafficBusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanCardParser#trafficBus}.
	 * @param ctx the parse tree
	 */
	void exitTrafficBus(ShinhanCardParser.TrafficBusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanCardParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(ShinhanCardParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanCardParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(ShinhanCardParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanCardParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ShinhanCardParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanCardParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ShinhanCardParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanCardParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(ShinhanCardParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanCardParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(ShinhanCardParser.EofContext ctx);
}
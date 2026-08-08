// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanCard.g4 by ANTLR 4.13.0
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
 * by {@link ShinhanCardParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShinhanCardVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShinhanCardParser#shinhanCardDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanCardDocument(ShinhanCardParser.ShinhanCardDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanCardParser#trafficBus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrafficBus(ShinhanCardParser.TrafficBusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanCardParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(ShinhanCardParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanCardParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ShinhanCardParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanCardParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(ShinhanCardParser.EofContext ctx);
}
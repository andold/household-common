// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\JbBank.g4 by ANTLR 4.13.0
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
 * by {@link JbBankParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JbBankVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JbBankParser#jbBankDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJbBankDocument(JbBankParser.JbBankDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JbBankParser#jbOrdinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJbOrdinary(JbBankParser.JbOrdinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JbBankParser#jbFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJbFixedDeposite(JbBankParser.JbFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JbBankParser#jbFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJbFixedDepositeItem(JbBankParser.JbFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JbBankParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(JbBankParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JbBankParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(JbBankParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JbBankParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(JbBankParser.EofContext ctx);
}
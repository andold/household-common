// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanBank.g4 by ANTLR 4.13.0
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
 * by {@link ShinhanBankParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShinhanBankVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanBankDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanBankDocument(ShinhanBankParser.ShinhanBankDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanGeneralDepositeHtml(ShinhanBankParser.ShinhanGeneralDepositeHtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeHtmlItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanGeneralDepositeHtmlItem(ShinhanBankParser.ShinhanGeneralDepositeHtmlItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanLocalFund}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanLocalFund(ShinhanBankParser.ShinhanLocalFundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanExpire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanExpire(ShinhanBankParser.ShinhanExpireContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanFund}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanFund(ShinhanBankParser.ShinhanFundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanFundItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanFundItem(ShinhanBankParser.ShinhanFundItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanGeneralDeposite(ShinhanBankParser.ShinhanGeneralDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanGeneralDepositeItem(ShinhanBankParser.ShinhanGeneralDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanFixedDeposite(ShinhanBankParser.ShinhanFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#shinhanFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShinhanFixedDepositeItem(ShinhanBankParser.ShinhanFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(ShinhanBankParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ShinhanBankParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShinhanBankParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(ShinhanBankParser.EofContext ctx);
}
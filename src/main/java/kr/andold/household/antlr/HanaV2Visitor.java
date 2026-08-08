// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\HanaV2.g4 by ANTLR 4.13.0
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
 * by {@link HanaV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HanaV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaDocument(HanaV2Parser.HanaDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaISACloseBill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaISACloseBill(HanaV2Parser.HanaISACloseBillContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaFixedExpire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaFixedExpire(HanaV2Parser.HanaFixedExpireContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaIsa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaIsa(HanaV2Parser.HanaIsaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaIsaItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaIsaItem(HanaV2Parser.HanaIsaItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaRsp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaRsp(HanaV2Parser.HanaRspContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaRspItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaRspItem(HanaV2Parser.HanaRspItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaExpireBill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaExpireBill(HanaV2Parser.HanaExpireBillContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaBusCard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaBusCard(HanaV2Parser.HanaBusCardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaBusCardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaBusCardItem(HanaV2Parser.HanaBusCardItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaExpiredAccount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaExpiredAccount(HanaV2Parser.HanaExpiredAccountContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaExpiredAccountItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaExpiredAccountItem(HanaV2Parser.HanaExpiredAccountItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaFixedDeposite(HanaV2Parser.HanaFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaFixedDepositeItem(HanaV2Parser.HanaFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaGeneralDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaGeneralDeposite(HanaV2Parser.HanaGeneralDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#hanaGeneralDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaGeneralDepositeItem(HanaV2Parser.HanaGeneralDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(HanaV2Parser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HanaV2Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaV2Parser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(HanaV2Parser.EofContext ctx);
}
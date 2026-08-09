// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Hana.g4 by ANTLR 4.13.0
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
 * by {@link HanaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HanaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaDocument(HanaParser.HanaDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaISACloseBill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaISACloseBill(HanaParser.HanaISACloseBillContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaFixedExpire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaFixedExpire(HanaParser.HanaFixedExpireContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaIsa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaIsa(HanaParser.HanaIsaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaIsaItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaIsaItem(HanaParser.HanaIsaItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaRsp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaRsp(HanaParser.HanaRspContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaRspItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaRspItem(HanaParser.HanaRspItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaExpireBill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaExpireBill(HanaParser.HanaExpireBillContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaBusCard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaBusCard(HanaParser.HanaBusCardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaBusCardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaBusCardItem(HanaParser.HanaBusCardItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaExpiredAccount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaExpiredAccount(HanaParser.HanaExpiredAccountContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaExpiredAccountItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaExpiredAccountItem(HanaParser.HanaExpiredAccountItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaFixedDeposite(HanaParser.HanaFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaFixedDepositeItem(HanaParser.HanaFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaGeneralDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaGeneralDeposite(HanaParser.HanaGeneralDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#hanaGeneralDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHanaGeneralDepositeItem(HanaParser.HanaGeneralDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(HanaParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HanaParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanaParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(HanaParser.EofContext ctx);
}
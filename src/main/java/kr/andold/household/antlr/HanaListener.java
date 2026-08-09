// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Hana.g4 by ANTLR 4.13.0
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
 * {@link HanaParser}.
 */
public interface HanaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaDocument}.
	 * @param ctx the parse tree
	 */
	void enterHanaDocument(HanaParser.HanaDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaDocument}.
	 * @param ctx the parse tree
	 */
	void exitHanaDocument(HanaParser.HanaDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaISACloseBill}.
	 * @param ctx the parse tree
	 */
	void enterHanaISACloseBill(HanaParser.HanaISACloseBillContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaISACloseBill}.
	 * @param ctx the parse tree
	 */
	void exitHanaISACloseBill(HanaParser.HanaISACloseBillContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaFixedExpire}.
	 * @param ctx the parse tree
	 */
	void enterHanaFixedExpire(HanaParser.HanaFixedExpireContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaFixedExpire}.
	 * @param ctx the parse tree
	 */
	void exitHanaFixedExpire(HanaParser.HanaFixedExpireContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaIsa}.
	 * @param ctx the parse tree
	 */
	void enterHanaIsa(HanaParser.HanaIsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaIsa}.
	 * @param ctx the parse tree
	 */
	void exitHanaIsa(HanaParser.HanaIsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaIsaItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaIsaItem(HanaParser.HanaIsaItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaIsaItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaIsaItem(HanaParser.HanaIsaItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaRsp}.
	 * @param ctx the parse tree
	 */
	void enterHanaRsp(HanaParser.HanaRspContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaRsp}.
	 * @param ctx the parse tree
	 */
	void exitHanaRsp(HanaParser.HanaRspContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaRspItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaRspItem(HanaParser.HanaRspItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaRspItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaRspItem(HanaParser.HanaRspItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaExpireBill}.
	 * @param ctx the parse tree
	 */
	void enterHanaExpireBill(HanaParser.HanaExpireBillContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaExpireBill}.
	 * @param ctx the parse tree
	 */
	void exitHanaExpireBill(HanaParser.HanaExpireBillContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaBusCard}.
	 * @param ctx the parse tree
	 */
	void enterHanaBusCard(HanaParser.HanaBusCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaBusCard}.
	 * @param ctx the parse tree
	 */
	void exitHanaBusCard(HanaParser.HanaBusCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaBusCardItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaBusCardItem(HanaParser.HanaBusCardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaBusCardItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaBusCardItem(HanaParser.HanaBusCardItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaExpiredAccount}.
	 * @param ctx the parse tree
	 */
	void enterHanaExpiredAccount(HanaParser.HanaExpiredAccountContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaExpiredAccount}.
	 * @param ctx the parse tree
	 */
	void exitHanaExpiredAccount(HanaParser.HanaExpiredAccountContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaExpiredAccountItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaExpiredAccountItem(HanaParser.HanaExpiredAccountItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaExpiredAccountItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaExpiredAccountItem(HanaParser.HanaExpiredAccountItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterHanaFixedDeposite(HanaParser.HanaFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitHanaFixedDeposite(HanaParser.HanaFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaFixedDepositeItem(HanaParser.HanaFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaFixedDepositeItem(HanaParser.HanaFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void enterHanaGeneralDeposite(HanaParser.HanaGeneralDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void exitHanaGeneralDeposite(HanaParser.HanaGeneralDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#hanaGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaGeneralDepositeItem(HanaParser.HanaGeneralDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#hanaGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaGeneralDepositeItem(HanaParser.HanaGeneralDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(HanaParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(HanaParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HanaParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HanaParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(HanaParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(HanaParser.EofContext ctx);
}
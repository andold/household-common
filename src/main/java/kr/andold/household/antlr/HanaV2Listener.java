// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\HanaV2.g4 by ANTLR 4.13.0
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
 * {@link HanaV2Parser}.
 */
public interface HanaV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaDocument}.
	 * @param ctx the parse tree
	 */
	void enterHanaDocument(HanaV2Parser.HanaDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaDocument}.
	 * @param ctx the parse tree
	 */
	void exitHanaDocument(HanaV2Parser.HanaDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaISACloseBill}.
	 * @param ctx the parse tree
	 */
	void enterHanaISACloseBill(HanaV2Parser.HanaISACloseBillContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaISACloseBill}.
	 * @param ctx the parse tree
	 */
	void exitHanaISACloseBill(HanaV2Parser.HanaISACloseBillContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaFixedExpire}.
	 * @param ctx the parse tree
	 */
	void enterHanaFixedExpire(HanaV2Parser.HanaFixedExpireContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaFixedExpire}.
	 * @param ctx the parse tree
	 */
	void exitHanaFixedExpire(HanaV2Parser.HanaFixedExpireContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaIsa}.
	 * @param ctx the parse tree
	 */
	void enterHanaIsa(HanaV2Parser.HanaIsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaIsa}.
	 * @param ctx the parse tree
	 */
	void exitHanaIsa(HanaV2Parser.HanaIsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaIsaItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaIsaItem(HanaV2Parser.HanaIsaItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaIsaItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaIsaItem(HanaV2Parser.HanaIsaItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaRsp}.
	 * @param ctx the parse tree
	 */
	void enterHanaRsp(HanaV2Parser.HanaRspContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaRsp}.
	 * @param ctx the parse tree
	 */
	void exitHanaRsp(HanaV2Parser.HanaRspContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaRspItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaRspItem(HanaV2Parser.HanaRspItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaRspItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaRspItem(HanaV2Parser.HanaRspItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaExpireBill}.
	 * @param ctx the parse tree
	 */
	void enterHanaExpireBill(HanaV2Parser.HanaExpireBillContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaExpireBill}.
	 * @param ctx the parse tree
	 */
	void exitHanaExpireBill(HanaV2Parser.HanaExpireBillContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaBusCard}.
	 * @param ctx the parse tree
	 */
	void enterHanaBusCard(HanaV2Parser.HanaBusCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaBusCard}.
	 * @param ctx the parse tree
	 */
	void exitHanaBusCard(HanaV2Parser.HanaBusCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaBusCardItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaBusCardItem(HanaV2Parser.HanaBusCardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaBusCardItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaBusCardItem(HanaV2Parser.HanaBusCardItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaExpiredAccount}.
	 * @param ctx the parse tree
	 */
	void enterHanaExpiredAccount(HanaV2Parser.HanaExpiredAccountContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaExpiredAccount}.
	 * @param ctx the parse tree
	 */
	void exitHanaExpiredAccount(HanaV2Parser.HanaExpiredAccountContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaExpiredAccountItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaExpiredAccountItem(HanaV2Parser.HanaExpiredAccountItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaExpiredAccountItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaExpiredAccountItem(HanaV2Parser.HanaExpiredAccountItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterHanaFixedDeposite(HanaV2Parser.HanaFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitHanaFixedDeposite(HanaV2Parser.HanaFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaFixedDepositeItem(HanaV2Parser.HanaFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaFixedDepositeItem(HanaV2Parser.HanaFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void enterHanaGeneralDeposite(HanaV2Parser.HanaGeneralDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void exitHanaGeneralDeposite(HanaV2Parser.HanaGeneralDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#hanaGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterHanaGeneralDepositeItem(HanaV2Parser.HanaGeneralDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#hanaGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitHanaGeneralDepositeItem(HanaV2Parser.HanaGeneralDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(HanaV2Parser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(HanaV2Parser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HanaV2Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HanaV2Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanaV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(HanaV2Parser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanaV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(HanaV2Parser.EofContext ctx);
}
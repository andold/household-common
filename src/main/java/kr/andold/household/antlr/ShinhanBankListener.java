// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanBank.g4 by ANTLR 4.13.0
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
 * {@link ShinhanBankParser}.
 */
public interface ShinhanBankListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanBankDocument}.
	 * @param ctx the parse tree
	 */
	void enterShinhanBankDocument(ShinhanBankParser.ShinhanBankDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanBankDocument}.
	 * @param ctx the parse tree
	 */
	void exitShinhanBankDocument(ShinhanBankParser.ShinhanBankDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeHtml}.
	 * @param ctx the parse tree
	 */
	void enterShinhanGeneralDepositeHtml(ShinhanBankParser.ShinhanGeneralDepositeHtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeHtml}.
	 * @param ctx the parse tree
	 */
	void exitShinhanGeneralDepositeHtml(ShinhanBankParser.ShinhanGeneralDepositeHtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeHtmlItem}.
	 * @param ctx the parse tree
	 */
	void enterShinhanGeneralDepositeHtmlItem(ShinhanBankParser.ShinhanGeneralDepositeHtmlItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeHtmlItem}.
	 * @param ctx the parse tree
	 */
	void exitShinhanGeneralDepositeHtmlItem(ShinhanBankParser.ShinhanGeneralDepositeHtmlItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanLocalFund}.
	 * @param ctx the parse tree
	 */
	void enterShinhanLocalFund(ShinhanBankParser.ShinhanLocalFundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanLocalFund}.
	 * @param ctx the parse tree
	 */
	void exitShinhanLocalFund(ShinhanBankParser.ShinhanLocalFundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanExpire}.
	 * @param ctx the parse tree
	 */
	void enterShinhanExpire(ShinhanBankParser.ShinhanExpireContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanExpire}.
	 * @param ctx the parse tree
	 */
	void exitShinhanExpire(ShinhanBankParser.ShinhanExpireContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanFund}.
	 * @param ctx the parse tree
	 */
	void enterShinhanFund(ShinhanBankParser.ShinhanFundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanFund}.
	 * @param ctx the parse tree
	 */
	void exitShinhanFund(ShinhanBankParser.ShinhanFundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanFundItem}.
	 * @param ctx the parse tree
	 */
	void enterShinhanFundItem(ShinhanBankParser.ShinhanFundItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanFundItem}.
	 * @param ctx the parse tree
	 */
	void exitShinhanFundItem(ShinhanBankParser.ShinhanFundItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void enterShinhanGeneralDeposite(ShinhanBankParser.ShinhanGeneralDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void exitShinhanGeneralDeposite(ShinhanBankParser.ShinhanGeneralDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterShinhanGeneralDepositeItem(ShinhanBankParser.ShinhanGeneralDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitShinhanGeneralDepositeItem(ShinhanBankParser.ShinhanGeneralDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterShinhanFixedDeposite(ShinhanBankParser.ShinhanFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitShinhanFixedDeposite(ShinhanBankParser.ShinhanFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#shinhanFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterShinhanFixedDepositeItem(ShinhanBankParser.ShinhanFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#shinhanFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitShinhanFixedDepositeItem(ShinhanBankParser.ShinhanFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(ShinhanBankParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(ShinhanBankParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ShinhanBankParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ShinhanBankParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShinhanBankParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(ShinhanBankParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShinhanBankParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(ShinhanBankParser.EofContext ctx);
}
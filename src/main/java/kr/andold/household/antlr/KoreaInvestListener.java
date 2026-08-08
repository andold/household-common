// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\KoreaInvest.g4 by ANTLR 4.13.0
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
 * {@link KoreaInvestParser}.
 */
public interface KoreaInvestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestDocument}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestDocument(KoreaInvestParser.KoreaInvestDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestDocument}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestDocument(KoreaInvestParser.KoreaInvestDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestAllTransaction}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestAllTransaction(KoreaInvestParser.KoreaInvestAllTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestAllTransaction}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestAllTransaction(KoreaInvestParser.KoreaInvestAllTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestAllTransactionItem}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestAllTransactionItem(KoreaInvestParser.KoreaInvestAllTransactionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestAllTransactionItem}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestAllTransactionItem(KoreaInvestParser.KoreaInvestAllTransactionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimate}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestDayTradeComprehensiveEstimate(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimate}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestDayTradeComprehensiveEstimate(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimateItem}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestDayTradeComprehensiveEstimateItem(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimateItem}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestDayTradeComprehensiveEstimateItem(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestInOutTransactionalInformation}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestInOutTransactionalInformation(KoreaInvestParser.KoreaInvestInOutTransactionalInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestInOutTransactionalInformation}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestInOutTransactionalInformation(KoreaInvestParser.KoreaInvestInOutTransactionalInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestInOutTransactionalInformationItem}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestInOutTransactionalInformationItem(KoreaInvestParser.KoreaInvestInOutTransactionalInformationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestInOutTransactionalInformationItem}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestInOutTransactionalInformationItem(KoreaInvestParser.KoreaInvestInOutTransactionalInformationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimateBefore20220904}.
	 * @param ctx the parse tree
	 */
	void enterKoreaInvestDayTradeComprehensiveEstimateBefore20220904(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimateBefore20220904}.
	 * @param ctx the parse tree
	 */
	void exitKoreaInvestDayTradeComprehensiveEstimateBefore20220904(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(KoreaInvestParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(KoreaInvestParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(KoreaInvestParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(KoreaInvestParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoreaInvestParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(KoreaInvestParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoreaInvestParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(KoreaInvestParser.EofContext ctx);
}
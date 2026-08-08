// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\KoreaInvest.g4 by ANTLR 4.13.0
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
 * by {@link KoreaInvestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KoreaInvestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestDocument(KoreaInvestParser.KoreaInvestDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestAllTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestAllTransaction(KoreaInvestParser.KoreaInvestAllTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestAllTransactionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestAllTransactionItem(KoreaInvestParser.KoreaInvestAllTransactionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestDayTradeComprehensiveEstimate(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimateItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestDayTradeComprehensiveEstimateItem(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestInOutTransactionalInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestInOutTransactionalInformation(KoreaInvestParser.KoreaInvestInOutTransactionalInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestInOutTransactionalInformationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestInOutTransactionalInformationItem(KoreaInvestParser.KoreaInvestInOutTransactionalInformationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#koreaInvestDayTradeComprehensiveEstimateBefore20220904}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoreaInvestDayTradeComprehensiveEstimateBefore20220904(KoreaInvestParser.KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(KoreaInvestParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(KoreaInvestParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoreaInvestParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(KoreaInvestParser.EofContext ctx);
}
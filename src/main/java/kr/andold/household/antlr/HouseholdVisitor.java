// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Household.g4 by ANTLR 4.13.0
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
 * by {@link HouseholdParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HouseholdVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HouseholdParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#generalStandard20251002}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandard20251002(HouseholdParser.GeneralStandard20251002Context ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#generalStandardItem20251002}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandardItem20251002(HouseholdParser.GeneralStandardItem20251002Context ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#generalStandard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandard(HouseholdParser.GeneralStandardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#generalStandardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandardItem(HouseholdParser.GeneralStandardItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#kookminDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKookminDocument(HouseholdParser.KookminDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#kookminGeneralDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKookminGeneralDeposite(HouseholdParser.KookminGeneralDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#kookminGeneralDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKookminGeneralDepositeItem(HouseholdParser.KookminGeneralDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(HouseholdParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HouseholdParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(HouseholdParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#etcDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcDocument(HouseholdParser.EtcDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#etcApartnerMaintenaceFee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcApartnerMaintenaceFee(HouseholdParser.EtcApartnerMaintenaceFeeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#etcApartnerMaintenaceFeeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcApartnerMaintenaceFeeItem(HouseholdParser.EtcApartnerMaintenaceFeeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#etcNextree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcNextree(HouseholdParser.EtcNextreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#etcNextreeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcNextreeItem(HouseholdParser.EtcNextreeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#hyundaiDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyundaiDocument(HouseholdParser.HyundaiDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#hyundaiDeferredPaymentTrafficCard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyundaiDeferredPaymentTrafficCard(HouseholdParser.HyundaiDeferredPaymentTrafficCardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdParser#hyundaiDeferredPaymentTrafficCardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyundaiDeferredPaymentTrafficCardItem(HouseholdParser.HyundaiDeferredPaymentTrafficCardItemContext ctx);
}
// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\HouseholdV2.g4 by ANTLR 4.13.0
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
 * by {@link HouseholdV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HouseholdV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HouseholdV2Parser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#generalStandard20251002}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandard20251002(HouseholdV2Parser.GeneralStandard20251002Context ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#generalStandardItem20251002}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandardItem20251002(HouseholdV2Parser.GeneralStandardItem20251002Context ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#generalStandard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandard(HouseholdV2Parser.GeneralStandardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#generalStandardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralStandardItem(HouseholdV2Parser.GeneralStandardItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#kookminDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKookminDocument(HouseholdV2Parser.KookminDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#kookminGeneralDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKookminGeneralDeposite(HouseholdV2Parser.KookminGeneralDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#kookminGeneralDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKookminGeneralDepositeItem(HouseholdV2Parser.KookminGeneralDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(HouseholdV2Parser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HouseholdV2Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(HouseholdV2Parser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#etcDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcDocument(HouseholdV2Parser.EtcDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#etcApartnerMaintenaceFee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcApartnerMaintenaceFee(HouseholdV2Parser.EtcApartnerMaintenaceFeeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#etcApartnerMaintenaceFeeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcApartnerMaintenaceFeeItem(HouseholdV2Parser.EtcApartnerMaintenaceFeeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#etcNextree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcNextree(HouseholdV2Parser.EtcNextreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#etcNextreeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtcNextreeItem(HouseholdV2Parser.EtcNextreeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#hyundaiDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyundaiDocument(HouseholdV2Parser.HyundaiDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#hyundaiDeferredPaymentTrafficCard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyundaiDeferredPaymentTrafficCard(HouseholdV2Parser.HyundaiDeferredPaymentTrafficCardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HouseholdV2Parser#hyundaiDeferredPaymentTrafficCardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyundaiDeferredPaymentTrafficCardItem(HouseholdV2Parser.HyundaiDeferredPaymentTrafficCardItemContext ctx);
}
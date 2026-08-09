// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Household.g4 by ANTLR 4.13.0
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
 * {@link HouseholdParser}.
 */
public interface HouseholdListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HouseholdParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HouseholdParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#generalStandard20251002}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandard20251002(HouseholdParser.GeneralStandard20251002Context ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#generalStandard20251002}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandard20251002(HouseholdParser.GeneralStandard20251002Context ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#generalStandardItem20251002}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandardItem20251002(HouseholdParser.GeneralStandardItem20251002Context ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#generalStandardItem20251002}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandardItem20251002(HouseholdParser.GeneralStandardItem20251002Context ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#generalStandard}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandard(HouseholdParser.GeneralStandardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#generalStandard}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandard(HouseholdParser.GeneralStandardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#generalStandardItem}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandardItem(HouseholdParser.GeneralStandardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#generalStandardItem}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandardItem(HouseholdParser.GeneralStandardItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#kookminDocument}.
	 * @param ctx the parse tree
	 */
	void enterKookminDocument(HouseholdParser.KookminDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#kookminDocument}.
	 * @param ctx the parse tree
	 */
	void exitKookminDocument(HouseholdParser.KookminDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#kookminGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKookminGeneralDeposite(HouseholdParser.KookminGeneralDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#kookminGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKookminGeneralDeposite(HouseholdParser.KookminGeneralDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#kookminGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKookminGeneralDepositeItem(HouseholdParser.KookminGeneralDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#kookminGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKookminGeneralDepositeItem(HouseholdParser.KookminGeneralDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(HouseholdParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(HouseholdParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HouseholdParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HouseholdParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(HouseholdParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(HouseholdParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#etcDocument}.
	 * @param ctx the parse tree
	 */
	void enterEtcDocument(HouseholdParser.EtcDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#etcDocument}.
	 * @param ctx the parse tree
	 */
	void exitEtcDocument(HouseholdParser.EtcDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#etcApartnerMaintenaceFee}.
	 * @param ctx the parse tree
	 */
	void enterEtcApartnerMaintenaceFee(HouseholdParser.EtcApartnerMaintenaceFeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#etcApartnerMaintenaceFee}.
	 * @param ctx the parse tree
	 */
	void exitEtcApartnerMaintenaceFee(HouseholdParser.EtcApartnerMaintenaceFeeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#etcApartnerMaintenaceFeeItem}.
	 * @param ctx the parse tree
	 */
	void enterEtcApartnerMaintenaceFeeItem(HouseholdParser.EtcApartnerMaintenaceFeeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#etcApartnerMaintenaceFeeItem}.
	 * @param ctx the parse tree
	 */
	void exitEtcApartnerMaintenaceFeeItem(HouseholdParser.EtcApartnerMaintenaceFeeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#etcNextree}.
	 * @param ctx the parse tree
	 */
	void enterEtcNextree(HouseholdParser.EtcNextreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#etcNextree}.
	 * @param ctx the parse tree
	 */
	void exitEtcNextree(HouseholdParser.EtcNextreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#etcNextreeItem}.
	 * @param ctx the parse tree
	 */
	void enterEtcNextreeItem(HouseholdParser.EtcNextreeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#etcNextreeItem}.
	 * @param ctx the parse tree
	 */
	void exitEtcNextreeItem(HouseholdParser.EtcNextreeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#hyundaiDocument}.
	 * @param ctx the parse tree
	 */
	void enterHyundaiDocument(HouseholdParser.HyundaiDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#hyundaiDocument}.
	 * @param ctx the parse tree
	 */
	void exitHyundaiDocument(HouseholdParser.HyundaiDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#hyundaiDeferredPaymentTrafficCard}.
	 * @param ctx the parse tree
	 */
	void enterHyundaiDeferredPaymentTrafficCard(HouseholdParser.HyundaiDeferredPaymentTrafficCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#hyundaiDeferredPaymentTrafficCard}.
	 * @param ctx the parse tree
	 */
	void exitHyundaiDeferredPaymentTrafficCard(HouseholdParser.HyundaiDeferredPaymentTrafficCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdParser#hyundaiDeferredPaymentTrafficCardItem}.
	 * @param ctx the parse tree
	 */
	void enterHyundaiDeferredPaymentTrafficCardItem(HouseholdParser.HyundaiDeferredPaymentTrafficCardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdParser#hyundaiDeferredPaymentTrafficCardItem}.
	 * @param ctx the parse tree
	 */
	void exitHyundaiDeferredPaymentTrafficCardItem(HouseholdParser.HyundaiDeferredPaymentTrafficCardItemContext ctx);
}
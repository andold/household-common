// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\HouseholdV2.g4 by ANTLR 4.13.0
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
 * {@link HouseholdV2Parser}.
 */
public interface HouseholdV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HouseholdV2Parser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HouseholdV2Parser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#generalStandard20251002}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandard20251002(HouseholdV2Parser.GeneralStandard20251002Context ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#generalStandard20251002}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandard20251002(HouseholdV2Parser.GeneralStandard20251002Context ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#generalStandardItem20251002}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandardItem20251002(HouseholdV2Parser.GeneralStandardItem20251002Context ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#generalStandardItem20251002}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandardItem20251002(HouseholdV2Parser.GeneralStandardItem20251002Context ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#generalStandard}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandard(HouseholdV2Parser.GeneralStandardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#generalStandard}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandard(HouseholdV2Parser.GeneralStandardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#generalStandardItem}.
	 * @param ctx the parse tree
	 */
	void enterGeneralStandardItem(HouseholdV2Parser.GeneralStandardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#generalStandardItem}.
	 * @param ctx the parse tree
	 */
	void exitGeneralStandardItem(HouseholdV2Parser.GeneralStandardItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#kookminDocument}.
	 * @param ctx the parse tree
	 */
	void enterKookminDocument(HouseholdV2Parser.KookminDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#kookminDocument}.
	 * @param ctx the parse tree
	 */
	void exitKookminDocument(HouseholdV2Parser.KookminDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#kookminGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKookminGeneralDeposite(HouseholdV2Parser.KookminGeneralDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#kookminGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKookminGeneralDeposite(HouseholdV2Parser.KookminGeneralDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#kookminGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKookminGeneralDepositeItem(HouseholdV2Parser.KookminGeneralDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#kookminGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKookminGeneralDepositeItem(HouseholdV2Parser.KookminGeneralDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(HouseholdV2Parser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(HouseholdV2Parser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HouseholdV2Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HouseholdV2Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(HouseholdV2Parser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(HouseholdV2Parser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#etcDocument}.
	 * @param ctx the parse tree
	 */
	void enterEtcDocument(HouseholdV2Parser.EtcDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#etcDocument}.
	 * @param ctx the parse tree
	 */
	void exitEtcDocument(HouseholdV2Parser.EtcDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#etcApartnerMaintenaceFee}.
	 * @param ctx the parse tree
	 */
	void enterEtcApartnerMaintenaceFee(HouseholdV2Parser.EtcApartnerMaintenaceFeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#etcApartnerMaintenaceFee}.
	 * @param ctx the parse tree
	 */
	void exitEtcApartnerMaintenaceFee(HouseholdV2Parser.EtcApartnerMaintenaceFeeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#etcApartnerMaintenaceFeeItem}.
	 * @param ctx the parse tree
	 */
	void enterEtcApartnerMaintenaceFeeItem(HouseholdV2Parser.EtcApartnerMaintenaceFeeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#etcApartnerMaintenaceFeeItem}.
	 * @param ctx the parse tree
	 */
	void exitEtcApartnerMaintenaceFeeItem(HouseholdV2Parser.EtcApartnerMaintenaceFeeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#etcNextree}.
	 * @param ctx the parse tree
	 */
	void enterEtcNextree(HouseholdV2Parser.EtcNextreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#etcNextree}.
	 * @param ctx the parse tree
	 */
	void exitEtcNextree(HouseholdV2Parser.EtcNextreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#etcNextreeItem}.
	 * @param ctx the parse tree
	 */
	void enterEtcNextreeItem(HouseholdV2Parser.EtcNextreeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#etcNextreeItem}.
	 * @param ctx the parse tree
	 */
	void exitEtcNextreeItem(HouseholdV2Parser.EtcNextreeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#hyundaiDocument}.
	 * @param ctx the parse tree
	 */
	void enterHyundaiDocument(HouseholdV2Parser.HyundaiDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#hyundaiDocument}.
	 * @param ctx the parse tree
	 */
	void exitHyundaiDocument(HouseholdV2Parser.HyundaiDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#hyundaiDeferredPaymentTrafficCard}.
	 * @param ctx the parse tree
	 */
	void enterHyundaiDeferredPaymentTrafficCard(HouseholdV2Parser.HyundaiDeferredPaymentTrafficCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#hyundaiDeferredPaymentTrafficCard}.
	 * @param ctx the parse tree
	 */
	void exitHyundaiDeferredPaymentTrafficCard(HouseholdV2Parser.HyundaiDeferredPaymentTrafficCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HouseholdV2Parser#hyundaiDeferredPaymentTrafficCardItem}.
	 * @param ctx the parse tree
	 */
	void enterHyundaiDeferredPaymentTrafficCardItem(HouseholdV2Parser.HyundaiDeferredPaymentTrafficCardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HouseholdV2Parser#hyundaiDeferredPaymentTrafficCardItem}.
	 * @param ctx the parse tree
	 */
	void exitHyundaiDeferredPaymentTrafficCardItem(HouseholdV2Parser.HyundaiDeferredPaymentTrafficCardItemContext ctx);
}
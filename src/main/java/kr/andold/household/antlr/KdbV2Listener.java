// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\KdbV2.g4 by ANTLR 4.13.0
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
 * {@link KdbV2Parser}.
 */
public interface KdbV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbDocument}.
	 * @param ctx the parse tree
	 */
	void enterKdbDocument(KdbV2Parser.KdbDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbDocument}.
	 * @param ctx the parse tree
	 */
	void exitKdbDocument(KdbV2Parser.KdbDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHelper}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingHelper(KdbV2Parser.KdbInstallmentSavingHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHelper}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingHelper(KdbV2Parser.KdbInstallmentSavingHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeByHelper}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDepositeByHelper(KdbV2Parser.KdbGeneralDepositeByHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeByHelper}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDepositeByHelper(KdbV2Parser.KdbGeneralDepositeByHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDepositeExcel(KdbV2Parser.KdbGeneralDepositeExcelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDepositeExcel(KdbV2Parser.KdbGeneralDepositeExcelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHtml}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingHtml(KdbV2Parser.KdbInstallmentSavingHtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHtml}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingHtml(KdbV2Parser.KdbInstallmentSavingHtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHtmlItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingHtmlItem(KdbV2Parser.KdbInstallmentSavingHtmlItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHtmlItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingHtmlItem(KdbV2Parser.KdbInstallmentSavingHtmlItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeClosed}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeClosed(KdbV2Parser.KdbFixedDepositeClosedContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeClosed}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeClosed(KdbV2Parser.KdbFixedDepositeClosedContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeClosedItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeClosedItem(KdbV2Parser.KdbFixedDepositeClosedItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeClosedItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeClosedItem(KdbV2Parser.KdbFixedDepositeClosedItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeExcel(KdbV2Parser.KdbFixedDepositeExcelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeExcel(KdbV2Parser.KdbFixedDepositeExcelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeExcelItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeExcelItem(KdbV2Parser.KdbFixedDepositeExcelItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeExcelItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeExcelItem(KdbV2Parser.KdbFixedDepositeExcelItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbInstallmentSaving}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSaving(KdbV2Parser.KdbInstallmentSavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSaving}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSaving(KdbV2Parser.KdbInstallmentSavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingItem(KdbV2Parser.KdbInstallmentSavingItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingItem(KdbV2Parser.KdbInstallmentSavingItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbEarlyExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKdbEarlyExpireFixedDeposite(KdbV2Parser.KdbEarlyExpireFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbEarlyExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKdbEarlyExpireFixedDeposite(KdbV2Parser.KdbEarlyExpireFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbEarlyExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbEarlyExpireFixedDepositeItem(KdbV2Parser.KdbEarlyExpireFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbEarlyExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbEarlyExpireFixedDepositeItem(KdbV2Parser.KdbEarlyExpireFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKdbExpireFixedDeposite(KdbV2Parser.KdbExpireFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKdbExpireFixedDeposite(KdbV2Parser.KdbExpireFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbExpireFixedDepositeItem(KdbV2Parser.KdbExpireFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbExpireFixedDepositeItem(KdbV2Parser.KdbExpireFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDeposite(KdbV2Parser.KdbGeneralDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDeposite(KdbV2Parser.KdbGeneralDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDepositeItem(KdbV2Parser.KdbGeneralDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDepositeItem(KdbV2Parser.KdbGeneralDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(KdbV2Parser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(KdbV2Parser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(KdbV2Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(KdbV2Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(KdbV2Parser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(KdbV2Parser.EofContext ctx);
}
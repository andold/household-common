// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Kdb.g4 by ANTLR 4.13.0
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
 * {@link KdbParser}.
 */
public interface KdbListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbDocument}.
	 * @param ctx the parse tree
	 */
	void enterKdbDocument(KdbParser.KdbDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbDocument}.
	 * @param ctx the parse tree
	 */
	void exitKdbDocument(KdbParser.KdbDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbInstallmentSavingHelper}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingHelper(KdbParser.KdbInstallmentSavingHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbInstallmentSavingHelper}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingHelper(KdbParser.KdbInstallmentSavingHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbGeneralDepositeByHelper}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDepositeByHelper(KdbParser.KdbGeneralDepositeByHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbGeneralDepositeByHelper}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDepositeByHelper(KdbParser.KdbGeneralDepositeByHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbGeneralDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDepositeExcel(KdbParser.KdbGeneralDepositeExcelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbGeneralDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDepositeExcel(KdbParser.KdbGeneralDepositeExcelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbInstallmentSavingHtml}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingHtml(KdbParser.KdbInstallmentSavingHtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbInstallmentSavingHtml}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingHtml(KdbParser.KdbInstallmentSavingHtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbInstallmentSavingHtmlItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingHtmlItem(KdbParser.KdbInstallmentSavingHtmlItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbInstallmentSavingHtmlItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingHtmlItem(KdbParser.KdbInstallmentSavingHtmlItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbFixedDepositeClosed}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeClosed(KdbParser.KdbFixedDepositeClosedContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbFixedDepositeClosed}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeClosed(KdbParser.KdbFixedDepositeClosedContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbFixedDepositeClosedItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeClosedItem(KdbParser.KdbFixedDepositeClosedItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbFixedDepositeClosedItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeClosedItem(KdbParser.KdbFixedDepositeClosedItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbFixedDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeExcel(KdbParser.KdbFixedDepositeExcelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbFixedDepositeExcel}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeExcel(KdbParser.KdbFixedDepositeExcelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbFixedDepositeExcelItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbFixedDepositeExcelItem(KdbParser.KdbFixedDepositeExcelItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbFixedDepositeExcelItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbFixedDepositeExcelItem(KdbParser.KdbFixedDepositeExcelItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbInstallmentSaving}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSaving(KdbParser.KdbInstallmentSavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbInstallmentSaving}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSaving(KdbParser.KdbInstallmentSavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbInstallmentSavingItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbInstallmentSavingItem(KdbParser.KdbInstallmentSavingItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbInstallmentSavingItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbInstallmentSavingItem(KdbParser.KdbInstallmentSavingItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbEarlyExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKdbEarlyExpireFixedDeposite(KdbParser.KdbEarlyExpireFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbEarlyExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKdbEarlyExpireFixedDeposite(KdbParser.KdbEarlyExpireFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbEarlyExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbEarlyExpireFixedDepositeItem(KdbParser.KdbEarlyExpireFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbEarlyExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbEarlyExpireFixedDepositeItem(KdbParser.KdbEarlyExpireFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKdbExpireFixedDeposite(KdbParser.KdbExpireFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbExpireFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKdbExpireFixedDeposite(KdbParser.KdbExpireFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbExpireFixedDepositeItem(KdbParser.KdbExpireFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbExpireFixedDepositeItem(KdbParser.KdbExpireFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDeposite(KdbParser.KdbGeneralDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbGeneralDeposite}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDeposite(KdbParser.KdbGeneralDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#kdbGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterKdbGeneralDepositeItem(KdbParser.KdbGeneralDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#kdbGeneralDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitKdbGeneralDepositeItem(KdbParser.KdbGeneralDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(KdbParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(KdbParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(KdbParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(KdbParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KdbParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(KdbParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link KdbParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(KdbParser.EofContext ctx);
}
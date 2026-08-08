// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\KdbV2.g4 by ANTLR 4.13.0
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
 * by {@link KdbV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KdbV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbDocument(KdbV2Parser.KdbDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHelper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingHelper(KdbV2Parser.KdbInstallmentSavingHelperContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeByHelper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDepositeByHelper(KdbV2Parser.KdbGeneralDepositeByHelperContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeExcel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDepositeExcel(KdbV2Parser.KdbGeneralDepositeExcelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingHtml(KdbV2Parser.KdbInstallmentSavingHtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingHtmlItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingHtmlItem(KdbV2Parser.KdbInstallmentSavingHtmlItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeClosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeClosed(KdbV2Parser.KdbFixedDepositeClosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeClosedItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeClosedItem(KdbV2Parser.KdbFixedDepositeClosedItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeExcel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeExcel(KdbV2Parser.KdbFixedDepositeExcelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbFixedDepositeExcelItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeExcelItem(KdbV2Parser.KdbFixedDepositeExcelItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSaving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSaving(KdbV2Parser.KdbInstallmentSavingContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbInstallmentSavingItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingItem(KdbV2Parser.KdbInstallmentSavingItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbEarlyExpireFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbEarlyExpireFixedDeposite(KdbV2Parser.KdbEarlyExpireFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbEarlyExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbEarlyExpireFixedDepositeItem(KdbV2Parser.KdbEarlyExpireFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbExpireFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbExpireFixedDeposite(KdbV2Parser.KdbExpireFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbExpireFixedDepositeItem(KdbV2Parser.KdbExpireFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbGeneralDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDeposite(KdbV2Parser.KdbGeneralDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#kdbGeneralDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDepositeItem(KdbV2Parser.KdbGeneralDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(KdbV2Parser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(KdbV2Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbV2Parser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(KdbV2Parser.EofContext ctx);
}
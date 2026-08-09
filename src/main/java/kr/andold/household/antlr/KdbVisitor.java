// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Kdb.g4 by ANTLR 4.13.0
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
 * by {@link KdbParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KdbVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbDocument(KdbParser.KdbDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbInstallmentSavingHelper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingHelper(KdbParser.KdbInstallmentSavingHelperContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbGeneralDepositeByHelper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDepositeByHelper(KdbParser.KdbGeneralDepositeByHelperContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbGeneralDepositeExcel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDepositeExcel(KdbParser.KdbGeneralDepositeExcelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbInstallmentSavingHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingHtml(KdbParser.KdbInstallmentSavingHtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbInstallmentSavingHtmlItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingHtmlItem(KdbParser.KdbInstallmentSavingHtmlItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbFixedDepositeClosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeClosed(KdbParser.KdbFixedDepositeClosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbFixedDepositeClosedItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeClosedItem(KdbParser.KdbFixedDepositeClosedItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbFixedDepositeExcel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeExcel(KdbParser.KdbFixedDepositeExcelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbFixedDepositeExcelItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbFixedDepositeExcelItem(KdbParser.KdbFixedDepositeExcelItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbInstallmentSaving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSaving(KdbParser.KdbInstallmentSavingContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbInstallmentSavingItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbInstallmentSavingItem(KdbParser.KdbInstallmentSavingItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbEarlyExpireFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbEarlyExpireFixedDeposite(KdbParser.KdbEarlyExpireFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbEarlyExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbEarlyExpireFixedDepositeItem(KdbParser.KdbEarlyExpireFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbExpireFixedDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbExpireFixedDeposite(KdbParser.KdbExpireFixedDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbExpireFixedDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbExpireFixedDepositeItem(KdbParser.KdbExpireFixedDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbGeneralDeposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDeposite(KdbParser.KdbGeneralDepositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#kdbGeneralDepositeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKdbGeneralDepositeItem(KdbParser.KdbGeneralDepositeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(KdbParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(KdbParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KdbParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(KdbParser.EofContext ctx);
}
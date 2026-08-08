// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ReceiptV2.g4 by ANTLR 4.13.0
package kr.andold.household.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReceiptV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReceiptV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptDocument(ReceiptV2Parser.ReceiptDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptNHHanaroTransationInquiry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptNHHanaroTransationInquiry(ReceiptV2Parser.ReceiptNHHanaroTransationInquiryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptNHHanaroTransationInquiryItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptNHHanaroTransationInquiryItems(ReceiptV2Parser.ReceiptNHHanaroTransationInquiryItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptHanaroDirectTrade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptHanaroDirectTrade(ReceiptV2Parser.ReceiptHanaroDirectTradeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptHanaro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptHanaro(ReceiptV2Parser.ReceiptHanaroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptHanaroItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptHanaroItem(ReceiptV2Parser.ReceiptHanaroItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#exHipass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExHipass(ReceiptV2Parser.ExHipassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#hipass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHipass(ReceiptV2Parser.HipassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#hipassItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHipassItem(ReceiptV2Parser.HipassItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptEMart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptEMart(ReceiptV2Parser.ReceiptEMartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptEMartItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptEMartItem(ReceiptV2Parser.ReceiptEMartItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptSSg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptSSg(ReceiptV2Parser.ReceiptSSgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptSSgSSgDelivery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptSSgSSgDelivery(ReceiptV2Parser.ReceiptSSgSSgDeliveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptSSgD2DDelivery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptSSgD2DDelivery(ReceiptV2Parser.ReceiptSSgD2DDeliveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptDureSupplyHistoryDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptDureSupplyHistoryDetail(ReceiptV2Parser.ReceiptDureSupplyHistoryDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptDureSupplyHistoryDetailItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptDureSupplyHistoryDetailItem(ReceiptV2Parser.ReceiptDureSupplyHistoryDetailItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpHtml(ReceiptV2Parser.ReceiptICoorpHtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtmlSummary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpHtmlSummary(ReceiptV2Parser.ReceiptICoorpHtmlSummaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtmlItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpHtmlItem(ReceiptV2Parser.ReceiptICoorpHtmlItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptStandard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptStandard(ReceiptV2Parser.ReceiptStandardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptStandardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptStandardItem(ReceiptV2Parser.ReceiptStandardItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptICoorp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorp(ReceiptV2Parser.ReceiptICoorpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpItem(ReceiptV2Parser.ReceiptICoorpItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptTaeYoungHomeMart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptTaeYoungHomeMart(ReceiptV2Parser.ReceiptTaeYoungHomeMartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#receiptTaeYoungHomeMartItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptTaeYoungHomeMartItem(ReceiptV2Parser.ReceiptTaeYoungHomeMartItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(ReceiptV2Parser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ReceiptV2Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptV2Parser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(ReceiptV2Parser.EofContext ctx);
}
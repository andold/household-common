// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Receipt.g4 by ANTLR 4.13.0
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
 * by {@link ReceiptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReceiptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptDocument(ReceiptParser.ReceiptDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptNHHanaroTransationInquiry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptNHHanaroTransationInquiry(ReceiptParser.ReceiptNHHanaroTransationInquiryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptNHHanaroTransationInquiryItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptNHHanaroTransationInquiryItems(ReceiptParser.ReceiptNHHanaroTransationInquiryItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptHanaroDirectTrade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptHanaroDirectTrade(ReceiptParser.ReceiptHanaroDirectTradeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptHanaro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptHanaro(ReceiptParser.ReceiptHanaroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptHanaroItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptHanaroItem(ReceiptParser.ReceiptHanaroItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#exHipass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExHipass(ReceiptParser.ExHipassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#hipass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHipass(ReceiptParser.HipassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#hipassItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHipassItem(ReceiptParser.HipassItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptEMart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptEMart(ReceiptParser.ReceiptEMartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptEMartItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptEMartItem(ReceiptParser.ReceiptEMartItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptSSg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptSSg(ReceiptParser.ReceiptSSgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptSSgSSgDelivery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptSSgSSgDelivery(ReceiptParser.ReceiptSSgSSgDeliveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptSSgD2DDelivery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptSSgD2DDelivery(ReceiptParser.ReceiptSSgD2DDeliveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptDureSupplyHistoryDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptDureSupplyHistoryDetail(ReceiptParser.ReceiptDureSupplyHistoryDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptDureSupplyHistoryDetailItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptDureSupplyHistoryDetailItem(ReceiptParser.ReceiptDureSupplyHistoryDetailItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptICoorpHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpHtml(ReceiptParser.ReceiptICoorpHtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptICoorpHtmlSummary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpHtmlSummary(ReceiptParser.ReceiptICoorpHtmlSummaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptICoorpHtmlItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpHtmlItem(ReceiptParser.ReceiptICoorpHtmlItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptStandard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptStandard(ReceiptParser.ReceiptStandardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptStandardItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptStandardItem(ReceiptParser.ReceiptStandardItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptICoorp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorp(ReceiptParser.ReceiptICoorpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptICoorpItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptICoorpItem(ReceiptParser.ReceiptICoorpItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptTaeYoungHomeMart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptTaeYoungHomeMart(ReceiptParser.ReceiptTaeYoungHomeMartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#receiptTaeYoungHomeMartItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiptTaeYoungHomeMartItem(ReceiptParser.ReceiptTaeYoungHomeMartItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(ReceiptParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ReceiptParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceiptParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(ReceiptParser.EofContext ctx);
}
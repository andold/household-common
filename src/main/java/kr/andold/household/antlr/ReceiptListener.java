// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Receipt.g4 by ANTLR 4.13.0
package kr.andold.household.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReceiptParser}.
 */
public interface ReceiptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptDocument}.
	 * @param ctx the parse tree
	 */
	void enterReceiptDocument(ReceiptParser.ReceiptDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptDocument}.
	 * @param ctx the parse tree
	 */
	void exitReceiptDocument(ReceiptParser.ReceiptDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptNHHanaroTransationInquiry}.
	 * @param ctx the parse tree
	 */
	void enterReceiptNHHanaroTransationInquiry(ReceiptParser.ReceiptNHHanaroTransationInquiryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptNHHanaroTransationInquiry}.
	 * @param ctx the parse tree
	 */
	void exitReceiptNHHanaroTransationInquiry(ReceiptParser.ReceiptNHHanaroTransationInquiryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptNHHanaroTransationInquiryItems}.
	 * @param ctx the parse tree
	 */
	void enterReceiptNHHanaroTransationInquiryItems(ReceiptParser.ReceiptNHHanaroTransationInquiryItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptNHHanaroTransationInquiryItems}.
	 * @param ctx the parse tree
	 */
	void exitReceiptNHHanaroTransationInquiryItems(ReceiptParser.ReceiptNHHanaroTransationInquiryItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptHanaroDirectTrade}.
	 * @param ctx the parse tree
	 */
	void enterReceiptHanaroDirectTrade(ReceiptParser.ReceiptHanaroDirectTradeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptHanaroDirectTrade}.
	 * @param ctx the parse tree
	 */
	void exitReceiptHanaroDirectTrade(ReceiptParser.ReceiptHanaroDirectTradeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptHanaro}.
	 * @param ctx the parse tree
	 */
	void enterReceiptHanaro(ReceiptParser.ReceiptHanaroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptHanaro}.
	 * @param ctx the parse tree
	 */
	void exitReceiptHanaro(ReceiptParser.ReceiptHanaroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptHanaroItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptHanaroItem(ReceiptParser.ReceiptHanaroItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptHanaroItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptHanaroItem(ReceiptParser.ReceiptHanaroItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#exHipass}.
	 * @param ctx the parse tree
	 */
	void enterExHipass(ReceiptParser.ExHipassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#exHipass}.
	 * @param ctx the parse tree
	 */
	void exitExHipass(ReceiptParser.ExHipassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#hipass}.
	 * @param ctx the parse tree
	 */
	void enterHipass(ReceiptParser.HipassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#hipass}.
	 * @param ctx the parse tree
	 */
	void exitHipass(ReceiptParser.HipassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#hipassItem}.
	 * @param ctx the parse tree
	 */
	void enterHipassItem(ReceiptParser.HipassItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#hipassItem}.
	 * @param ctx the parse tree
	 */
	void exitHipassItem(ReceiptParser.HipassItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptEMart}.
	 * @param ctx the parse tree
	 */
	void enterReceiptEMart(ReceiptParser.ReceiptEMartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptEMart}.
	 * @param ctx the parse tree
	 */
	void exitReceiptEMart(ReceiptParser.ReceiptEMartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptEMartItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptEMartItem(ReceiptParser.ReceiptEMartItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptEMartItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptEMartItem(ReceiptParser.ReceiptEMartItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptSSg}.
	 * @param ctx the parse tree
	 */
	void enterReceiptSSg(ReceiptParser.ReceiptSSgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptSSg}.
	 * @param ctx the parse tree
	 */
	void exitReceiptSSg(ReceiptParser.ReceiptSSgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptSSgSSgDelivery}.
	 * @param ctx the parse tree
	 */
	void enterReceiptSSgSSgDelivery(ReceiptParser.ReceiptSSgSSgDeliveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptSSgSSgDelivery}.
	 * @param ctx the parse tree
	 */
	void exitReceiptSSgSSgDelivery(ReceiptParser.ReceiptSSgSSgDeliveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptSSgD2DDelivery}.
	 * @param ctx the parse tree
	 */
	void enterReceiptSSgD2DDelivery(ReceiptParser.ReceiptSSgD2DDeliveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptSSgD2DDelivery}.
	 * @param ctx the parse tree
	 */
	void exitReceiptSSgD2DDelivery(ReceiptParser.ReceiptSSgD2DDeliveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptDureSupplyHistoryDetail}.
	 * @param ctx the parse tree
	 */
	void enterReceiptDureSupplyHistoryDetail(ReceiptParser.ReceiptDureSupplyHistoryDetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptDureSupplyHistoryDetail}.
	 * @param ctx the parse tree
	 */
	void exitReceiptDureSupplyHistoryDetail(ReceiptParser.ReceiptDureSupplyHistoryDetailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptDureSupplyHistoryDetailItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptDureSupplyHistoryDetailItem(ReceiptParser.ReceiptDureSupplyHistoryDetailItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptDureSupplyHistoryDetailItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptDureSupplyHistoryDetailItem(ReceiptParser.ReceiptDureSupplyHistoryDetailItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptICoorpHtml}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpHtml(ReceiptParser.ReceiptICoorpHtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptICoorpHtml}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpHtml(ReceiptParser.ReceiptICoorpHtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptICoorpHtmlSummary}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpHtmlSummary(ReceiptParser.ReceiptICoorpHtmlSummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptICoorpHtmlSummary}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpHtmlSummary(ReceiptParser.ReceiptICoorpHtmlSummaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptICoorpHtmlItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpHtmlItem(ReceiptParser.ReceiptICoorpHtmlItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptICoorpHtmlItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpHtmlItem(ReceiptParser.ReceiptICoorpHtmlItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptStandard}.
	 * @param ctx the parse tree
	 */
	void enterReceiptStandard(ReceiptParser.ReceiptStandardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptStandard}.
	 * @param ctx the parse tree
	 */
	void exitReceiptStandard(ReceiptParser.ReceiptStandardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptStandardItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptStandardItem(ReceiptParser.ReceiptStandardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptStandardItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptStandardItem(ReceiptParser.ReceiptStandardItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptICoorp}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorp(ReceiptParser.ReceiptICoorpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptICoorp}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorp(ReceiptParser.ReceiptICoorpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptICoorpItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpItem(ReceiptParser.ReceiptICoorpItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptICoorpItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpItem(ReceiptParser.ReceiptICoorpItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptTaeYoungHomeMart}.
	 * @param ctx the parse tree
	 */
	void enterReceiptTaeYoungHomeMart(ReceiptParser.ReceiptTaeYoungHomeMartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptTaeYoungHomeMart}.
	 * @param ctx the parse tree
	 */
	void exitReceiptTaeYoungHomeMart(ReceiptParser.ReceiptTaeYoungHomeMartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#receiptTaeYoungHomeMartItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptTaeYoungHomeMartItem(ReceiptParser.ReceiptTaeYoungHomeMartItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#receiptTaeYoungHomeMartItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptTaeYoungHomeMartItem(ReceiptParser.ReceiptTaeYoungHomeMartItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(ReceiptParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(ReceiptParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ReceiptParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ReceiptParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(ReceiptParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(ReceiptParser.EofContext ctx);
}
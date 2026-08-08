// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ReceiptV2.g4 by ANTLR 4.13.0
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
 * {@link ReceiptV2Parser}.
 */
public interface ReceiptV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptDocument}.
	 * @param ctx the parse tree
	 */
	void enterReceiptDocument(ReceiptV2Parser.ReceiptDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptDocument}.
	 * @param ctx the parse tree
	 */
	void exitReceiptDocument(ReceiptV2Parser.ReceiptDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptNHHanaroTransationInquiry}.
	 * @param ctx the parse tree
	 */
	void enterReceiptNHHanaroTransationInquiry(ReceiptV2Parser.ReceiptNHHanaroTransationInquiryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptNHHanaroTransationInquiry}.
	 * @param ctx the parse tree
	 */
	void exitReceiptNHHanaroTransationInquiry(ReceiptV2Parser.ReceiptNHHanaroTransationInquiryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptNHHanaroTransationInquiryItems}.
	 * @param ctx the parse tree
	 */
	void enterReceiptNHHanaroTransationInquiryItems(ReceiptV2Parser.ReceiptNHHanaroTransationInquiryItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptNHHanaroTransationInquiryItems}.
	 * @param ctx the parse tree
	 */
	void exitReceiptNHHanaroTransationInquiryItems(ReceiptV2Parser.ReceiptNHHanaroTransationInquiryItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptHanaroDirectTrade}.
	 * @param ctx the parse tree
	 */
	void enterReceiptHanaroDirectTrade(ReceiptV2Parser.ReceiptHanaroDirectTradeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptHanaroDirectTrade}.
	 * @param ctx the parse tree
	 */
	void exitReceiptHanaroDirectTrade(ReceiptV2Parser.ReceiptHanaroDirectTradeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptHanaro}.
	 * @param ctx the parse tree
	 */
	void enterReceiptHanaro(ReceiptV2Parser.ReceiptHanaroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptHanaro}.
	 * @param ctx the parse tree
	 */
	void exitReceiptHanaro(ReceiptV2Parser.ReceiptHanaroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptHanaroItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptHanaroItem(ReceiptV2Parser.ReceiptHanaroItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptHanaroItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptHanaroItem(ReceiptV2Parser.ReceiptHanaroItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#exHipass}.
	 * @param ctx the parse tree
	 */
	void enterExHipass(ReceiptV2Parser.ExHipassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#exHipass}.
	 * @param ctx the parse tree
	 */
	void exitExHipass(ReceiptV2Parser.ExHipassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#hipass}.
	 * @param ctx the parse tree
	 */
	void enterHipass(ReceiptV2Parser.HipassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#hipass}.
	 * @param ctx the parse tree
	 */
	void exitHipass(ReceiptV2Parser.HipassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#hipassItem}.
	 * @param ctx the parse tree
	 */
	void enterHipassItem(ReceiptV2Parser.HipassItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#hipassItem}.
	 * @param ctx the parse tree
	 */
	void exitHipassItem(ReceiptV2Parser.HipassItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptEMart}.
	 * @param ctx the parse tree
	 */
	void enterReceiptEMart(ReceiptV2Parser.ReceiptEMartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptEMart}.
	 * @param ctx the parse tree
	 */
	void exitReceiptEMart(ReceiptV2Parser.ReceiptEMartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptEMartItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptEMartItem(ReceiptV2Parser.ReceiptEMartItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptEMartItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptEMartItem(ReceiptV2Parser.ReceiptEMartItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptSSg}.
	 * @param ctx the parse tree
	 */
	void enterReceiptSSg(ReceiptV2Parser.ReceiptSSgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptSSg}.
	 * @param ctx the parse tree
	 */
	void exitReceiptSSg(ReceiptV2Parser.ReceiptSSgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptSSgSSgDelivery}.
	 * @param ctx the parse tree
	 */
	void enterReceiptSSgSSgDelivery(ReceiptV2Parser.ReceiptSSgSSgDeliveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptSSgSSgDelivery}.
	 * @param ctx the parse tree
	 */
	void exitReceiptSSgSSgDelivery(ReceiptV2Parser.ReceiptSSgSSgDeliveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptSSgD2DDelivery}.
	 * @param ctx the parse tree
	 */
	void enterReceiptSSgD2DDelivery(ReceiptV2Parser.ReceiptSSgD2DDeliveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptSSgD2DDelivery}.
	 * @param ctx the parse tree
	 */
	void exitReceiptSSgD2DDelivery(ReceiptV2Parser.ReceiptSSgD2DDeliveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptDureSupplyHistoryDetail}.
	 * @param ctx the parse tree
	 */
	void enterReceiptDureSupplyHistoryDetail(ReceiptV2Parser.ReceiptDureSupplyHistoryDetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptDureSupplyHistoryDetail}.
	 * @param ctx the parse tree
	 */
	void exitReceiptDureSupplyHistoryDetail(ReceiptV2Parser.ReceiptDureSupplyHistoryDetailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptDureSupplyHistoryDetailItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptDureSupplyHistoryDetailItem(ReceiptV2Parser.ReceiptDureSupplyHistoryDetailItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptDureSupplyHistoryDetailItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptDureSupplyHistoryDetailItem(ReceiptV2Parser.ReceiptDureSupplyHistoryDetailItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtml}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpHtml(ReceiptV2Parser.ReceiptICoorpHtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtml}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpHtml(ReceiptV2Parser.ReceiptICoorpHtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtmlSummary}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpHtmlSummary(ReceiptV2Parser.ReceiptICoorpHtmlSummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtmlSummary}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpHtmlSummary(ReceiptV2Parser.ReceiptICoorpHtmlSummaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtmlItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpHtmlItem(ReceiptV2Parser.ReceiptICoorpHtmlItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpHtmlItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpHtmlItem(ReceiptV2Parser.ReceiptICoorpHtmlItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptStandard}.
	 * @param ctx the parse tree
	 */
	void enterReceiptStandard(ReceiptV2Parser.ReceiptStandardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptStandard}.
	 * @param ctx the parse tree
	 */
	void exitReceiptStandard(ReceiptV2Parser.ReceiptStandardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptStandardItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptStandardItem(ReceiptV2Parser.ReceiptStandardItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptStandardItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptStandardItem(ReceiptV2Parser.ReceiptStandardItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptICoorp}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorp(ReceiptV2Parser.ReceiptICoorpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptICoorp}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorp(ReceiptV2Parser.ReceiptICoorpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptICoorpItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptICoorpItem(ReceiptV2Parser.ReceiptICoorpItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptICoorpItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptICoorpItem(ReceiptV2Parser.ReceiptICoorpItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptTaeYoungHomeMart}.
	 * @param ctx the parse tree
	 */
	void enterReceiptTaeYoungHomeMart(ReceiptV2Parser.ReceiptTaeYoungHomeMartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptTaeYoungHomeMart}.
	 * @param ctx the parse tree
	 */
	void exitReceiptTaeYoungHomeMart(ReceiptV2Parser.ReceiptTaeYoungHomeMartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#receiptTaeYoungHomeMartItem}.
	 * @param ctx the parse tree
	 */
	void enterReceiptTaeYoungHomeMartItem(ReceiptV2Parser.ReceiptTaeYoungHomeMartItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#receiptTaeYoungHomeMartItem}.
	 * @param ctx the parse tree
	 */
	void exitReceiptTaeYoungHomeMartItem(ReceiptV2Parser.ReceiptTaeYoungHomeMartItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(ReceiptV2Parser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(ReceiptV2Parser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ReceiptV2Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ReceiptV2Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceiptV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(ReceiptV2Parser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceiptV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(ReceiptV2Parser.EofContext ctx);
}
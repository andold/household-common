// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\NaverV2.g4 by ANTLR 4.13.0
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
 * {@link NaverV2Parser}.
 */
public interface NaverV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverDocument}.
	 * @param ctx the parse tree
	 */
	void enterNaverDocument(NaverV2Parser.NaverDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverDocument}.
	 * @param ctx the parse tree
	 */
	void exitNaverDocument(NaverV2Parser.NaverDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailShillaBakery}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailShillaBakery(NaverV2Parser.NaverNaverMailShillaBakeryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailShillaBakery}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailShillaBakery(NaverV2Parser.NaverNaverMailShillaBakeryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailShillaBakeryItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailShillaBakeryItem(NaverV2Parser.NaverNaverMailShillaBakeryItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailShillaBakeryItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailShillaBakeryItem(NaverV2Parser.NaverNaverMailShillaBakeryItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailNaverPay}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailNaverPay(NaverV2Parser.NaverNaverMailNaverPayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailNaverPay}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailNaverPay(NaverV2Parser.NaverNaverMailNaverPayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailAuction}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailAuction(NaverV2Parser.NaverNaverMailAuctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailAuction}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailAuction(NaverV2Parser.NaverNaverMailAuctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailAuctionItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailAuctionItem(NaverV2Parser.NaverNaverMailAuctionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailAuctionItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailAuctionItem(NaverV2Parser.NaverNaverMailAuctionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelPay}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayCancelPay(NaverV2Parser.NaverNaverPayCancelPayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelPay}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayCancelPay(NaverV2Parser.NaverNaverPayCancelPayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelPurchase}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayCancelPurchase(NaverV2Parser.NaverNaverPayCancelPurchaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelPurchase}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayCancelPurchase(NaverV2Parser.NaverNaverPayCancelPurchaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMainGoogle}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMainGoogle(NaverV2Parser.NaverNaverMainGoogleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMainGoogle}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMainGoogle(NaverV2Parser.NaverNaverMainGoogleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailReserveBuy}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailReserveBuy(NaverV2Parser.NaverNaverMailReserveBuyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailReserveBuy}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailReserveBuy(NaverV2Parser.NaverNaverMailReserveBuyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailGMarket}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailGMarket(NaverV2Parser.NaverNaverMailGMarketContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailGMarket}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailGMarket(NaverV2Parser.NaverNaverMailGMarketContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMailGMarketItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailGMarketItem(NaverV2Parser.NaverNaverMailGMarketItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMailGMarketItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailGMarketItem(NaverV2Parser.NaverNaverMailGMarketItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMail11Address}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMail11Address(NaverV2Parser.NaverNaverMail11AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMail11Address}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMail11Address(NaverV2Parser.NaverNaverMail11AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverMail11AddressItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMail11AddressItem(NaverV2Parser.NaverNaverMail11AddressItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverMail11AddressItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMail11AddressItem(NaverV2Parser.NaverNaverMail11AddressItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverPayDeliveryRace}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayDeliveryRace(NaverV2Parser.NaverNaverPayDeliveryRaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverPayDeliveryRace}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayDeliveryRace(NaverV2Parser.NaverNaverPayDeliveryRaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelSale}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayCancelSale(NaverV2Parser.NaverNaverPayCancelSaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelSale}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayCancelSale(NaverV2Parser.NaverNaverPayCancelSaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverPay}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPay(NaverV2Parser.NaverNaverPayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverPay}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPay(NaverV2Parser.NaverNaverPayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverPayOrder}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayOrder(NaverV2Parser.NaverNaverPayOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverPayOrder}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayOrder(NaverV2Parser.NaverNaverPayOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#naverNaverPayOrderAddition}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayOrderAddition(NaverV2Parser.NaverNaverPayOrderAdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#naverNaverPayOrderAddition}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayOrderAddition(NaverV2Parser.NaverNaverPayOrderAdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(NaverV2Parser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(NaverV2Parser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(NaverV2Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(NaverV2Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(NaverV2Parser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverV2Parser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(NaverV2Parser.EofContext ctx);
}
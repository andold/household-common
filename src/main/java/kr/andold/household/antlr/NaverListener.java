// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Naver.g4 by ANTLR 4.13.0
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
 * {@link NaverParser}.
 */
public interface NaverListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverDocument}.
	 * @param ctx the parse tree
	 */
	void enterNaverDocument(NaverParser.NaverDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverDocument}.
	 * @param ctx the parse tree
	 */
	void exitNaverDocument(NaverParser.NaverDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailShillaBakery}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailShillaBakery(NaverParser.NaverNaverMailShillaBakeryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailShillaBakery}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailShillaBakery(NaverParser.NaverNaverMailShillaBakeryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailShillaBakeryItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailShillaBakeryItem(NaverParser.NaverNaverMailShillaBakeryItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailShillaBakeryItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailShillaBakeryItem(NaverParser.NaverNaverMailShillaBakeryItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailNaverPay}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailNaverPay(NaverParser.NaverNaverMailNaverPayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailNaverPay}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailNaverPay(NaverParser.NaverNaverMailNaverPayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailAuction}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailAuction(NaverParser.NaverNaverMailAuctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailAuction}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailAuction(NaverParser.NaverNaverMailAuctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailAuctionItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailAuctionItem(NaverParser.NaverNaverMailAuctionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailAuctionItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailAuctionItem(NaverParser.NaverNaverMailAuctionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverPayCancelPay}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayCancelPay(NaverParser.NaverNaverPayCancelPayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverPayCancelPay}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayCancelPay(NaverParser.NaverNaverPayCancelPayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverPayCancelPurchase}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayCancelPurchase(NaverParser.NaverNaverPayCancelPurchaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverPayCancelPurchase}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayCancelPurchase(NaverParser.NaverNaverPayCancelPurchaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMainGoogle}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMainGoogle(NaverParser.NaverNaverMainGoogleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMainGoogle}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMainGoogle(NaverParser.NaverNaverMainGoogleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailReserveBuy}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailReserveBuy(NaverParser.NaverNaverMailReserveBuyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailReserveBuy}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailReserveBuy(NaverParser.NaverNaverMailReserveBuyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailGMarket}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailGMarket(NaverParser.NaverNaverMailGMarketContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailGMarket}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailGMarket(NaverParser.NaverNaverMailGMarketContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMailGMarketItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMailGMarketItem(NaverParser.NaverNaverMailGMarketItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMailGMarketItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMailGMarketItem(NaverParser.NaverNaverMailGMarketItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMail11Address}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMail11Address(NaverParser.NaverNaverMail11AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMail11Address}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMail11Address(NaverParser.NaverNaverMail11AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverMail11AddressItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverMail11AddressItem(NaverParser.NaverNaverMail11AddressItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverMail11AddressItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverMail11AddressItem(NaverParser.NaverNaverMail11AddressItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverPayDeliveryRace}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayDeliveryRace(NaverParser.NaverNaverPayDeliveryRaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverPayDeliveryRace}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayDeliveryRace(NaverParser.NaverNaverPayDeliveryRaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverPayCancelSale}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayCancelSale(NaverParser.NaverNaverPayCancelSaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverPayCancelSale}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayCancelSale(NaverParser.NaverNaverPayCancelSaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverPay}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPay(NaverParser.NaverNaverPayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverPay}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPay(NaverParser.NaverNaverPayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverPayOrder}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayOrder(NaverParser.NaverNaverPayOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverPayOrder}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayOrder(NaverParser.NaverNaverPayOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#naverNaverPayOrderAddition}.
	 * @param ctx the parse tree
	 */
	void enterNaverNaverPayOrderAddition(NaverParser.NaverNaverPayOrderAdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#naverNaverPayOrderAddition}.
	 * @param ctx the parse tree
	 */
	void exitNaverNaverPayOrderAddition(NaverParser.NaverNaverPayOrderAdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(NaverParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(NaverParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(NaverParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(NaverParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaverParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(NaverParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaverParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(NaverParser.EofContext ctx);
}
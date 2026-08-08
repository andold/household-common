// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\NaverV2.g4 by ANTLR 4.13.0
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
 * by {@link NaverV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NaverV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverDocument(NaverV2Parser.NaverDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailShillaBakery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailShillaBakery(NaverV2Parser.NaverNaverMailShillaBakeryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailShillaBakeryItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailShillaBakeryItem(NaverV2Parser.NaverNaverMailShillaBakeryItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailNaverPay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailNaverPay(NaverV2Parser.NaverNaverMailNaverPayContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailAuction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailAuction(NaverV2Parser.NaverNaverMailAuctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailAuctionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailAuctionItem(NaverV2Parser.NaverNaverMailAuctionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelPay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayCancelPay(NaverV2Parser.NaverNaverPayCancelPayContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelPurchase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayCancelPurchase(NaverV2Parser.NaverNaverPayCancelPurchaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMainGoogle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMainGoogle(NaverV2Parser.NaverNaverMainGoogleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailReserveBuy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailReserveBuy(NaverV2Parser.NaverNaverMailReserveBuyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailGMarket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailGMarket(NaverV2Parser.NaverNaverMailGMarketContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMailGMarketItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailGMarketItem(NaverV2Parser.NaverNaverMailGMarketItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMail11Address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMail11Address(NaverV2Parser.NaverNaverMail11AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverMail11AddressItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMail11AddressItem(NaverV2Parser.NaverNaverMail11AddressItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverPayDeliveryRace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayDeliveryRace(NaverV2Parser.NaverNaverPayDeliveryRaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverPayCancelSale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayCancelSale(NaverV2Parser.NaverNaverPayCancelSaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverPay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPay(NaverV2Parser.NaverNaverPayContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverPayOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayOrder(NaverV2Parser.NaverNaverPayOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#naverNaverPayOrderAddition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayOrderAddition(NaverV2Parser.NaverNaverPayOrderAdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(NaverV2Parser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(NaverV2Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverV2Parser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(NaverV2Parser.EofContext ctx);
}
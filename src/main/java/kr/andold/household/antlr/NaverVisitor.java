// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Naver.g4 by ANTLR 4.13.0
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
 * by {@link NaverParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NaverVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverDocument(NaverParser.NaverDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailShillaBakery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailShillaBakery(NaverParser.NaverNaverMailShillaBakeryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailShillaBakeryItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailShillaBakeryItem(NaverParser.NaverNaverMailShillaBakeryItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailNaverPay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailNaverPay(NaverParser.NaverNaverMailNaverPayContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailAuction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailAuction(NaverParser.NaverNaverMailAuctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailAuctionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailAuctionItem(NaverParser.NaverNaverMailAuctionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverPayCancelPay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayCancelPay(NaverParser.NaverNaverPayCancelPayContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverPayCancelPurchase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayCancelPurchase(NaverParser.NaverNaverPayCancelPurchaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMainGoogle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMainGoogle(NaverParser.NaverNaverMainGoogleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailReserveBuy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailReserveBuy(NaverParser.NaverNaverMailReserveBuyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailGMarket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailGMarket(NaverParser.NaverNaverMailGMarketContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMailGMarketItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMailGMarketItem(NaverParser.NaverNaverMailGMarketItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMail11Address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMail11Address(NaverParser.NaverNaverMail11AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverMail11AddressItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverMail11AddressItem(NaverParser.NaverNaverMail11AddressItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverPayDeliveryRace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayDeliveryRace(NaverParser.NaverNaverPayDeliveryRaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverPayCancelSale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayCancelSale(NaverParser.NaverNaverPayCancelSaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverPay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPay(NaverParser.NaverNaverPayContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverPayOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayOrder(NaverParser.NaverNaverPayOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#naverNaverPayOrderAddition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverNaverPayOrderAddition(NaverParser.NaverNaverPayOrderAdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(NaverParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(NaverParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaverParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(NaverParser.EofContext ctx);
}
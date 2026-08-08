// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\SamsungInsure.g4 by ANTLR 4.13.0
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
 * by {@link SamsungInsureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SamsungInsureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SamsungInsureParser#samsungInsureDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamsungInsureDocument(SamsungInsureParser.SamsungInsureDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamsungInsureParser#samsungLifeInsurance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamsungLifeInsurance(SamsungInsureParser.SamsungLifeInsuranceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamsungInsureParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(SamsungInsureParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamsungInsureParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SamsungInsureParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamsungInsureParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(SamsungInsureParser.EofContext ctx);
}
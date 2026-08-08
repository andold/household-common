// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\SamsungInsure.g4 by ANTLR 4.13.0
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
 * {@link SamsungInsureParser}.
 */
public interface SamsungInsureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SamsungInsureParser#samsungInsureDocument}.
	 * @param ctx the parse tree
	 */
	void enterSamsungInsureDocument(SamsungInsureParser.SamsungInsureDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamsungInsureParser#samsungInsureDocument}.
	 * @param ctx the parse tree
	 */
	void exitSamsungInsureDocument(SamsungInsureParser.SamsungInsureDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamsungInsureParser#samsungLifeInsurance}.
	 * @param ctx the parse tree
	 */
	void enterSamsungLifeInsurance(SamsungInsureParser.SamsungLifeInsuranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamsungInsureParser#samsungLifeInsurance}.
	 * @param ctx the parse tree
	 */
	void exitSamsungLifeInsurance(SamsungInsureParser.SamsungLifeInsuranceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamsungInsureParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(SamsungInsureParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamsungInsureParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(SamsungInsureParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamsungInsureParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SamsungInsureParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamsungInsureParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SamsungInsureParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamsungInsureParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(SamsungInsureParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamsungInsureParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(SamsungInsureParser.EofContext ctx);
}
// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\JbBank.g4 by ANTLR 4.13.0
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
 * {@link JbBankParser}.
 */
public interface JbBankListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JbBankParser#jbBankDocument}.
	 * @param ctx the parse tree
	 */
	void enterJbBankDocument(JbBankParser.JbBankDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbBankParser#jbBankDocument}.
	 * @param ctx the parse tree
	 */
	void exitJbBankDocument(JbBankParser.JbBankDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbBankParser#jbOrdinary}.
	 * @param ctx the parse tree
	 */
	void enterJbOrdinary(JbBankParser.JbOrdinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbBankParser#jbOrdinary}.
	 * @param ctx the parse tree
	 */
	void exitJbOrdinary(JbBankParser.JbOrdinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbBankParser#jbFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void enterJbFixedDeposite(JbBankParser.JbFixedDepositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbBankParser#jbFixedDeposite}.
	 * @param ctx the parse tree
	 */
	void exitJbFixedDeposite(JbBankParser.JbFixedDepositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbBankParser#jbFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void enterJbFixedDepositeItem(JbBankParser.JbFixedDepositeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbBankParser#jbFixedDepositeItem}.
	 * @param ctx the parse tree
	 */
	void exitJbFixedDepositeItem(JbBankParser.JbFixedDepositeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbBankParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(JbBankParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbBankParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(JbBankParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbBankParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(JbBankParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbBankParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(JbBankParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbBankParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(JbBankParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbBankParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(JbBankParser.EofContext ctx);
}
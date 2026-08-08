// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanInvest.g4 by ANTLR 4.13.0
package kr.andold.household.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.utils.Utility;
import kr.andold.household.web.StatementForm;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ShinhanInvestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_shinhanInvestDocument = 0, RULE_shinhanInvestSummaryTradeHistory = 1, 
		RULE_shinhanInvestSummaryTradeHistoryItem = 2, RULE_shinhanInvestCma = 3, 
		RULE_shinhanInvestCmaItem = 4, RULE_word = 5, RULE_line = 6, RULE_eof = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"shinhanInvestDocument", "shinhanInvestSummaryTradeHistory", "shinhanInvestSummaryTradeHistoryItem", 
			"shinhanInvestCma", "shinhanInvestCmaItem", "word", "line", "eof"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANK", "BLANK_LINE", "TAB", "NEWLINE", "KEYWORD", "DATE", "TIME", 
			"NUMBER", "STRING", "WORD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ShinhanInvest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private final Logger log = LoggerFactory.getLogger(getClass());

		private final AccountForm ACCOUNT = AccountForm.ACCOUNT;
		private final List<StatementForm> LIST_STATEMENT = StatementForm.LIST_STATEMENT;
		private final StatementForm STATEMENT = StatementForm.STATEMENT;

	public ShinhanInvestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShinhanInvestDocumentContext extends ParserRuleContext {
		public ShinhanInvestSummaryTradeHistoryContext shinhanInvestSummaryTradeHistory() {
			return getRuleContext(ShinhanInvestSummaryTradeHistoryContext.class,0);
		}
		public ShinhanInvestCmaContext shinhanInvestCma() {
			return getRuleContext(ShinhanInvestCmaContext.class,0);
		}
		public ShinhanInvestDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shinhanInvestDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterShinhanInvestDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitShinhanInvestDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitShinhanInvestDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShinhanInvestDocumentContext shinhanInvestDocument() throws RecognitionException {
		ShinhanInvestDocumentContext _localctx = new ShinhanInvestDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_shinhanInvestDocument);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				shinhanInvestSummaryTradeHistory();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				shinhanInvestCma();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShinhanInvestSummaryTradeHistoryContext extends ParserRuleContext {
		public Token bnumber;
		public TerminalNode KEYWORD() { return getToken(ShinhanInvestParser.KEYWORD, 0); }
		public List<TerminalNode> TAB() { return getTokens(ShinhanInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanInvestParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ShinhanInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShinhanInvestParser.WORD, i);
		}
		public List<TerminalNode> DATE() { return getTokens(ShinhanInvestParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ShinhanInvestParser.DATE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShinhanInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShinhanInvestParser.NEWLINE, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ShinhanInvestSummaryTradeHistoryItemContext> shinhanInvestSummaryTradeHistoryItem() {
			return getRuleContexts(ShinhanInvestSummaryTradeHistoryItemContext.class);
		}
		public ShinhanInvestSummaryTradeHistoryItemContext shinhanInvestSummaryTradeHistoryItem(int i) {
			return getRuleContext(ShinhanInvestSummaryTradeHistoryItemContext.class,i);
		}
		public ShinhanInvestSummaryTradeHistoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shinhanInvestSummaryTradeHistory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterShinhanInvestSummaryTradeHistory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitShinhanInvestSummaryTradeHistory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitShinhanInvestSummaryTradeHistory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShinhanInvestSummaryTradeHistoryContext shinhanInvestSummaryTradeHistory() throws RecognitionException {
		ShinhanInvestSummaryTradeHistoryContext _localctx = new ShinhanInvestSummaryTradeHistoryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_shinhanInvestSummaryTradeHistory);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(25);
			match(KEYWORD);
			setState(26);
			match(TAB);
			setState(27);
			((ShinhanInvestSummaryTradeHistoryContext)_localctx).bnumber = match(WORD);
			setState(28);
			match(WORD);
			setState(29);
			match(TAB);
			setState(30);
			match(WORD);
			setState(31);
			match(TAB);
			setState(32);
			match(DATE);
			setState(33);
			match(WORD);
			setState(34);
			match(DATE);
			setState(35);
			match(TAB);
			setState(36);
			match(NEWLINE);
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(42);
			match(WORD);
			setState(43);
			match(TAB);
			setState(44);
			match(WORD);
			setState(45);
			match(TAB);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					match(WORD);
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(51);
				match(TAB);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(56);
			match(NEWLINE);
			setState(57);
			match(WORD);
			setState(58);
			match(TAB);
			setState(59);
			match(WORD);
			setState(60);
			match(TAB);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					match(WORD);
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(66);
				match(TAB);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(71);
			match(NEWLINE);
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72);
					shinhanInvestSummaryTradeHistoryItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(77);
			eof();

				log.info("{} shinhanInvestSummaryTradeHistory::종합거래내역(『{}』)", Utility.indentMiddle(), (((ShinhanInvestSummaryTradeHistoryContext)_localctx).bnumber!=null?((ShinhanInvestSummaryTradeHistoryContext)_localctx).bnumber.getText():null));

				ACCOUNT.setProducer("신한투자증권");
				ACCOUNT.setNumber((((ShinhanInvestSummaryTradeHistoryContext)_localctx).bnumber!=null?((ShinhanInvestSummaryTradeHistoryContext)_localctx).bnumber.getText():null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShinhanInvestSummaryTradeHistoryItemContext extends ParserRuleContext {
		public Token DATE;
		public Token type;
		public WordContext code;
		public Token amount;
		public Token transationPrice;
		public Token commission;
		public Token assessment;
		public Token changed;
		public Token sequence;
		public Token subTitle;
		public WordContext sname;
		public WordContext sname1;
		public WordContext sname2;
		public WordContext sname3;
		public WordContext sname4;
		public WordContext sname5;
		public WordContext sname6;
		public WordContext sname7;
		public Token price;
		public Token loan;
		public Token tax;
		public Token interest;
		public Token useFee;
		public Token finalAmount;
		public TerminalNode DATE() { return getToken(ShinhanInvestParser.DATE, 0); }
		public List<TerminalNode> TAB() { return getTokens(ShinhanInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanInvestParser.TAB, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShinhanInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShinhanInvestParser.NUMBER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShinhanInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShinhanInvestParser.NEWLINE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ShinhanInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShinhanInvestParser.WORD, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ShinhanInvestSummaryTradeHistoryItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shinhanInvestSummaryTradeHistoryItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterShinhanInvestSummaryTradeHistoryItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitShinhanInvestSummaryTradeHistoryItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitShinhanInvestSummaryTradeHistoryItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShinhanInvestSummaryTradeHistoryItemContext shinhanInvestSummaryTradeHistoryItem() throws RecognitionException {
		ShinhanInvestSummaryTradeHistoryItemContext _localctx = new ShinhanInvestSummaryTradeHistoryItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_shinhanInvestSummaryTradeHistoryItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE = match(DATE);
			setState(81);
			match(TAB);
			setState(82);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type = match(WORD);
			setState(83);
			match(TAB);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				setState(84);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).code = word();
				}
			}

			setState(87);
			match(TAB);
			setState(88);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).amount = match(NUMBER);
			setState(89);
			match(TAB);
			setState(90);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice = match(NUMBER);
			setState(91);
			match(TAB);
			setState(92);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).commission = match(NUMBER);
			setState(93);
			match(TAB);
			setState(94);
			match(NUMBER);
			setState(95);
			match(TAB);
			setState(96);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).assessment = match(NUMBER);
			setState(97);
			match(TAB);
			setState(98);
			match(NUMBER);
			setState(99);
			match(TAB);
			setState(100);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed = match(NUMBER);
			setState(101);
			match(TAB);
			setState(102);
			match(TAB);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(103);
				word();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(TAB);
			setState(110);
			match(NEWLINE);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(111);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sequence = match(NUMBER);
				}
			}

			setState(114);
			match(TAB);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(115);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).subTitle = match(WORD);
				}
			}

			setState(118);
			match(TAB);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(119);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname = word();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(122);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1 = word();
				}
				break;
			}
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(125);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2 = word();
				}
				break;
			}
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(128);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3 = word();
				}
				break;
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(131);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4 = word();
				}
				break;
			}
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(134);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5 = word();
				}
				break;
			}
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(137);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6 = word();
				}
				break;
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(140);
				((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7 = word();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(TAB);
			setState(147);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).price = match(NUMBER);
			setState(148);
			match(TAB);
			setState(149);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).loan = match(NUMBER);
			setState(150);
			match(TAB);
			setState(151);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax = match(NUMBER);
			setState(152);
			match(TAB);
			setState(153);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).interest = match(NUMBER);
			setState(154);
			match(TAB);
			setState(155);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).useFee = match(NUMBER);
			setState(156);
			match(TAB);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(157);
				word();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(TAB);
			setState(164);
			((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).finalAmount = match(NUMBER);
			setState(165);
			match(TAB);
			setState(166);
			match(TAB);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(167);
				match(WORD);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(TAB);
			setState(174);
			match(NEWLINE);

			/*
				log.info("{} shinhanInvestSummaryTradeHistoryItem(『{} {} {}』 『{} {}』, 『{} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {}』 『{} {} {}』)", Utility.indentMiddle()
					, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).code!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).code.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).code.stop):null)
					, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).amount!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).amount.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null)
					, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).commission!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).commission.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sequence!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sequence.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).subTitle!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).subTitle.getText():null)
					, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null)
					, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).price!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).price.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).loan!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).loan.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax.getText():null)
					, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).interest!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).interest.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).useFee!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).useFee.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).finalAmount!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).finalAmount.getText():null)
				);
			*/
				StatementForm statement = null;
				switch ((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null)) {
					case "예탁금이용료":
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null));
						statement.setTitle((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null));
						statement.setIncome(0);
						statement.setOutcome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed.getText():null));
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.지출.이체/대체.기타");

					case "ETF분배금":
					case "배당금":
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null));
						statement.setTitle((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), "-", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null));
						statement.setIncome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null));
						statement.setOutcome(0);
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.수입.부수입.이자/배당금");
				
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null));
						statement.setTitle("[세금]", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), "-", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null));
						statement.setIncome(0);
						statement.setOutcome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax.getText():null));
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.지출.세금/이자.세금");
				
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null), "00:00:01");
						statement.setTitle("[정산]", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), "-", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null));
						statement.setIncome(0);
						statement.setOutcome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed.getText():null));
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.지출.이체/대체.기타");
						break;
					case "배당세":
					case "RP_재투자환매":
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null));
						statement.setTitle("[세금]", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null));
						statement.setIncome(0);
						statement.setOutcome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax.getText():null));
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.지출.세금/이자.세금");
						break;
					case "RP_매도":
					case "코스닥_매도":
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null));
						statement.setTitle("[세금]", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null));
						statement.setIncome(0);
						statement.setOutcome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax.getText():null));
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.지출.세금/이자.세금");

						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null));
						statement.setTitle("[과표]", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null));
						statement.setIncome(0);
						statement.setOutcome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).assessment!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).assessment.getText():null));
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.지출.세금/이자.기타");
						break;
					case "장내_매도":
					case "장내_매수":
					case "코스닥_매수":
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null));
						statement.setTitle("[수수료]", (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null));
						statement.setIncome(0);
						statement.setOutcome((((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).commission!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).commission.getText():null));
						statement.setBalance(0);
						statement.setDescription("");
						statement.setCategoryName("분류.지출.세금/이자.기타");
						break;
					case "RP_매수":
					case "은행이체출금":
					case "은행이체출금취소":
					case "RP_재투자매수":
					case "환전입금":
					case "환전출금":
						break;
					default:
						log.info("{} shinhanInvestSummaryTradeHistoryItem::DEFAULT NONE(『{} {} {}』 『{} {}』, 『{} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {}』 『{} {} {}』)", Utility.indentMiddle()
							, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).DATE.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).type.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).code!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).code.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).code.stop):null)
							, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).amount!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).amount.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).transationPrice.getText():null)
							, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).commission!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).commission.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).changed.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sequence!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sequence.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).subTitle!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).subTitle.getText():null)
							, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname1.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname2.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname3.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname4.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname5.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname6.stop):null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.start,((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).sname7.stop):null)
							, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).price!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).price.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).loan!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).loan.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).tax.getText():null)
							, (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).interest!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).interest.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).useFee!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).useFee.getText():null), (((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).finalAmount!=null?((ShinhanInvestSummaryTradeHistoryItemContext)_localctx).finalAmount.getText():null)
						);
						break;
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShinhanInvestCmaContext extends ParserRuleContext {
		public Token bnumber;
		public Token outcomeTitle;
		public Token income;
		public Token balance;
		public Token outcome;
		public TerminalNode KEYWORD() { return getToken(ShinhanInvestParser.KEYWORD, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ShinhanInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShinhanInvestParser.NEWLINE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ShinhanInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShinhanInvestParser.WORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(ShinhanInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanInvestParser.TAB, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShinhanInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShinhanInvestParser.NUMBER, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<ShinhanInvestCmaItemContext> shinhanInvestCmaItem() {
			return getRuleContexts(ShinhanInvestCmaItemContext.class);
		}
		public ShinhanInvestCmaItemContext shinhanInvestCmaItem(int i) {
			return getRuleContext(ShinhanInvestCmaItemContext.class,i);
		}
		public ShinhanInvestCmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shinhanInvestCma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterShinhanInvestCma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitShinhanInvestCma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitShinhanInvestCma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShinhanInvestCmaContext shinhanInvestCma() throws RecognitionException {
		ShinhanInvestCmaContext _localctx = new ShinhanInvestCmaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shinhanInvestCma);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(177);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(182);
			match(KEYWORD);
			setState(183);
			match(NEWLINE);
			setState(184);
			((ShinhanInvestCmaContext)_localctx).bnumber = match(WORD);
			setState(185);
			match(WORD);
			setState(186);
			match(NEWLINE);
			setState(188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(192);
			match(WORD);
			setState(193);
			match(WORD);
			setState(194);
			match(NEWLINE);
			setState(195);
			match(WORD);
			setState(196);
			match(TAB);
			setState(197);
			match(WORD);
			setState(198);
			match(TAB);
			setState(199);
			((ShinhanInvestCmaContext)_localctx).outcomeTitle = match(WORD);
			setState(200);
			match(WORD);
			setState(201);
			match(TAB);
			setState(202);
			match(NEWLINE);
			setState(203);
			((ShinhanInvestCmaContext)_localctx).income = match(NUMBER);
			setState(204);
			match(TAB);
			setState(205);
			((ShinhanInvestCmaContext)_localctx).balance = match(NUMBER);
			setState(206);
			match(TAB);
			setState(207);
			((ShinhanInvestCmaContext)_localctx).outcome = match(NUMBER);
			setState(208);
			match(TAB);
			setState(209);
			match(NEWLINE);
			setState(211); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(210);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(215);
			match(WORD);
			setState(216);
			match(TAB);
			setState(217);
			match(WORD);
			setState(218);
			match(TAB);
			setState(219);
			match(WORD);
			setState(220);
			match(TAB);
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				match(WORD);
				setState(222);
				match(TAB);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(227);
			match(NEWLINE);
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				{
				{
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					shinhanInvestCmaItem();
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DATE );
				}
				}
				break;
			case TAB:
				{
				{
				setState(233);
				match(TAB);
				setState(234);
				match(NEWLINE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			match(WORD);
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				word();
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(243);
			match(NEWLINE);
			setState(244);
			eof();

				log.info("{} shinhanInvestCma(『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
					, Utility.indentMiddle(), (((ShinhanInvestCmaContext)_localctx).bnumber!=null?((ShinhanInvestCmaContext)_localctx).bnumber.getText():null), (((ShinhanInvestCmaContext)_localctx).income!=null?((ShinhanInvestCmaContext)_localctx).income.getText():null), (((ShinhanInvestCmaContext)_localctx).outcome!=null?((ShinhanInvestCmaContext)_localctx).outcome.getText():null), (((ShinhanInvestCmaContext)_localctx).balance!=null?((ShinhanInvestCmaContext)_localctx).balance.getText():null));

				ACCOUNT.setProducer("신한투자증권");
				ACCOUNT.setNumber((((ShinhanInvestCmaContext)_localctx).bnumber!=null?((ShinhanInvestCmaContext)_localctx).bnumber.getText():null));

				StatementForm statement = new StatementForm();
				//	무효화
			//	LIST_STATEMENT.add(statement);

				Calendar calendar = Calendar.getInstance();
				calendar.clear(Calendar.MILLISECOND);

				statement.setTime(calendar.getTime());
				statement.setTitle("평가금액", (((ShinhanInvestCmaContext)_localctx).income!=null?((ShinhanInvestCmaContext)_localctx).income.getText():null), "(", (((ShinhanInvestCmaContext)_localctx).outcomeTitle!=null?((ShinhanInvestCmaContext)_localctx).outcomeTitle.getText():null), (((ShinhanInvestCmaContext)_localctx).outcome!=null?((ShinhanInvestCmaContext)_localctx).outcome.getText():null), ")");
				statement.setIncome(0);
				statement.setOutcome(0);
				statement.setBalance((((ShinhanInvestCmaContext)_localctx).balance!=null?((ShinhanInvestCmaContext)_localctx).balance.getText():null));
				statement.setCategoryName("분류.수입.저축/보험.기타");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShinhanInvestCmaItemContext extends ParserRuleContext {
		public Token date;
		public Token time;
		public Token title;
		public Token income;
		public Token balance;
		public WordContext you;
		public WordContext you1;
		public WordContext you2;
		public WordContext you3;
		public WordContext you4;
		public WordContext you5;
		public WordContext you6;
		public WordContext you7;
		public Token memo;
		public WordContext sname;
		public WordContext sname1;
		public WordContext sname2;
		public WordContext sname3;
		public WordContext sname4;
		public WordContext sname5;
		public WordContext sname6;
		public WordContext sname7;
		public Token outcome;
		public List<TerminalNode> TAB() { return getTokens(ShinhanInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanInvestParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShinhanInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShinhanInvestParser.NEWLINE, i);
		}
		public TerminalNode DATE() { return getToken(ShinhanInvestParser.DATE, 0); }
		public List<TerminalNode> WORD() { return getTokens(ShinhanInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShinhanInvestParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShinhanInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShinhanInvestParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ShinhanInvestCmaItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shinhanInvestCmaItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterShinhanInvestCmaItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitShinhanInvestCmaItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitShinhanInvestCmaItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShinhanInvestCmaItemContext shinhanInvestCmaItem() throws RecognitionException {
		ShinhanInvestCmaItemContext _localctx = new ShinhanInvestCmaItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shinhanInvestCmaItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				{
				setState(247);
				((ShinhanInvestCmaItemContext)_localctx).date = match(DATE);
				setState(248);
				((ShinhanInvestCmaItemContext)_localctx).time = match(WORD);
				setState(249);
				match(TAB);
				setState(250);
				((ShinhanInvestCmaItemContext)_localctx).title = match(WORD);
				setState(251);
				match(TAB);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(252);
					((ShinhanInvestCmaItemContext)_localctx).income = match(NUMBER);
					}
				}

				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(255);
					match(WORD);
					}
				}

				setState(258);
				match(TAB);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(259);
					((ShinhanInvestCmaItemContext)_localctx).balance = match(NUMBER);
					}
				}

				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(262);
					match(WORD);
					}
				}

				setState(265);
				match(TAB);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(266);
					((ShinhanInvestCmaItemContext)_localctx).you = word();
					}
					break;
				}
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(269);
					((ShinhanInvestCmaItemContext)_localctx).you1 = word();
					}
					break;
				}
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(272);
					((ShinhanInvestCmaItemContext)_localctx).you2 = word();
					}
					break;
				}
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(275);
					((ShinhanInvestCmaItemContext)_localctx).you3 = word();
					}
					break;
				}
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(278);
					((ShinhanInvestCmaItemContext)_localctx).you4 = word();
					}
					break;
				}
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(281);
					((ShinhanInvestCmaItemContext)_localctx).you5 = word();
					}
					break;
				}
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(284);
					((ShinhanInvestCmaItemContext)_localctx).you6 = word();
					}
					break;
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(287);
					((ShinhanInvestCmaItemContext)_localctx).you7 = word();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(TAB);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(294);
					((ShinhanInvestCmaItemContext)_localctx).memo = match(WORD);
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(TAB);
				setState(301);
				match(NEWLINE);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(302);
					((ShinhanInvestCmaItemContext)_localctx).sname = word();
					}
					break;
				}
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(305);
					((ShinhanInvestCmaItemContext)_localctx).sname1 = word();
					}
					break;
				}
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(308);
					((ShinhanInvestCmaItemContext)_localctx).sname2 = word();
					}
					break;
				}
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(311);
					((ShinhanInvestCmaItemContext)_localctx).sname3 = word();
					}
					break;
				}
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(314);
					((ShinhanInvestCmaItemContext)_localctx).sname4 = word();
					}
					break;
				}
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(317);
					((ShinhanInvestCmaItemContext)_localctx).sname5 = word();
					}
					break;
				}
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(320);
					((ShinhanInvestCmaItemContext)_localctx).sname6 = word();
					}
					break;
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(323);
					((ShinhanInvestCmaItemContext)_localctx).sname7 = word();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				match(TAB);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(330);
					((ShinhanInvestCmaItemContext)_localctx).outcome = match(NUMBER);
					}
				}

				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(333);
					match(WORD);
					}
				}

				setState(336);
				match(TAB);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(337);
					word();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				match(TAB);
				setState(344);
				match(TAB);
				setState(345);
				match(NEWLINE);
				}
				}
				break;
			case 2:
				{
				{
				setState(346);
				((ShinhanInvestCmaItemContext)_localctx).date = match(DATE);
				setState(347);
				((ShinhanInvestCmaItemContext)_localctx).time = match(WORD);
				setState(348);
				match(TAB);
				setState(349);
				((ShinhanInvestCmaItemContext)_localctx).title = match(WORD);
				setState(350);
				match(TAB);
				setState(351);
				((ShinhanInvestCmaItemContext)_localctx).outcome = match(NUMBER);
				setState(352);
				match(TAB);
				setState(353);
				((ShinhanInvestCmaItemContext)_localctx).income = match(NUMBER);
				setState(354);
				match(TAB);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(355);
					((ShinhanInvestCmaItemContext)_localctx).memo = match(WORD);
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(TAB);
				setState(362);
				((ShinhanInvestCmaItemContext)_localctx).balance = match(NUMBER);
				setState(363);
				match(TAB);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(364);
					((ShinhanInvestCmaItemContext)_localctx).you = word();
					}
					break;
				}
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(367);
					((ShinhanInvestCmaItemContext)_localctx).you1 = word();
					}
					break;
				}
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(370);
					((ShinhanInvestCmaItemContext)_localctx).you2 = word();
					}
					break;
				}
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(373);
					((ShinhanInvestCmaItemContext)_localctx).you3 = word();
					}
					break;
				}
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(376);
					((ShinhanInvestCmaItemContext)_localctx).you4 = word();
					}
					break;
				}
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(379);
					((ShinhanInvestCmaItemContext)_localctx).you5 = word();
					}
					break;
				}
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(382);
					((ShinhanInvestCmaItemContext)_localctx).you6 = word();
					}
					break;
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(385);
					((ShinhanInvestCmaItemContext)_localctx).you7 = word();
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
				match(TAB);
				setState(392);
				match(NEWLINE);
				}
				}
				break;
			}
				
				log.info("{} shinhanInvestCmaItem(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
					, Utility.indentMiddle(), (((ShinhanInvestCmaItemContext)_localctx).date!=null?((ShinhanInvestCmaItemContext)_localctx).date.getText():null), (((ShinhanInvestCmaItemContext)_localctx).time!=null?((ShinhanInvestCmaItemContext)_localctx).time.getText():null), (((ShinhanInvestCmaItemContext)_localctx).income!=null?((ShinhanInvestCmaItemContext)_localctx).income.getText():null), (((ShinhanInvestCmaItemContext)_localctx).outcome!=null?((ShinhanInvestCmaItemContext)_localctx).outcome.getText():null), (((ShinhanInvestCmaItemContext)_localctx).balance!=null?((ShinhanInvestCmaItemContext)_localctx).balance.getText():null)
					, (((ShinhanInvestCmaItemContext)_localctx).you!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you.start,((ShinhanInvestCmaItemContext)_localctx).you.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you1!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you1.start,((ShinhanInvestCmaItemContext)_localctx).you1.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you2!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you2.start,((ShinhanInvestCmaItemContext)_localctx).you2.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you3!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you3.start,((ShinhanInvestCmaItemContext)_localctx).you3.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you4!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you4.start,((ShinhanInvestCmaItemContext)_localctx).you4.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you5!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you5.start,((ShinhanInvestCmaItemContext)_localctx).you5.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you6!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you6.start,((ShinhanInvestCmaItemContext)_localctx).you6.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you7!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you7.start,((ShinhanInvestCmaItemContext)_localctx).you7.stop):null)
				);

				if (!(((ShinhanInvestCmaItemContext)_localctx).title!=null?((ShinhanInvestCmaItemContext)_localctx).title.getText():null).contains("환전") && !(((ShinhanInvestCmaItemContext)_localctx).title!=null?((ShinhanInvestCmaItemContext)_localctx).title.getText():null).contains("증서")) {
					StatementForm statement = new StatementForm();
					LIST_STATEMENT.add(statement);
					statement.setTime((((ShinhanInvestCmaItemContext)_localctx).date!=null?((ShinhanInvestCmaItemContext)_localctx).date.getText():null), (((ShinhanInvestCmaItemContext)_localctx).time!=null?((ShinhanInvestCmaItemContext)_localctx).time.getText():null));
					statement.setTitle(
						(((ShinhanInvestCmaItemContext)_localctx).memo!=null?((ShinhanInvestCmaItemContext)_localctx).memo.getText():null) == null ? (((ShinhanInvestCmaItemContext)_localctx).title!=null?((ShinhanInvestCmaItemContext)_localctx).title.getText():null) : (((ShinhanInvestCmaItemContext)_localctx).memo!=null?((ShinhanInvestCmaItemContext)_localctx).memo.getText():null)
						, (((ShinhanInvestCmaItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname.start,((ShinhanInvestCmaItemContext)_localctx).sname.stop):null) == null ? "" : " - "
						, (((ShinhanInvestCmaItemContext)_localctx).sname!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname.start,((ShinhanInvestCmaItemContext)_localctx).sname.stop):null), (((ShinhanInvestCmaItemContext)_localctx).sname1!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname1.start,((ShinhanInvestCmaItemContext)_localctx).sname1.stop):null), (((ShinhanInvestCmaItemContext)_localctx).sname2!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname2.start,((ShinhanInvestCmaItemContext)_localctx).sname2.stop):null), (((ShinhanInvestCmaItemContext)_localctx).sname3!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname3.start,((ShinhanInvestCmaItemContext)_localctx).sname3.stop):null), (((ShinhanInvestCmaItemContext)_localctx).sname4!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname4.start,((ShinhanInvestCmaItemContext)_localctx).sname4.stop):null), (((ShinhanInvestCmaItemContext)_localctx).sname5!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname5.start,((ShinhanInvestCmaItemContext)_localctx).sname5.stop):null), (((ShinhanInvestCmaItemContext)_localctx).sname6!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname6.start,((ShinhanInvestCmaItemContext)_localctx).sname6.stop):null), (((ShinhanInvestCmaItemContext)_localctx).sname7!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).sname7.start,((ShinhanInvestCmaItemContext)_localctx).sname7.stop):null)
					);
					statement.setIncome((((ShinhanInvestCmaItemContext)_localctx).income!=null?((ShinhanInvestCmaItemContext)_localctx).income.getText():null));
					statement.setOutcome((((ShinhanInvestCmaItemContext)_localctx).outcome!=null?((ShinhanInvestCmaItemContext)_localctx).outcome.getText():null));
					statement.setBalance((((ShinhanInvestCmaItemContext)_localctx).balance!=null?((ShinhanInvestCmaItemContext)_localctx).balance.getText():null));
					statement.setDescription((((ShinhanInvestCmaItemContext)_localctx).title!=null?((ShinhanInvestCmaItemContext)_localctx).title.getText():null), (((ShinhanInvestCmaItemContext)_localctx).you!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you.start,((ShinhanInvestCmaItemContext)_localctx).you.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you1!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you1.start,((ShinhanInvestCmaItemContext)_localctx).you1.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you2!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you2.start,((ShinhanInvestCmaItemContext)_localctx).you2.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you3!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you3.start,((ShinhanInvestCmaItemContext)_localctx).you3.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you4!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you4.start,((ShinhanInvestCmaItemContext)_localctx).you4.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you5!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you5.start,((ShinhanInvestCmaItemContext)_localctx).you5.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you6!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you6.start,((ShinhanInvestCmaItemContext)_localctx).you6.stop):null), (((ShinhanInvestCmaItemContext)_localctx).you7!=null?_input.getText(((ShinhanInvestCmaItemContext)_localctx).you7.start,((ShinhanInvestCmaItemContext)_localctx).you7.stop):null));
					if ((((ShinhanInvestCmaItemContext)_localctx).title!=null?((ShinhanInvestCmaItemContext)_localctx).title.getText():null).contains("평가금액")) {
						statement.setDescription((((ShinhanInvestCmaItemContext)_localctx).title!=null?((ShinhanInvestCmaItemContext)_localctx).title.getText():null), "+", (((ShinhanInvestCmaItemContext)_localctx).income!=null?((ShinhanInvestCmaItemContext)_localctx).income.getText():null), "-", (((ShinhanInvestCmaItemContext)_localctx).outcome!=null?((ShinhanInvestCmaItemContext)_localctx).outcome.getText():null));
						statement.setIncome(0);
						statement.setOutcome(0);
						statement.setCategoryName("분류.수입.저축/보험.기타");
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ShinhanInvestParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(ShinhanInvestParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(ShinhanInvestParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(ShinhanInvestParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(ShinhanInvestParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(ShinhanInvestParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ShinhanInvestParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(ShinhanInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanInvestParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(399);
					word();
					}
					break;
				case TAB:
					{
					setState(400);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );
			setState(405);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EofContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(ShinhanInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanInvestParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShinhanInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShinhanInvestParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanInvestListener ) ((ShinhanInvestListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanInvestVisitor ) return ((ShinhanInvestVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2040L) != 0)) {
				{
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(407);
					word();
					}
					break;
				case TAB:
					{
					setState(408);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(409);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n\u01a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0004\u0001\u0016"+
		"\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\'\b\u0001"+
		"\u000b\u0001\f\u0001(\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u00010\b\u0001\u000b\u0001\f\u00011\u0001\u0001\u0004"+
		"\u00015\b\u0001\u000b\u0001\f\u00016\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001?\b\u0001\u000b\u0001"+
		"\f\u0001@\u0001\u0001\u0004\u0001D\b\u0001\u000b\u0001\f\u0001E\u0001"+
		"\u0001\u0001\u0001\u0004\u0001J\b\u0001\u000b\u0001\f\u0001K\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002i\b\u0002\n\u0002\f\u0002l\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002u\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"y\b\u0002\u0001\u0002\u0003\u0002|\b\u0002\u0001\u0002\u0003\u0002\u007f"+
		"\b\u0002\u0001\u0002\u0003\u0002\u0082\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0085\b\u0002\u0001\u0002\u0003\u0002\u0088\b\u0002\u0001\u0002\u0003"+
		"\u0002\u008b\b\u0002\u0001\u0002\u0005\u0002\u008e\b\u0002\n\u0002\f\u0002"+
		"\u0091\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u009f\b\u0002\n\u0002\f\u0002\u00a2\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00a9"+
		"\b\u0002\n\u0002\f\u0002\u00ac\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0004\u0003\u00b3\b\u0003\u000b\u0003\f\u0003"+
		"\u00b4\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u00bd\b\u0003\u000b\u0003\f\u0003\u00be\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003\u00d4\b\u0003\u000b\u0003\f\u0003\u00d5\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u00e0\b\u0003\u000b\u0003\f\u0003\u00e1\u0001\u0003"+
		"\u0001\u0003\u0004\u0003\u00e6\b\u0003\u000b\u0003\f\u0003\u00e7\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00ec\b\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\u00f0\b\u0003\u000b\u0003\f\u0003\u00f1\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00fe\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0101\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0105\b\u0004\u0001"+
		"\u0004\u0003\u0004\u0108\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u010c"+
		"\b\u0004\u0001\u0004\u0003\u0004\u010f\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0112\b\u0004\u0001\u0004\u0003\u0004\u0115\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0118\b\u0004\u0001\u0004\u0003\u0004\u011b\b\u0004\u0001\u0004"+
		"\u0003\u0004\u011e\b\u0004\u0001\u0004\u0005\u0004\u0121\b\u0004\n\u0004"+
		"\f\u0004\u0124\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0128\b\u0004"+
		"\n\u0004\f\u0004\u012b\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0130\b\u0004\u0001\u0004\u0003\u0004\u0133\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0136\b\u0004\u0001\u0004\u0003\u0004\u0139\b\u0004\u0001"+
		"\u0004\u0003\u0004\u013c\b\u0004\u0001\u0004\u0003\u0004\u013f\b\u0004"+
		"\u0001\u0004\u0003\u0004\u0142\b\u0004\u0001\u0004\u0005\u0004\u0145\b"+
		"\u0004\n\u0004\f\u0004\u0148\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u014c\b\u0004\u0001\u0004\u0003\u0004\u014f\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0153\b\u0004\n\u0004\f\u0004\u0156\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0165\b\u0004\n\u0004\f\u0004\u0168\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u016e\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0171\b\u0004\u0001\u0004\u0003\u0004\u0174\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0177\b\u0004\u0001\u0004\u0003\u0004\u017a\b\u0004\u0001"+
		"\u0004\u0003\u0004\u017d\b\u0004\u0001\u0004\u0003\u0004\u0180\b\u0004"+
		"\u0001\u0004\u0005\u0004\u0183\b\u0004\n\u0004\f\u0004\u0186\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u018a\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006\u0192\b\u0006\u000b"+
		"\u0006\f\u0006\u0193\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u019b\b\u0007\n\u0007\f\u0007\u019e\t\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000"+
		"\u0005\n\u01db\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000"+
		"\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006\u00b2\u0001\u0000\u0000"+
		"\u0000\b\u0189\u0001\u0000\u0000\u0000\n\u018d\u0001\u0000\u0000\u0000"+
		"\f\u0191\u0001\u0000\u0000\u0000\u000e\u019c\u0001\u0000\u0000\u0000\u0010"+
		"\u0013\u0003\u0002\u0001\u0000\u0011\u0013\u0003\u0006\u0003\u0000\u0012"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0001\u0001\u0000\u0000\u0000\u0014\u0016\u0003\f\u0006\u0000\u0015\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0005\u0000\u0000\u001a\u001b"+
		"\u0005\u0003\u0000\u0000\u001b\u001c\u0005\n\u0000\u0000\u001c\u001d\u0005"+
		"\n\u0000\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0005\n"+
		"\u0000\u0000\u001f \u0005\u0003\u0000\u0000 !\u0005\u0006\u0000\u0000"+
		"!\"\u0005\n\u0000\u0000\"#\u0005\u0006\u0000\u0000#$\u0005\u0003\u0000"+
		"\u0000$&\u0005\u0004\u0000\u0000%\'\u0003\f\u0006\u0000&%\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0005\n\u0000\u0000+,\u0005"+
		"\u0003\u0000\u0000,-\u0005\n\u0000\u0000-4\u0005\u0003\u0000\u0000.0\u0005"+
		"\n\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"35\u0005\u0003\u0000\u00004/\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0005\u0004\u0000\u00009:\u0005\n\u0000\u0000:;\u0005\u0003"+
		"\u0000\u0000;<\u0005\n\u0000\u0000<C\u0005\u0003\u0000\u0000=?\u0005\n"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BD\u0005\u0003\u0000\u0000C>\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GI\u0005\u0004\u0000\u0000HJ\u0003\u0004\u0002\u0000IH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0003\u000e\u0007"+
		"\u0000NO\u0006\u0001\uffff\uffff\u0000O\u0003\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u0006\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\n\u0000\u0000"+
		"SU\u0005\u0003\u0000\u0000TV\u0003\n\u0005\u0000UT\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\u0003\u0000"+
		"\u0000XY\u0005\b\u0000\u0000YZ\u0005\u0003\u0000\u0000Z[\u0005\b\u0000"+
		"\u0000[\\\u0005\u0003\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005\u0003"+
		"\u0000\u0000^_\u0005\b\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005\b"+
		"\u0000\u0000ab\u0005\u0003\u0000\u0000bc\u0005\b\u0000\u0000cd\u0005\u0003"+
		"\u0000\u0000de\u0005\b\u0000\u0000ef\u0005\u0003\u0000\u0000fj\u0005\u0003"+
		"\u0000\u0000gi\u0003\n\u0005\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u0003\u0000\u0000"+
		"np\u0005\u0004\u0000\u0000oq\u0005\b\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0005\u0003\u0000"+
		"\u0000su\u0005\n\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0005\u0003\u0000\u0000wy\u0003\n\u0005"+
		"\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000z|\u0003\n\u0005\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}\u007f\u0003\n\u0005\u0000~}\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0003\n\u0005\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0003\n\u0005\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0003\n\u0005\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0003\n\u0005\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008f\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0003\n\u0005\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0005"+
		"\b\u0000\u0000\u0094\u0095\u0005\u0003\u0000\u0000\u0095\u0096\u0005\b"+
		"\u0000\u0000\u0096\u0097\u0005\u0003\u0000\u0000\u0097\u0098\u0005\b\u0000"+
		"\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009a\u0005\b\u0000\u0000"+
		"\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c"+
		"\u00a0\u0005\u0003\u0000\u0000\u009d\u009f\u0003\n\u0005\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u0003\u0000\u0000\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0003\u0000\u0000\u00a6\u00aa\u0005\u0003\u0000\u0000\u00a7\u00a9\u0005"+
		"\n\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0003\u0000\u0000\u00ae\u00af\u0005\u0004"+
		"\u0000\u0000\u00af\u00b0\u0006\u0002\uffff\uffff\u0000\u00b0\u0005\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0003\f\u0006\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0005\u0000\u0000\u00b7\u00b8\u0005\u0004"+
		"\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00ba\u0005\n\u0000"+
		"\u0000\u00ba\u00bc\u0005\u0004\u0000\u0000\u00bb\u00bd\u0003\f\u0006\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1"+
		"\u00c2\u0005\n\u0000\u0000\u00c2\u00c3\u0005\u0004\u0000\u0000\u00c3\u00c4"+
		"\u0005\n\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00c6\u0005"+
		"\n\u0000\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7\u00c8\u0005\n"+
		"\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0004\u0000\u0000\u00cb\u00cc\u0005\b\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00ce\u0005\b\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d0\u0005\b\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0003\u0000\u0000\u00d1\u00d3\u0005\u0004\u0000\u0000\u00d2\u00d4"+
		"\u0003\f\u0006\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\n\u0000\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00da\u0005\n"+
		"\u0000\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u0005\n\u0000"+
		"\u0000\u00dc\u00df\u0005\u0003\u0000\u0000\u00dd\u00de\u0005\n\u0000\u0000"+
		"\u00de\u00e0\u0005\u0003\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00eb\u0005\u0004\u0000\u0000\u00e4\u00e6\u0003\b\u0004\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ec\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea"+
		"\u00ec\u0005\u0004\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0005\n\u0000\u0000\u00ee\u00f0\u0003\n\u0005\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4\u00f5"+
		"\u0003\u000e\u0007\u0000\u00f5\u00f6\u0006\u0003\uffff\uffff\u0000\u00f6"+
		"\u0007\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0006\u0000\u0000\u00f8"+
		"\u00f9\u0005\n\u0000\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa\u00fb"+
		"\u0005\n\u0000\u0000\u00fb\u00fd\u0005\u0003\u0000\u0000\u00fc\u00fe\u0005"+
		"\b\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u0101\u0005\n\u0000"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0005\u0003\u0000"+
		"\u0000\u0103\u0105\u0005\b\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\u0005\n\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010b\u0005\u0003\u0000\u0000\u010a\u010c\u0003\n\u0005\u0000\u010b\u010a"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e"+
		"\u0001\u0000\u0000\u0000\u010d\u010f\u0003\n\u0005\u0000\u010e\u010d\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001"+
		"\u0000\u0000\u0000\u0110\u0112\u0003\n\u0005\u0000\u0111\u0110\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000"+
		"\u0000\u0000\u0113\u0115\u0003\n\u0005\u0000\u0114\u0113\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0003\n\u0005\u0000\u0117\u0116\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000"+
		"\u0119\u011b\u0003\n\u0005\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c"+
		"\u011e\u0003\n\u0005\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0001\u0000\u0000\u0000\u011e\u0122\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0003\n\u0005\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001"+
		"\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0125\u0129\u0005\u0003\u0000\u0000\u0126\u0128\u0005"+
		"\n\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0005\u0003\u0000\u0000\u012d\u012f\u0005\u0004"+
		"\u0000\u0000\u012e\u0130\u0003\n\u0005\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0003\n\u0005\u0000\u0132\u0131\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000"+
		"\u0134\u0136\u0003\n\u0005\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0003\n\u0005\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\u0003\n\u0005\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013f\u0003"+
		"\n\u0005\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u0142\u0003\n\u0005"+
		"\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0146\u0001\u0000\u0000\u0000\u0143\u0145\u0003\n\u0005\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u014b\u0005\u0003\u0000\u0000\u014a\u014c\u0005\b\u0000\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014e\u0001\u0000\u0000\u0000\u014d\u014f\u0005\n\u0000\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0154\u0005\u0003\u0000\u0000\u0151\u0153"+
		"\u0003\n\u0005\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156\u0001"+
		"\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005\u0003\u0000\u0000\u0158\u0159\u0005"+
		"\u0003\u0000\u0000\u0159\u018a\u0005\u0004\u0000\u0000\u015a\u015b\u0005"+
		"\u0006\u0000\u0000\u015b\u015c\u0005\n\u0000\u0000\u015c\u015d\u0005\u0003"+
		"\u0000\u0000\u015d\u015e\u0005\n\u0000\u0000\u015e\u015f\u0005\u0003\u0000"+
		"\u0000\u015f\u0160\u0005\b\u0000\u0000\u0160\u0161\u0005\u0003\u0000\u0000"+
		"\u0161\u0162\u0005\b\u0000\u0000\u0162\u0166\u0005\u0003\u0000\u0000\u0163"+
		"\u0165\u0005\n\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165\u0168"+
		"\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0003\u0000\u0000\u016a\u016b"+
		"\u0005\b\u0000\u0000\u016b\u016d\u0005\u0003\u0000\u0000\u016c\u016e\u0003"+
		"\n\u0005\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u0171\u0003\n\u0005"+
		"\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0174\u0003\n\u0005\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0177\u0003\n\u0005\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0179\u0001\u0000\u0000\u0000\u0178\u017a\u0003\n\u0005\u0000\u0179\u0178"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c"+
		"\u0001\u0000\u0000\u0000\u017b\u017d\u0003\n\u0005\u0000\u017c\u017b\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001"+
		"\u0000\u0000\u0000\u017e\u0180\u0003\n\u0005\u0000\u017f\u017e\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0184\u0001\u0000"+
		"\u0000\u0000\u0181\u0183\u0003\n\u0005\u0000\u0182\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u0003\u0000"+
		"\u0000\u0188\u018a\u0005\u0004\u0000\u0000\u0189\u00f7\u0001\u0000\u0000"+
		"\u0000\u0189\u015a\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0006\u0004\uffff\uffff\u0000\u018c\t\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0007\u0000\u0000\u0000\u018e\u000b\u0001\u0000\u0000"+
		"\u0000\u018f\u0192\u0003\n\u0005\u0000\u0190\u0192\u0005\u0003\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0005\u0004\u0000\u0000\u0196\r\u0001\u0000\u0000\u0000\u0197"+
		"\u019b\u0003\n\u0005\u0000\u0198\u019b\u0005\u0003\u0000\u0000\u0199\u019b"+
		"\u0005\u0004\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000\u019a\u0198"+
		"\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e"+
		"\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019d\u000f\u0001\u0000\u0000\u0000\u019e\u019c"+
		"\u0001\u0000\u0000\u0000C\u0012\u0017(16@EKUjptx{~\u0081\u0084\u0087\u008a"+
		"\u008f\u00a0\u00aa\u00b4\u00be\u00d5\u00e1\u00e7\u00eb\u00f1\u00fd\u0100"+
		"\u0104\u0107\u010b\u010e\u0111\u0114\u0117\u011a\u011d\u0122\u0129\u012f"+
		"\u0132\u0135\u0138\u013b\u013e\u0141\u0146\u014b\u014e\u0154\u0166\u016d"+
		"\u0170\u0173\u0176\u0179\u017c\u017f\u0184\u0189\u0191\u0193\u019a\u019c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
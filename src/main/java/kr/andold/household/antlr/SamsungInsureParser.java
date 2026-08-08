// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\SamsungInsure.g4 by ANTLR 4.13.0
package kr.andold.household.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.household.web.AccountForm;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SamsungInsureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_samsungInsureDocument = 0, RULE_samsungLifeInsurance = 1, RULE_word = 2, 
		RULE_line = 3, RULE_eof = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"samsungInsureDocument", "samsungLifeInsurance", "word", "line", "eof"
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
	public String getGrammarFileName() { return "SamsungInsure.g4"; }

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

	public SamsungInsureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SamsungInsureDocumentContext extends ParserRuleContext {
		public SamsungLifeInsuranceContext samsungLifeInsurance() {
			return getRuleContext(SamsungLifeInsuranceContext.class,0);
		}
		public SamsungInsureDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samsungInsureDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).enterSamsungInsureDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).exitSamsungInsureDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SamsungInsureVisitor ) return ((SamsungInsureVisitor<? extends T>)visitor).visitSamsungInsureDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SamsungInsureDocumentContext samsungInsureDocument() throws RecognitionException {
		SamsungInsureDocumentContext _localctx = new SamsungInsureDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_samsungInsureDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			samsungLifeInsurance();
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
	public static class SamsungLifeInsuranceContext extends ParserRuleContext {
		public WordContext bnumber;
		public WordContext bnumber1;
		public WordContext bnumber2;
		public WordContext bnumber3;
		public WordContext bnumber4;
		public WordContext bnumber5;
		public WordContext bnumber6;
		public WordContext bnumber7;
		public WordContext paytotal;
		public Token last;
		public Token DATE;
		public Token period;
		public Token outcome;
		public Token title;
		public Token balance;
		public List<TerminalNode> NEWLINE() { return getTokens(SamsungInsureParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SamsungInsureParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(SamsungInsureParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SamsungInsureParser.WORD, i);
		}
		public TerminalNode DATE() { return getToken(SamsungInsureParser.DATE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public SamsungLifeInsuranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samsungLifeInsurance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).enterSamsungLifeInsurance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).exitSamsungLifeInsurance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SamsungInsureVisitor ) return ((SamsungInsureVisitor<? extends T>)visitor).visitSamsungLifeInsurance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SamsungLifeInsuranceContext samsungLifeInsurance() throws RecognitionException {
		SamsungLifeInsuranceContext _localctx = new SamsungLifeInsuranceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_samsungLifeInsurance);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(12);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(15); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(17);
			((SamsungLifeInsuranceContext)_localctx).bnumber = word();
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(18);
				((SamsungLifeInsuranceContext)_localctx).bnumber1 = word();
				}
				break;
			}
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(21);
				((SamsungLifeInsuranceContext)_localctx).bnumber2 = word();
				}
				break;
			}
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(24);
				((SamsungLifeInsuranceContext)_localctx).bnumber3 = word();
				}
				break;
			}
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(27);
				((SamsungLifeInsuranceContext)_localctx).bnumber4 = word();
				}
				break;
			}
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(30);
				((SamsungLifeInsuranceContext)_localctx).bnumber5 = word();
				}
				break;
			}
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(33);
				((SamsungLifeInsuranceContext)_localctx).bnumber6 = word();
				}
				break;
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(36);
				((SamsungLifeInsuranceContext)_localctx).bnumber7 = word();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(NEWLINE);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				((SamsungLifeInsuranceContext)_localctx).paytotal = word();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(48);
			match(NEWLINE);
			setState(49);
			line();
			setState(50);
			((SamsungLifeInsuranceContext)_localctx).last = match(WORD);
			setState(51);
			match(NEWLINE);
			setState(52);
			match(WORD);
			setState(53);
			match(NEWLINE);
			setState(54);
			((SamsungLifeInsuranceContext)_localctx).DATE = match(DATE);
			setState(55);
			match(NEWLINE);
			setState(56);
			match(WORD);
			setState(57);
			match(NEWLINE);
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					((SamsungLifeInsuranceContext)_localctx).period = match(WORD);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(63);
				match(NEWLINE);
				}
				break;
			}
			setState(66);
			match(WORD);
			setState(67);
			match(NEWLINE);
			setState(68);
			line();
			setState(69);
			match(WORD);
			setState(70);
			match(NEWLINE);
			setState(71);
			((SamsungLifeInsuranceContext)_localctx).outcome = match(WORD);
			setState(72);
			match(WORD);
			setState(73);
			match(NEWLINE);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(74);
				match(WORD);
				setState(75);
				match(NEWLINE);
				setState(76);
				match(WORD);
				setState(77);
				match(NEWLINE);
				}
				break;
			}
			setState(80);
			match(WORD);
			setState(81);
			match(NEWLINE);
			setState(82);
			match(WORD);
			setState(83);
			match(NEWLINE);
			setState(84);
			match(WORD);
			setState(85);
			match(NEWLINE);
			setState(86);
			match(WORD);
			setState(87);
			match(NEWLINE);
			setState(88);
			match(WORD);
			setState(89);
			match(NEWLINE);
			setState(90);
			match(WORD);
			setState(91);
			match(NEWLINE);
			setState(92);
			match(WORD);
			setState(93);
			match(NEWLINE);
			setState(94);
			match(WORD);
			setState(95);
			match(NEWLINE);
			setState(96);
			line();
			setState(97);
			((SamsungLifeInsuranceContext)_localctx).title = match(WORD);
			setState(98);
			match(NEWLINE);
			setState(99);
			((SamsungLifeInsuranceContext)_localctx).balance = match(WORD);
			setState(100);
			match(NEWLINE);
			setState(101);
			match(WORD);
			setState(102);
			match(WORD);
			setState(103);
			match(NEWLINE);
			setState(104);
			word();
			setState(105);
			match(WORD);
			setState(106);
			match(NEWLINE);
			setState(107);
			eof();

				log.info("{} 삼성생명 계약조회(『{} {} {} {} {} {} {} {}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
					, (((SamsungLifeInsuranceContext)_localctx).bnumber!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber.start,((SamsungLifeInsuranceContext)_localctx).bnumber.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber1!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber1.start,((SamsungLifeInsuranceContext)_localctx).bnumber1.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber2!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber2.start,((SamsungLifeInsuranceContext)_localctx).bnumber2.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber3!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber3.start,((SamsungLifeInsuranceContext)_localctx).bnumber3.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber4!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber4.start,((SamsungLifeInsuranceContext)_localctx).bnumber4.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber5!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber5.start,((SamsungLifeInsuranceContext)_localctx).bnumber5.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber6!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber6.start,((SamsungLifeInsuranceContext)_localctx).bnumber6.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber7!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber7.start,((SamsungLifeInsuranceContext)_localctx).bnumber7.stop):null)
					, (((SamsungLifeInsuranceContext)_localctx).paytotal!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).paytotal.start,((SamsungLifeInsuranceContext)_localctx).paytotal.stop):null), (((SamsungLifeInsuranceContext)_localctx).last!=null?((SamsungLifeInsuranceContext)_localctx).last.getText():null), (((SamsungLifeInsuranceContext)_localctx).period!=null?((SamsungLifeInsuranceContext)_localctx).period.getText():null), (((SamsungLifeInsuranceContext)_localctx).title!=null?((SamsungLifeInsuranceContext)_localctx).title.getText():null), (((SamsungLifeInsuranceContext)_localctx).balance!=null?((SamsungLifeInsuranceContext)_localctx).balance.getText():null)
				);

				ACCOUNT.setProducer("삼성생명");
				ACCOUNT.setNumber((((SamsungLifeInsuranceContext)_localctx).bnumber!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber.start,((SamsungLifeInsuranceContext)_localctx).bnumber.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber1!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber1.start,((SamsungLifeInsuranceContext)_localctx).bnumber1.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber2!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber2.start,((SamsungLifeInsuranceContext)_localctx).bnumber2.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber3!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber3.start,((SamsungLifeInsuranceContext)_localctx).bnumber3.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber4!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber4.start,((SamsungLifeInsuranceContext)_localctx).bnumber4.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber5!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber5.start,((SamsungLifeInsuranceContext)_localctx).bnumber5.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber6!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber6.start,((SamsungLifeInsuranceContext)_localctx).bnumber6.stop):null), (((SamsungLifeInsuranceContext)_localctx).bnumber7!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).bnumber7.start,((SamsungLifeInsuranceContext)_localctx).bnumber7.stop):null));

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);

				Calendar calendar = Calendar.getInstance();
				calendar.clear(java.util.Calendar.MILLISECOND);

				statement.setTime(calendar.getTime());
				statement.setTitle((((SamsungLifeInsuranceContext)_localctx).title!=null?((SamsungLifeInsuranceContext)_localctx).title.getText():null), (((SamsungLifeInsuranceContext)_localctx).last!=null?((SamsungLifeInsuranceContext)_localctx).last.getText():null));
				statement.setDescription((((SamsungLifeInsuranceContext)_localctx).paytotal!=null?_input.getText(((SamsungLifeInsuranceContext)_localctx).paytotal.start,((SamsungLifeInsuranceContext)_localctx).paytotal.stop):null), (((SamsungLifeInsuranceContext)_localctx).DATE!=null?((SamsungLifeInsuranceContext)_localctx).DATE.getText():null), "+", (((SamsungLifeInsuranceContext)_localctx).period!=null?((SamsungLifeInsuranceContext)_localctx).period.getText():null));
				statement.setIncome(0);
				statement.setOutcome((((SamsungLifeInsuranceContext)_localctx).outcome!=null?((SamsungLifeInsuranceContext)_localctx).outcome.getText():null));
				statement.setBalance((((SamsungLifeInsuranceContext)_localctx).balance!=null?((SamsungLifeInsuranceContext)_localctx).balance.getText():null));
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
	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SamsungInsureParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(SamsungInsureParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(SamsungInsureParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(SamsungInsureParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(SamsungInsureParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(SamsungInsureParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SamsungInsureVisitor ) return ((SamsungInsureVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		public TerminalNode NEWLINE() { return getToken(SamsungInsureParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(SamsungInsureParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SamsungInsureParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SamsungInsureVisitor ) return ((SamsungInsureVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(112);
					word();
					}
					break;
				case TAB:
					{
					setState(113);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );
			setState(118);
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
		public List<TerminalNode> TAB() { return getTokens(SamsungInsureParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SamsungInsureParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SamsungInsureParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SamsungInsureParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SamsungInsureListener ) ((SamsungInsureListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SamsungInsureVisitor ) return ((SamsungInsureVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2040L) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(120);
					word();
					}
					break;
				case TAB:
					{
					setState(121);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(122);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
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
		"\u0004\u0001\n\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u000e\b\u0001\u000b\u0001\f"+
		"\u0001\u000f\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001"+
		"\u0003\u0001\u0017\b\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001"+
		"\u0001\u0003\u0001\u001d\b\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001"+
		"\u0001\u0003\u0001#\b\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f"+
		"\u0001)\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001-\b\u0001\u000b\u0001"+
		"\f\u0001.\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001<\b\u0001\u000b\u0001\f\u0001=\u0001\u0001\u0003\u0001A\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001O\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0004\u0003s\b\u0003\u000b\u0003\f\u0003t\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004|\b\u0004\n\u0004\f\u0004"+
		"\u007f\t\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b"+
		"\u0000\u0001\u0001\u0000\u0005\n\u008c\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0002\r\u0001\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006"+
		"r\u0001\u0000\u0000\u0000\b}\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002"+
		"\u0001\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f\u000e\u0003\u0006\u0003"+
		"\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0003\u0004\u0002\u0000\u0012"+
		"\u0014\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015"+
		"\u0017\u0003\u0004\u0002\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0003\u0004\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b"+
		"\u001d\u0003\u0004\u0002\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e"+
		" \u0003\u0004\u0002\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!#\u0003\u0004\u0002\u0000"+
		"\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\'\u0001\u0000"+
		"\u0000\u0000$&\u0003\u0004\u0002\u0000%$\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*,\u0005\u0004\u0000"+
		"\u0000+-\u0003\u0004\u0002\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0005\u0004\u0000\u000012\u0003\u0006\u0003\u0000"+
		"23\u0005\n\u0000\u000034\u0005\u0004\u0000\u000045\u0005\n\u0000\u0000"+
		"56\u0005\u0004\u0000\u000067\u0005\u0006\u0000\u000078\u0005\u0004\u0000"+
		"\u000089\u0005\n\u0000\u00009@\u0005\u0004\u0000\u0000:<\u0005\n\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0005"+
		"\u0004\u0000\u0000@;\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0005\n\u0000\u0000CD\u0005\u0004\u0000\u0000"+
		"DE\u0003\u0006\u0003\u0000EF\u0005\n\u0000\u0000FG\u0005\u0004\u0000\u0000"+
		"GH\u0005\n\u0000\u0000HI\u0005\n\u0000\u0000IN\u0005\u0004\u0000\u0000"+
		"JK\u0005\n\u0000\u0000KL\u0005\u0004\u0000\u0000LM\u0005\n\u0000\u0000"+
		"MO\u0005\u0004\u0000\u0000NJ\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\n\u0000\u0000QR\u0005\u0004\u0000"+
		"\u0000RS\u0005\n\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005\n\u0000"+
		"\u0000UV\u0005\u0004\u0000\u0000VW\u0005\n\u0000\u0000WX\u0005\u0004\u0000"+
		"\u0000XY\u0005\n\u0000\u0000YZ\u0005\u0004\u0000\u0000Z[\u0005\n\u0000"+
		"\u0000[\\\u0005\u0004\u0000\u0000\\]\u0005\n\u0000\u0000]^\u0005\u0004"+
		"\u0000\u0000^_\u0005\n\u0000\u0000_`\u0005\u0004\u0000\u0000`a\u0003\u0006"+
		"\u0003\u0000ab\u0005\n\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0005\n"+
		"\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0005\n\u0000\u0000fg\u0005\n"+
		"\u0000\u0000gh\u0005\u0004\u0000\u0000hi\u0003\u0004\u0002\u0000ij\u0005"+
		"\n\u0000\u0000jk\u0005\u0004\u0000\u0000kl\u0003\b\u0004\u0000lm\u0006"+
		"\u0001\uffff\uffff\u0000m\u0003\u0001\u0000\u0000\u0000no\u0007\u0000"+
		"\u0000\u0000o\u0005\u0001\u0000\u0000\u0000ps\u0003\u0004\u0002\u0000"+
		"qs\u0005\u0003\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005\u0004\u0000\u0000w\u0007"+
		"\u0001\u0000\u0000\u0000x|\u0003\u0004\u0002\u0000y|\u0005\u0003\u0000"+
		"\u0000z|\u0005\u0004\u0000\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\t\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0010\u000f\u0013\u0016\u0019\u001c"+
		"\u001f\"\'.=@Nrt{}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
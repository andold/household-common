// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\JbBank.g4 by ANTLR 4.13.0
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
public class JbBankParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_jbBankDocument = 0, RULE_jbOrdinary = 1, RULE_jbFixedDeposite = 2, 
		RULE_jbFixedDepositeItem = 3, RULE_word = 4, RULE_line = 5, RULE_eof = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"jbBankDocument", "jbOrdinary", "jbFixedDeposite", "jbFixedDepositeItem", 
			"word", "line", "eof"
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
	public String getGrammarFileName() { return "JbBank.g4"; }

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

	public JbBankParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JbBankDocumentContext extends ParserRuleContext {
		public JbOrdinaryContext jbOrdinary() {
			return getRuleContext(JbOrdinaryContext.class,0);
		}
		public JbFixedDepositeContext jbFixedDeposite() {
			return getRuleContext(JbFixedDepositeContext.class,0);
		}
		public JbBankDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jbBankDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).enterJbBankDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).exitJbBankDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JbBankVisitor ) return ((JbBankVisitor<? extends T>)visitor).visitJbBankDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JbBankDocumentContext jbBankDocument() throws RecognitionException {
		JbBankDocumentContext _localctx = new JbBankDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jbBankDocument);
		try {
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				jbOrdinary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				jbFixedDeposite();
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
	public static class JbOrdinaryContext extends ParserRuleContext {
		public Token bnumber;
		public Token DATE;
		public Token TIME;
		public Token outcome;
		public Token income;
		public Token balance;
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public WordContext memo;
		public WordContext memo1;
		public WordContext memo2;
		public WordContext memo3;
		public WordContext memo4;
		public WordContext memo5;
		public WordContext memo6;
		public WordContext memo7;
		public WordContext place;
		public WordContext place1;
		public WordContext place2;
		public WordContext place3;
		public WordContext place4;
		public WordContext place5;
		public WordContext place6;
		public WordContext place7;
		public TerminalNode KEYWORD() { return getToken(JbBankParser.KEYWORD, 0); }
		public List<TerminalNode> TAB() { return getTokens(JbBankParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(JbBankParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(JbBankParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JbBankParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JbBankParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JbBankParser.NEWLINE, i);
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
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> DATE() { return getTokens(JbBankParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(JbBankParser.DATE, i);
		}
		public List<TerminalNode> TIME() { return getTokens(JbBankParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(JbBankParser.TIME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(JbBankParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JbBankParser.NUMBER, i);
		}
		public JbOrdinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jbOrdinary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).enterJbOrdinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).exitJbOrdinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JbBankVisitor ) return ((JbBankVisitor<? extends T>)visitor).visitJbOrdinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JbOrdinaryContext jbOrdinary() throws RecognitionException {
		JbOrdinaryContext _localctx = new JbOrdinaryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jbOrdinary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(18);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(21); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(23);
			match(KEYWORD);
			setState(24);
			match(TAB);
			setState(25);
			((JbOrdinaryContext)_localctx).bnumber = match(WORD);
			setState(26);
			match(WORD);
			setState(27);
			match(TAB);
			setState(28);
			match(WORD);
			setState(29);
			match(TAB);
			setState(30);
			match(WORD);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				word();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(36);
			match(TAB);
			setState(37);
			match(NEWLINE);
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(43);
			match(WORD);
			setState(44);
			match(NEWLINE);
			setState(45);
			match(WORD);
			setState(46);
			match(NEWLINE);
			setState(47);
			match(WORD);
			setState(48);
			match(NEWLINE);
			setState(49);
			match(WORD);
			setState(50);
			match(NEWLINE);
			setState(51);
			match(WORD);
			setState(52);
			match(NEWLINE);
			setState(53);
			match(WORD);
			setState(54);
			match(NEWLINE);
			setState(55);
			match(WORD);
			setState(56);
			match(NEWLINE);
			setState(57);
			match(WORD);
			setState(58);
			match(NEWLINE);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				((JbOrdinaryContext)_localctx).DATE = match(DATE);
				setState(60);
				match(NEWLINE);
				setState(61);
				((JbOrdinaryContext)_localctx).TIME = match(TIME);
				setState(62);
				match(NEWLINE);
				setState(63);
				((JbOrdinaryContext)_localctx).outcome = match(NUMBER);
				setState(64);
				match(NEWLINE);
				setState(65);
				((JbOrdinaryContext)_localctx).income = match(NUMBER);
				setState(66);
				match(NEWLINE);
				setState(67);
				((JbOrdinaryContext)_localctx).balance = match(NUMBER);
				setState(68);
				match(NEWLINE);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(69);
					((JbOrdinaryContext)_localctx).title = word();
					}
					break;
				}
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(72);
					((JbOrdinaryContext)_localctx).title1 = word();
					}
					break;
				}
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(75);
					((JbOrdinaryContext)_localctx).title2 = word();
					}
					break;
				}
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(78);
					((JbOrdinaryContext)_localctx).title3 = word();
					}
					break;
				}
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(81);
					((JbOrdinaryContext)_localctx).title4 = word();
					}
					break;
				}
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(84);
					((JbOrdinaryContext)_localctx).title5 = word();
					}
					break;
				}
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(87);
					((JbOrdinaryContext)_localctx).title6 = word();
					}
					break;
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(90);
					((JbOrdinaryContext)_localctx).title7 = word();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(NEWLINE);
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(97);
					((JbOrdinaryContext)_localctx).memo = word();
					}
					break;
				}
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(100);
					((JbOrdinaryContext)_localctx).memo1 = word();
					}
					break;
				}
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(103);
					((JbOrdinaryContext)_localctx).memo2 = word();
					}
					break;
				}
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(106);
					((JbOrdinaryContext)_localctx).memo3 = word();
					}
					break;
				}
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(109);
					((JbOrdinaryContext)_localctx).memo4 = word();
					}
					break;
				}
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(112);
					((JbOrdinaryContext)_localctx).memo5 = word();
					}
					break;
				}
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(115);
					((JbOrdinaryContext)_localctx).memo6 = word();
					}
					break;
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(118);
					((JbOrdinaryContext)_localctx).memo7 = word();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(NEWLINE);
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(125);
					((JbOrdinaryContext)_localctx).place = word();
					}
					break;
				}
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(128);
					((JbOrdinaryContext)_localctx).place1 = word();
					}
					break;
				}
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(131);
					((JbOrdinaryContext)_localctx).place2 = word();
					}
					break;
				}
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(134);
					((JbOrdinaryContext)_localctx).place3 = word();
					}
					break;
				}
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(137);
					((JbOrdinaryContext)_localctx).place4 = word();
					}
					break;
				}
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(140);
					((JbOrdinaryContext)_localctx).place5 = word();
					}
					break;
				}
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(143);
					((JbOrdinaryContext)_localctx).place6 = word();
					}
					break;
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(146);
					((JbOrdinaryContext)_localctx).place7 = word();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(NEWLINE);
					
							log.info("{} 전북은행 보통예금(『{} {}』 『{} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
								, (((JbOrdinaryContext)_localctx).DATE!=null?((JbOrdinaryContext)_localctx).DATE.getText():null), (((JbOrdinaryContext)_localctx).TIME!=null?((JbOrdinaryContext)_localctx).TIME.getText():null)
								, (((JbOrdinaryContext)_localctx).outcome!=null?((JbOrdinaryContext)_localctx).outcome.getText():null), (((JbOrdinaryContext)_localctx).income!=null?((JbOrdinaryContext)_localctx).income.getText():null), (((JbOrdinaryContext)_localctx).balance!=null?((JbOrdinaryContext)_localctx).balance.getText():null)
								, (((JbOrdinaryContext)_localctx).title!=null?_input.getText(((JbOrdinaryContext)_localctx).title.start,((JbOrdinaryContext)_localctx).title.stop):null), (((JbOrdinaryContext)_localctx).title1!=null?_input.getText(((JbOrdinaryContext)_localctx).title1.start,((JbOrdinaryContext)_localctx).title1.stop):null), (((JbOrdinaryContext)_localctx).title2!=null?_input.getText(((JbOrdinaryContext)_localctx).title2.start,((JbOrdinaryContext)_localctx).title2.stop):null), (((JbOrdinaryContext)_localctx).title3!=null?_input.getText(((JbOrdinaryContext)_localctx).title3.start,((JbOrdinaryContext)_localctx).title3.stop):null), (((JbOrdinaryContext)_localctx).title4!=null?_input.getText(((JbOrdinaryContext)_localctx).title4.start,((JbOrdinaryContext)_localctx).title4.stop):null), (((JbOrdinaryContext)_localctx).title5!=null?_input.getText(((JbOrdinaryContext)_localctx).title5.start,((JbOrdinaryContext)_localctx).title5.stop):null), (((JbOrdinaryContext)_localctx).title6!=null?_input.getText(((JbOrdinaryContext)_localctx).title6.start,((JbOrdinaryContext)_localctx).title6.stop):null), (((JbOrdinaryContext)_localctx).title7!=null?_input.getText(((JbOrdinaryContext)_localctx).title7.start,((JbOrdinaryContext)_localctx).title7.stop):null)
								, (((JbOrdinaryContext)_localctx).memo!=null?_input.getText(((JbOrdinaryContext)_localctx).memo.start,((JbOrdinaryContext)_localctx).memo.stop):null), (((JbOrdinaryContext)_localctx).memo1!=null?_input.getText(((JbOrdinaryContext)_localctx).memo1.start,((JbOrdinaryContext)_localctx).memo1.stop):null), (((JbOrdinaryContext)_localctx).memo2!=null?_input.getText(((JbOrdinaryContext)_localctx).memo2.start,((JbOrdinaryContext)_localctx).memo2.stop):null), (((JbOrdinaryContext)_localctx).memo3!=null?_input.getText(((JbOrdinaryContext)_localctx).memo3.start,((JbOrdinaryContext)_localctx).memo3.stop):null), (((JbOrdinaryContext)_localctx).memo4!=null?_input.getText(((JbOrdinaryContext)_localctx).memo4.start,((JbOrdinaryContext)_localctx).memo4.stop):null), (((JbOrdinaryContext)_localctx).memo5!=null?_input.getText(((JbOrdinaryContext)_localctx).memo5.start,((JbOrdinaryContext)_localctx).memo5.stop):null), (((JbOrdinaryContext)_localctx).memo6!=null?_input.getText(((JbOrdinaryContext)_localctx).memo6.start,((JbOrdinaryContext)_localctx).memo6.stop):null), (((JbOrdinaryContext)_localctx).memo7!=null?_input.getText(((JbOrdinaryContext)_localctx).memo7.start,((JbOrdinaryContext)_localctx).memo7.stop):null)
								, (((JbOrdinaryContext)_localctx).place!=null?_input.getText(((JbOrdinaryContext)_localctx).place.start,((JbOrdinaryContext)_localctx).place.stop):null), (((JbOrdinaryContext)_localctx).place1!=null?_input.getText(((JbOrdinaryContext)_localctx).place1.start,((JbOrdinaryContext)_localctx).place1.stop):null), (((JbOrdinaryContext)_localctx).place2!=null?_input.getText(((JbOrdinaryContext)_localctx).place2.start,((JbOrdinaryContext)_localctx).place2.stop):null), (((JbOrdinaryContext)_localctx).place3!=null?_input.getText(((JbOrdinaryContext)_localctx).place3.start,((JbOrdinaryContext)_localctx).place3.stop):null), (((JbOrdinaryContext)_localctx).place4!=null?_input.getText(((JbOrdinaryContext)_localctx).place4.start,((JbOrdinaryContext)_localctx).place4.stop):null), (((JbOrdinaryContext)_localctx).place5!=null?_input.getText(((JbOrdinaryContext)_localctx).place5.start,((JbOrdinaryContext)_localctx).place5.stop):null), (((JbOrdinaryContext)_localctx).place6!=null?_input.getText(((JbOrdinaryContext)_localctx).place6.start,((JbOrdinaryContext)_localctx).place6.stop):null), (((JbOrdinaryContext)_localctx).place7!=null?_input.getText(((JbOrdinaryContext)_localctx).place7.start,((JbOrdinaryContext)_localctx).place7.stop):null)
							);
						
							StatementForm statement = new StatementForm();
							LIST_STATEMENT.add(statement);
							statement.setTime((((JbOrdinaryContext)_localctx).DATE!=null?((JbOrdinaryContext)_localctx).DATE.getText():null), (((JbOrdinaryContext)_localctx).TIME!=null?((JbOrdinaryContext)_localctx).TIME.getText():null));
							statement.setTitle((((JbOrdinaryContext)_localctx).title!=null?_input.getText(((JbOrdinaryContext)_localctx).title.start,((JbOrdinaryContext)_localctx).title.stop):null), (((JbOrdinaryContext)_localctx).title1!=null?_input.getText(((JbOrdinaryContext)_localctx).title1.start,((JbOrdinaryContext)_localctx).title1.stop):null), (((JbOrdinaryContext)_localctx).title2!=null?_input.getText(((JbOrdinaryContext)_localctx).title2.start,((JbOrdinaryContext)_localctx).title2.stop):null), (((JbOrdinaryContext)_localctx).title3!=null?_input.getText(((JbOrdinaryContext)_localctx).title3.start,((JbOrdinaryContext)_localctx).title3.stop):null), (((JbOrdinaryContext)_localctx).title4!=null?_input.getText(((JbOrdinaryContext)_localctx).title4.start,((JbOrdinaryContext)_localctx).title4.stop):null), (((JbOrdinaryContext)_localctx).title5!=null?_input.getText(((JbOrdinaryContext)_localctx).title5.start,((JbOrdinaryContext)_localctx).title5.stop):null), (((JbOrdinaryContext)_localctx).title6!=null?_input.getText(((JbOrdinaryContext)_localctx).title6.start,((JbOrdinaryContext)_localctx).title6.stop):null), (((JbOrdinaryContext)_localctx).title7!=null?_input.getText(((JbOrdinaryContext)_localctx).title7.start,((JbOrdinaryContext)_localctx).title7.stop):null));
							statement.setDescription(
								(((JbOrdinaryContext)_localctx).memo!=null?_input.getText(((JbOrdinaryContext)_localctx).memo.start,((JbOrdinaryContext)_localctx).memo.stop):null), (((JbOrdinaryContext)_localctx).memo1!=null?_input.getText(((JbOrdinaryContext)_localctx).memo1.start,((JbOrdinaryContext)_localctx).memo1.stop):null), (((JbOrdinaryContext)_localctx).memo2!=null?_input.getText(((JbOrdinaryContext)_localctx).memo2.start,((JbOrdinaryContext)_localctx).memo2.stop):null), (((JbOrdinaryContext)_localctx).memo3!=null?_input.getText(((JbOrdinaryContext)_localctx).memo3.start,((JbOrdinaryContext)_localctx).memo3.stop):null), (((JbOrdinaryContext)_localctx).memo4!=null?_input.getText(((JbOrdinaryContext)_localctx).memo4.start,((JbOrdinaryContext)_localctx).memo4.stop):null), (((JbOrdinaryContext)_localctx).memo5!=null?_input.getText(((JbOrdinaryContext)_localctx).memo5.start,((JbOrdinaryContext)_localctx).memo5.stop):null), (((JbOrdinaryContext)_localctx).memo6!=null?_input.getText(((JbOrdinaryContext)_localctx).memo6.start,((JbOrdinaryContext)_localctx).memo6.stop):null), (((JbOrdinaryContext)_localctx).memo7!=null?_input.getText(((JbOrdinaryContext)_localctx).memo7.start,((JbOrdinaryContext)_localctx).memo7.stop):null)
								, (((JbOrdinaryContext)_localctx).place!=null?_input.getText(((JbOrdinaryContext)_localctx).place.start,((JbOrdinaryContext)_localctx).place.stop):null), (((JbOrdinaryContext)_localctx).place1!=null?_input.getText(((JbOrdinaryContext)_localctx).place1.start,((JbOrdinaryContext)_localctx).place1.stop):null), (((JbOrdinaryContext)_localctx).place2!=null?_input.getText(((JbOrdinaryContext)_localctx).place2.start,((JbOrdinaryContext)_localctx).place2.stop):null), (((JbOrdinaryContext)_localctx).place3!=null?_input.getText(((JbOrdinaryContext)_localctx).place3.start,((JbOrdinaryContext)_localctx).place3.stop):null), (((JbOrdinaryContext)_localctx).place4!=null?_input.getText(((JbOrdinaryContext)_localctx).place4.start,((JbOrdinaryContext)_localctx).place4.stop):null), (((JbOrdinaryContext)_localctx).place5!=null?_input.getText(((JbOrdinaryContext)_localctx).place5.start,((JbOrdinaryContext)_localctx).place5.stop):null), (((JbOrdinaryContext)_localctx).place6!=null?_input.getText(((JbOrdinaryContext)_localctx).place6.start,((JbOrdinaryContext)_localctx).place6.stop):null), (((JbOrdinaryContext)_localctx).place7!=null?_input.getText(((JbOrdinaryContext)_localctx).place7.start,((JbOrdinaryContext)_localctx).place7.stop):null)
							);
							statement.setIncome((((JbOrdinaryContext)_localctx).income!=null?((JbOrdinaryContext)_localctx).income.getText():null));
							statement.setOutcome((((JbOrdinaryContext)_localctx).outcome!=null?((JbOrdinaryContext)_localctx).outcome.getText():null));
							statement.setBalance((((JbOrdinaryContext)_localctx).balance!=null?((JbOrdinaryContext)_localctx).balance.getText():null));
							statement.setCategoryName("분류.수입.부수입.이자/배당금");
						
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATE );
			setState(158);
			match(WORD);
			setState(159);
			match(NEWLINE);
			setState(160);
			match(WORD);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				word();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(166);
			match(NEWLINE);
			setState(167);
			eof();

				log.info("{} 전북은행 보통예금 『{}』", Utility.indentMiddle(), (((JbOrdinaryContext)_localctx).bnumber!=null?((JbOrdinaryContext)_localctx).bnumber.getText():null));

				ACCOUNT.setProducer("전북은행");
				ACCOUNT.setNumber((((JbOrdinaryContext)_localctx).bnumber!=null?((JbOrdinaryContext)_localctx).bnumber.getText():null));

				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);
				STATEMENT.setDescription("");

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
	public static class JbFixedDepositeContext extends ParserRuleContext {
		public Token DATE;
		public Token TIME;
		public Token bnumber;
		public List<TerminalNode> TAB() { return getTokens(JbBankParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(JbBankParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(JbBankParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JbBankParser.WORD, i);
		}
		public TerminalNode DATE() { return getToken(JbBankParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(JbBankParser.TIME, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JbBankParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JbBankParser.NEWLINE, i);
		}
		public TerminalNode KEYWORD() { return getToken(JbBankParser.KEYWORD, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<JbFixedDepositeItemContext> jbFixedDepositeItem() {
			return getRuleContexts(JbFixedDepositeItemContext.class);
		}
		public JbFixedDepositeItemContext jbFixedDepositeItem(int i) {
			return getRuleContext(JbFixedDepositeItemContext.class,i);
		}
		public JbFixedDepositeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jbFixedDeposite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).enterJbFixedDeposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).exitJbFixedDeposite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JbBankVisitor ) return ((JbBankVisitor<? extends T>)visitor).visitJbFixedDeposite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JbFixedDepositeContext jbFixedDeposite() throws RecognitionException {
		JbFixedDepositeContext _localctx = new JbFixedDepositeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jbFixedDeposite);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(170);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(175);
			match(TAB);
			setState(176);
			match(TAB);
			setState(177);
			match(TAB);
			setState(178);
			match(TAB);
			setState(179);
			match(TAB);
			setState(180);
			match(WORD);
			setState(181);
			match(WORD);
			setState(182);
			((JbFixedDepositeContext)_localctx).DATE = match(DATE);
			setState(183);
			((JbFixedDepositeContext)_localctx).TIME = match(TIME);
			setState(184);
			match(TAB);
			setState(185);
			match(TAB);
			setState(186);
			match(TAB);
			setState(187);
			match(NEWLINE);
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(193);
			match(TAB);
			setState(194);
			match(WORD);
			setState(195);
			match(TAB);
			setState(196);
			match(TAB);
			setState(197);
			match(WORD);
			setState(198);
			match(TAB);
			setState(199);
			match(TAB);
			setState(200);
			match(KEYWORD);
			setState(201);
			match(TAB);
			setState(202);
			((JbFixedDepositeContext)_localctx).bnumber = match(WORD);
			setState(203);
			match(TAB);
			setState(204);
			match(TAB);
			setState(205);
			match(NEWLINE);
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(206);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(211);
			match(TAB);
			setState(212);
			match(WORD);
			setState(213);
			match(TAB);
			setState(214);
			match(WORD);
			setState(215);
			match(TAB);
			setState(216);
			match(WORD);
			setState(217);
			match(TAB);
			setState(218);
			match(WORD);
			setState(219);
			match(TAB);
			setState(220);
			match(WORD);
			setState(221);
			match(TAB);
			setState(222);
			match(WORD);
			setState(223);
			match(TAB);
			setState(224);
			match(WORD);
			setState(225);
			match(TAB);
			setState(226);
			match(NEWLINE);
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
					jbFixedDepositeItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(232);
			match(TAB);
			setState(233);
			match(WORD);
			setState(234);
			match(WORD);
			setState(235);
			match(WORD);
			setState(236);
			match(WORD);
			setState(237);
			match(WORD);
			setState(238);
			match(WORD);
			setState(239);
			match(TAB);
			setState(240);
			match(TAB);
			setState(241);
			match(TAB);
			setState(242);
			match(TAB);
			setState(243);
			match(WORD);
			setState(244);
			match(WORD);
			setState(245);
			match(WORD);
			setState(246);
			match(WORD);
			setState(247);
			match(WORD);
			setState(248);
			match(WORD);
			setState(249);
			match(TAB);
			setState(250);
			match(TAB);
			setState(251);
			match(TAB);
			setState(252);
			match(NEWLINE);

				log.info("{} 전북은행 정기예금(『{}』)", Utility.indentMiddle(), (((JbFixedDepositeContext)_localctx).bnumber!=null?((JbFixedDepositeContext)_localctx).bnumber.getText():null));

				ACCOUNT.setNumber((((JbFixedDepositeContext)_localctx).bnumber!=null?((JbFixedDepositeContext)_localctx).bnumber.getText():null));

				STATEMENT.setTime((((JbFixedDepositeContext)_localctx).DATE!=null?((JbFixedDepositeContext)_localctx).DATE.getText():null), (((JbFixedDepositeContext)_localctx).TIME!=null?((JbFixedDepositeContext)_localctx).TIME.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);
				STATEMENT.setDescription("");

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
	public static class JbFixedDepositeItemContext extends ParserRuleContext {
		public Token DATE;
		public Token TIME;
		public Token outcome;
		public Token income;
		public Token balance;
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public WordContext place;
		public WordContext place1;
		public WordContext place2;
		public WordContext place3;
		public WordContext place4;
		public WordContext place5;
		public WordContext place6;
		public WordContext place7;
		public List<TerminalNode> TAB() { return getTokens(JbBankParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(JbBankParser.TAB, i);
		}
		public TerminalNode DATE() { return getToken(JbBankParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(JbBankParser.TIME, 0); }
		public TerminalNode NEWLINE() { return getToken(JbBankParser.NEWLINE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(JbBankParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JbBankParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public JbFixedDepositeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jbFixedDepositeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).enterJbFixedDepositeItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).exitJbFixedDepositeItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JbBankVisitor ) return ((JbBankVisitor<? extends T>)visitor).visitJbFixedDepositeItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JbFixedDepositeItemContext jbFixedDepositeItem() throws RecognitionException {
		JbFixedDepositeItemContext _localctx = new JbFixedDepositeItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jbFixedDepositeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(TAB);
			setState(256);
			((JbFixedDepositeItemContext)_localctx).DATE = match(DATE);
			setState(257);
			match(TAB);
			setState(258);
			((JbFixedDepositeItemContext)_localctx).TIME = match(TIME);
			setState(259);
			match(TAB);
			setState(260);
			((JbFixedDepositeItemContext)_localctx).outcome = match(NUMBER);
			setState(261);
			match(TAB);
			setState(262);
			((JbFixedDepositeItemContext)_localctx).income = match(NUMBER);
			setState(263);
			match(TAB);
			setState(264);
			((JbFixedDepositeItemContext)_localctx).balance = match(NUMBER);
			setState(265);
			match(TAB);
			setState(266);
			((JbFixedDepositeItemContext)_localctx).title = word();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(267);
				((JbFixedDepositeItemContext)_localctx).title1 = word();
				}
				break;
			}
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(270);
				((JbFixedDepositeItemContext)_localctx).title2 = word();
				}
				break;
			}
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(273);
				((JbFixedDepositeItemContext)_localctx).title3 = word();
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(276);
				((JbFixedDepositeItemContext)_localctx).title4 = word();
				}
				break;
			}
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(279);
				((JbFixedDepositeItemContext)_localctx).title5 = word();
				}
				break;
			}
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(282);
				((JbFixedDepositeItemContext)_localctx).title6 = word();
				}
				break;
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(285);
				((JbFixedDepositeItemContext)_localctx).title7 = word();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(TAB);
			setState(292);
			((JbFixedDepositeItemContext)_localctx).place = word();
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(293);
				((JbFixedDepositeItemContext)_localctx).place1 = word();
				}
				break;
			}
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(296);
				((JbFixedDepositeItemContext)_localctx).place2 = word();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(299);
				((JbFixedDepositeItemContext)_localctx).place3 = word();
				}
				break;
			}
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(302);
				((JbFixedDepositeItemContext)_localctx).place4 = word();
				}
				break;
			}
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(305);
				((JbFixedDepositeItemContext)_localctx).place5 = word();
				}
				break;
			}
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(308);
				((JbFixedDepositeItemContext)_localctx).place6 = word();
				}
				break;
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(311);
				((JbFixedDepositeItemContext)_localctx).place7 = word();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(TAB);
			setState(318);
			match(NEWLINE);

				log.info("{} 전북은행 적요(『{} {}』 『{} {} {} {} {} {} {} {}』 『{} {}』 『{} {} {} {} {} {} {} {}』)", Utility.indentMiddle()
					, (((JbFixedDepositeItemContext)_localctx).DATE!=null?((JbFixedDepositeItemContext)_localctx).DATE.getText():null), (((JbFixedDepositeItemContext)_localctx).TIME!=null?((JbFixedDepositeItemContext)_localctx).TIME.getText():null)
					, (((JbFixedDepositeItemContext)_localctx).title!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title.start,((JbFixedDepositeItemContext)_localctx).title.stop):null), (((JbFixedDepositeItemContext)_localctx).title1!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title1.start,((JbFixedDepositeItemContext)_localctx).title1.stop):null), (((JbFixedDepositeItemContext)_localctx).title2!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title2.start,((JbFixedDepositeItemContext)_localctx).title2.stop):null), (((JbFixedDepositeItemContext)_localctx).title3!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title3.start,((JbFixedDepositeItemContext)_localctx).title3.stop):null), (((JbFixedDepositeItemContext)_localctx).title4!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title4.start,((JbFixedDepositeItemContext)_localctx).title4.stop):null), (((JbFixedDepositeItemContext)_localctx).title5!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title5.start,((JbFixedDepositeItemContext)_localctx).title5.stop):null), (((JbFixedDepositeItemContext)_localctx).title6!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title6.start,((JbFixedDepositeItemContext)_localctx).title6.stop):null), (((JbFixedDepositeItemContext)_localctx).title7!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title7.start,((JbFixedDepositeItemContext)_localctx).title7.stop):null)
					, (((JbFixedDepositeItemContext)_localctx).outcome!=null?((JbFixedDepositeItemContext)_localctx).outcome.getText():null), (((JbFixedDepositeItemContext)_localctx).income!=null?((JbFixedDepositeItemContext)_localctx).income.getText():null)
					, (((JbFixedDepositeItemContext)_localctx).place!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place.start,((JbFixedDepositeItemContext)_localctx).place.stop):null), (((JbFixedDepositeItemContext)_localctx).place1!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place1.start,((JbFixedDepositeItemContext)_localctx).place1.stop):null), (((JbFixedDepositeItemContext)_localctx).place2!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place2.start,((JbFixedDepositeItemContext)_localctx).place2.stop):null), (((JbFixedDepositeItemContext)_localctx).place3!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place3.start,((JbFixedDepositeItemContext)_localctx).place3.stop):null), (((JbFixedDepositeItemContext)_localctx).place4!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place4.start,((JbFixedDepositeItemContext)_localctx).place4.stop):null), (((JbFixedDepositeItemContext)_localctx).place5!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place5.start,((JbFixedDepositeItemContext)_localctx).place5.stop):null), (((JbFixedDepositeItemContext)_localctx).place6!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place6.start,((JbFixedDepositeItemContext)_localctx).place6.stop):null), (((JbFixedDepositeItemContext)_localctx).place7!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place7.start,((JbFixedDepositeItemContext)_localctx).place7.stop):null)
				);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTime((((JbFixedDepositeItemContext)_localctx).DATE!=null?((JbFixedDepositeItemContext)_localctx).DATE.getText():null), (((JbFixedDepositeItemContext)_localctx).TIME!=null?((JbFixedDepositeItemContext)_localctx).TIME.getText():null));
				statement.setTitle((((JbFixedDepositeItemContext)_localctx).title!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title.start,((JbFixedDepositeItemContext)_localctx).title.stop):null), (((JbFixedDepositeItemContext)_localctx).title1!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title1.start,((JbFixedDepositeItemContext)_localctx).title1.stop):null), (((JbFixedDepositeItemContext)_localctx).title2!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title2.start,((JbFixedDepositeItemContext)_localctx).title2.stop):null), (((JbFixedDepositeItemContext)_localctx).title3!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title3.start,((JbFixedDepositeItemContext)_localctx).title3.stop):null), (((JbFixedDepositeItemContext)_localctx).title4!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title4.start,((JbFixedDepositeItemContext)_localctx).title4.stop):null), (((JbFixedDepositeItemContext)_localctx).title5!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title5.start,((JbFixedDepositeItemContext)_localctx).title5.stop):null), (((JbFixedDepositeItemContext)_localctx).title6!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title6.start,((JbFixedDepositeItemContext)_localctx).title6.stop):null), (((JbFixedDepositeItemContext)_localctx).title7!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).title7.start,((JbFixedDepositeItemContext)_localctx).title7.stop):null));
				statement.setDescription((((JbFixedDepositeItemContext)_localctx).place!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place.start,((JbFixedDepositeItemContext)_localctx).place.stop):null), (((JbFixedDepositeItemContext)_localctx).place1!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place1.start,((JbFixedDepositeItemContext)_localctx).place1.stop):null), (((JbFixedDepositeItemContext)_localctx).place2!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place2.start,((JbFixedDepositeItemContext)_localctx).place2.stop):null), (((JbFixedDepositeItemContext)_localctx).place3!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place3.start,((JbFixedDepositeItemContext)_localctx).place3.stop):null), (((JbFixedDepositeItemContext)_localctx).place4!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place4.start,((JbFixedDepositeItemContext)_localctx).place4.stop):null), (((JbFixedDepositeItemContext)_localctx).place5!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place5.start,((JbFixedDepositeItemContext)_localctx).place5.stop):null), (((JbFixedDepositeItemContext)_localctx).place6!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place6.start,((JbFixedDepositeItemContext)_localctx).place6.stop):null), (((JbFixedDepositeItemContext)_localctx).place7!=null?_input.getText(((JbFixedDepositeItemContext)_localctx).place7.start,((JbFixedDepositeItemContext)_localctx).place7.stop):null));
				statement.setIncome((((JbFixedDepositeItemContext)_localctx).income!=null?((JbFixedDepositeItemContext)_localctx).income.getText():null));
				statement.setOutcome((((JbFixedDepositeItemContext)_localctx).outcome!=null?((JbFixedDepositeItemContext)_localctx).outcome.getText():null));
				statement.setBalance((((JbFixedDepositeItemContext)_localctx).balance!=null?((JbFixedDepositeItemContext)_localctx).balance.getText():null));

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
		public TerminalNode WORD() { return getToken(JbBankParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(JbBankParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(JbBankParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(JbBankParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(JbBankParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(JbBankParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JbBankVisitor ) return ((JbBankVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		public TerminalNode NEWLINE() { return getToken(JbBankParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(JbBankParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(JbBankParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JbBankVisitor ) return ((JbBankVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(323);
					word();
					}
					break;
				case TAB:
					{
					setState(324);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );
			setState(329);
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
		public List<TerminalNode> TAB() { return getTokens(JbBankParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(JbBankParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JbBankParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JbBankParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbBankListener ) ((JbBankListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JbBankVisitor ) return ((JbBankVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2040L) != 0)) {
				{
				setState(334);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(331);
					word();
					}
					break;
				case TAB:
					{
					setState(332);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(333);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(338);
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
		"\u0004\u0001\n\u0154\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0001\u0004\u0001\u0014\b\u0001\u000b\u0001"+
		"\f\u0001\u0015\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001!\b\u0001"+
		"\u000b\u0001\f\u0001\"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"(\b\u0001\u000b\u0001\f\u0001)\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001G\b\u0001\u0001\u0001\u0003\u0001J\b\u0001\u0001\u0001\u0003\u0001"+
		"M\b\u0001\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0001\u0003\u0001S\b"+
		"\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0001\u0003\u0001Y\b\u0001"+
		"\u0001\u0001\u0005\u0001\\\b\u0001\n\u0001\f\u0001_\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0001\u0003\u0001f\b\u0001\u0001"+
		"\u0001\u0003\u0001i\b\u0001\u0001\u0001\u0003\u0001l\b\u0001\u0001\u0001"+
		"\u0003\u0001o\b\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001\u0001\u0003"+
		"\u0001u\b\u0001\u0001\u0001\u0005\u0001x\b\u0001\n\u0001\f\u0001{\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u007f\b\u0001\u0001\u0001\u0003\u0001"+
		"\u0082\b\u0001\u0001\u0001\u0003\u0001\u0085\b\u0001\u0001\u0001\u0003"+
		"\u0001\u0088\b\u0001\u0001\u0001\u0003\u0001\u008b\b\u0001\u0001\u0001"+
		"\u0003\u0001\u008e\b\u0001\u0001\u0001\u0003\u0001\u0091\b\u0001\u0001"+
		"\u0001\u0005\u0001\u0094\b\u0001\n\u0001\f\u0001\u0097\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u009b\b\u0001\u000b\u0001\f\u0001\u009c\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00a3\b\u0001\u000b"+
		"\u0001\f\u0001\u00a4\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0004\u0002\u00ac\b\u0002\u000b\u0002\f\u0002\u00ad\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u00be\b\u0002\u000b\u0002\f\u0002\u00bf\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\u00d0\b\u0002\u000b\u0002\f\u0002\u00d1"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"\u00e5\b\u0002\u000b\u0002\f\u0002\u00e6\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u010d\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0110\b\u0003\u0001\u0003\u0003\u0003\u0113\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0116\b\u0003\u0001\u0003\u0003\u0003\u0119\b"+
		"\u0003\u0001\u0003\u0003\u0003\u011c\b\u0003\u0001\u0003\u0005\u0003\u011f"+
		"\b\u0003\n\u0003\f\u0003\u0122\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0127\b\u0003\u0001\u0003\u0003\u0003\u012a\b\u0003\u0001"+
		"\u0003\u0003\u0003\u012d\b\u0003\u0001\u0003\u0003\u0003\u0130\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0133\b\u0003\u0001\u0003\u0003\u0003\u0136\b"+
		"\u0003\u0001\u0003\u0005\u0003\u0139\b\u0003\n\u0003\f\u0003\u013c\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u0146\b\u0005\u000b\u0005\f\u0005"+
		"\u0147\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u014f\b\u0006\n\u0006\f\u0006\u0152\t\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\u0005\n\u0181"+
		"\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000"+
		"\u0004\u00ab\u0001\u0000\u0000\u0000\u0006\u00ff\u0001\u0000\u0000\u0000"+
		"\b\u0141\u0001\u0000\u0000\u0000\n\u0145\u0001\u0000\u0000\u0000\f\u0150"+
		"\u0001\u0000\u0000\u0000\u000e\u0011\u0003\u0002\u0001\u0000\u000f\u0011"+
		"\u0003\u0004\u0002\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0014"+
		"\u0003\n\u0005\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\u0005\u0000\u0000\u0018\u0019\u0005\u0003\u0000\u0000\u0019\u001a\u0005"+
		"\n\u0000\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b\u001c\u0005\u0003"+
		"\u0000\u0000\u001c\u001d\u0005\n\u0000\u0000\u001d\u001e\u0005\u0003\u0000"+
		"\u0000\u001e \u0005\n\u0000\u0000\u001f!\u0003\b\u0004\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0003\u0000"+
		"\u0000%\'\u0005\u0004\u0000\u0000&(\u0003\n\u0005\u0000\'&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0005\n\u0000\u0000,-\u0005"+
		"\u0004\u0000\u0000-.\u0005\n\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0005"+
		"\n\u0000\u000001\u0005\u0004\u0000\u000012\u0005\n\u0000\u000023\u0005"+
		"\u0004\u0000\u000034\u0005\n\u0000\u000045\u0005\u0004\u0000\u000056\u0005"+
		"\n\u0000\u000067\u0005\u0004\u0000\u000078\u0005\n\u0000\u000089\u0005"+
		"\u0004\u0000\u00009:\u0005\n\u0000\u0000:\u009a\u0005\u0004\u0000\u0000"+
		";<\u0005\u0006\u0000\u0000<=\u0005\u0004\u0000\u0000=>\u0005\u0007\u0000"+
		"\u0000>?\u0005\u0004\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005\u0004\u0000"+
		"\u0000AB\u0005\b\u0000\u0000BC\u0005\u0004\u0000\u0000CD\u0005\b\u0000"+
		"\u0000DF\u0005\u0004\u0000\u0000EG\u0003\b\u0004\u0000FE\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0003\b\u0004"+
		"\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
		"\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NP\u0003\b\u0004\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QS\u0003"+
		"\b\u0004\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001"+
		"\u0000\u0000\u0000TV\u0003\b\u0004\u0000UT\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WY\u0003\b\u0004\u0000XW\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y]\u0001\u0000\u0000\u0000"+
		"Z\\\u0003\b\u0004\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0005\u0004\u0000\u0000ac\u0003"+
		"\b\u0004\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000df\u0003\b\u0004\u0000ed\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000gi\u0003\b\u0004\u0000hg\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"jl\u0003\b\u0004\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mo\u0003\b\u0004\u0000nm\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pr\u0003\b\u0004\u0000"+
		"qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000"+
		"\u0000su\u0003\b\u0004\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uy\u0001\u0000\u0000\u0000vx\u0003\b\u0004\u0000wv\u0001\u0000\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0005"+
		"\u0004\u0000\u0000}\u007f\u0003\b\u0004\u0000~}\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0003\b\u0004\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0003\b\u0004\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0088\u0003"+
		"\b\u0004\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u008b\u0003\b\u0004"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008e\u0003\b\u0004\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0091\u0003\b\u0004\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0095\u0001\u0000\u0000\u0000\u0092\u0094\u0003\b\u0004\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\u0004\u0000\u0000\u0099\u009b\u0006\u0001\uffff\uffff\u0000\u009a"+
		";\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0005"+
		"\u0004\u0000\u0000\u00a0\u00a2\u0005\n\u0000\u0000\u00a1\u00a3\u0003\b"+
		"\u0004\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0004"+
		"\u0000\u0000\u00a7\u00a8\u0003\f\u0006\u0000\u00a8\u00a9\u0006\u0001\uffff"+
		"\uffff\u0000\u00a9\u0003\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003\n\u0005"+
		"\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0003\u0000"+
		"\u0000\u00b0\u00b1\u0005\u0003\u0000\u0000\u00b1\u00b2\u0005\u0003\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000"+
		"\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0005\n\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7\u00b8\u0005\u0007\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u00bd\u0005\u0004\u0000\u0000"+
		"\u00bc\u00be\u0003\n\u0005\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c3\u0005\n\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00c6"+
		"\u0005\n\u0000\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7\u00c8\u0005"+
		"\u0003\u0000\u0000\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9\u00ca\u0005"+
		"\u0003\u0000\u0000\u00ca\u00cb\u0005\n\u0000\u0000\u00cb\u00cc\u0005\u0003"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00cf\u0005\u0004"+
		"\u0000\u0000\u00ce\u00d0\u0003\n\u0005\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7\u0005\n\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9\u00da"+
		"\u0005\u0003\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc\u0005"+
		"\u0003\u0000\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0003"+
		"\u0000\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e0\u0005\u0003\u0000"+
		"\u0000\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000"+
		"\u00e2\u00e4\u0005\u0004\u0000\u0000\u00e3\u00e5\u0003\u0006\u0003\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0003\u0000\u0000"+
		"\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00eb\u0005\n\u0000\u0000\u00eb"+
		"\u00ec\u0005\n\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee"+
		"\u0005\n\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00f0\u0005"+
		"\u0003\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0003\u0000\u0000\u00f2\u00f3\u0005\u0003\u0000\u0000\u00f3\u00f4\u0005"+
		"\n\u0000\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5\u00f6\u0005\n\u0000"+
		"\u0000\u00f6\u00f7\u0005\n\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000"+
		"\u00f8\u00f9\u0005\n\u0000\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0003\u0000\u0000\u00fb\u00fc\u0005\u0003\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0004\u0000\u0000\u00fd\u00fe\u0006\u0002\uffff\uffff\u0000"+
		"\u00fe\u0005\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0003\u0000\u0000"+
		"\u0100\u0101\u0005\u0006\u0000\u0000\u0101\u0102\u0005\u0003\u0000\u0000"+
		"\u0102\u0103\u0005\u0007\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000"+
		"\u0104\u0105\u0005\b\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000\u0106"+
		"\u0107\u0005\b\u0000\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u0109"+
		"\u0005\b\u0000\u0000\u0109\u010a\u0005\u0003\u0000\u0000\u010a\u010c\u0003"+
		"\b\u0004\u0000\u010b\u010d\u0003\b\u0004\u0000\u010c\u010b\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000"+
		"\u0000\u0000\u010e\u0110\u0003\b\u0004\u0000\u010f\u010e\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u0113\u0003\b\u0004\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0003\b\u0004\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0003\b\u0004\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0003\b\u0004\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u0120\u0001\u0000\u0000\u0000\u011d\u011f\u0003"+
		"\b\u0004\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124\u0126\u0003\b\u0004"+
		"\u0000\u0125\u0127\u0003\b\u0004\u0000\u0126\u0125\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000"+
		"\u0128\u012a\u0003\b\u0004\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u012d\u0003\b\u0004\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u0130"+
		"\u0003\b\u0004\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0133\u0003"+
		"\b\u0004\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0136\u0003\b\u0004"+
		"\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u013a\u0001\u0000\u0000\u0000\u0137\u0139\u0003\b\u0004\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0005\u0003\u0000\u0000\u013e\u013f\u0005\u0004\u0000\u0000"+
		"\u013f\u0140\u0006\u0003\uffff\uffff\u0000\u0140\u0007\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0007\u0000\u0000\u0000\u0142\t\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0003\b\u0004\u0000\u0144\u0146\u0005\u0003\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005\u0004\u0000\u0000\u014a\u000b\u0001\u0000\u0000\u0000\u014b"+
		"\u014f\u0003\b\u0004\u0000\u014c\u014f\u0005\u0003\u0000\u0000\u014d\u014f"+
		"\u0005\u0004\u0000\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\r\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u00004\u0010\u0015\")FILORUX]behknqty~\u0081\u0084\u0087"+
		"\u008a\u008d\u0090\u0095\u009c\u00a4\u00ad\u00bf\u00d1\u00e6\u010c\u010f"+
		"\u0112\u0115\u0118\u011b\u0120\u0126\u0129\u012c\u012f\u0132\u0135\u013a"+
		"\u0145\u0147\u014e\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
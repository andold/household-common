// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\ShinhanCard.g4 by ANTLR 4.13.0
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
public class ShinhanCardParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_shinhanCardDocument = 0, RULE_trafficBus = 1, RULE_word = 2, RULE_line = 3, 
		RULE_eof = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"shinhanCardDocument", "trafficBus", "word", "line", "eof"
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
	public String getGrammarFileName() { return "ShinhanCard.g4"; }

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

	public ShinhanCardParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShinhanCardDocumentContext extends ParserRuleContext {
		public TrafficBusContext trafficBus() {
			return getRuleContext(TrafficBusContext.class,0);
		}
		public ShinhanCardDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shinhanCardDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).enterShinhanCardDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).exitShinhanCardDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanCardVisitor ) return ((ShinhanCardVisitor<? extends T>)visitor).visitShinhanCardDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShinhanCardDocumentContext shinhanCardDocument() throws RecognitionException {
		ShinhanCardDocumentContext _localctx = new ShinhanCardDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_shinhanCardDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			trafficBus();
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
	public static class TrafficBusContext extends ParserRuleContext {
		public WordContext onplace;
		public WordContext onplace1;
		public WordContext onplace2;
		public WordContext onplace3;
		public WordContext onplace4;
		public WordContext onplace5;
		public WordContext onplace6;
		public WordContext onplace7;
		public Token DATE;
		public Token geton;
		public WordContext offplace;
		public WordContext offplace1;
		public WordContext offplace2;
		public WordContext offplace3;
		public WordContext offplace4;
		public WordContext offplace5;
		public WordContext offplace6;
		public WordContext offplace7;
		public Token getoff;
		public WordContext ttype;
		public WordContext bname;
		public WordContext bname1;
		public WordContext bname2;
		public WordContext bname3;
		public WordContext bname4;
		public WordContext bname5;
		public WordContext bname6;
		public WordContext bname7;
		public Token outcome;
		public List<TerminalNode> WORD() { return getTokens(ShinhanCardParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShinhanCardParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShinhanCardParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShinhanCardParser.NUMBER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShinhanCardParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShinhanCardParser.NEWLINE, i);
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
		public List<TerminalNode> DATE() { return getTokens(ShinhanCardParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ShinhanCardParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TIME() { return getTokens(ShinhanCardParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(ShinhanCardParser.TIME, i);
		}
		public TrafficBusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trafficBus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).enterTrafficBus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).exitTrafficBus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanCardVisitor ) return ((ShinhanCardVisitor<? extends T>)visitor).visitTrafficBus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrafficBusContext trafficBus() throws RecognitionException {
		TrafficBusContext _localctx = new TrafficBusContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trafficBus);
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
			match(WORD);
			setState(18);
			match(NUMBER);
			setState(19);
			match(WORD);
			setState(20);
			match(NEWLINE);
			setState(121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(21);
					match(WORD);
					setState(22);
					((TrafficBusContext)_localctx).onplace = word();
					setState(24);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(23);
						((TrafficBusContext)_localctx).onplace1 = word();
						}
						break;
					}
					setState(27);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(26);
						((TrafficBusContext)_localctx).onplace2 = word();
						}
						break;
					}
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(29);
						((TrafficBusContext)_localctx).onplace3 = word();
						}
						break;
					}
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(32);
						((TrafficBusContext)_localctx).onplace4 = word();
						}
						break;
					}
					setState(36);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(35);
						((TrafficBusContext)_localctx).onplace5 = word();
						}
						break;
					}
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(38);
						((TrafficBusContext)_localctx).onplace6 = word();
						}
						break;
					}
					setState(44);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(41);
							((TrafficBusContext)_localctx).onplace7 = word();
							}
							} 
						}
						setState(46);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(47);
					((TrafficBusContext)_localctx).DATE = match(DATE);
					setState(48);
					((TrafficBusContext)_localctx).geton = match(TIME);
					setState(49);
					match(NEWLINE);
					setState(50);
					match(WORD);
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(51);
						((TrafficBusContext)_localctx).offplace = word();
						}
						break;
					}
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(54);
						((TrafficBusContext)_localctx).offplace1 = word();
						}
						break;
					}
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(57);
						((TrafficBusContext)_localctx).offplace2 = word();
						}
						break;
					}
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(60);
						((TrafficBusContext)_localctx).offplace3 = word();
						}
						break;
					}
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(63);
						((TrafficBusContext)_localctx).offplace4 = word();
						}
						break;
					}
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(66);
						((TrafficBusContext)_localctx).offplace5 = word();
						}
						break;
					}
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(69);
						((TrafficBusContext)_localctx).offplace6 = word();
						}
						break;
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(72);
							((TrafficBusContext)_localctx).offplace7 = word();
							}
							} 
						}
						setState(77);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TIME) {
						{
						setState(78);
						((TrafficBusContext)_localctx).getoff = match(TIME);
						}
					}

					setState(81);
					match(NEWLINE);
					setState(82);
					((TrafficBusContext)_localctx).ttype = word();
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(83);
						((TrafficBusContext)_localctx).bname = word();
						}
						break;
					}
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(86);
						((TrafficBusContext)_localctx).bname1 = word();
						}
						break;
					}
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(89);
						((TrafficBusContext)_localctx).bname2 = word();
						}
						break;
					}
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(92);
						((TrafficBusContext)_localctx).bname3 = word();
						}
						break;
					}
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(95);
						((TrafficBusContext)_localctx).bname4 = word();
						}
						break;
					}
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(98);
						((TrafficBusContext)_localctx).bname5 = word();
						}
						break;
					}
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(101);
						((TrafficBusContext)_localctx).bname6 = word();
						}
						break;
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
						{
						{
						setState(104);
						((TrafficBusContext)_localctx).bname7 = word();
						}
						}
						setState(109);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(110);
					match(NEWLINE);
					setState(112); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(111);
							word();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(114); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(116);
					((TrafficBusContext)_localctx).outcome = match(NUMBER);
					setState(117);
					match(WORD);
					setState(118);
					match(NEWLINE);
						
								log.info("{} 신한카드...지하철 버스(『{} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {}』 『{} {} {} {} {} {} {} {} {}』 『{}』)"
									, Utility.indentMiddle()
									, (((TrafficBusContext)_localctx).DATE!=null?((TrafficBusContext)_localctx).DATE.getText():null), (((TrafficBusContext)_localctx).geton!=null?((TrafficBusContext)_localctx).geton.getText():null), (((TrafficBusContext)_localctx).getoff!=null?((TrafficBusContext)_localctx).getoff.getText():null)
									, (((TrafficBusContext)_localctx).onplace!=null?_input.getText(((TrafficBusContext)_localctx).onplace.start,((TrafficBusContext)_localctx).onplace.stop):null), (((TrafficBusContext)_localctx).onplace1!=null?_input.getText(((TrafficBusContext)_localctx).onplace1.start,((TrafficBusContext)_localctx).onplace1.stop):null), (((TrafficBusContext)_localctx).onplace2!=null?_input.getText(((TrafficBusContext)_localctx).onplace2.start,((TrafficBusContext)_localctx).onplace2.stop):null), (((TrafficBusContext)_localctx).onplace3!=null?_input.getText(((TrafficBusContext)_localctx).onplace3.start,((TrafficBusContext)_localctx).onplace3.stop):null), (((TrafficBusContext)_localctx).onplace4!=null?_input.getText(((TrafficBusContext)_localctx).onplace4.start,((TrafficBusContext)_localctx).onplace4.stop):null), (((TrafficBusContext)_localctx).onplace5!=null?_input.getText(((TrafficBusContext)_localctx).onplace5.start,((TrafficBusContext)_localctx).onplace5.stop):null), (((TrafficBusContext)_localctx).onplace6!=null?_input.getText(((TrafficBusContext)_localctx).onplace6.start,((TrafficBusContext)_localctx).onplace6.stop):null), (((TrafficBusContext)_localctx).onplace7!=null?_input.getText(((TrafficBusContext)_localctx).onplace7.start,((TrafficBusContext)_localctx).onplace7.stop):null)
									, (((TrafficBusContext)_localctx).offplace!=null?_input.getText(((TrafficBusContext)_localctx).offplace.start,((TrafficBusContext)_localctx).offplace.stop):null), (((TrafficBusContext)_localctx).offplace1!=null?_input.getText(((TrafficBusContext)_localctx).offplace1.start,((TrafficBusContext)_localctx).offplace1.stop):null), (((TrafficBusContext)_localctx).offplace2!=null?_input.getText(((TrafficBusContext)_localctx).offplace2.start,((TrafficBusContext)_localctx).offplace2.stop):null), (((TrafficBusContext)_localctx).offplace3!=null?_input.getText(((TrafficBusContext)_localctx).offplace3.start,((TrafficBusContext)_localctx).offplace3.stop):null), (((TrafficBusContext)_localctx).offplace4!=null?_input.getText(((TrafficBusContext)_localctx).offplace4.start,((TrafficBusContext)_localctx).offplace4.stop):null), (((TrafficBusContext)_localctx).offplace5!=null?_input.getText(((TrafficBusContext)_localctx).offplace5.start,((TrafficBusContext)_localctx).offplace5.stop):null), (((TrafficBusContext)_localctx).offplace6!=null?_input.getText(((TrafficBusContext)_localctx).offplace6.start,((TrafficBusContext)_localctx).offplace6.stop):null), (((TrafficBusContext)_localctx).offplace7!=null?_input.getText(((TrafficBusContext)_localctx).offplace7.start,((TrafficBusContext)_localctx).offplace7.stop):null)
									, (((TrafficBusContext)_localctx).ttype!=null?_input.getText(((TrafficBusContext)_localctx).ttype.start,((TrafficBusContext)_localctx).ttype.stop):null), (((TrafficBusContext)_localctx).bname!=null?_input.getText(((TrafficBusContext)_localctx).bname.start,((TrafficBusContext)_localctx).bname.stop):null), (((TrafficBusContext)_localctx).bname1!=null?_input.getText(((TrafficBusContext)_localctx).bname1.start,((TrafficBusContext)_localctx).bname1.stop):null), (((TrafficBusContext)_localctx).bname2!=null?_input.getText(((TrafficBusContext)_localctx).bname2.start,((TrafficBusContext)_localctx).bname2.stop):null), (((TrafficBusContext)_localctx).bname3!=null?_input.getText(((TrafficBusContext)_localctx).bname3.start,((TrafficBusContext)_localctx).bname3.stop):null), (((TrafficBusContext)_localctx).bname4!=null?_input.getText(((TrafficBusContext)_localctx).bname4.start,((TrafficBusContext)_localctx).bname4.stop):null), (((TrafficBusContext)_localctx).bname5!=null?_input.getText(((TrafficBusContext)_localctx).bname5.start,((TrafficBusContext)_localctx).bname5.stop):null), (((TrafficBusContext)_localctx).bname6!=null?_input.getText(((TrafficBusContext)_localctx).bname6.start,((TrafficBusContext)_localctx).bname6.stop):null), (((TrafficBusContext)_localctx).bname7!=null?_input.getText(((TrafficBusContext)_localctx).bname7.start,((TrafficBusContext)_localctx).bname7.stop):null)
									, (((TrafficBusContext)_localctx).outcome!=null?((TrafficBusContext)_localctx).outcome.getText():null));
							
								StatementForm statement = new StatementForm();
								LIST_STATEMENT.add(statement);
								statement.setTime((((TrafficBusContext)_localctx).DATE!=null?((TrafficBusContext)_localctx).DATE.getText():null), (((TrafficBusContext)_localctx).getoff!=null?((TrafficBusContext)_localctx).getoff.getText():null) == null ? (((TrafficBusContext)_localctx).geton!=null?((TrafficBusContext)_localctx).geton.getText():null) : (((TrafficBusContext)_localctx).getoff!=null?((TrafficBusContext)_localctx).getoff.getText():null));
								statement.setTitle((((TrafficBusContext)_localctx).ttype!=null?_input.getText(((TrafficBusContext)_localctx).ttype.start,((TrafficBusContext)_localctx).ttype.stop):null)
										, (((TrafficBusContext)_localctx).bname!=null?_input.getText(((TrafficBusContext)_localctx).bname.start,((TrafficBusContext)_localctx).bname.stop):null), (((TrafficBusContext)_localctx).bname1!=null?_input.getText(((TrafficBusContext)_localctx).bname1.start,((TrafficBusContext)_localctx).bname1.stop):null), (((TrafficBusContext)_localctx).bname2!=null?_input.getText(((TrafficBusContext)_localctx).bname2.start,((TrafficBusContext)_localctx).bname2.stop):null), (((TrafficBusContext)_localctx).bname3!=null?_input.getText(((TrafficBusContext)_localctx).bname3.start,((TrafficBusContext)_localctx).bname3.stop):null), (((TrafficBusContext)_localctx).bname4!=null?_input.getText(((TrafficBusContext)_localctx).bname4.start,((TrafficBusContext)_localctx).bname4.stop):null), (((TrafficBusContext)_localctx).bname5!=null?_input.getText(((TrafficBusContext)_localctx).bname5.start,((TrafficBusContext)_localctx).bname5.stop):null), (((TrafficBusContext)_localctx).bname6!=null?_input.getText(((TrafficBusContext)_localctx).bname6.start,((TrafficBusContext)_localctx).bname6.stop):null), (((TrafficBusContext)_localctx).bname7!=null?_input.getText(((TrafficBusContext)_localctx).bname7.start,((TrafficBusContext)_localctx).bname7.stop):null)
										, (((TrafficBusContext)_localctx).offplace!=null?_input.getText(((TrafficBusContext)_localctx).offplace.start,((TrafficBusContext)_localctx).offplace.stop):null), (((TrafficBusContext)_localctx).offplace1!=null?_input.getText(((TrafficBusContext)_localctx).offplace1.start,((TrafficBusContext)_localctx).offplace1.stop):null), (((TrafficBusContext)_localctx).offplace2!=null?_input.getText(((TrafficBusContext)_localctx).offplace2.start,((TrafficBusContext)_localctx).offplace2.stop):null), (((TrafficBusContext)_localctx).offplace3!=null?_input.getText(((TrafficBusContext)_localctx).offplace3.start,((TrafficBusContext)_localctx).offplace3.stop):null), (((TrafficBusContext)_localctx).offplace4!=null?_input.getText(((TrafficBusContext)_localctx).offplace4.start,((TrafficBusContext)_localctx).offplace4.stop):null), (((TrafficBusContext)_localctx).offplace5!=null?_input.getText(((TrafficBusContext)_localctx).offplace5.start,((TrafficBusContext)_localctx).offplace5.stop):null), (((TrafficBusContext)_localctx).offplace6!=null?_input.getText(((TrafficBusContext)_localctx).offplace6.start,((TrafficBusContext)_localctx).offplace6.stop):null), (((TrafficBusContext)_localctx).offplace7!=null?_input.getText(((TrafficBusContext)_localctx).offplace7.start,((TrafficBusContext)_localctx).offplace7.stop):null)
										, "⇦"
										, (((TrafficBusContext)_localctx).onplace!=null?_input.getText(((TrafficBusContext)_localctx).onplace.start,((TrafficBusContext)_localctx).onplace.stop):null), (((TrafficBusContext)_localctx).onplace1!=null?_input.getText(((TrafficBusContext)_localctx).onplace1.start,((TrafficBusContext)_localctx).onplace1.stop):null), (((TrafficBusContext)_localctx).onplace2!=null?_input.getText(((TrafficBusContext)_localctx).onplace2.start,((TrafficBusContext)_localctx).onplace2.stop):null), (((TrafficBusContext)_localctx).onplace3!=null?_input.getText(((TrafficBusContext)_localctx).onplace3.start,((TrafficBusContext)_localctx).onplace3.stop):null), (((TrafficBusContext)_localctx).onplace4!=null?_input.getText(((TrafficBusContext)_localctx).onplace4.start,((TrafficBusContext)_localctx).onplace4.stop):null), (((TrafficBusContext)_localctx).onplace5!=null?_input.getText(((TrafficBusContext)_localctx).onplace5.start,((TrafficBusContext)_localctx).onplace5.stop):null), (((TrafficBusContext)_localctx).onplace6!=null?_input.getText(((TrafficBusContext)_localctx).onplace6.start,((TrafficBusContext)_localctx).onplace6.stop):null), (((TrafficBusContext)_localctx).onplace7!=null?_input.getText(((TrafficBusContext)_localctx).onplace7.start,((TrafficBusContext)_localctx).onplace7.stop):null));
								statement.setDescription((((TrafficBusContext)_localctx).geton!=null?((TrafficBusContext)_localctx).geton.getText():null));
								statement.setOutcome((((TrafficBusContext)_localctx).outcome!=null?((TrafficBusContext)_localctx).outcome.getText():null));
								statement.setCategoryName("분류.지출.교통/차량.대중교통비");
							
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(125);
			match(WORD);
			setState(126);
			match(WORD);
			setState(127);
			match(NEWLINE);
			setState(128);
			eof();

				log.info("{} 신한카드 > 마이 > 교통카드 이용내역 > 지하철 버스", Utility.indentMiddle());

				ACCOUNT.setProducer("신한카드");
				ACCOUNT.setNumber("신한 교통카드");

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
	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ShinhanCardParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(ShinhanCardParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(ShinhanCardParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(ShinhanCardParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(ShinhanCardParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(ShinhanCardParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanCardVisitor ) return ((ShinhanCardVisitor<? extends T>)visitor).visitWord(this);
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
			setState(131);
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
		public TerminalNode NEWLINE() { return getToken(ShinhanCardParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(ShinhanCardParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanCardParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanCardVisitor ) return ((ShinhanCardVisitor<? extends T>)visitor).visitLine(this);
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
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(133);
					word();
					}
					break;
				case TAB:
					{
					setState(134);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );
			setState(139);
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
		public List<TerminalNode> TAB() { return getTokens(ShinhanCardParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ShinhanCardParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShinhanCardParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShinhanCardParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShinhanCardListener ) ((ShinhanCardListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShinhanCardVisitor ) return ((ShinhanCardVisitor<? extends T>)visitor).visitEof(this);
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
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2040L) != 0)) {
				{
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(141);
					word();
					}
					break;
				case TAB:
					{
					setState(142);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(143);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(148);
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
		"\u0004\u0001\n\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u000e\b\u0001\u000b\u0001\f"+
		"\u0001\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0003\u0001"+
		"\u001c\b\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0003"+
		"\u0001\"\b\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0003\u0001"+
		"(\b\u0001\u0001\u0001\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00015\b"+
		"\u0001\u0001\u0001\u0003\u00018\b\u0001\u0001\u0001\u0003\u0001;\b\u0001"+
		"\u0001\u0001\u0003\u0001>\b\u0001\u0001\u0001\u0003\u0001A\b\u0001\u0001"+
		"\u0001\u0003\u0001D\b\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0001"+
		"\u0005\u0001J\b\u0001\n\u0001\f\u0001M\t\u0001\u0001\u0001\u0003\u0001"+
		"P\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001U\b\u0001\u0001"+
		"\u0001\u0003\u0001X\b\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0001"+
		"\u0003\u0001^\b\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0001\u0003"+
		"\u0001d\b\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0001\u0005\u0001"+
		"j\b\u0001\n\u0001\f\u0001m\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"q\b\u0001\u000b\u0001\f\u0001r\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001z\b\u0001\u000b\u0001\f\u0001{\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003\u0088\b\u0003\u000b\u0003"+
		"\f\u0003\u0089\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0091\b\u0004\n\u0004\f\u0004\u0094\t\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0005\n"+
		"\u00b0\u0000\n\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000"+
		"\u0004\u0083\u0001\u0000\u0000\u0000\u0006\u0087\u0001\u0000\u0000\u0000"+
		"\b\u0092\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\u000e\u0003\u0006\u0003\u0000\r\f\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0005\n\u0000\u0000\u0012\u0013\u0005\b\u0000"+
		"\u0000\u0013\u0014\u0005\n\u0000\u0000\u0014y\u0005\u0004\u0000\u0000"+
		"\u0015\u0016\u0005\n\u0000\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017"+
		"\u0019\u0003\u0004\u0002\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0004\u0002\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d"+
		"\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \"\u0003"+
		"\u0004\u0002\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000"+
		"\"$\u0001\u0000\u0000\u0000#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&(\u0003\u0004"+
		"\u0002\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(,\u0001"+
		"\u0000\u0000\u0000)+\u0003\u0004\u0002\u0000*)\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0006"+
		"\u0000\u000001\u0005\u0007\u0000\u000012\u0005\u0004\u0000\u000024\u0005"+
		"\n\u0000\u000035\u0003\u0004\u0002\u000043\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0001\u0000\u0000\u000068\u0003\u0004\u0002\u0000"+
		"76\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000"+
		"\u00009;\u0003\u0004\u0002\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;=\u0001\u0000\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?A\u0003\u0004\u0002\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AC\u0001\u0000\u0000\u0000BD\u0003\u0004\u0002\u0000CB\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EG\u0003"+
		"\u0004\u0002\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GK\u0001\u0000\u0000\u0000HJ\u0003\u0004\u0002\u0000IH\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0005"+
		"\u0007\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QR\u0005\u0004\u0000\u0000RT\u0003\u0004\u0002"+
		"\u0000SU\u0003\u0004\u0002\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UW\u0001\u0000\u0000\u0000VX\u0003\u0004\u0002\u0000WV\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000"+
		"Y[\u0003\u0004\u0002\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[]\u0001\u0000\u0000\u0000\\^\u0003\u0004\u0002\u0000]\\\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_a\u0003"+
		"\u0004\u0002\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ac\u0001\u0000\u0000\u0000bd\u0003\u0004\u0002\u0000cb\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0003\u0004"+
		"\u0002\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gk\u0001"+
		"\u0000\u0000\u0000hj\u0003\u0004\u0002\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0005\u0004"+
		"\u0000\u0000oq\u0003\u0004\u0002\u0000po\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0005\b\u0000\u0000uv\u0005\n\u0000\u0000"+
		"vw\u0005\u0004\u0000\u0000wx\u0006\u0001\uffff\uffff\u0000xz\u0001\u0000"+
		"\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0005\n\u0000\u0000~\u007f\u0005\n\u0000\u0000\u007f\u0080\u0005"+
		"\u0004\u0000\u0000\u0080\u0081\u0003\b\u0004\u0000\u0081\u0082\u0006\u0001"+
		"\uffff\uffff\u0000\u0082\u0003\u0001\u0000\u0000\u0000\u0083\u0084\u0007"+
		"\u0000\u0000\u0000\u0084\u0005\u0001\u0000\u0000\u0000\u0085\u0088\u0003"+
		"\u0004\u0002\u0000\u0086\u0088\u0005\u0003\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\u0004\u0000\u0000\u008c\u0007\u0001\u0000\u0000\u0000\u008d\u0091\u0003"+
		"\u0004\u0002\u0000\u008e\u0091\u0005\u0003\u0000\u0000\u008f\u0091\u0005"+
		"\u0004\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u001f\u000f\u0018\u001b\u001e!$\',47:=@CFKOTWZ]`cfkr{\u0087"+
		"\u0089\u0090\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
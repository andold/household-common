// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\KoreaInvest.g4 by ANTLR 4.13.0
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
public class KoreaInvestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_koreaInvestDocument = 0, RULE_koreaInvestAllTransaction = 1, RULE_koreaInvestAllTransactionItem = 2, 
		RULE_koreaInvestDayTradeComprehensiveEstimate = 3, RULE_koreaInvestDayTradeComprehensiveEstimateItem = 4, 
		RULE_koreaInvestInOutTransactionalInformation = 5, RULE_koreaInvestInOutTransactionalInformationItem = 6, 
		RULE_koreaInvestDayTradeComprehensiveEstimateBefore20220904 = 7, RULE_word = 8, 
		RULE_line = 9, RULE_eof = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"koreaInvestDocument", "koreaInvestAllTransaction", "koreaInvestAllTransactionItem", 
			"koreaInvestDayTradeComprehensiveEstimate", "koreaInvestDayTradeComprehensiveEstimateItem", 
			"koreaInvestInOutTransactionalInformation", "koreaInvestInOutTransactionalInformationItem", 
			"koreaInvestDayTradeComprehensiveEstimateBefore20220904", "word", "line", 
			"eof"
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
	public String getGrammarFileName() { return "KoreaInvest.g4"; }

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

	public KoreaInvestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KoreaInvestDocumentContext extends ParserRuleContext {
		public KoreaInvestAllTransactionContext koreaInvestAllTransaction() {
			return getRuleContext(KoreaInvestAllTransactionContext.class,0);
		}
		public KoreaInvestDayTradeComprehensiveEstimateContext koreaInvestDayTradeComprehensiveEstimate() {
			return getRuleContext(KoreaInvestDayTradeComprehensiveEstimateContext.class,0);
		}
		public KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context koreaInvestDayTradeComprehensiveEstimateBefore20220904() {
			return getRuleContext(KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context.class,0);
		}
		public KoreaInvestInOutTransactionalInformationContext koreaInvestInOutTransactionalInformation() {
			return getRuleContext(KoreaInvestInOutTransactionalInformationContext.class,0);
		}
		public KoreaInvestDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestDocumentContext koreaInvestDocument() throws RecognitionException {
		KoreaInvestDocumentContext _localctx = new KoreaInvestDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_koreaInvestDocument);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				koreaInvestAllTransaction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				koreaInvestDayTradeComprehensiveEstimate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				koreaInvestDayTradeComprehensiveEstimateBefore20220904();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				koreaInvestInOutTransactionalInformation();
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
	public static class KoreaInvestAllTransactionContext extends ParserRuleContext {
		public Token bnumber;
		public List<TerminalNode> KEYWORD() { return getTokens(KoreaInvestParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(KoreaInvestParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KoreaInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KoreaInvestParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
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
		public List<KoreaInvestAllTransactionItemContext> koreaInvestAllTransactionItem() {
			return getRuleContexts(KoreaInvestAllTransactionItemContext.class);
		}
		public KoreaInvestAllTransactionItemContext koreaInvestAllTransactionItem(int i) {
			return getRuleContext(KoreaInvestAllTransactionItemContext.class,i);
		}
		public KoreaInvestAllTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestAllTransaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestAllTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestAllTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestAllTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestAllTransactionContext koreaInvestAllTransaction() throws RecognitionException {
		KoreaInvestAllTransactionContext _localctx = new KoreaInvestAllTransactionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_koreaInvestAllTransaction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(28);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(33);
			match(KEYWORD);
			setState(34);
			match(TAB);
			setState(35);
			match(KEYWORD);
			setState(36);
			match(WORD);
			setState(37);
			((KoreaInvestAllTransactionContext)_localctx).bnumber = match(WORD);
			setState(38);
			match(WORD);
			setState(39);
			match(KEYWORD);
			setState(40);
			match(TAB);
			setState(41);
			match(NEWLINE);
			setState(43); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(42);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				word();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(52);
			match(NEWLINE);
			setState(54); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(53);
					koreaInvestAllTransactionItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				word();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(63);
			match(NEWLINE);
			setState(64);
			eof();

				log.info("{} koreaInvest전체거래내역(『{}』)", Utility.indentMiddle(), (((KoreaInvestAllTransactionContext)_localctx).bnumber!=null?((KoreaInvestAllTransactionContext)_localctx).bnumber.getText():null));

				ACCOUNT.setProducer("한국투자");
				ACCOUNT.setNumber((((KoreaInvestAllTransactionContext)_localctx).bnumber!=null?((KoreaInvestAllTransactionContext)_localctx).bnumber.getText():null));

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
	public static class KoreaInvestAllTransactionItemContext extends ParserRuleContext {
		public Token DATE;
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public Token transactionQuantity;
		public Token transactionAmount;
		public Token fee;
		public Token balance;
		public WordContext type;
		public Token unitPrice;
		public Token dollarBalance;
		public Token calculateAmount;
		public Token tradeFee;
		public Token tax;
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public TerminalNode DATE() { return getToken(KoreaInvestParser.DATE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(KoreaInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KoreaInvestParser.NUMBER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public KoreaInvestAllTransactionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestAllTransactionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestAllTransactionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestAllTransactionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestAllTransactionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestAllTransactionItemContext koreaInvestAllTransactionItem() throws RecognitionException {
		KoreaInvestAllTransactionItemContext _localctx = new KoreaInvestAllTransactionItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_koreaInvestAllTransactionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(67);
				match(NUMBER);
				}
			}

			setState(70);
			match(TAB);
			setState(71);
			((KoreaInvestAllTransactionItemContext)_localctx).DATE = match(DATE);
			setState(72);
			match(TAB);
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(73);
				((KoreaInvestAllTransactionItemContext)_localctx).title = word();
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(76);
				((KoreaInvestAllTransactionItemContext)_localctx).title1 = word();
				}
				break;
			}
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(79);
				((KoreaInvestAllTransactionItemContext)_localctx).title2 = word();
				}
				break;
			}
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(82);
				((KoreaInvestAllTransactionItemContext)_localctx).title3 = word();
				}
				break;
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(85);
				((KoreaInvestAllTransactionItemContext)_localctx).title4 = word();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(TAB);
			setState(92);
			((KoreaInvestAllTransactionItemContext)_localctx).transactionQuantity = match(NUMBER);
			setState(93);
			match(TAB);
			setState(94);
			match(NUMBER);
			setState(95);
			match(TAB);
			setState(96);
			((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount = match(NUMBER);
			setState(97);
			match(TAB);
			setState(98);
			((KoreaInvestAllTransactionItemContext)_localctx).fee = match(NUMBER);
			setState(99);
			match(TAB);
			setState(100);
			match(NUMBER);
			setState(101);
			match(TAB);
			setState(102);
			((KoreaInvestAllTransactionItemContext)_localctx).balance = match(NUMBER);
			setState(103);
			match(TAB);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(104);
				word();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(TAB);
			setState(111);
			match(NEWLINE);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				((KoreaInvestAllTransactionItemContext)_localctx).type = word();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(117);
			match(TAB);
			setState(118);
			match(TAB);
			setState(119);
			((KoreaInvestAllTransactionItemContext)_localctx).unitPrice = match(NUMBER);
			setState(120);
			match(TAB);
			setState(121);
			((KoreaInvestAllTransactionItemContext)_localctx).dollarBalance = match(NUMBER);
			setState(122);
			match(TAB);
			setState(123);
			((KoreaInvestAllTransactionItemContext)_localctx).calculateAmount = match(NUMBER);
			setState(124);
			match(TAB);
			setState(125);
			((KoreaInvestAllTransactionItemContext)_localctx).tradeFee = match(NUMBER);
			setState(126);
			match(TAB);
			setState(127);
			((KoreaInvestAllTransactionItemContext)_localctx).tax = match(NUMBER);
			setState(128);
			match(TAB);
			setState(129);
			match(NUMBER);
			setState(130);
			match(TAB);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(131);
				word();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(TAB);
			setState(138);
			match(NEWLINE);
				
				log.info("{} koreaInvest전체거래내역적요(『{} {} {} {} {}』 『{} {} {}』 『{} {} {} {} {} {}』 『{}』)", Utility.indentMiddle()
					, (((KoreaInvestAllTransactionItemContext)_localctx).title!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title.start,((KoreaInvestAllTransactionItemContext)_localctx).title.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title1!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title1.start,((KoreaInvestAllTransactionItemContext)_localctx).title1.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title2!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title2.start,((KoreaInvestAllTransactionItemContext)_localctx).title2.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title3!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title3.start,((KoreaInvestAllTransactionItemContext)_localctx).title3.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title4!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title4.start,((KoreaInvestAllTransactionItemContext)_localctx).title4.stop):null)
					, (((KoreaInvestAllTransactionItemContext)_localctx).transactionQuantity!=null?((KoreaInvestAllTransactionItemContext)_localctx).transactionQuantity.getText():null), (((KoreaInvestAllTransactionItemContext)_localctx).fee!=null?((KoreaInvestAllTransactionItemContext)_localctx).fee.getText():null), (((KoreaInvestAllTransactionItemContext)_localctx).balance!=null?((KoreaInvestAllTransactionItemContext)_localctx).balance.getText():null)
					, (((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).unitPrice!=null?((KoreaInvestAllTransactionItemContext)_localctx).unitPrice.getText():null), (((KoreaInvestAllTransactionItemContext)_localctx).dollarBalance!=null?((KoreaInvestAllTransactionItemContext)_localctx).dollarBalance.getText():null), (((KoreaInvestAllTransactionItemContext)_localctx).calculateAmount!=null?((KoreaInvestAllTransactionItemContext)_localctx).calculateAmount.getText():null), (((KoreaInvestAllTransactionItemContext)_localctx).tradeFee!=null?((KoreaInvestAllTransactionItemContext)_localctx).tradeFee.getText():null), (((KoreaInvestAllTransactionItemContext)_localctx).tax!=null?((KoreaInvestAllTransactionItemContext)_localctx).tax.getText():null)
					, (((KoreaInvestAllTransactionItemContext)_localctx).DATE!=null?((KoreaInvestAllTransactionItemContext)_localctx).DATE.getText():null));

				if ((((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null).contains("매도") || (((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null).contains("매수")) {
					StatementForm statement = new StatementForm();
					LIST_STATEMENT.add(statement);
					statement.setTime((((KoreaInvestAllTransactionItemContext)_localctx).DATE!=null?((KoreaInvestAllTransactionItemContext)_localctx).DATE.getText():null));
					statement.setTitle("[수수료]", (((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null), "-", (((KoreaInvestAllTransactionItemContext)_localctx).title!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title.start,((KoreaInvestAllTransactionItemContext)_localctx).title.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title1!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title1.start,((KoreaInvestAllTransactionItemContext)_localctx).title1.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title2!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title2.start,((KoreaInvestAllTransactionItemContext)_localctx).title2.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title3!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title3.start,((KoreaInvestAllTransactionItemContext)_localctx).title3.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title4!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title4.start,((KoreaInvestAllTransactionItemContext)_localctx).title4.stop):null), "-", (((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount!=null?((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount.getText():null));
					statement.setDescription("");
					statement.setIncome(0);
					statement.setOutcome((((KoreaInvestAllTransactionItemContext)_localctx).fee!=null?((KoreaInvestAllTransactionItemContext)_localctx).fee.getText():null));
					statement.setBalance(0);
					statement.setCategoryName("분류.지출.세금/이자.기타");
				} else if ((((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null).contains("분배금입금") && !"0".contentEquals((((KoreaInvestAllTransactionItemContext)_localctx).tax!=null?((KoreaInvestAllTransactionItemContext)_localctx).tax.getText():null))) {
					StatementForm statement = new StatementForm();
					LIST_STATEMENT.add(statement);
					statement.setTime((((KoreaInvestAllTransactionItemContext)_localctx).DATE!=null?((KoreaInvestAllTransactionItemContext)_localctx).DATE.getText():null));
					statement.setTitle((((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null), "-", (((KoreaInvestAllTransactionItemContext)_localctx).title!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title.start,((KoreaInvestAllTransactionItemContext)_localctx).title.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title1!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title1.start,((KoreaInvestAllTransactionItemContext)_localctx).title1.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title2!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title2.start,((KoreaInvestAllTransactionItemContext)_localctx).title2.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title3!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title3.start,((KoreaInvestAllTransactionItemContext)_localctx).title3.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title4!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title4.start,((KoreaInvestAllTransactionItemContext)_localctx).title4.stop):null));
					statement.setDescription("");
					statement.setIncome((((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount!=null?((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount.getText():null));
					statement.setOutcome(0);
					statement.setBalance(0);
					statement.setCategoryName("분류.수입.부수입.이자/배당금");

					statement = new StatementForm();
					LIST_STATEMENT.add(statement);
					statement.setTime((((KoreaInvestAllTransactionItemContext)_localctx).DATE!=null?((KoreaInvestAllTransactionItemContext)_localctx).DATE.getText():null));
					statement.setTitle("[세금]", (((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null), "-", (((KoreaInvestAllTransactionItemContext)_localctx).title!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title.start,((KoreaInvestAllTransactionItemContext)_localctx).title.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title1!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title1.start,((KoreaInvestAllTransactionItemContext)_localctx).title1.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title2!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title2.start,((KoreaInvestAllTransactionItemContext)_localctx).title2.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title3!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title3.start,((KoreaInvestAllTransactionItemContext)_localctx).title3.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title4!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title4.start,((KoreaInvestAllTransactionItemContext)_localctx).title4.stop):null), "-", (((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount!=null?((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount.getText():null));
					statement.setDescription("");
					statement.setIncome(0);
					statement.setOutcome((((KoreaInvestAllTransactionItemContext)_localctx).tax!=null?((KoreaInvestAllTransactionItemContext)_localctx).tax.getText():null));
					statement.setBalance(0);
					statement.setCategoryName("분류.지출.세금/이자.세금");
				
					statement = new StatementForm();
					LIST_STATEMENT.add(statement);
					statement.setTime((((KoreaInvestAllTransactionItemContext)_localctx).DATE!=null?((KoreaInvestAllTransactionItemContext)_localctx).DATE.getText():null), "00:00:01");
					statement.setTitle("[정산]", (((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null), "-", (((KoreaInvestAllTransactionItemContext)_localctx).title!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title.start,((KoreaInvestAllTransactionItemContext)_localctx).title.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title1!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title1.start,((KoreaInvestAllTransactionItemContext)_localctx).title1.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title2!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title2.start,((KoreaInvestAllTransactionItemContext)_localctx).title2.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title3!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title3.start,((KoreaInvestAllTransactionItemContext)_localctx).title3.stop):null), (((KoreaInvestAllTransactionItemContext)_localctx).title4!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).title4.start,((KoreaInvestAllTransactionItemContext)_localctx).title4.stop):null), "-", (((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount!=null?((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount.getText():null));
					statement.setDescription("");
					statement.setIncome(0);
					statement.setOutcome((((KoreaInvestAllTransactionItemContext)_localctx).calculateAmount!=null?((KoreaInvestAllTransactionItemContext)_localctx).calculateAmount.getText():null));
					statement.setBalance(0);
					statement.setCategoryName("분류.지출.이체/대체.기타");
				} else if ((((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null).contains("예탁금이용료")) {
					StatementForm statement = new StatementForm();
					LIST_STATEMENT.add(statement);
					statement.setTime((((KoreaInvestAllTransactionItemContext)_localctx).DATE!=null?((KoreaInvestAllTransactionItemContext)_localctx).DATE.getText():null));
					statement.setTitle("[세금]", (((KoreaInvestAllTransactionItemContext)_localctx).type!=null?_input.getText(((KoreaInvestAllTransactionItemContext)_localctx).type.start,((KoreaInvestAllTransactionItemContext)_localctx).type.stop):null), "=", (((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount!=null?((KoreaInvestAllTransactionItemContext)_localctx).transactionAmount.getText():null));
					statement.setDescription("");
					statement.setIncome(0);
					statement.setOutcome((((KoreaInvestAllTransactionItemContext)_localctx).tax!=null?((KoreaInvestAllTransactionItemContext)_localctx).tax.getText():null));
					statement.setBalance(0);
					statement.setCategoryName("분류.지출.세금/이자.세금");
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
	public static class KoreaInvestDayTradeComprehensiveEstimateContext extends ParserRuleContext {
		public Token bnumber;
		public Token available;
		public Token availableAmount;
		public Token income;
		public Token outcome;
		public Token value1;
		public Token rate;
		public Token balance;
		public Token value2;
		public TerminalNode KEYWORD() { return getToken(KoreaInvestParser.KEYWORD, 0); }
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(KoreaInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KoreaInvestParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KoreaInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KoreaInvestParser.NUMBER, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<KoreaInvestDayTradeComprehensiveEstimateItemContext> koreaInvestDayTradeComprehensiveEstimateItem() {
			return getRuleContexts(KoreaInvestDayTradeComprehensiveEstimateItemContext.class);
		}
		public KoreaInvestDayTradeComprehensiveEstimateItemContext koreaInvestDayTradeComprehensiveEstimateItem(int i) {
			return getRuleContext(KoreaInvestDayTradeComprehensiveEstimateItemContext.class,i);
		}
		public KoreaInvestDayTradeComprehensiveEstimateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestDayTradeComprehensiveEstimate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestDayTradeComprehensiveEstimate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestDayTradeComprehensiveEstimate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestDayTradeComprehensiveEstimate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestDayTradeComprehensiveEstimateContext koreaInvestDayTradeComprehensiveEstimate() throws RecognitionException {
		KoreaInvestDayTradeComprehensiveEstimateContext _localctx = new KoreaInvestDayTradeComprehensiveEstimateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_koreaInvestDayTradeComprehensiveEstimate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(141);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(146);
			match(KEYWORD);
			setState(147);
			match(TAB);
			setState(148);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).bnumber = match(WORD);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(WORD);
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAB) {
				{
				setState(154);
				match(TAB);
				}
			}

			setState(157);
			match(NEWLINE);
			setState(159); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(158);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(163);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).available = match(WORD);
			setState(164);
			match(TAB);
			setState(165);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).availableAmount = match(NUMBER);
			setState(166);
			match(TAB);
			setState(167);
			match(NEWLINE);
			setState(168);
			line();
			setState(169);
			line();
			setState(170);
			line();
			setState(171);
			line();
			setState(172);
			line();
			setState(173);
			line();
			setState(174);
			match(WORD);
			setState(175);
			match(TAB);
			setState(176);
			match(NUMBER);
			setState(177);
			match(TAB);
			setState(178);
			match(NEWLINE);
			setState(179);
			match(WORD);
			setState(180);
			match(TAB);
			setState(181);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).income = match(NUMBER);
			setState(182);
			match(TAB);
			setState(183);
			match(NEWLINE);
			setState(184);
			match(WORD);
			setState(185);
			match(TAB);
			setState(186);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).outcome = match(NUMBER);
			setState(187);
			match(TAB);
			setState(188);
			match(NEWLINE);
			setState(189);
			match(WORD);
			setState(190);
			match(TAB);
			setState(191);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value1 = match(NUMBER);
			setState(192);
			match(TAB);
			setState(193);
			match(NEWLINE);
			setState(194);
			match(WORD);
			setState(195);
			match(TAB);
			setState(196);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).rate = match(WORD);
			setState(197);
			match(TAB);
			setState(198);
			match(NEWLINE);
			setState(199);
			match(WORD);
			setState(200);
			match(WORD);
			setState(201);
			match(TAB);
			setState(202);
			match(NUMBER);
			setState(203);
			match(TAB);
			setState(204);
			match(NEWLINE);
			setState(205);
			match(WORD);
			setState(206);
			match(WORD);
			setState(207);
			match(WORD);
			setState(208);
			match(WORD);
			setState(209);
			match(WORD);
			setState(210);
			match(WORD);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(WORD);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(216);
			match(NEWLINE);
			setState(217);
			match(WORD);
			setState(218);
			match(WORD);
			setState(219);
			match(TAB);
			setState(220);
			match(NUMBER);
			setState(221);
			match(TAB);
			setState(222);
			match(NEWLINE);
			setState(223);
			match(WORD);
			setState(224);
			match(TAB);
			setState(225);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).balance = match(NUMBER);
			setState(226);
			match(TAB);
			setState(227);
			match(NEWLINE);
			setState(228);
			match(WORD);
			setState(229);
			match(TAB);
			setState(230);
			match(NUMBER);
			setState(231);
			match(TAB);
			setState(232);
			match(NEWLINE);
			setState(233);
			match(WORD);
			setState(234);
			match(TAB);
			setState(235);
			match(NUMBER);
			setState(236);
			match(TAB);
			setState(237);
			match(NEWLINE);
			setState(238);
			match(WORD);
			setState(239);
			match(TAB);
			setState(240);
			match(WORD);
			setState(241);
			match(TAB);
			setState(242);
			match(NEWLINE);
			setState(243);
			match(WORD);
			setState(244);
			match(WORD);
			setState(245);
			match(TAB);
			setState(246);
			((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value2 = match(NUMBER);
			setState(247);
			match(TAB);
			setState(248);
			match(NEWLINE);
			setState(250); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(249);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(252); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(254);
			match(WORD);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				match(WORD);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(260);
			match(NEWLINE);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					koreaInvestDayTradeComprehensiveEstimateItem();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(267);
			match(WORD);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				match(WORD);
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(273);
			match(NEWLINE);
			setState(274);
			eof();

				log.info("{} 한국투자 당일매매종합평가(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
					, Utility.indentMiddle(), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).bnumber!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).bnumber.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).rate!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).rate.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).income!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).income.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).outcome!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).outcome.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value1!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value1.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value2!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value2.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).balance!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).balance.getText():null));

				ACCOUNT.setProducer("한국투자");
				ACCOUNT.setNumber((((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).bnumber!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).bnumber.getText():null));

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);

				Calendar calendar = Calendar.getInstance();
				calendar.clear(Calendar.MILLISECOND);

				statement.setTime(calendar.getTime());
				statement.setTitle("평가금액", (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).rate!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).rate.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).income!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).income.getText():null), "(",  (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).available!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).available.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).availableAmount!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).availableAmount.getText():null), ")");
				statement.setDescription("");
				statement.setIncome(0);
				statement.setOutcome(0);
				statement.setBalance((((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value2!=null?((KoreaInvestDayTradeComprehensiveEstimateContext)_localctx).value2.getText():null));
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
	public static class KoreaInvestDayTradeComprehensiveEstimateItemContext extends ParserRuleContext {
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public Token inumber;
		public Token buyPrice;
		public Token currentPrice;
		public Token profit;
		public Token buyAmount;
		public Token cost;
		public Token rate;
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KoreaInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KoreaInvestParser.NUMBER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KoreaInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KoreaInvestParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public KoreaInvestDayTradeComprehensiveEstimateItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestDayTradeComprehensiveEstimateItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestDayTradeComprehensiveEstimateItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestDayTradeComprehensiveEstimateItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestDayTradeComprehensiveEstimateItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestDayTradeComprehensiveEstimateItemContext koreaInvestDayTradeComprehensiveEstimateItem() throws RecognitionException {
		KoreaInvestDayTradeComprehensiveEstimateItemContext _localctx = new KoreaInvestDayTradeComprehensiveEstimateItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_koreaInvestDayTradeComprehensiveEstimateItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title = word();
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(278);
				((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title1 = word();
				}
				break;
			}
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(281);
				((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title2 = word();
				}
				break;
			}
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(284);
				((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title3 = word();
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
				((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title4 = word();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(TAB);
			setState(294);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).inumber = match(NUMBER);
			setState(295);
			match(TAB);
			setState(296);
			match(NUMBER);
			setState(297);
			match(TAB);
			setState(298);
			match(NUMBER);
			setState(299);
			match(TAB);
			setState(300);
			match(NUMBER);
			setState(301);
			match(TAB);
			setState(302);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).buyPrice = match(NUMBER);
			setState(303);
			match(TAB);
			setState(304);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).currentPrice = match(NUMBER);
			setState(305);
			match(TAB);
			setState(306);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).profit = match(NUMBER);
			setState(307);
			match(TAB);
			setState(308);
			match(NUMBER);
			setState(309);
			match(WORD);
			setState(310);
			match(TAB);
			setState(311);
			match(TAB);
			setState(312);
			match(NEWLINE);
			setState(313);
			match(WORD);
			setState(314);
			match(TAB);
			setState(315);
			match(NUMBER);
			setState(316);
			match(TAB);
			setState(317);
			match(NUMBER);
			setState(318);
			match(TAB);
			setState(319);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).buyAmount = match(NUMBER);
			setState(320);
			match(TAB);
			setState(321);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).cost = match(NUMBER);
			setState(322);
			match(TAB);
			setState(323);
			((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).rate = match(NUMBER);
			setState(324);
			match(TAB);
			setState(325);
			match(TAB);
			setState(326);
			match(NEWLINE);

				log.info("{} koreaInvestDayTradeComprehensiveEstimateItem(『{} {} {} {} {}』 『{}』 『{} = ({} - {}) * {}』 『-{} ∴{}%』", Utility.indentMiddle()
					, (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title.start,((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title.stop):null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title1!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title1.start,((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title1.stop):null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title2!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title2.start,((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title2.stop):null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title3!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title3.start,((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title3.stop):null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title4!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title4.start,((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).title4.stop):null)
					, (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).inumber!=null?((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).inumber.getText():null)
					, (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).profit!=null?((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).profit.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).currentPrice!=null?((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).currentPrice.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).buyPrice!=null?((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).buyPrice.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).buyAmount!=null?((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).buyAmount.getText():null)
					, (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).cost!=null?((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).cost.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).rate!=null?((KoreaInvestDayTradeComprehensiveEstimateItemContext)_localctx).rate.getText():null)
				);

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
	public static class KoreaInvestInOutTransactionalInformationContext extends ParserRuleContext {
		public Token bnumber;
		public List<TerminalNode> KEYWORD() { return getTokens(KoreaInvestParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(KoreaInvestParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KoreaInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KoreaInvestParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<KoreaInvestInOutTransactionalInformationItemContext> koreaInvestInOutTransactionalInformationItem() {
			return getRuleContexts(KoreaInvestInOutTransactionalInformationItemContext.class);
		}
		public KoreaInvestInOutTransactionalInformationItemContext koreaInvestInOutTransactionalInformationItem(int i) {
			return getRuleContext(KoreaInvestInOutTransactionalInformationItemContext.class,i);
		}
		public KoreaInvestInOutTransactionalInformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestInOutTransactionalInformation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestInOutTransactionalInformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestInOutTransactionalInformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestInOutTransactionalInformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestInOutTransactionalInformationContext koreaInvestInOutTransactionalInformation() throws RecognitionException {
		KoreaInvestInOutTransactionalInformationContext _localctx = new KoreaInvestInOutTransactionalInformationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_koreaInvestInOutTransactionalInformation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(329);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(332); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(334);
			match(KEYWORD);
			setState(335);
			match(TAB);
			setState(336);
			match(KEYWORD);
			setState(337);
			match(WORD);
			setState(338);
			((KoreaInvestInOutTransactionalInformationContext)_localctx).bnumber = match(WORD);
			setState(339);
			match(WORD);
			setState(340);
			match(KEYWORD);
			setState(341);
			match(TAB);
			setState(342);
			match(NEWLINE);
			setState(344); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(343);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(346); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				match(WORD);
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(353);
			match(NEWLINE);
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(354);
				koreaInvestInOutTransactionalInformationItem();
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATE );
			setState(360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				match(WORD);
				}
				}
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(364);
			match(NEWLINE);
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(365);
				line();
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );

				log.info("{} koreaInvest입출금거래내역(『{}』)", Utility.indentMiddle(), (((KoreaInvestInOutTransactionalInformationContext)_localctx).bnumber!=null?((KoreaInvestInOutTransactionalInformationContext)_localctx).bnumber.getText():null));

				ACCOUNT.setProducer("한국투자");
				ACCOUNT.setNumber((((KoreaInvestInOutTransactionalInformationContext)_localctx).bnumber!=null?((KoreaInvestInOutTransactionalInformationContext)_localctx).bnumber.getText():null));

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
	public static class KoreaInvestInOutTransactionalInformationItemContext extends ParserRuleContext {
		public Token DATE;
		public WordContext type;
		public Token income;
		public Token fee;
		public Token balance;
		public WordContext outmessage;
		public WordContext targetNumber;
		public WordContext targetProducer;
		public Token TIME;
		public Token outcome;
		public Token inmessage;
		public WordContext targetName;
		public WordContext channel;
		public TerminalNode DATE() { return getToken(KoreaInvestParser.DATE, 0); }
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
		}
		public TerminalNode TIME() { return getToken(KoreaInvestParser.TIME, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KoreaInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KoreaInvestParser.NUMBER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KoreaInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KoreaInvestParser.WORD, i);
		}
		public KoreaInvestInOutTransactionalInformationItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestInOutTransactionalInformationItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestInOutTransactionalInformationItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestInOutTransactionalInformationItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestInOutTransactionalInformationItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestInOutTransactionalInformationItemContext koreaInvestInOutTransactionalInformationItem() throws RecognitionException {
		KoreaInvestInOutTransactionalInformationItemContext _localctx = new KoreaInvestInOutTransactionalInformationItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_koreaInvestInOutTransactionalInformationItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			((KoreaInvestInOutTransactionalInformationItemContext)_localctx).DATE = match(DATE);
			setState(373);
			match(TAB);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(374);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type = word();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(TAB);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(381);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).income = match(NUMBER);
				}
			}

			setState(384);
			match(TAB);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(385);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).fee = match(NUMBER);
				}
			}

			setState(388);
			match(TAB);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(389);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance = match(NUMBER);
				}
			}

			setState(392);
			match(TAB);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(393);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage = word();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(TAB);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(400);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber = word();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(TAB);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(407);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer = word();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(TAB);
			setState(414);
			match(NEWLINE);
			setState(415);
			((KoreaInvestInOutTransactionalInformationItemContext)_localctx).TIME = match(TIME);
			setState(416);
			match(TAB);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(417);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outcome = match(NUMBER);
				}
			}

			setState(420);
			match(TAB);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(421);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage = match(WORD);
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			match(TAB);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(428);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName = word();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(TAB);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(435);
				((KoreaInvestInOutTransactionalInformationItemContext)_localctx).channel = word();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(TAB);
			setState(442);
			match(NEWLINE);
				
				log.info("{} koreaInvest입출금거래내역적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
					, Utility.indentMiddle(), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).DATE!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).DATE.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).TIME!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).TIME.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).income!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).income.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outcome!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outcome.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.stop):null)
					, (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).fee!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).fee.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).channel!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).channel.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).channel.stop):null));

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTime((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).DATE!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).DATE.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).TIME!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).TIME.getText():null));
				if ((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.stop):null).contains("출금")) {
					statement.setTitle((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.stop):null));
					statement.setIncome((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).income!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).income.getText():null));
					statement.setOutcome((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outcome!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outcome.getText():null));
					statement.setBalance((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance.getText():null));
					statement.setDescription((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage.getText():null));

					if (!"0".equals((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).fee!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).fee.getText():null))) {
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).DATE!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).DATE.getText():null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).TIME!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).TIME.getText():null));
						statement.setTitle("[수수료]", (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.stop):null));
						statement.setIncome(0);
						statement.setOutcome((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).fee!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).fee.getText():null));
						statement.setBalance((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance.getText():null));
						statement.setDescription((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage.getText():null));
						statement.setCategoryName("분류.지출.세금/이자.기타");
					}
				} else {
					statement.setTitle((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).type.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).inmessage.getText():null));
					statement.setIncome((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).income!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).income.getText():null));
					statement.setOutcome((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outcome!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outcome.getText():null));
					statement.setBalance((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance!=null?((KoreaInvestInOutTransactionalInformationItemContext)_localctx).balance.getText():null));
					statement.setDescription((((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetNumber.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetName.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).targetProducer.stop):null), (((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage!=null?_input.getText(((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.start,((KoreaInvestInOutTransactionalInformationItemContext)_localctx).outmessage.stop):null));
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
	public static class KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context extends ParserRuleContext {
		public Token bankbookNumber1;
		public Token bankbookNumber2;
		public Token income;
		public Token outcome;
		public WordContext name1;
		public Token value1;
		public WordContext name2;
		public WordContext value2;
		public Token balance;
		public List<TerminalNode> WORD() { return getTokens(KoreaInvestParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KoreaInvestParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KoreaInvestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KoreaInvestParser.NUMBER, i);
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
		public KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koreaInvestDayTradeComprehensiveEstimateBefore20220904; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterKoreaInvestDayTradeComprehensiveEstimateBefore20220904(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitKoreaInvestDayTradeComprehensiveEstimateBefore20220904(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitKoreaInvestDayTradeComprehensiveEstimateBefore20220904(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context koreaInvestDayTradeComprehensiveEstimateBefore20220904() throws RecognitionException {
		KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context _localctx = new KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_koreaInvestDayTradeComprehensiveEstimateBefore20220904);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(445);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(448); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(450);
			match(WORD);
			setState(451);
			match(WORD);
			setState(452);
			match(WORD);
			setState(453);
			match(WORD);
			setState(454);
			match(WORD);
			setState(455);
			match(WORD);
			setState(456);
			match(WORD);
			setState(457);
			match(WORD);
			setState(458);
			match(WORD);
			setState(459);
			match(NEWLINE);
			setState(460);
			match(WORD);
			setState(461);
			match(TAB);
			setState(462);
			((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber1 = match(WORD);
			setState(463);
			match(WORD);
			setState(464);
			((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber2 = match(WORD);
			setState(465);
			match(WORD);
			setState(466);
			match(NEWLINE);
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				{
				setState(467);
				match(WORD);
				setState(468);
				match(TAB);
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(469);
					word();
					}
					}
					setState(472); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
				setState(474);
				match(TAB);
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(475);
					word();
					}
					}
					setState(478); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
				setState(480);
				match(TAB);
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(481);
					word();
					}
					}
					setState(484); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
				setState(486);
				match(TAB);
				setState(487);
				match(NEWLINE);
				}
				}
				break;
			case TAB:
				{
				{
				setState(489);
				match(TAB);
				setState(490);
				match(WORD);
				setState(491);
				match(TAB);
				setState(492);
				match(NEWLINE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(496); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(495);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(498); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(501); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(500);
				word();
				}
				}
				setState(503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(505);
			match(TAB);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(506);
				match(NUMBER);
				}
			}

			setState(509);
			match(TAB);
			setState(510);
			match(NEWLINE);
			setState(512); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(511);
				word();
				}
				}
				setState(514); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(516);
			match(TAB);
			setState(517);
			((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).income = match(NUMBER);
			setState(518);
			match(TAB);
			setState(519);
			match(NEWLINE);
			setState(521); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				word();
				}
				}
				setState(523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(525);
			match(TAB);
			setState(526);
			((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).outcome = match(NUMBER);
			setState(527);
			match(TAB);
			setState(528);
			match(NEWLINE);
			setState(530); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(529);
				((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name1 = word();
				}
				}
				setState(532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(534);
			match(TAB);
			setState(535);
			((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value1 = match(NUMBER);
			setState(536);
			match(TAB);
			setState(537);
			match(NEWLINE);
			setState(539); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(538);
				((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name2 = word();
				}
				}
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(543);
			match(TAB);
			setState(545); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(544);
				((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2 = word();
				}
				}
				setState(547); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(549);
			match(TAB);
			setState(550);
			match(NEWLINE);
			setState(552); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(551);
				word();
				}
				}
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(556);
			match(TAB);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(557);
				match(NUMBER);
				}
			}

			setState(560);
			match(TAB);
			setState(561);
			match(NEWLINE);
			setState(563); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(562);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(565); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(567);
			match(WORD);
			setState(568);
			match(TAB);
			setState(570); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(569);
				word();
				}
				}
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(574);
			match(TAB);
			setState(575);
			match(NEWLINE);
			setState(577); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(576);
				word();
				}
				}
				setState(579); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(581);
			match(TAB);
			setState(582);
			((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).balance = match(NUMBER);
			setState(583);
			match(TAB);
			setState(584);
			match(NEWLINE);
			setState(585);
			match(WORD);
			setState(587); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(586);
				match(WORD);
				}
				}
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(591);
			match(NEWLINE);
			setState(592);
			eof();

				log.info("koreaInvest당일매매종합평가(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
					, (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber1!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber1.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber2!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber2.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).income!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).income.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).outcome!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).outcome.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name1!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name1.start,((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name1.stop):null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value1!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value1.getText():null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name2!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name2.start,((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name2.stop):null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2.start,((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2.stop):null), (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).balance!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).balance.getText():null));

				ACCOUNT.setProducer("한국투자");
				if (Utility.parseInteger((((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).balance!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).balance.getText():null)) < 100000000) {
					ACCOUNT.setNumber((((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber1!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber1.getText():null));
				} else {
					ACCOUNT.setNumber((((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber2!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).bankbookNumber2.getText():null));
				}

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);

				Calendar calendar = Calendar.getInstance();
				calendar.clear(Calendar.MILLISECOND);

				statement.setTime(calendar.getTime());
				statement.setTitle("평가금액 (" + (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value1!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value1.getText():null) + ",", (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2.start,((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2.stop):null) + ")");
				statement.setDescription((((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name1!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name1.start,((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name1.stop):null) + ":", (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value1!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value1.getText():null) + ",", (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name2!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name2.start,((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).name2.stop):null) + ":", (((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2!=null?_input.getText(((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2.start,((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).value2.stop):null));
				statement.setIncome((((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).income!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).income.getText():null));
				statement.setOutcome((((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).outcome!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).outcome.getText():null));
				statement.setBalance((((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).balance!=null?((KoreaInvestDayTradeComprehensiveEstimateBefore20220904Context)_localctx).balance.getText():null));
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
		public TerminalNode WORD() { return getToken(KoreaInvestParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(KoreaInvestParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(KoreaInvestParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(KoreaInvestParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(KoreaInvestParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(KoreaInvestParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
		public TerminalNode NEWLINE() { return getToken(KoreaInvestParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(599);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(597);
					word();
					}
					break;
				case TAB:
					{
					setState(598);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(601); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );
			setState(603);
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
		public List<TerminalNode> TAB() { return getTokens(KoreaInvestParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KoreaInvestParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KoreaInvestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KoreaInvestParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoreaInvestListener ) ((KoreaInvestListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoreaInvestVisitor ) return ((KoreaInvestVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2040L) != 0)) {
				{
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(605);
					word();
					}
					break;
				case TAB:
					{
					setState(606);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(607);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(612);
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
		"\u0004\u0001\n\u0266\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0001\u0004\u0001\u001e"+
		"\b\u0001\u000b\u0001\f\u0001\u001f\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001,\b\u0001\u000b\u0001\f\u0001-\u0001\u0001\u0004"+
		"\u00011\b\u0001\u000b\u0001\f\u00012\u0001\u0001\u0001\u0001\u0004\u0001"+
		"7\b\u0001\u000b\u0001\f\u00018\u0001\u0001\u0004\u0001<\b\u0001\u000b"+
		"\u0001\f\u0001=\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0003\u0002E\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002K\b\u0002\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0002"+
		"\u0003\u0002Q\b\u0002\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0005"+
		"\u0002W\b\u0002\n\u0002\f\u0002Z\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002j\b\u0002\n\u0002\f\u0002m\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002r\b\u0002\u000b\u0002\f\u0002s\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u0085\b\u0002\n\u0002\f\u0002\u0088\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003\u008f"+
		"\b\u0003\u000b\u0003\f\u0003\u0090\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003\u0097\b\u0003\u000b\u0003\f\u0003\u0098\u0001"+
		"\u0003\u0003\u0003\u009c\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u00a0"+
		"\b\u0003\u000b\u0003\f\u0003\u00a1\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u00d5\b\u0003"+
		"\u000b\u0003\f\u0003\u00d6\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003\u00fb\b\u0003\u000b\u0003\f\u0003\u00fc\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u0101\b\u0003\u000b\u0003\f\u0003\u0102\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u0107\b\u0003\n\u0003\f\u0003\u010a\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003\u010e\b\u0003\u000b\u0003\f\u0003\u010f"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0118\b\u0004\u0001\u0004\u0003\u0004\u011b\b\u0004\u0001"+
		"\u0004\u0003\u0004\u011e\b\u0004\u0001\u0004\u0005\u0004\u0121\b\u0004"+
		"\n\u0004\f\u0004\u0124\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005\u014b\b\u0005\u000b"+
		"\u0005\f\u0005\u014c\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u0159\b\u0005\u000b\u0005\f\u0005\u015a\u0001\u0005\u0004\u0005"+
		"\u015e\b\u0005\u000b\u0005\f\u0005\u015f\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u0164\b\u0005\u000b\u0005\f\u0005\u0165\u0001\u0005\u0004\u0005"+
		"\u0169\b\u0005\u000b\u0005\f\u0005\u016a\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u016f\b\u0005\u000b\u0005\f\u0005\u0170\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0178\b\u0006\n\u0006"+
		"\f\u0006\u017b\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u017f\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0183\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0187\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u018b\b"+
		"\u0006\n\u0006\f\u0006\u018e\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0192\b\u0006\n\u0006\f\u0006\u0195\t\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0199\b\u0006\n\u0006\f\u0006\u019c\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01a3\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u01a7\b\u0006\n\u0006\f\u0006\u01aa\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u01ae\b\u0006\n\u0006\f\u0006\u01b1\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u01b5\b\u0006\n\u0006\f\u0006\u01b8"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004"+
		"\u0007\u01bf\b\u0007\u000b\u0007\f\u0007\u01c0\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u01d7\b\u0007\u000b\u0007\f\u0007\u01d8\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u01dd\b\u0007\u000b\u0007\f\u0007\u01de\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u01e3\b\u0007\u000b\u0007\f\u0007\u01e4\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u01ee\b\u0007\u0001\u0007\u0004\u0007\u01f1\b\u0007"+
		"\u000b\u0007\f\u0007\u01f2\u0001\u0007\u0004\u0007\u01f6\b\u0007\u000b"+
		"\u0007\f\u0007\u01f7\u0001\u0007\u0001\u0007\u0003\u0007\u01fc\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0201\b\u0007\u000b\u0007"+
		"\f\u0007\u0202\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u020a\b\u0007\u000b\u0007\f\u0007\u020b\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0213\b\u0007\u000b"+
		"\u0007\f\u0007\u0214\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u021c\b\u0007\u000b\u0007\f\u0007\u021d\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u0222\b\u0007\u000b\u0007\f\u0007\u0223\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0229\b\u0007\u000b\u0007\f"+
		"\u0007\u022a\u0001\u0007\u0001\u0007\u0003\u0007\u022f\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u0234\b\u0007\u000b\u0007\f\u0007"+
		"\u0235\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u023b\b\u0007\u000b"+
		"\u0007\f\u0007\u023c\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0242"+
		"\b\u0007\u000b\u0007\f\u0007\u0243\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u024c\b\u0007\u000b\u0007"+
		"\f\u0007\u024d\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0004\t\u0258\b\t\u000b\t\f\t\u0259\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0005\n\u0261\b\n\n\n\f\n\u0264\t\n\u0001\n"+
		"\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0001\u0001\u0000\u0005\n\u02a1\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0002\u001d\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006"+
		"\u008e\u0001\u0000\u0000\u0000\b\u0115\u0001\u0000\u0000\u0000\n\u014a"+
		"\u0001\u0000\u0000\u0000\f\u0174\u0001\u0000\u0000\u0000\u000e\u01be\u0001"+
		"\u0000\u0000\u0000\u0010\u0253\u0001\u0000\u0000\u0000\u0012\u0257\u0001"+
		"\u0000\u0000\u0000\u0014\u0262\u0001\u0000\u0000\u0000\u0016\u001b\u0003"+
		"\u0002\u0001\u0000\u0017\u001b\u0003\u0006\u0003\u0000\u0018\u001b\u0003"+
		"\u000e\u0007\u0000\u0019\u001b\u0003\n\u0005\u0000\u001a\u0016\u0001\u0000"+
		"\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000"+
		"\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0001\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\u0012\t\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u0005\u0000\u0000\"#\u0005\u0003\u0000\u0000#$\u0005\u0005\u0000\u0000"+
		"$%\u0005\n\u0000\u0000%&\u0005\n\u0000\u0000&\'\u0005\n\u0000\u0000\'"+
		"(\u0005\u0005\u0000\u0000()\u0005\u0003\u0000\u0000)+\u0005\u0004\u0000"+
		"\u0000*,\u0003\u0012\t\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000"+
		"\u0000\u0000/1\u0003\u0010\b\u00000/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000046\u0005\u0004\u0000\u000057\u0003\u0004\u0002\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:<\u0003\u0010"+
		"\b\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0004\u0000\u0000@A\u0003\u0014\n\u0000AB\u0006\u0001\uffff\uffff\u0000"+
		"B\u0003\u0001\u0000\u0000\u0000CE\u0005\b\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0003"+
		"\u0000\u0000GH\u0005\u0006\u0000\u0000HJ\u0005\u0003\u0000\u0000IK\u0003"+
		"\u0010\b\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001"+
		"\u0000\u0000\u0000LN\u0003\u0010\b\u0000ML\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OQ\u0003\u0010\b\u0000PO\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RT\u0003\u0010\b\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TX\u0001\u0000\u0000\u0000UW\u0003\u0010\b\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u0003"+
		"\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0005"+
		"\b\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005\b\u0000\u0000ab\u0005"+
		"\u0003\u0000\u0000bc\u0005\b\u0000\u0000cd\u0005\u0003\u0000\u0000de\u0005"+
		"\b\u0000\u0000ef\u0005\u0003\u0000\u0000fg\u0005\b\u0000\u0000gk\u0005"+
		"\u0003\u0000\u0000hj\u0003\u0010\b\u0000ih\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0003\u0000"+
		"\u0000oq\u0005\u0004\u0000\u0000pr\u0003\u0010\b\u0000qp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0003\u0000\u0000vw\u0005"+
		"\u0003\u0000\u0000wx\u0005\b\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0005"+
		"\b\u0000\u0000z{\u0005\u0003\u0000\u0000{|\u0005\b\u0000\u0000|}\u0005"+
		"\u0003\u0000\u0000}~\u0005\b\u0000\u0000~\u007f\u0005\u0003\u0000\u0000"+
		"\u007f\u0080\u0005\b\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081"+
		"\u0082\u0005\b\u0000\u0000\u0082\u0086\u0005\u0003\u0000\u0000\u0083\u0085"+
		"\u0003\u0010\b\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0005"+
		"\u0004\u0000\u0000\u008b\u008c\u0006\u0002\uffff\uffff\u0000\u008c\u0005"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0012\t\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0005\u0000\u0000\u0093\u0094\u0005"+
		"\u0003\u0000\u0000\u0094\u0096\u0005\n\u0000\u0000\u0095\u0097\u0005\n"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u009c\u0005\u0003"+
		"\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u0004"+
		"\u0000\u0000\u009e\u00a0\u0003\u0012\t\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000"+
		"\u00a5\u00a6\u0005\b\u0000\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9\u0003\u0012\t\u0000\u00a9\u00aa"+
		"\u0003\u0012\t\u0000\u00aa\u00ab\u0003\u0012\t\u0000\u00ab\u00ac\u0003"+
		"\u0012\t\u0000\u00ac\u00ad\u0003\u0012\t\u0000\u00ad\u00ae\u0003\u0012"+
		"\t\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0005\u0003\u0000"+
		"\u0000\u00b0\u00b1\u0005\b\u0000\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3\u00b4\u0005\n\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0003\u0000\u0000\u00b5\u00b6\u0005\b\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0003\u0000\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\u00b9"+
		"\u0005\n\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bb\u0005"+
		"\b\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00bd\u0005\u0004"+
		"\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000\u00be\u00bf\u0005\u0003\u0000"+
		"\u0000\u00bf\u00c0\u0005\b\u0000\u0000\u00c0\u00c1\u0005\u0003\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0004\u0000\u0000\u00c2\u00c3\u0005\n\u0000\u0000\u00c3"+
		"\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005\n\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0003\u0000\u0000\u00c6\u00c7\u0005\u0004\u0000\u0000\u00c7\u00c8"+
		"\u0005\n\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00ca\u0005"+
		"\u0003\u0000\u0000\u00ca\u00cb\u0005\b\u0000\u0000\u00cb\u00cc\u0005\u0003"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0004\u0000\u0000\u00cd\u00ce\u0005\n\u0000"+
		"\u0000\u00ce\u00cf\u0005\n\u0000\u0000\u00cf\u00d0\u0005\n\u0000\u0000"+
		"\u00d0\u00d1\u0005\n\u0000\u0000\u00d1\u00d2\u0005\n\u0000\u0000\u00d2"+
		"\u00d4\u0005\n\u0000\u0000\u00d3\u00d5\u0005\n\u0000\u0000\u00d4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0004\u0000\u0000\u00d9\u00da"+
		"\u0005\n\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc\u0005"+
		"\u0003\u0000\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00de\u0005\u0003"+
		"\u0000\u0000\u00de\u00df\u0005\u0004\u0000\u0000\u00df\u00e0\u0005\n\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e2\u0005\b\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0003\u0000\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000"+
		"\u00e4\u00e5\u0005\n\u0000\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000\u00e6"+
		"\u00e7\u0005\b\u0000\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0004\u0000\u0000\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0003\u0000\u0000\u00eb\u00ec\u0005\b\u0000\u0000\u00ec\u00ed\u0005\u0003"+
		"\u0000\u0000\u00ed\u00ee\u0005\u0004\u0000\u0000\u00ee\u00ef\u0005\n\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0\u00f1\u0005\n\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f3\u0005\u0004\u0000\u0000"+
		"\u00f3\u00f4\u0005\n\u0000\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5"+
		"\u00f6\u0005\u0003\u0000\u0000\u00f6\u00f7\u0005\b\u0000\u0000\u00f7\u00f8"+
		"\u0005\u0003\u0000\u0000\u00f8\u00fa\u0005\u0004\u0000\u0000\u00f9\u00fb"+
		"\u0003\u0012\t\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0005"+
		"\n\u0000\u0000\u00ff\u0101\u0005\n\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0108\u0005\u0004\u0000\u0000\u0105\u0107\u0003\b\u0004"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010b\u010d\u0005\n\u0000\u0000\u010c\u010e\u0005\n\u0000\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0004\u0000\u0000"+
		"\u0112\u0113\u0003\u0014\n\u0000\u0113\u0114\u0006\u0003\uffff\uffff\u0000"+
		"\u0114\u0007\u0001\u0000\u0000\u0000\u0115\u0117\u0003\u0010\b\u0000\u0116"+
		"\u0118\u0003\u0010\b\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u011b"+
		"\u0003\u0010\b\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011e\u0003"+
		"\u0010\b\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0122\u0001\u0000\u0000\u0000\u011f\u0121\u0003\u0010"+
		"\b\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005\u0003\u0000\u0000\u0126\u0127\u0005\b\u0000\u0000"+
		"\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u0129\u0005\b\u0000\u0000\u0129"+
		"\u012a\u0005\u0003\u0000\u0000\u012a\u012b\u0005\b\u0000\u0000\u012b\u012c"+
		"\u0005\u0003\u0000\u0000\u012c\u012d\u0005\b\u0000\u0000\u012d\u012e\u0005"+
		"\u0003\u0000\u0000\u012e\u012f\u0005\b\u0000\u0000\u012f\u0130\u0005\u0003"+
		"\u0000\u0000\u0130\u0131\u0005\b\u0000\u0000\u0131\u0132\u0005\u0003\u0000"+
		"\u0000\u0132\u0133\u0005\b\u0000\u0000\u0133\u0134\u0005\u0003\u0000\u0000"+
		"\u0134\u0135\u0005\b\u0000\u0000\u0135\u0136\u0005\n\u0000\u0000\u0136"+
		"\u0137\u0005\u0003\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138"+
		"\u0139\u0005\u0004\u0000\u0000\u0139\u013a\u0005\n\u0000\u0000\u013a\u013b"+
		"\u0005\u0003\u0000\u0000\u013b\u013c\u0005\b\u0000\u0000\u013c\u013d\u0005"+
		"\u0003\u0000\u0000\u013d\u013e\u0005\b\u0000\u0000\u013e\u013f\u0005\u0003"+
		"\u0000\u0000\u013f\u0140\u0005\b\u0000\u0000\u0140\u0141\u0005\u0003\u0000"+
		"\u0000\u0141\u0142\u0005\b\u0000\u0000\u0142\u0143\u0005\u0003\u0000\u0000"+
		"\u0143\u0144\u0005\b\u0000\u0000\u0144\u0145\u0005\u0003\u0000\u0000\u0145"+
		"\u0146\u0005\u0003\u0000\u0000\u0146\u0147\u0005\u0004\u0000\u0000\u0147"+
		"\u0148\u0006\u0004\uffff\uffff\u0000\u0148\t\u0001\u0000\u0000\u0000\u0149"+
		"\u014b\u0003\u0012\t\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005\u0005\u0000\u0000\u014f\u0150\u0005\u0003\u0000\u0000\u0150\u0151"+
		"\u0005\u0005\u0000\u0000\u0151\u0152\u0005\n\u0000\u0000\u0152\u0153\u0005"+
		"\n\u0000\u0000\u0153\u0154\u0005\n\u0000\u0000\u0154\u0155\u0005\u0005"+
		"\u0000\u0000\u0155\u0156\u0005\u0003\u0000\u0000\u0156\u0158\u0005\u0004"+
		"\u0000\u0000\u0157\u0159\u0003\u0012\t\u0000\u0158\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0005\n\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0163\u0005\u0004\u0000\u0000\u0162\u0164\u0003\f\u0006\u0000\u0163"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0168\u0001\u0000\u0000\u0000\u0167\u0169\u0005\n\u0000\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u0005\u0004\u0000\u0000\u016d\u016f"+
		"\u0003\u0012\t\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0006"+
		"\u0005\uffff\uffff\u0000\u0173\u000b\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0005\u0006\u0000\u0000\u0175\u0179\u0005\u0003\u0000\u0000\u0176\u0178"+
		"\u0003\u0010\b\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001"+
		"\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u0005\u0003\u0000\u0000\u017d\u017f\u0005"+
		"\b\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0182\u0005\u0003"+
		"\u0000\u0000\u0181\u0183\u0005\b\u0000\u0000\u0182\u0181\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0186\u0005\u0003\u0000\u0000\u0185\u0187\u0005\b\u0000\u0000"+
		"\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018c\u0005\u0003\u0000\u0000"+
		"\u0189\u018b\u0003\u0010\b\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e"+
		"\u018c\u0001\u0000\u0000\u0000\u018f\u0193\u0005\u0003\u0000\u0000\u0190"+
		"\u0192\u0003\u0010\b\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192\u0195"+
		"\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195\u0193"+
		"\u0001\u0000\u0000\u0000\u0196\u019a\u0005\u0003\u0000\u0000\u0197\u0199"+
		"\u0003\u0010\b\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019c\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019a\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0005\u0003\u0000\u0000\u019e\u019f\u0005"+
		"\u0004\u0000\u0000\u019f\u01a0\u0005\u0007\u0000\u0000\u01a0\u01a2\u0005"+
		"\u0003\u0000\u0000\u01a1\u01a3\u0005\b\u0000\u0000\u01a2\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a8\u0005\u0003\u0000\u0000\u01a5\u01a7\u0005\n\u0000"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01af\u0005\u0003\u0000\u0000\u01ac\u01ae\u0003\u0010\b\u0000"+
		"\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000"+
		"\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b6\u0005\u0003\u0000\u0000\u01b3\u01b5\u0003\u0010\b\u0000\u01b4"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005\u0003\u0000\u0000\u01ba\u01bb\u0005\u0004\u0000\u0000\u01bb"+
		"\u01bc\u0006\u0006\uffff\uffff\u0000\u01bc\r\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bf\u0003\u0012\t\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0005\n\u0000\u0000\u01c3\u01c4\u0005\n\u0000\u0000\u01c4\u01c5\u0005"+
		"\n\u0000\u0000\u01c5\u01c6\u0005\n\u0000\u0000\u01c6\u01c7\u0005\n\u0000"+
		"\u0000\u01c7\u01c8\u0005\n\u0000\u0000\u01c8\u01c9\u0005\n\u0000\u0000"+
		"\u01c9\u01ca\u0005\n\u0000\u0000\u01ca\u01cb\u0005\n\u0000\u0000\u01cb"+
		"\u01cc\u0005\u0004\u0000\u0000\u01cc\u01cd\u0005\n\u0000\u0000\u01cd\u01ce"+
		"\u0005\u0003\u0000\u0000\u01ce\u01cf\u0005\n\u0000\u0000\u01cf\u01d0\u0005"+
		"\n\u0000\u0000\u01d0\u01d1\u0005\n\u0000\u0000\u01d1\u01d2\u0005\n\u0000"+
		"\u0000\u01d2\u01ed\u0005\u0004\u0000\u0000\u01d3\u01d4\u0005\n\u0000\u0000"+
		"\u01d4\u01d6\u0005\u0003\u0000\u0000\u01d5\u01d7\u0003\u0010\b\u0000\u01d6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0005\u0003\u0000\u0000\u01db"+
		"\u01dd\u0003\u0010\b\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u0005\u0003\u0000\u0000\u01e1\u01e3\u0003\u0010\b\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0005\u0003\u0000\u0000\u01e7\u01e8\u0005"+
		"\u0004\u0000\u0000\u01e8\u01ee\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005"+
		"\u0003\u0000\u0000\u01ea\u01eb\u0005\n\u0000\u0000\u01eb\u01ec\u0005\u0003"+
		"\u0000\u0000\u01ec\u01ee\u0005\u0004\u0000\u0000\u01ed\u01d3\u0001\u0000"+
		"\u0000\u0000\u01ed\u01e9\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f1\u0003\u0012\t\u0000\u01f0\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f6\u0003\u0010\b\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fb\u0005\u0003\u0000\u0000\u01fa\u01fc\u0005\b\u0000\u0000\u01fb"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\u0003\u0000\u0000\u01fe"+
		"\u0200\u0005\u0004\u0000\u0000\u01ff\u0201\u0003\u0010\b\u0000\u0200\u01ff"+
		"\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0200"+
		"\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204\u0205\u0005\u0003\u0000\u0000\u0205\u0206"+
		"\u0005\b\u0000\u0000\u0206\u0207\u0005\u0003\u0000\u0000\u0207\u0209\u0005"+
		"\u0004\u0000\u0000\u0208\u020a\u0003\u0010\b\u0000\u0209\u0208\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u020f\u0005\b\u0000"+
		"\u0000\u020f\u0210\u0005\u0003\u0000\u0000\u0210\u0212\u0005\u0004\u0000"+
		"\u0000\u0211\u0213\u0003\u0010\b\u0000\u0212\u0211\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0005\u0003\u0000\u0000\u0217\u0218\u0005\b\u0000\u0000\u0218"+
		"\u0219\u0005\u0003\u0000\u0000\u0219\u021b\u0005\u0004\u0000\u0000\u021a"+
		"\u021c\u0003\u0010\b\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221"+
		"\u0005\u0003\u0000\u0000\u0220\u0222\u0003\u0010\b\u0000\u0221\u0220\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0221\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0005\u0003\u0000\u0000\u0226\u0228\u0005"+
		"\u0004\u0000\u0000\u0227\u0229\u0003\u0010\b\u0000\u0228\u0227\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000"+
		"\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000"+
		"\u0000\u0000\u022c\u022e\u0005\u0003\u0000\u0000\u022d\u022f\u0005\b\u0000"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0005\u0003\u0000"+
		"\u0000\u0231\u0233\u0005\u0004\u0000\u0000\u0232\u0234\u0003\u0012\t\u0000"+
		"\u0233\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000"+
		"\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0005\n\u0000\u0000\u0238"+
		"\u023a\u0005\u0003\u0000\u0000\u0239\u023b\u0003\u0010\b\u0000\u023a\u0239"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023a"+
		"\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0005\u0003\u0000\u0000\u023f\u0241"+
		"\u0005\u0004\u0000\u0000\u0240\u0242\u0003\u0010\b\u0000\u0241\u0240\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0241\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0005\u0003\u0000\u0000\u0246\u0247\u0005"+
		"\b\u0000\u0000\u0247\u0248\u0005\u0003\u0000\u0000\u0248\u0249\u0005\u0004"+
		"\u0000\u0000\u0249\u024b\u0005\n\u0000\u0000\u024a\u024c\u0005\n\u0000"+
		"\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0005\u0004\u0000"+
		"\u0000\u0250\u0251\u0003\u0014\n\u0000\u0251\u0252\u0006\u0007\uffff\uffff"+
		"\u0000\u0252\u000f\u0001\u0000\u0000\u0000\u0253\u0254\u0007\u0000\u0000"+
		"\u0000\u0254\u0011\u0001\u0000\u0000\u0000\u0255\u0258\u0003\u0010\b\u0000"+
		"\u0256\u0258\u0005\u0003\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000"+
		"\u0257\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000"+
		"\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0005\u0004\u0000\u0000"+
		"\u025c\u0013\u0001\u0000\u0000\u0000\u025d\u0261\u0003\u0010\b\u0000\u025e"+
		"\u0261\u0005\u0003\u0000\u0000\u025f\u0261\u0005\u0004\u0000\u0000\u0260"+
		"\u025d\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260"+
		"\u025f\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262"+
		"\u0260\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263"+
		"\u0015\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000D\u001a"+
		"\u001f-28=DJMPSXks\u0086\u0090\u0098\u009b\u00a1\u00d6\u00fc\u0102\u0108"+
		"\u010f\u0117\u011a\u011d\u0122\u014c\u015a\u015f\u0165\u016a\u0170\u0179"+
		"\u017e\u0182\u0186\u018c\u0193\u019a\u01a2\u01a8\u01af\u01b6\u01c0\u01d8"+
		"\u01de\u01e4\u01ed\u01f2\u01f7\u01fb\u0202\u020b\u0214\u021d\u0223\u022a"+
		"\u022e\u0235\u023c\u0243\u024d\u0257\u0259\u0260\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
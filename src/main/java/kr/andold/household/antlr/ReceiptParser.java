// Generated from C:\src\eclipse-workspace\household-common\src\main\resources\antlr\Receipt.g4 by ANTLR 4.13.0
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
public class ReceiptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_receiptDocument = 0, RULE_receiptNHHanaroTransationInquiry = 1, RULE_receiptNHHanaroTransationInquiryItems = 2, 
		RULE_receiptHanaroDirectTrade = 3, RULE_receiptHanaro = 4, RULE_receiptHanaroItem = 5, 
		RULE_exHipass = 6, RULE_hipass = 7, RULE_hipassItem = 8, RULE_receiptEMart = 9, 
		RULE_receiptEMartItem = 10, RULE_receiptSSg = 11, RULE_receiptSSgSSgDelivery = 12, 
		RULE_receiptSSgD2DDelivery = 13, RULE_receiptDureSupplyHistoryDetail = 14, 
		RULE_receiptDureSupplyHistoryDetailItem = 15, RULE_receiptICoorpHtml = 16, 
		RULE_receiptICoorpHtmlSummary = 17, RULE_receiptICoorpHtmlItem = 18, RULE_receiptStandard = 19, 
		RULE_receiptStandardItem = 20, RULE_receiptICoorp = 21, RULE_receiptICoorpItem = 22, 
		RULE_receiptTaeYoungHomeMart = 23, RULE_receiptTaeYoungHomeMartItem = 24, 
		RULE_word = 25, RULE_line = 26, RULE_eof = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"receiptDocument", "receiptNHHanaroTransationInquiry", "receiptNHHanaroTransationInquiryItems", 
			"receiptHanaroDirectTrade", "receiptHanaro", "receiptHanaroItem", "exHipass", 
			"hipass", "hipassItem", "receiptEMart", "receiptEMartItem", "receiptSSg", 
			"receiptSSgSSgDelivery", "receiptSSgD2DDelivery", "receiptDureSupplyHistoryDetail", 
			"receiptDureSupplyHistoryDetailItem", "receiptICoorpHtml", "receiptICoorpHtmlSummary", 
			"receiptICoorpHtmlItem", "receiptStandard", "receiptStandardItem", "receiptICoorp", 
			"receiptICoorpItem", "receiptTaeYoungHomeMart", "receiptTaeYoungHomeMartItem", 
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
	public String getGrammarFileName() { return "Receipt.g4"; }

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

	public ReceiptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiptDocumentContext extends ParserRuleContext {
		public ReceiptNHHanaroTransationInquiryContext receiptNHHanaroTransationInquiry() {
			return getRuleContext(ReceiptNHHanaroTransationInquiryContext.class,0);
		}
		public ReceiptHanaroContext receiptHanaro() {
			return getRuleContext(ReceiptHanaroContext.class,0);
		}
		public ReceiptHanaroDirectTradeContext receiptHanaroDirectTrade() {
			return getRuleContext(ReceiptHanaroDirectTradeContext.class,0);
		}
		public ExHipassContext exHipass() {
			return getRuleContext(ExHipassContext.class,0);
		}
		public HipassContext hipass() {
			return getRuleContext(HipassContext.class,0);
		}
		public ReceiptEMartContext receiptEMart() {
			return getRuleContext(ReceiptEMartContext.class,0);
		}
		public ReceiptSSgContext receiptSSg() {
			return getRuleContext(ReceiptSSgContext.class,0);
		}
		public ReceiptTaeYoungHomeMartContext receiptTaeYoungHomeMart() {
			return getRuleContext(ReceiptTaeYoungHomeMartContext.class,0);
		}
		public ReceiptDureSupplyHistoryDetailContext receiptDureSupplyHistoryDetail() {
			return getRuleContext(ReceiptDureSupplyHistoryDetailContext.class,0);
		}
		public ReceiptICoorpHtmlContext receiptICoorpHtml() {
			return getRuleContext(ReceiptICoorpHtmlContext.class,0);
		}
		public ReceiptICoorpContext receiptICoorp() {
			return getRuleContext(ReceiptICoorpContext.class,0);
		}
		public ReceiptStandardContext receiptStandard() {
			return getRuleContext(ReceiptStandardContext.class,0);
		}
		public ReceiptDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptDocumentContext receiptDocument() throws RecognitionException {
		ReceiptDocumentContext _localctx = new ReceiptDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receiptDocument);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				receiptNHHanaroTransationInquiry();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				receiptHanaro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				receiptHanaroDirectTrade();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				exHipass();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				hipass();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				receiptEMart();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				receiptSSg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				receiptTaeYoungHomeMart();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				receiptDureSupplyHistoryDetail();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				receiptICoorpHtml();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(66);
				receiptICoorp();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(67);
				receiptStandard();
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
	public static class ReceiptNHHanaroTransationInquiryContext extends ParserRuleContext {
		public Token DATE;
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
		public Token total;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
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
		public List<TerminalNode> DATE() { return getTokens(ReceiptParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ReceiptParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<ReceiptNHHanaroTransationInquiryItemsContext> receiptNHHanaroTransationInquiryItems() {
			return getRuleContexts(ReceiptNHHanaroTransationInquiryItemsContext.class);
		}
		public ReceiptNHHanaroTransationInquiryItemsContext receiptNHHanaroTransationInquiryItems(int i) {
			return getRuleContext(ReceiptNHHanaroTransationInquiryItemsContext.class,i);
		}
		public ReceiptNHHanaroTransationInquiryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptNHHanaroTransationInquiry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptNHHanaroTransationInquiry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptNHHanaroTransationInquiry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptNHHanaroTransationInquiry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptNHHanaroTransationInquiryContext receiptNHHanaroTransationInquiry() throws RecognitionException {
		ReceiptNHHanaroTransationInquiryContext _localctx = new ReceiptNHHanaroTransationInquiryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_receiptNHHanaroTransationInquiry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(70);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(75);
			match(WORD);
			setState(76);
			match(WORD);
			setState(77);
			match(NUMBER);
			setState(78);
			match(WORD);
			setState(79);
			match(NUMBER);
			setState(80);
			match(NEWLINE);
			setState(81);
			match(WORD);
			setState(82);
			match(TAB);
			setState(83);
			match(WORD);
			setState(84);
			match(TAB);
			setState(85);
			match(WORD);
			setState(86);
			match(TAB);
			setState(87);
			match(WORD);
			setState(88);
			match(TAB);
			setState(89);
			match(WORD);
			setState(90);
			match(TAB);
			setState(91);
			match(TAB);
			setState(92);
			match(NEWLINE);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(NUMBER);
				setState(94);
				match(TAB);
				setState(95);
				((ReceiptNHHanaroTransationInquiryContext)_localctx).DATE = match(DATE);
				setState(96);
				match(TAB);
				setState(97);
				((ReceiptNHHanaroTransationInquiryContext)_localctx).title = word();
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(98);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).title1 = word();
					}
					break;
				}
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(101);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).title2 = word();
					}
					break;
				}
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(104);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).title3 = word();
					}
					break;
				}
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(107);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).title4 = word();
					}
					break;
				}
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(110);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).title5 = word();
					}
					break;
				}
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(113);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).title6 = word();
					}
					break;
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(116);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).title7 = word();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(TAB);
				setState(123);
				((ReceiptNHHanaroTransationInquiryContext)_localctx).place = word();
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(124);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).place1 = word();
					}
					break;
				}
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(127);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).place2 = word();
					}
					break;
				}
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(130);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).place3 = word();
					}
					break;
				}
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(133);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).place4 = word();
					}
					break;
				}
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(136);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).place5 = word();
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(139);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).place6 = word();
					}
					break;
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(142);
					((ReceiptNHHanaroTransationInquiryContext)_localctx).place7 = word();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(TAB);
				setState(149);
				((ReceiptNHHanaroTransationInquiryContext)_localctx).total = match(NUMBER);
				setState(150);
				match(TAB);
				setState(151);
				match(TAB);
				setState(152);
				match(NEWLINE);

							log.info("{} 농협하나로마트 거래내역조회(『{} {}』)", Utility.indentMiddle()
								, (((ReceiptNHHanaroTransationInquiryContext)_localctx).DATE!=null?((ReceiptNHHanaroTransationInquiryContext)_localctx).DATE.getText():null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).total!=null?((ReceiptNHHanaroTransationInquiryContext)_localctx).total.getText():null)
							);
							STATEMENT.setTime((((ReceiptNHHanaroTransationInquiryContext)_localctx).DATE!=null?((ReceiptNHHanaroTransationInquiryContext)_localctx).DATE.getText():null));
							STATEMENT.setDescription("[농협하나로마트]", (((ReceiptNHHanaroTransationInquiryContext)_localctx).total!=null?((ReceiptNHHanaroTransationInquiryContext)_localctx).total.getText():null));
							STATEMENT.setIncome(0);
							STATEMENT.setOutcome(0);
							STATEMENT.setBalance(0);
						
							StatementForm statement = new StatementForm();
							LIST_STATEMENT.add(statement);
							statement.setTime((((ReceiptNHHanaroTransationInquiryContext)_localctx).DATE!=null?((ReceiptNHHanaroTransationInquiryContext)_localctx).DATE.getText():null), "12:00");
							statement.setTitle((((ReceiptNHHanaroTransationInquiryContext)_localctx).title!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).title1!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title1.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title1.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).title2!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title2.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title2.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).title3!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title3.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title3.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).title4!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title4.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title4.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).title5!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title5.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title5.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).title6!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title6.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title6.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).title7!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).title7.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).title7.stop):null));
							statement.setDescription((((ReceiptNHHanaroTransationInquiryContext)_localctx).place!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).place1!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place1.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place1.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).place2!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place2.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place2.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).place3!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place3.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place3.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).place4!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place4.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place4.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).place5!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place5.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place5.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).place6!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place6.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place6.stop):null), (((ReceiptNHHanaroTransationInquiryContext)_localctx).place7!=null?_input.getText(((ReceiptNHHanaroTransationInquiryContext)_localctx).place7.start,((ReceiptNHHanaroTransationInquiryContext)_localctx).place7.stop):null));
							statement.setIncome((((ReceiptNHHanaroTransationInquiryContext)_localctx).total!=null?((ReceiptNHHanaroTransationInquiryContext)_localctx).total.getText():null));
							statement.setOutcome(0);
							statement.setBalance(0);
							statement.setCategoryName("분류.수입.전월이월.이체");
						
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					receiptNHHanaroTransationInquiryItems();
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(159);
				match(TAB);
				setState(160);
				match(NEWLINE);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(166);
			match(WORD);
			setState(167);
			match(NUMBER);
			setState(168);
			match(WORD);
			setState(169);
			match(NEWLINE);
			setState(170);
			match(WORD);
			setState(171);
			match(WORD);
			setState(172);
			match(WORD);
			setState(173);
			match(WORD);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				match(WORD);
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(179);
			match(NEWLINE);
			setState(180);
			eof();

				log.info("{} 농협하나로마트 거래내역조회(『영수증』『하나로마트 구매 내역 (농협몰)』)", Utility.indentMiddle());
				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("하나로마트 구매 내역 (농협몰)");

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
	public static class ReceiptNHHanaroTransationInquiryItemsContext extends ParserRuleContext {
		public Token title;
		public Token title1;
		public Token title2;
		public Token title3;
		public Token title4;
		public Token title5;
		public Token title6;
		public Token title7;
		public Token ea;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(ReceiptParser.NUMBER, 0); }
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public ReceiptNHHanaroTransationInquiryItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptNHHanaroTransationInquiryItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptNHHanaroTransationInquiryItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptNHHanaroTransationInquiryItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptNHHanaroTransationInquiryItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptNHHanaroTransationInquiryItemsContext receiptNHHanaroTransationInquiryItems() throws RecognitionException {
		ReceiptNHHanaroTransationInquiryItemsContext _localctx = new ReceiptNHHanaroTransationInquiryItemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_receiptNHHanaroTransationInquiryItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title = match(WORD);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(184);
				((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title1 = match(WORD);
				}
				break;
			}
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(187);
				((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title2 = match(WORD);
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(190);
				((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title3 = match(WORD);
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(193);
				((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title4 = match(WORD);
				}
				break;
			}
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(196);
				((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title5 = match(WORD);
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(199);
				((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title6 = match(WORD);
				}
				break;
			}
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title7 = match(WORD);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(208);
			((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).ea = match(WORD);
			setState(209);
			((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).NUMBER = match(NUMBER);

				log.info("{} 농협하나로마트 거래내역조회(『{} {} {} {} {} {} {} {}』『{} {}』)", Utility.indentMiddle()
					, (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title1!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title1.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title2!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title2.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title3!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title3.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title4!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title4.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title5!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title5.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title6!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title6.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title7!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title7.getText():null)
					, (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).ea!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).ea.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).NUMBER!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).NUMBER.getText():null)
				);
				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTime(STATEMENT.getTime());
				statement.setTitle((((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title1!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title1.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title2!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title2.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title3!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title3.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title4!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title4.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title5!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title5.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title6!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title6.getText():null), (((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title7!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).title7.getText():null));
				statement.setDescription((((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).ea!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).ea.getText():null));
				statement.setIncome(0);
				statement.setOutcome((((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).NUMBER!=null?((ReceiptNHHanaroTransationInquiryItemsContext)_localctx).NUMBER.getText():null));
				statement.setBalance(0);
				statement.setCategoryName("분류.지출.식비.부식");

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
	public static class ReceiptHanaroDirectTradeContext extends ParserRuleContext {
		public Token DATE;
		public Token TIME;
		public Token total;
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token unit;
		public Token ea;
		public Token amount;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public TerminalNode DATE() { return getToken(ReceiptParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
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
		public ReceiptHanaroDirectTradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptHanaroDirectTrade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptHanaroDirectTrade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptHanaroDirectTrade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptHanaroDirectTrade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptHanaroDirectTradeContext receiptHanaroDirectTrade() throws RecognitionException {
		ReceiptHanaroDirectTradeContext _localctx = new ReceiptHanaroDirectTradeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receiptHanaroDirectTrade);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(212);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(217);
			match(WORD);
			setState(218);
			((ReceiptHanaroDirectTradeContext)_localctx).DATE = match(DATE);
			setState(219);
			((ReceiptHanaroDirectTradeContext)_localctx).TIME = match(TIME);
			setState(220);
			match(WORD);
			setState(221);
			match(NEWLINE);
			setState(222);
			match(WORD);
			setState(223);
			match(WORD);
			setState(224);
			match(WORD);
			setState(225);
			match(WORD);
			setState(226);
			((ReceiptHanaroDirectTradeContext)_localctx).total = match(NUMBER);
			setState(227);
			match(NEWLINE);
			setState(228);
			match(WORD);
			setState(229);
			match(NEWLINE);
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(235);
			match(NUMBER);
			setState(236);
			match(NEWLINE);
			setState(237);
			match(WORD);
			setState(238);
			match(WORD);
			setState(239);
			match(WORD);
			setState(240);
			match(WORD);
			setState(241);
			match(NEWLINE);
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(NUMBER);
				setState(243);
				((ReceiptHanaroDirectTradeContext)_localctx).title = word();
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(244);
					((ReceiptHanaroDirectTradeContext)_localctx).title1 = word();
					}
					break;
				}
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(247);
					((ReceiptHanaroDirectTradeContext)_localctx).title2 = word();
					}
					break;
				}
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(250);
					((ReceiptHanaroDirectTradeContext)_localctx).title3 = word();
					}
					break;
				}
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(253);
					((ReceiptHanaroDirectTradeContext)_localctx).title4 = word();
					}
					break;
				}
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(256);
					((ReceiptHanaroDirectTradeContext)_localctx).title5 = word();
					}
					break;
				}
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(259);
					((ReceiptHanaroDirectTradeContext)_localctx).title6 = word();
					}
					break;
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(262);
					((ReceiptHanaroDirectTradeContext)_localctx).title7 = word();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				match(NEWLINE);
				setState(269);
				match(WORD);
				setState(270);
				((ReceiptHanaroDirectTradeContext)_localctx).unit = match(NUMBER);
				setState(271);
				((ReceiptHanaroDirectTradeContext)_localctx).ea = match(NUMBER);
				setState(272);
				((ReceiptHanaroDirectTradeContext)_localctx).amount = match(NUMBER);
				setState(273);
				match(NEWLINE);

							log.info("{} 하나로 직거래 『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {}』", Utility.indentMiddle()
								, (((ReceiptHanaroDirectTradeContext)_localctx).DATE!=null?((ReceiptHanaroDirectTradeContext)_localctx).DATE.getText():null), (((ReceiptHanaroDirectTradeContext)_localctx).TIME!=null?((ReceiptHanaroDirectTradeContext)_localctx).TIME.getText():null)
								, (((ReceiptHanaroDirectTradeContext)_localctx).title!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title.start,((ReceiptHanaroDirectTradeContext)_localctx).title.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title1!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title1.start,((ReceiptHanaroDirectTradeContext)_localctx).title1.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title2!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title2.start,((ReceiptHanaroDirectTradeContext)_localctx).title2.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title3!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title3.start,((ReceiptHanaroDirectTradeContext)_localctx).title3.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title4!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title4.start,((ReceiptHanaroDirectTradeContext)_localctx).title4.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title5!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title5.start,((ReceiptHanaroDirectTradeContext)_localctx).title5.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title6!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title6.start,((ReceiptHanaroDirectTradeContext)_localctx).title6.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title7!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title7.start,((ReceiptHanaroDirectTradeContext)_localctx).title7.stop):null)
								, (((ReceiptHanaroDirectTradeContext)_localctx).unit!=null?((ReceiptHanaroDirectTradeContext)_localctx).unit.getText():null), (((ReceiptHanaroDirectTradeContext)_localctx).ea!=null?((ReceiptHanaroDirectTradeContext)_localctx).ea.getText():null), (((ReceiptHanaroDirectTradeContext)_localctx).amount!=null?((ReceiptHanaroDirectTradeContext)_localctx).amount.getText():null)
							);
						
							StatementForm statement = new StatementForm();
							LIST_STATEMENT.add(statement);
							statement.setTime((((ReceiptHanaroDirectTradeContext)_localctx).DATE!=null?((ReceiptHanaroDirectTradeContext)_localctx).DATE.getText():null), (((ReceiptHanaroDirectTradeContext)_localctx).TIME!=null?((ReceiptHanaroDirectTradeContext)_localctx).TIME.getText():null));
							statement.setTitle((((ReceiptHanaroDirectTradeContext)_localctx).title!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title.start,((ReceiptHanaroDirectTradeContext)_localctx).title.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title1!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title1.start,((ReceiptHanaroDirectTradeContext)_localctx).title1.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title2!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title2.start,((ReceiptHanaroDirectTradeContext)_localctx).title2.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title3!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title3.start,((ReceiptHanaroDirectTradeContext)_localctx).title3.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title4!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title4.start,((ReceiptHanaroDirectTradeContext)_localctx).title4.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title5!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title5.start,((ReceiptHanaroDirectTradeContext)_localctx).title5.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title6!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title6.start,((ReceiptHanaroDirectTradeContext)_localctx).title6.stop):null), (((ReceiptHanaroDirectTradeContext)_localctx).title7!=null?_input.getText(((ReceiptHanaroDirectTradeContext)_localctx).title7.start,((ReceiptHanaroDirectTradeContext)_localctx).title7.stop):null));
							statement.setDescription((((ReceiptHanaroDirectTradeContext)_localctx).unit!=null?((ReceiptHanaroDirectTradeContext)_localctx).unit.getText():null), "x", (((ReceiptHanaroDirectTradeContext)_localctx).ea!=null?((ReceiptHanaroDirectTradeContext)_localctx).ea.getText():null));
							statement.setOutcome((((ReceiptHanaroDirectTradeContext)_localctx).amount!=null?((ReceiptHanaroDirectTradeContext)_localctx).amount.getText():null));
							statement.setCategoryName("분류.지출.식비.부식");
						
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(280);
			match(WORD);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(281);
				word();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(NEWLINE);
			setState(288);
			eof();

				log.info("{} 하나로 직거래", Utility.indentMiddle());

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("하나로마트 구매 내역 (농협몰)");

				STATEMENT.setTime((((ReceiptHanaroDirectTradeContext)_localctx).DATE!=null?((ReceiptHanaroDirectTradeContext)_localctx).DATE.getText():null), (((ReceiptHanaroDirectTradeContext)_localctx).TIME!=null?((ReceiptHanaroDirectTradeContext)_localctx).TIME.getText():null));
				STATEMENT.setDescription("하나로마트", (((ReceiptHanaroDirectTradeContext)_localctx).total!=null?((ReceiptHanaroDirectTradeContext)_localctx).total.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTime((((ReceiptHanaroDirectTradeContext)_localctx).DATE!=null?((ReceiptHanaroDirectTradeContext)_localctx).DATE.getText():null), (((ReceiptHanaroDirectTradeContext)_localctx).TIME!=null?((ReceiptHanaroDirectTradeContext)_localctx).TIME.getText():null));
				statement.setTitle("하나로 직거래 영수증", (((ReceiptHanaroDirectTradeContext)_localctx).total!=null?((ReceiptHanaroDirectTradeContext)_localctx).total.getText():null));
				statement.setDescription("");
				statement.setIncome((((ReceiptHanaroDirectTradeContext)_localctx).total!=null?((ReceiptHanaroDirectTradeContext)_localctx).total.getText():null));
				statement.setOutcome(0);
				statement.setBalance(0);
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptHanaroContext extends ParserRuleContext {
		public Token DATE;
		public Token TIME;
		public Token total;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public TerminalNode DATE() { return getToken(ReceiptParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public TerminalNode NUMBER() { return getToken(ReceiptParser.NUMBER, 0); }
		public TerminalNode KEYWORD() { return getToken(ReceiptParser.KEYWORD, 0); }
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ReceiptHanaroItemContext> receiptHanaroItem() {
			return getRuleContexts(ReceiptHanaroItemContext.class);
		}
		public ReceiptHanaroItemContext receiptHanaroItem(int i) {
			return getRuleContext(ReceiptHanaroItemContext.class,i);
		}
		public ReceiptHanaroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptHanaro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptHanaro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptHanaro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptHanaro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptHanaroContext receiptHanaro() throws RecognitionException {
		ReceiptHanaroContext _localctx = new ReceiptHanaroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_receiptHanaro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(291);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(294); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(296);
			match(WORD);
			setState(297);
			((ReceiptHanaroContext)_localctx).DATE = match(DATE);
			setState(298);
			((ReceiptHanaroContext)_localctx).TIME = match(TIME);
			setState(299);
			match(WORD);
			setState(300);
			match(NEWLINE);
			setState(301);
			match(WORD);
			setState(302);
			match(WORD);
			setState(303);
			match(WORD);
			setState(304);
			match(WORD);
			setState(305);
			match(NEWLINE);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				receiptHanaroItem();
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(311);
			match(WORD);
			setState(312);
			match(WORD);
			setState(313);
			match(WORD);
			setState(314);
			match(WORD);
			setState(315);
			match(NUMBER);
			setState(316);
			match(NEWLINE);
			setState(318); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(317);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(322);
			match(WORD);
			setState(323);
			match(KEYWORD);
			setState(324);
			match(WORD);
			setState(325);
			match(WORD);
			setState(326);
			match(NEWLINE);
			setState(327);
			match(WORD);
			setState(328);
			match(NEWLINE);
			setState(329);
			match(WORD);
			setState(330);
			match(WORD);
			setState(331);
			match(NEWLINE);
			setState(332);
			match(WORD);
			setState(333);
			match(WORD);
			setState(334);
			((ReceiptHanaroContext)_localctx).total = match(WORD);
			setState(335);
			match(NEWLINE);
			setState(336);
			eof();

				log.info("{} 하나로 영수증(『{}』, 『{}』, 『{}』)", Utility.indentMiddle(), (((ReceiptHanaroContext)_localctx).DATE!=null?((ReceiptHanaroContext)_localctx).DATE.getText():null), (((ReceiptHanaroContext)_localctx).TIME!=null?((ReceiptHanaroContext)_localctx).TIME.getText():null), (((ReceiptHanaroContext)_localctx).total!=null?((ReceiptHanaroContext)_localctx).total.getText():null));

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("하나로마트 구매 내역 (농협몰)");

				STATEMENT.setTime((((ReceiptHanaroContext)_localctx).DATE!=null?((ReceiptHanaroContext)_localctx).DATE.getText():null), (((ReceiptHanaroContext)_localctx).TIME!=null?((ReceiptHanaroContext)_localctx).TIME.getText():null));
				STATEMENT.setDescription("하나로마트", (((ReceiptHanaroContext)_localctx).total!=null?((ReceiptHanaroContext)_localctx).total.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTime((((ReceiptHanaroContext)_localctx).DATE!=null?((ReceiptHanaroContext)_localctx).DATE.getText():null), (((ReceiptHanaroContext)_localctx).TIME!=null?((ReceiptHanaroContext)_localctx).TIME.getText():null));
				statement.setTitle("하나로 영수증", (((ReceiptHanaroContext)_localctx).total!=null?((ReceiptHanaroContext)_localctx).total.getText():null));
				statement.setDescription("");
				statement.setIncome((((ReceiptHanaroContext)_localctx).total!=null?((ReceiptHanaroContext)_localctx).total.getText():null));
				statement.setOutcome(0);
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptHanaroItemContext extends ParserRuleContext {
		public Token seq;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token unit;
		public Token ea;
		public Token total;
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public ReceiptHanaroItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptHanaroItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptHanaroItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptHanaroItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptHanaroItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptHanaroItemContext receiptHanaroItem() throws RecognitionException {
		ReceiptHanaroItemContext _localctx = new ReceiptHanaroItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_receiptHanaroItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((ReceiptHanaroItemContext)_localctx).seq = match(NUMBER);
			setState(340);
			((ReceiptHanaroItemContext)_localctx).title1 = word();
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(341);
				((ReceiptHanaroItemContext)_localctx).title2 = word();
				}
				break;
			}
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(344);
				((ReceiptHanaroItemContext)_localctx).title3 = word();
				}
				break;
			}
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(347);
				((ReceiptHanaroItemContext)_localctx).title4 = word();
				}
				break;
			}
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(350);
				((ReceiptHanaroItemContext)_localctx).title5 = word();
				}
				break;
			}
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(353);
				((ReceiptHanaroItemContext)_localctx).title6 = word();
				}
				break;
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(356);
				((ReceiptHanaroItemContext)_localctx).title7 = word();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(NEWLINE);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				{
				setState(363);
				match(NUMBER);
				setState(364);
				match(NUMBER);
				}
				}
				break;
			case WORD:
				{
				{
				setState(365);
				match(WORD);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
			((ReceiptHanaroItemContext)_localctx).unit = match(NUMBER);
			setState(369);
			((ReceiptHanaroItemContext)_localctx).ea = match(NUMBER);
			setState(370);
			((ReceiptHanaroItemContext)_localctx).total = match(NUMBER);
			setState(371);
			match(NEWLINE);
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(372);
					match(WORD);
					}
					}
					setState(375); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(377);
				match(NUMBER);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(378);
					match(NUMBER);
					}
				}

				setState(381);
				match(NEWLINE);
				}
				break;
			}

				log.info("{} receipt하나로적요 parsing done! - (『{}』 / 『{}』, 『{}』, 『{}』, 『{}』, 『{}』 / 『{}』, 『{}』, 『{}』)"
					, Utility.indentMiddle(), (((ReceiptHanaroItemContext)_localctx).seq!=null?((ReceiptHanaroItemContext)_localctx).seq.getText():null)
					, (((ReceiptHanaroItemContext)_localctx).title1!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title1.start,((ReceiptHanaroItemContext)_localctx).title1.stop):null), (((ReceiptHanaroItemContext)_localctx).title2!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title2.start,((ReceiptHanaroItemContext)_localctx).title2.stop):null), (((ReceiptHanaroItemContext)_localctx).title3!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title3.start,((ReceiptHanaroItemContext)_localctx).title3.stop):null), (((ReceiptHanaroItemContext)_localctx).title4!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title4.start,((ReceiptHanaroItemContext)_localctx).title4.stop):null), (((ReceiptHanaroItemContext)_localctx).title5!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title5.start,((ReceiptHanaroItemContext)_localctx).title5.stop):null), (((ReceiptHanaroItemContext)_localctx).title6!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title6.start,((ReceiptHanaroItemContext)_localctx).title6.stop):null), (((ReceiptHanaroItemContext)_localctx).title7!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title7.start,((ReceiptHanaroItemContext)_localctx).title7.stop):null)
					, (((ReceiptHanaroItemContext)_localctx).unit!=null?((ReceiptHanaroItemContext)_localctx).unit.getText():null), (((ReceiptHanaroItemContext)_localctx).ea!=null?((ReceiptHanaroItemContext)_localctx).ea.getText():null), (((ReceiptHanaroItemContext)_localctx).total!=null?((ReceiptHanaroItemContext)_localctx).total.getText():null)
				);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle((((ReceiptHanaroItemContext)_localctx).title1!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title1.start,((ReceiptHanaroItemContext)_localctx).title1.stop):null).replaceFirst("[0-9a-zA-Z\\.,&:\\s]*", ""), (((ReceiptHanaroItemContext)_localctx).title2!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title2.start,((ReceiptHanaroItemContext)_localctx).title2.stop):null), (((ReceiptHanaroItemContext)_localctx).title3!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title3.start,((ReceiptHanaroItemContext)_localctx).title3.stop):null), (((ReceiptHanaroItemContext)_localctx).title4!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title4.start,((ReceiptHanaroItemContext)_localctx).title4.stop):null), (((ReceiptHanaroItemContext)_localctx).title5!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title5.start,((ReceiptHanaroItemContext)_localctx).title5.stop):null), (((ReceiptHanaroItemContext)_localctx).title6!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title6.start,((ReceiptHanaroItemContext)_localctx).title6.stop):null), (((ReceiptHanaroItemContext)_localctx).title7!=null?_input.getText(((ReceiptHanaroItemContext)_localctx).title7.start,((ReceiptHanaroItemContext)_localctx).title7.stop):null));
				statement.setDescription((((ReceiptHanaroItemContext)_localctx).unit!=null?((ReceiptHanaroItemContext)_localctx).unit.getText():null), "x", (((ReceiptHanaroItemContext)_localctx).ea!=null?((ReceiptHanaroItemContext)_localctx).ea.getText():null), "하나로");
				statement.setOutcome((((ReceiptHanaroItemContext)_localctx).total!=null?((ReceiptHanaroItemContext)_localctx).total.getText():null));
				statement.setCategoryName("분류.지출.식비.주식");

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
	public static class ExHipassContext extends ParserRuleContext {
		public Token DATE;
		public Token TIME;
		public WordContext in;
		public WordContext in1;
		public WordContext in2;
		public WordContext in3;
		public WordContext in4;
		public WordContext in5;
		public WordContext in6;
		public WordContext in7;
		public WordContext out;
		public WordContext out1;
		public WordContext out2;
		public WordContext out3;
		public WordContext out4;
		public WordContext out5;
		public WordContext out6;
		public WordContext out7;
		public Token won;
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
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
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public List<TerminalNode> DATE() { return getTokens(ReceiptParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ReceiptParser.DATE, i);
		}
		public List<TerminalNode> TIME() { return getTokens(ReceiptParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(ReceiptParser.TIME, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ExHipassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exHipass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterExHipass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitExHipass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitExHipass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExHipassContext exHipass() throws RecognitionException {
		ExHipassContext _localctx = new ExHipassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exHipass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(386);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(389); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(391);
			match(TAB);
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				match(WORD);
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(397);
			match(TAB);
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(398);
				match(WORD);
				}
				}
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(403);
			match(TAB);
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(404);
				match(WORD);
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(409);
			match(TAB);
			setState(416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(410);
					match(WORD);
					}
					}
					setState(413); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(415);
				match(TAB);
				}
				}
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(420);
			match(NEWLINE);
			setState(523); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(421);
				match(NUMBER);
				setState(422);
				match(NUMBER);
				setState(423);
				match(NUMBER);
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(424);
					match(NUMBER);
					}
					}
					setState(427); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(429);
				match(TAB);
				setState(430);
				match(NUMBER);
				setState(431);
				match(TAB);
				setState(432);
				((ExHipassContext)_localctx).DATE = match(DATE);
				setState(433);
				((ExHipassContext)_localctx).TIME = match(TIME);
				setState(434);
				match(TAB);
				setState(436); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(435);
					word();
					}
					}
					setState(438); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
				setState(440);
				match(TAB);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(441);
					word();
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447);
				match(TAB);
				setState(449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(448);
					word();
					}
					}
					setState(451); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
				setState(453);
				match(TAB);
				setState(454);
				((ExHipassContext)_localctx).in = word();
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(455);
					((ExHipassContext)_localctx).in1 = word();
					}
					break;
				}
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(458);
					((ExHipassContext)_localctx).in2 = word();
					}
					break;
				}
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(461);
					((ExHipassContext)_localctx).in3 = word();
					}
					break;
				}
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(464);
					((ExHipassContext)_localctx).in4 = word();
					}
					break;
				}
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(467);
					((ExHipassContext)_localctx).in5 = word();
					}
					break;
				}
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(470);
					((ExHipassContext)_localctx).in6 = word();
					}
					break;
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(473);
					((ExHipassContext)_localctx).in7 = word();
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				match(TAB);
				setState(480);
				((ExHipassContext)_localctx).out = word();
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(481);
					((ExHipassContext)_localctx).out1 = word();
					}
					break;
				}
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(484);
					((ExHipassContext)_localctx).out2 = word();
					}
					break;
				}
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(487);
					((ExHipassContext)_localctx).out3 = word();
					}
					break;
				}
				setState(491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(490);
					((ExHipassContext)_localctx).out4 = word();
					}
					break;
				}
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(493);
					((ExHipassContext)_localctx).out5 = word();
					}
					break;
				}
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(496);
					((ExHipassContext)_localctx).out6 = word();
					}
					break;
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(499);
					((ExHipassContext)_localctx).out7 = word();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
				match(TAB);
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(506);
					word();
					}
					}
					setState(509); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
				setState(511);
				match(TAB);
				setState(512);
				((ExHipassContext)_localctx).won = match(WORD);
				setState(513);
				match(TAB);
				setState(515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(514);
					word();
					}
					}
					setState(517); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
				setState(519);
				match(TAB);
				setState(520);
				match(NEWLINE);

							log.info("{} 도로공사 하이패스 『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {}』『{}』", Utility.indentMiddle()
								, (((ExHipassContext)_localctx).DATE!=null?((ExHipassContext)_localctx).DATE.getText():null), (((ExHipassContext)_localctx).TIME!=null?((ExHipassContext)_localctx).TIME.getText():null)
								, (((ExHipassContext)_localctx).out!=null?_input.getText(((ExHipassContext)_localctx).out.start,((ExHipassContext)_localctx).out.stop):null), (((ExHipassContext)_localctx).out1!=null?_input.getText(((ExHipassContext)_localctx).out1.start,((ExHipassContext)_localctx).out1.stop):null), (((ExHipassContext)_localctx).out2!=null?_input.getText(((ExHipassContext)_localctx).out2.start,((ExHipassContext)_localctx).out2.stop):null), (((ExHipassContext)_localctx).out3!=null?_input.getText(((ExHipassContext)_localctx).out3.start,((ExHipassContext)_localctx).out3.stop):null), (((ExHipassContext)_localctx).out4!=null?_input.getText(((ExHipassContext)_localctx).out4.start,((ExHipassContext)_localctx).out4.stop):null), (((ExHipassContext)_localctx).out5!=null?_input.getText(((ExHipassContext)_localctx).out5.start,((ExHipassContext)_localctx).out5.stop):null), (((ExHipassContext)_localctx).out6!=null?_input.getText(((ExHipassContext)_localctx).out6.start,((ExHipassContext)_localctx).out6.stop):null), (((ExHipassContext)_localctx).out7!=null?_input.getText(((ExHipassContext)_localctx).out7.start,((ExHipassContext)_localctx).out7.stop):null)
								, (((ExHipassContext)_localctx).in!=null?_input.getText(((ExHipassContext)_localctx).in.start,((ExHipassContext)_localctx).in.stop):null), (((ExHipassContext)_localctx).in1!=null?_input.getText(((ExHipassContext)_localctx).in1.start,((ExHipassContext)_localctx).in1.stop):null), (((ExHipassContext)_localctx).in2!=null?_input.getText(((ExHipassContext)_localctx).in2.start,((ExHipassContext)_localctx).in2.stop):null), (((ExHipassContext)_localctx).in3!=null?_input.getText(((ExHipassContext)_localctx).in3.start,((ExHipassContext)_localctx).in3.stop):null), (((ExHipassContext)_localctx).in4!=null?_input.getText(((ExHipassContext)_localctx).in4.start,((ExHipassContext)_localctx).in4.stop):null), (((ExHipassContext)_localctx).in5!=null?_input.getText(((ExHipassContext)_localctx).in5.start,((ExHipassContext)_localctx).in5.stop):null), (((ExHipassContext)_localctx).in6!=null?_input.getText(((ExHipassContext)_localctx).in6.start,((ExHipassContext)_localctx).in6.stop):null), (((ExHipassContext)_localctx).in7!=null?_input.getText(((ExHipassContext)_localctx).in7.start,((ExHipassContext)_localctx).in7.stop):null)
								, (((ExHipassContext)_localctx).won!=null?((ExHipassContext)_localctx).won.getText():null)
							);
						
							StatementForm statement = new StatementForm();
							LIST_STATEMENT.add(statement);
							statement.setTime((((ExHipassContext)_localctx).DATE!=null?((ExHipassContext)_localctx).DATE.getText():null), (((ExHipassContext)_localctx).TIME!=null?((ExHipassContext)_localctx).TIME.getText():null));
							statement.setTitle(
								(((ExHipassContext)_localctx).out!=null?_input.getText(((ExHipassContext)_localctx).out.start,((ExHipassContext)_localctx).out.stop):null), (((ExHipassContext)_localctx).out1!=null?_input.getText(((ExHipassContext)_localctx).out1.start,((ExHipassContext)_localctx).out1.stop):null), (((ExHipassContext)_localctx).out2!=null?_input.getText(((ExHipassContext)_localctx).out2.start,((ExHipassContext)_localctx).out2.stop):null), (((ExHipassContext)_localctx).out3!=null?_input.getText(((ExHipassContext)_localctx).out3.start,((ExHipassContext)_localctx).out3.stop):null), (((ExHipassContext)_localctx).out4!=null?_input.getText(((ExHipassContext)_localctx).out4.start,((ExHipassContext)_localctx).out4.stop):null), (((ExHipassContext)_localctx).out5!=null?_input.getText(((ExHipassContext)_localctx).out5.start,((ExHipassContext)_localctx).out5.stop):null), (((ExHipassContext)_localctx).out6!=null?_input.getText(((ExHipassContext)_localctx).out6.start,((ExHipassContext)_localctx).out6.stop):null), (((ExHipassContext)_localctx).out7!=null?_input.getText(((ExHipassContext)_localctx).out7.start,((ExHipassContext)_localctx).out7.stop):null)
								, "⇦"
								, (((ExHipassContext)_localctx).in!=null?_input.getText(((ExHipassContext)_localctx).in.start,((ExHipassContext)_localctx).in.stop):null), (((ExHipassContext)_localctx).in1!=null?_input.getText(((ExHipassContext)_localctx).in1.start,((ExHipassContext)_localctx).in1.stop):null), (((ExHipassContext)_localctx).in2!=null?_input.getText(((ExHipassContext)_localctx).in2.start,((ExHipassContext)_localctx).in2.stop):null), (((ExHipassContext)_localctx).in3!=null?_input.getText(((ExHipassContext)_localctx).in3.start,((ExHipassContext)_localctx).in3.stop):null), (((ExHipassContext)_localctx).in4!=null?_input.getText(((ExHipassContext)_localctx).in4.start,((ExHipassContext)_localctx).in4.stop):null), (((ExHipassContext)_localctx).in5!=null?_input.getText(((ExHipassContext)_localctx).in5.start,((ExHipassContext)_localctx).in5.stop):null), (((ExHipassContext)_localctx).in6!=null?_input.getText(((ExHipassContext)_localctx).in6.start,((ExHipassContext)_localctx).in6.stop):null), (((ExHipassContext)_localctx).in7!=null?_input.getText(((ExHipassContext)_localctx).in7.start,((ExHipassContext)_localctx).in7.stop):null)
							);
							statement.setOutcome((((ExHipassContext)_localctx).won!=null?((ExHipassContext)_localctx).won.getText():null));
							statement.setCategoryName("분류.지출.교통/차량.대중교통비");
						
				}
				}
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(527);
			match(WORD);
			setState(528);
			match(NEWLINE);
			setState(529);
			eof();

				log.info("{} 도로공사 하이패스", Utility.indentMiddle());

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("영수증 일반");

				STATEMENT.setDescription("도로공사 고속도로 통행료 하이패스");
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

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
	public static class HipassContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public TerminalNode NUMBER() { return getToken(ReceiptParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
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
		public List<HipassItemContext> hipassItem() {
			return getRuleContexts(HipassItemContext.class);
		}
		public HipassItemContext hipassItem(int i) {
			return getRuleContext(HipassItemContext.class,i);
		}
		public HipassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hipass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterHipass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitHipass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitHipass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HipassContext hipass() throws RecognitionException {
		HipassContext _localctx = new HipassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hipass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(532);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(537);
			match(WORD);
			setState(538);
			match(WORD);
			setState(539);
			match(NUMBER);
			setState(540);
			match(WORD);
			setState(541);
			match(NEWLINE);
			setState(543); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(542);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(545); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(547);
			match(TAB);
			setState(548);
			match(WORD);
			setState(549);
			match(TAB);
			setState(550);
			match(WORD);
			setState(551);
			match(TAB);
			setState(552);
			match(WORD);
			setState(553);
			match(TAB);
			setState(554);
			match(WORD);
			setState(555);
			match(TAB);
			setState(562); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(556);
					match(WORD);
					}
					}
					setState(559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(561);
				match(TAB);
				}
				}
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(566);
			match(NEWLINE);
			setState(568); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(567);
				hipassItem();
				}
				}
				setState(570); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(572);
			match(WORD);
			setState(573);
			match(NEWLINE);
			setState(574);
			eof();

				log.info("{} 하이패스 자동충전카드", Utility.indentMiddle());

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("하이패스 자동충전카드");

				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

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
	public static class HipassItemContext extends ParserRuleContext {
		public Token sequence;
		public Token cardNumber;
		public Token DATE;
		public Token TIME;
		public Token type;
		public Token before;
		public Token outcome;
		public Token balance;
		public Token producer;
		public Token entrance;
		public Token exit;
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
		}
		public TerminalNode DATE() { return getToken(ReceiptParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public TerminalNode NEWLINE() { return getToken(ReceiptParser.NEWLINE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public HipassItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hipassItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterHipassItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitHipassItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitHipassItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HipassItemContext hipassItem() throws RecognitionException {
		HipassItemContext _localctx = new HipassItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hipassItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(TAB);
			setState(578);
			((HipassItemContext)_localctx).sequence = match(NUMBER);
			setState(579);
			match(TAB);
			setState(580);
			((HipassItemContext)_localctx).cardNumber = match(WORD);
			setState(581);
			match(TAB);
			setState(582);
			((HipassItemContext)_localctx).DATE = match(DATE);
			setState(583);
			((HipassItemContext)_localctx).TIME = match(TIME);
			setState(584);
			match(TAB);
			setState(585);
			((HipassItemContext)_localctx).type = match(WORD);
			setState(586);
			match(TAB);
			setState(587);
			((HipassItemContext)_localctx).before = match(NUMBER);
			setState(588);
			match(TAB);
			setState(589);
			((HipassItemContext)_localctx).outcome = match(NUMBER);
			setState(590);
			match(TAB);
			setState(591);
			((HipassItemContext)_localctx).balance = match(NUMBER);
			setState(592);
			match(TAB);
			setState(593);
			((HipassItemContext)_localctx).producer = match(WORD);
			setState(594);
			match(TAB);
			setState(595);
			((HipassItemContext)_localctx).entrance = match(WORD);
			setState(596);
			match(TAB);
			setState(597);
			((HipassItemContext)_localctx).exit = match(WORD);
			setState(598);
			match(TAB);
			setState(599);
			match(NEWLINE);

				log.info("{} 하이패스 자동충전카드(『{} {}』『{} {}』『{} {}』『{} {}』『{}』『{} {}』)", Utility.indentMiddle()
					, (((HipassItemContext)_localctx).sequence!=null?((HipassItemContext)_localctx).sequence.getText():null), (((HipassItemContext)_localctx).cardNumber!=null?((HipassItemContext)_localctx).cardNumber.getText():null)
					, (((HipassItemContext)_localctx).DATE!=null?((HipassItemContext)_localctx).DATE.getText():null), (((HipassItemContext)_localctx).TIME!=null?((HipassItemContext)_localctx).TIME.getText():null)
					, (((HipassItemContext)_localctx).type!=null?((HipassItemContext)_localctx).type.getText():null), (((HipassItemContext)_localctx).before!=null?((HipassItemContext)_localctx).before.getText():null)
					, (((HipassItemContext)_localctx).outcome!=null?((HipassItemContext)_localctx).outcome.getText():null), (((HipassItemContext)_localctx).balance!=null?((HipassItemContext)_localctx).balance.getText():null)
					, (((HipassItemContext)_localctx).producer!=null?((HipassItemContext)_localctx).producer.getText():null)
					, (((HipassItemContext)_localctx).entrance!=null?((HipassItemContext)_localctx).entrance.getText():null), (((HipassItemContext)_localctx).exit!=null?((HipassItemContext)_localctx).exit.getText():null)
				);

				StatementForm statement = null;
				switch ((((HipassItemContext)_localctx).type!=null?((HipassItemContext)_localctx).type.getText():null)) {
					case "자동충전":
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((HipassItemContext)_localctx).DATE!=null?((HipassItemContext)_localctx).DATE.getText():null), (((HipassItemContext)_localctx).TIME!=null?((HipassItemContext)_localctx).TIME.getText():null));
						statement.setTitle((((HipassItemContext)_localctx).type!=null?((HipassItemContext)_localctx).type.getText():null));
						statement.setDescription((((HipassItemContext)_localctx).before!=null?((HipassItemContext)_localctx).before.getText():null), "+", (((HipassItemContext)_localctx).outcome!=null?((HipassItemContext)_localctx).outcome.getText():null), "=", (((HipassItemContext)_localctx).balance!=null?((HipassItemContext)_localctx).balance.getText():null));
						statement.setIncome((((HipassItemContext)_localctx).outcome!=null?((HipassItemContext)_localctx).outcome.getText():null));
						statement.setBalance((((HipassItemContext)_localctx).balance!=null?((HipassItemContext)_localctx).balance.getText():null));
						statement.setCategoryName("분류.수입.전월이월.이체");
						break;
					default:
						statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTime((((HipassItemContext)_localctx).DATE!=null?((HipassItemContext)_localctx).DATE.getText():null), (((HipassItemContext)_localctx).TIME!=null?((HipassItemContext)_localctx).TIME.getText():null));
						statement.setTitle((((HipassItemContext)_localctx).exit!=null?((HipassItemContext)_localctx).exit.getText():null), "⇦", (((HipassItemContext)_localctx).entrance!=null?((HipassItemContext)_localctx).entrance.getText():null), (((HipassItemContext)_localctx).producer!=null?((HipassItemContext)_localctx).producer.getText():null));
						statement.setDescription((((HipassItemContext)_localctx).before!=null?((HipassItemContext)_localctx).before.getText():null), "-", (((HipassItemContext)_localctx).outcome!=null?((HipassItemContext)_localctx).outcome.getText():null), "=", (((HipassItemContext)_localctx).balance!=null?((HipassItemContext)_localctx).balance.getText():null));
						statement.setOutcome((((HipassItemContext)_localctx).outcome!=null?((HipassItemContext)_localctx).outcome.getText():null));
						statement.setBalance((((HipassItemContext)_localctx).balance!=null?((HipassItemContext)_localctx).balance.getText():null));
						statement.setCategoryName("분류.지출.교통/차량.대중교통비");
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
	public static class ReceiptEMartContext extends ParserRuleContext {
		public WordContext seller;
		public WordContext seller1;
		public WordContext seller2;
		public WordContext seller3;
		public WordContext seller4;
		public WordContext seller5;
		public WordContext seller6;
		public WordContext seller7;
		public Token datestring;
		public Token TIME;
		public Token total;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ReceiptEMartItemContext> receiptEMartItem() {
			return getRuleContexts(ReceiptEMartItemContext.class);
		}
		public ReceiptEMartItemContext receiptEMartItem(int i) {
			return getRuleContext(ReceiptEMartItemContext.class,i);
		}
		public ReceiptEMartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptEMart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptEMart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptEMart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptEMart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptEMartContext receiptEMart() throws RecognitionException {
		ReceiptEMartContext _localctx = new ReceiptEMartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_receiptEMart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			((ReceiptEMartContext)_localctx).seller = word();
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(603);
				((ReceiptEMartContext)_localctx).seller1 = word();
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(606);
				((ReceiptEMartContext)_localctx).seller2 = word();
				}
				break;
			}
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(609);
				((ReceiptEMartContext)_localctx).seller3 = word();
				}
				break;
			}
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(612);
				((ReceiptEMartContext)_localctx).seller4 = word();
				}
				break;
			}
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(615);
				((ReceiptEMartContext)_localctx).seller5 = word();
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(618);
				((ReceiptEMartContext)_localctx).seller6 = word();
				}
				break;
			}
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					((ReceiptEMartContext)_localctx).seller7 = word();
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(627);
			match(WORD);
			setState(628);
			match(NEWLINE);
			setState(630); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(629);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(632); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(634);
			match(WORD);
			setState(635);
			((ReceiptEMartContext)_localctx).datestring = match(WORD);
			setState(636);
			((ReceiptEMartContext)_localctx).TIME = match(TIME);
			setState(637);
			match(WORD);
			setState(638);
			match(NEWLINE);
			setState(639);
			match(WORD);
			setState(640);
			match(NEWLINE);
			setState(641);
			match(WORD);
			setState(642);
			match(WORD);
			setState(643);
			match(WORD);
			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(644);
				match(WORD);
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(649);
			match(NEWLINE);
			setState(650);
			match(WORD);
			setState(651);
			match(NEWLINE);
			setState(653); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(652);
					receiptEMartItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(655); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(658); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(657);
				match(WORD);
				}
				}
				setState(660); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(662);
			match(NUMBER);
			setState(663);
			match(NEWLINE);
			setState(671); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(665); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(664);
						match(WORD);
						}
						}
						setState(667); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WORD );
					setState(669);
					match(NUMBER);
					setState(670);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(673); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(676); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(675);
				match(WORD);
				}
				}
				setState(678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(680);
			((ReceiptEMartContext)_localctx).total = match(NUMBER);
			setState(681);
			match(NEWLINE);
			setState(682);
			match(WORD);
			setState(683);
			match(NEWLINE);
			setState(684);
			eof();

				log.info("{} 이마트 『{} {} {} {} {} {} {} {}』", Utility.indentMiddle()
					, (((ReceiptEMartContext)_localctx).seller!=null?_input.getText(((ReceiptEMartContext)_localctx).seller.start,((ReceiptEMartContext)_localctx).seller.stop):null), (((ReceiptEMartContext)_localctx).seller1!=null?_input.getText(((ReceiptEMartContext)_localctx).seller1.start,((ReceiptEMartContext)_localctx).seller1.stop):null), (((ReceiptEMartContext)_localctx).seller2!=null?_input.getText(((ReceiptEMartContext)_localctx).seller2.start,((ReceiptEMartContext)_localctx).seller2.stop):null), (((ReceiptEMartContext)_localctx).seller3!=null?_input.getText(((ReceiptEMartContext)_localctx).seller3.start,((ReceiptEMartContext)_localctx).seller3.stop):null), (((ReceiptEMartContext)_localctx).seller4!=null?_input.getText(((ReceiptEMartContext)_localctx).seller4.start,((ReceiptEMartContext)_localctx).seller4.stop):null), (((ReceiptEMartContext)_localctx).seller5!=null?_input.getText(((ReceiptEMartContext)_localctx).seller5.start,((ReceiptEMartContext)_localctx).seller5.stop):null), (((ReceiptEMartContext)_localctx).seller6!=null?_input.getText(((ReceiptEMartContext)_localctx).seller6.start,((ReceiptEMartContext)_localctx).seller6.stop):null), (((ReceiptEMartContext)_localctx).seller7!=null?_input.getText(((ReceiptEMartContext)_localctx).seller7.start,((ReceiptEMartContext)_localctx).seller7.stop):null)
				);

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("SSG 이마트 구매 내역");

				STATEMENT.setTime((((ReceiptEMartContext)_localctx).datestring!=null?((ReceiptEMartContext)_localctx).datestring.getText():null).replaceAll(".*\\]", ""), (((ReceiptEMartContext)_localctx).TIME!=null?((ReceiptEMartContext)_localctx).TIME.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle("SSG 이마트 구매 내역");
				statement.setIncome((((ReceiptEMartContext)_localctx).total!=null?((ReceiptEMartContext)_localctx).total.getText():null));
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptEMartItemContext extends ParserRuleContext {
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token unit;
		public Token ea;
		public Token sum;
		public TerminalNode WORD() { return getToken(ReceiptParser.WORD, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public ReceiptEMartItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptEMartItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptEMartItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptEMartItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptEMartItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptEMartItemContext receiptEMartItem() throws RecognitionException {
		ReceiptEMartItemContext _localctx = new ReceiptEMartItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_receiptEMartItem);
		int _la;
		try {
			int _alt;
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(687);
				match(WORD);
				setState(688);
				match(NEWLINE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(689);
				((ReceiptEMartItemContext)_localctx).title = word();
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(690);
					((ReceiptEMartItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(693);
					((ReceiptEMartItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(696);
					((ReceiptEMartItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(699);
					((ReceiptEMartItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(702);
					((ReceiptEMartItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(705);
					((ReceiptEMartItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(708);
					((ReceiptEMartItemContext)_localctx).title7 = word();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714);
				match(NEWLINE);
				setState(715);
				word();
				setState(716);
				((ReceiptEMartItemContext)_localctx).unit = match(NUMBER);
				setState(717);
				((ReceiptEMartItemContext)_localctx).ea = match(NUMBER);
				setState(718);
				((ReceiptEMartItemContext)_localctx).sum = match(NUMBER);
				setState(719);
				match(NEWLINE);
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(721); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(720);
							word();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(723); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(725);
					match(NUMBER);
					setState(726);
					match(NEWLINE);
					}
					break;
				}

						log.info("{} 이마트 『{} {} {} {} {} {} {} {}』『{} {} {}』", Utility.indentMiddle()
							, (((ReceiptEMartItemContext)_localctx).title!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title.start,((ReceiptEMartItemContext)_localctx).title.stop):null), (((ReceiptEMartItemContext)_localctx).title1!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title1.start,((ReceiptEMartItemContext)_localctx).title1.stop):null), (((ReceiptEMartItemContext)_localctx).title2!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title2.start,((ReceiptEMartItemContext)_localctx).title2.stop):null), (((ReceiptEMartItemContext)_localctx).title3!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title3.start,((ReceiptEMartItemContext)_localctx).title3.stop):null), (((ReceiptEMartItemContext)_localctx).title4!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title4.start,((ReceiptEMartItemContext)_localctx).title4.stop):null), (((ReceiptEMartItemContext)_localctx).title5!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title5.start,((ReceiptEMartItemContext)_localctx).title5.stop):null), (((ReceiptEMartItemContext)_localctx).title6!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title6.start,((ReceiptEMartItemContext)_localctx).title6.stop):null), (((ReceiptEMartItemContext)_localctx).title7!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title7.start,((ReceiptEMartItemContext)_localctx).title7.stop):null)
							, (((ReceiptEMartItemContext)_localctx).unit!=null?((ReceiptEMartItemContext)_localctx).unit.getText():null), (((ReceiptEMartItemContext)_localctx).ea!=null?((ReceiptEMartItemContext)_localctx).ea.getText():null), (((ReceiptEMartItemContext)_localctx).sum!=null?((ReceiptEMartItemContext)_localctx).sum.getText():null)
						);

						StatementForm statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTitle((((ReceiptEMartItemContext)_localctx).title!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title.start,((ReceiptEMartItemContext)_localctx).title.stop):null), (((ReceiptEMartItemContext)_localctx).title1!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title1.start,((ReceiptEMartItemContext)_localctx).title1.stop):null), (((ReceiptEMartItemContext)_localctx).title2!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title2.start,((ReceiptEMartItemContext)_localctx).title2.stop):null), (((ReceiptEMartItemContext)_localctx).title3!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title3.start,((ReceiptEMartItemContext)_localctx).title3.stop):null), (((ReceiptEMartItemContext)_localctx).title4!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title4.start,((ReceiptEMartItemContext)_localctx).title4.stop):null), (((ReceiptEMartItemContext)_localctx).title5!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title5.start,((ReceiptEMartItemContext)_localctx).title5.stop):null), (((ReceiptEMartItemContext)_localctx).title6!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title6.start,((ReceiptEMartItemContext)_localctx).title6.stop):null), (((ReceiptEMartItemContext)_localctx).title7!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title7.start,((ReceiptEMartItemContext)_localctx).title7.stop):null));
						statement.setDescription("[노브랜드] ", (((ReceiptEMartItemContext)_localctx).unit!=null?((ReceiptEMartItemContext)_localctx).unit.getText():null), "x", (((ReceiptEMartItemContext)_localctx).ea!=null?((ReceiptEMartItemContext)_localctx).ea.getText():null));
						statement.setOutcome((((ReceiptEMartItemContext)_localctx).sum!=null?((ReceiptEMartItemContext)_localctx).sum.getText():null));
						statement.setCategoryName("분류.지출.식비.주식");
					
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(732);
				((ReceiptEMartItemContext)_localctx).title = word();
				setState(734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(733);
					((ReceiptEMartItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(736);
					((ReceiptEMartItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(739);
					((ReceiptEMartItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(742);
					((ReceiptEMartItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(745);
					((ReceiptEMartItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(748);
					((ReceiptEMartItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(751);
						((ReceiptEMartItemContext)_localctx).title7 = word();
						}
						} 
					}
					setState(756);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				setState(757);
				((ReceiptEMartItemContext)_localctx).unit = match(NUMBER);
				setState(758);
				((ReceiptEMartItemContext)_localctx).ea = match(NUMBER);
				setState(759);
				((ReceiptEMartItemContext)_localctx).sum = match(NUMBER);
				setState(760);
				match(NEWLINE);
				setState(761);
				match(NUMBER);
				setState(762);
				match(NEWLINE);
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(764); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(763);
							word();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(766); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(768);
					match(NUMBER);
					setState(769);
					match(NEWLINE);
					}
					break;
				}

						log.info("{} 이마트 『{} {} {} {} {} {} {} {}』『{} {} {}』", Utility.indentMiddle()
							, (((ReceiptEMartItemContext)_localctx).title!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title.start,((ReceiptEMartItemContext)_localctx).title.stop):null), (((ReceiptEMartItemContext)_localctx).title1!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title1.start,((ReceiptEMartItemContext)_localctx).title1.stop):null), (((ReceiptEMartItemContext)_localctx).title2!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title2.start,((ReceiptEMartItemContext)_localctx).title2.stop):null), (((ReceiptEMartItemContext)_localctx).title3!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title3.start,((ReceiptEMartItemContext)_localctx).title3.stop):null), (((ReceiptEMartItemContext)_localctx).title4!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title4.start,((ReceiptEMartItemContext)_localctx).title4.stop):null), (((ReceiptEMartItemContext)_localctx).title5!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title5.start,((ReceiptEMartItemContext)_localctx).title5.stop):null), (((ReceiptEMartItemContext)_localctx).title6!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title6.start,((ReceiptEMartItemContext)_localctx).title6.stop):null), (((ReceiptEMartItemContext)_localctx).title7!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title7.start,((ReceiptEMartItemContext)_localctx).title7.stop):null)
							, (((ReceiptEMartItemContext)_localctx).unit!=null?((ReceiptEMartItemContext)_localctx).unit.getText():null), (((ReceiptEMartItemContext)_localctx).ea!=null?((ReceiptEMartItemContext)_localctx).ea.getText():null), (((ReceiptEMartItemContext)_localctx).sum!=null?((ReceiptEMartItemContext)_localctx).sum.getText():null)
						);

						StatementForm statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTitle((((ReceiptEMartItemContext)_localctx).title!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title.start,((ReceiptEMartItemContext)_localctx).title.stop):null), (((ReceiptEMartItemContext)_localctx).title1!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title1.start,((ReceiptEMartItemContext)_localctx).title1.stop):null), (((ReceiptEMartItemContext)_localctx).title2!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title2.start,((ReceiptEMartItemContext)_localctx).title2.stop):null), (((ReceiptEMartItemContext)_localctx).title3!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title3.start,((ReceiptEMartItemContext)_localctx).title3.stop):null), (((ReceiptEMartItemContext)_localctx).title4!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title4.start,((ReceiptEMartItemContext)_localctx).title4.stop):null), (((ReceiptEMartItemContext)_localctx).title5!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title5.start,((ReceiptEMartItemContext)_localctx).title5.stop):null), (((ReceiptEMartItemContext)_localctx).title6!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title6.start,((ReceiptEMartItemContext)_localctx).title6.stop):null), (((ReceiptEMartItemContext)_localctx).title7!=null?_input.getText(((ReceiptEMartItemContext)_localctx).title7.start,((ReceiptEMartItemContext)_localctx).title7.stop):null));
						statement.setDescription((((ReceiptEMartItemContext)_localctx).unit!=null?((ReceiptEMartItemContext)_localctx).unit.getText():null), "x", (((ReceiptEMartItemContext)_localctx).ea!=null?((ReceiptEMartItemContext)_localctx).ea.getText():null), "=", (((ReceiptEMartItemContext)_localctx).sum!=null?((ReceiptEMartItemContext)_localctx).sum.getText():null));
						statement.setOutcome((((ReceiptEMartItemContext)_localctx).sum!=null?((ReceiptEMartItemContext)_localctx).sum.getText():null));
						statement.setCategoryName("분류.지출.식비.주식");
					
				}
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
	public static class ReceiptSSgContext extends ParserRuleContext {
		public Token DATE;
		public Token outcome;
		public TerminalNode DATE() { return getToken(ReceiptParser.DATE, 0); }
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public TerminalNode KEYWORD() { return getToken(ReceiptParser.KEYWORD, 0); }
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ReceiptParser.NUMBER, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ReceiptSSgSSgDeliveryContext receiptSSgSSgDelivery() {
			return getRuleContext(ReceiptSSgSSgDeliveryContext.class,0);
		}
		public ReceiptSSgD2DDeliveryContext receiptSSgD2DDelivery() {
			return getRuleContext(ReceiptSSgD2DDeliveryContext.class,0);
		}
		public ReceiptSSgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptSSg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptSSg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptSSg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptSSg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptSSgContext receiptSSg() throws RecognitionException {
		ReceiptSSgContext _localctx = new ReceiptSSgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_receiptSSg);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(777);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(780); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(782);
			((ReceiptSSgContext)_localctx).DATE = match(DATE);
			setState(783);
			match(WORD);
			setState(784);
			match(WORD);
			setState(785);
			match(WORD);
			setState(786);
			match(WORD);
			setState(788); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(787);
				match(WORD);
				}
				}
				setState(790); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(792);
			match(NEWLINE);
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(793);
				receiptSSgSSgDelivery();
				}
				break;
			}
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(796);
				receiptSSgD2DDelivery();
				}
				break;
			}
			setState(800); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(799);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(802); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(804);
			match(KEYWORD);
			setState(805);
			match(NEWLINE);
			setState(806);
			((ReceiptSSgContext)_localctx).outcome = match(NUMBER);
			setState(807);
			match(WORD);
			setState(808);
			match(NEWLINE);
			setState(809);
			match(WORD);
			setState(810);
			match(WORD);
			setState(811);
			match(NEWLINE);
			setState(812);
			eof();

				log.info("{} SSG 이마트몰 영수증 - (『{} {}』 『{} {}』)", Utility.indentMiddle()
					, (((ReceiptSSgContext)_localctx).DATE!=null?((ReceiptSSgContext)_localctx).DATE.getText():null), (((ReceiptSSgContext)_localctx).outcome!=null?((ReceiptSSgContext)_localctx).outcome.getText():null)
				);

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("SSG 이마트 구매 내역");

				STATEMENT.setTime((((ReceiptSSgContext)_localctx).DATE!=null?((ReceiptSSgContext)_localctx).DATE.getText():null));
				STATEMENT.setDescription("SSG 이마트 구매 내역", (((ReceiptSSgContext)_localctx).DATE!=null?((ReceiptSSgContext)_localctx).DATE.getText():null), (((ReceiptSSgContext)_localctx).outcome!=null?((ReceiptSSgContext)_localctx).outcome.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle("SSG 이마트", (((ReceiptSSgContext)_localctx).outcome!=null?((ReceiptSSgContext)_localctx).outcome.getText():null));
				statement.setTime((((ReceiptSSgContext)_localctx).DATE!=null?((ReceiptSSgContext)_localctx).DATE.getText():null));
				statement.setIncome((((ReceiptSSgContext)_localctx).outcome!=null?((ReceiptSSgContext)_localctx).outcome.getText():null));
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptSSgSSgDeliveryContext extends ParserRuleContext {
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token total;
		public Token ea;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
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
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public ReceiptSSgSSgDeliveryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptSSgSSgDelivery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptSSgSSgDelivery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptSSgSSgDelivery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptSSgSSgDelivery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptSSgSSgDeliveryContext receiptSSgSSgDelivery() throws RecognitionException {
		ReceiptSSgSSgDeliveryContext _localctx = new ReceiptSSgSSgDeliveryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_receiptSSgSSgDelivery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(816); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(815);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(818); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(820);
			match(WORD);
			setState(822); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(821);
				word();
				}
				}
				setState(824); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(826);
			match(NEWLINE);
			setState(864); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(827);
				match(TAB);
				setState(828);
				((ReceiptSSgSSgDeliveryContext)_localctx).title = word();
				setState(830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(829);
					((ReceiptSSgSSgDeliveryContext)_localctx).title1 = word();
					}
					break;
				}
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(832);
					((ReceiptSSgSSgDeliveryContext)_localctx).title2 = word();
					}
					break;
				}
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(835);
					((ReceiptSSgSSgDeliveryContext)_localctx).title3 = word();
					}
					break;
				}
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(838);
					((ReceiptSSgSSgDeliveryContext)_localctx).title4 = word();
					}
					break;
				}
				setState(842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(841);
					((ReceiptSSgSSgDeliveryContext)_localctx).title5 = word();
					}
					break;
				}
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(844);
					((ReceiptSSgSSgDeliveryContext)_localctx).title6 = word();
					}
					break;
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(847);
					((ReceiptSSgSSgDeliveryContext)_localctx).title7 = word();
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(853);
				match(TAB);
				setState(854);
				match(WORD);
				setState(855);
				((ReceiptSSgSSgDeliveryContext)_localctx).total = match(NUMBER);
				setState(856);
				match(WORD);
				setState(857);
				match(WORD);
				setState(858);
				((ReceiptSSgSSgDeliveryContext)_localctx).ea = match(NUMBER);
				setState(859);
				match(WORD);
				setState(860);
				match(TAB);
				setState(861);
				match(NEWLINE);

							log.info("{} SSG 이마트몰 쓱배송 적요(『{} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
								, (((ReceiptSSgSSgDeliveryContext)_localctx).title!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title.start,((ReceiptSSgSSgDeliveryContext)_localctx).title.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title1!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title1.start,((ReceiptSSgSSgDeliveryContext)_localctx).title1.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title2!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title2.start,((ReceiptSSgSSgDeliveryContext)_localctx).title2.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title3!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title3.start,((ReceiptSSgSSgDeliveryContext)_localctx).title3.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title4!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title4.start,((ReceiptSSgSSgDeliveryContext)_localctx).title4.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title5!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title5.start,((ReceiptSSgSSgDeliveryContext)_localctx).title5.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title6!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title6.start,((ReceiptSSgSSgDeliveryContext)_localctx).title6.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title7!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title7.start,((ReceiptSSgSSgDeliveryContext)_localctx).title7.stop):null)
								, (((ReceiptSSgSSgDeliveryContext)_localctx).ea!=null?((ReceiptSSgSSgDeliveryContext)_localctx).ea.getText():null), (((ReceiptSSgSSgDeliveryContext)_localctx).total!=null?((ReceiptSSgSSgDeliveryContext)_localctx).total.getText():null));
						
							StatementForm statement = new StatementForm();
							LIST_STATEMENT.add(statement);
							statement.setTitle((((ReceiptSSgSSgDeliveryContext)_localctx).title!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title.start,((ReceiptSSgSSgDeliveryContext)_localctx).title.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title1!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title1.start,((ReceiptSSgSSgDeliveryContext)_localctx).title1.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title2!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title2.start,((ReceiptSSgSSgDeliveryContext)_localctx).title2.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title3!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title3.start,((ReceiptSSgSSgDeliveryContext)_localctx).title3.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title4!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title4.start,((ReceiptSSgSSgDeliveryContext)_localctx).title4.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title5!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title5.start,((ReceiptSSgSSgDeliveryContext)_localctx).title5.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title6!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title6.start,((ReceiptSSgSSgDeliveryContext)_localctx).title6.stop):null), (((ReceiptSSgSSgDeliveryContext)_localctx).title7!=null?_input.getText(((ReceiptSSgSSgDeliveryContext)_localctx).title7.start,((ReceiptSSgSSgDeliveryContext)_localctx).title7.stop):null));
							statement.setDescription((((ReceiptSSgSSgDeliveryContext)_localctx).ea!=null?((ReceiptSSgSSgDeliveryContext)_localctx).ea.getText():null));
							statement.setOutcome((((ReceiptSSgSSgDeliveryContext)_localctx).total!=null?((ReceiptSSgSSgDeliveryContext)_localctx).total.getText():null));
							statement.setCategoryName("분류.지출.식비.주식");
						
				}
				}
				setState(866); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(868);
			match(WORD);
			setState(870); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(869);
				word();
				}
				}
				setState(872); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(874);
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
	public static class ReceiptSSgD2DDeliveryContext extends ParserRuleContext {
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token total;
		public Token ea;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
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
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public ReceiptSSgD2DDeliveryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptSSgD2DDelivery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptSSgD2DDelivery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptSSgD2DDelivery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptSSgD2DDelivery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptSSgD2DDeliveryContext receiptSSgD2DDelivery() throws RecognitionException {
		ReceiptSSgD2DDeliveryContext _localctx = new ReceiptSSgD2DDeliveryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_receiptSSgD2DDelivery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(876);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(879); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(881);
			match(WORD);
			setState(883); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(882);
				word();
				}
				}
				setState(885); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(887);
			match(NEWLINE);
			setState(930); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(888);
				match(TAB);
				setState(889);
				((ReceiptSSgD2DDeliveryContext)_localctx).title = word();
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(890);
					((ReceiptSSgD2DDeliveryContext)_localctx).title1 = word();
					}
					break;
				}
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(893);
					((ReceiptSSgD2DDeliveryContext)_localctx).title2 = word();
					}
					break;
				}
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(896);
					((ReceiptSSgD2DDeliveryContext)_localctx).title3 = word();
					}
					break;
				}
				setState(900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(899);
					((ReceiptSSgD2DDeliveryContext)_localctx).title4 = word();
					}
					break;
				}
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(902);
					((ReceiptSSgD2DDeliveryContext)_localctx).title5 = word();
					}
					break;
				}
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(905);
					((ReceiptSSgD2DDeliveryContext)_localctx).title6 = word();
					}
					break;
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(908);
					((ReceiptSSgD2DDeliveryContext)_localctx).title7 = word();
					}
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(914);
				match(TAB);
				setState(915);
				match(WORD);
				setState(916);
				((ReceiptSSgD2DDeliveryContext)_localctx).total = match(NUMBER);
				setState(917);
				match(WORD);
				setState(918);
				match(WORD);
				setState(919);
				match(NUMBER);
				setState(920);
				match(WORD);
				setState(921);
				match(WORD);
				setState(922);
				match(WORD);
				setState(923);
				match(WORD);
				setState(924);
				((ReceiptSSgD2DDeliveryContext)_localctx).ea = match(NUMBER);
				setState(925);
				match(WORD);
				setState(926);
				match(TAB);
				setState(927);
				match(NEWLINE);

							log.info("{} SSG 이마트몰 택배배송 적요(『{} {} {} {} {} {} {} {}』 『{} {}』)", Utility.indentMiddle()
								, (((ReceiptSSgD2DDeliveryContext)_localctx).title!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title.start,((ReceiptSSgD2DDeliveryContext)_localctx).title.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title1!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title1.start,((ReceiptSSgD2DDeliveryContext)_localctx).title1.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title2!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title2.start,((ReceiptSSgD2DDeliveryContext)_localctx).title2.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title3!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title3.start,((ReceiptSSgD2DDeliveryContext)_localctx).title3.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title4!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title4.start,((ReceiptSSgD2DDeliveryContext)_localctx).title4.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title5!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title5.start,((ReceiptSSgD2DDeliveryContext)_localctx).title5.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title6!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title6.start,((ReceiptSSgD2DDeliveryContext)_localctx).title6.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title7!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title7.start,((ReceiptSSgD2DDeliveryContext)_localctx).title7.stop):null)
								, (((ReceiptSSgD2DDeliveryContext)_localctx).ea!=null?((ReceiptSSgD2DDeliveryContext)_localctx).ea.getText():null), (((ReceiptSSgD2DDeliveryContext)_localctx).total!=null?((ReceiptSSgD2DDeliveryContext)_localctx).total.getText():null));
							StatementForm statement = new StatementForm();
							LIST_STATEMENT.add(statement);
							statement.setTitle((((ReceiptSSgD2DDeliveryContext)_localctx).title!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title.start,((ReceiptSSgD2DDeliveryContext)_localctx).title.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title1!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title1.start,((ReceiptSSgD2DDeliveryContext)_localctx).title1.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title2!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title2.start,((ReceiptSSgD2DDeliveryContext)_localctx).title2.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title3!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title3.start,((ReceiptSSgD2DDeliveryContext)_localctx).title3.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title4!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title4.start,((ReceiptSSgD2DDeliveryContext)_localctx).title4.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title5!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title5.start,((ReceiptSSgD2DDeliveryContext)_localctx).title5.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title6!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title6.start,((ReceiptSSgD2DDeliveryContext)_localctx).title6.stop):null), (((ReceiptSSgD2DDeliveryContext)_localctx).title7!=null?_input.getText(((ReceiptSSgD2DDeliveryContext)_localctx).title7.start,((ReceiptSSgD2DDeliveryContext)_localctx).title7.stop):null));
							statement.setDescription((((ReceiptSSgD2DDeliveryContext)_localctx).ea!=null?((ReceiptSSgD2DDeliveryContext)_localctx).ea.getText():null));
							statement.setOutcome((((ReceiptSSgD2DDeliveryContext)_localctx).total!=null?((ReceiptSSgD2DDeliveryContext)_localctx).total.getText():null));
							statement.setCategoryName("분류.지출.식비.주식");
						
				}
				}
				setState(932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(934);
			match(WORD);
			setState(935);
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
	public static class ReceiptDureSupplyHistoryDetailContext extends ParserRuleContext {
		public Token date;
		public Token time;
		public Token oamount;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> DATE() { return getTokens(ReceiptParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ReceiptParser.DATE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
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
		public List<ReceiptDureSupplyHistoryDetailItemContext> receiptDureSupplyHistoryDetailItem() {
			return getRuleContexts(ReceiptDureSupplyHistoryDetailItemContext.class);
		}
		public ReceiptDureSupplyHistoryDetailItemContext receiptDureSupplyHistoryDetailItem(int i) {
			return getRuleContext(ReceiptDureSupplyHistoryDetailItemContext.class,i);
		}
		public ReceiptDureSupplyHistoryDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptDureSupplyHistoryDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptDureSupplyHistoryDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptDureSupplyHistoryDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptDureSupplyHistoryDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptDureSupplyHistoryDetailContext receiptDureSupplyHistoryDetail() throws RecognitionException {
		ReceiptDureSupplyHistoryDetailContext _localctx = new ReceiptDureSupplyHistoryDetailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_receiptDureSupplyHistoryDetail);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(938); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(937);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(940); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(943); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(942);
					word();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(945); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(947);
			((ReceiptDureSupplyHistoryDetailContext)_localctx).date = match(DATE);
			setState(948);
			((ReceiptDureSupplyHistoryDetailContext)_localctx).time = match(TIME);
			setState(949);
			match(WORD);
			setState(950);
			match(DATE);
			setState(952); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(951);
				word();
				}
				}
				setState(954); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(956);
			match(NEWLINE);
			setState(957);
			match(WORD);
			setState(958);
			match(WORD);
			setState(959);
			match(NEWLINE);
			setState(961); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(960);
					receiptDureSupplyHistoryDetailItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(963); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(965);
			match(WORD);
			setState(966);
			match(WORD);
			setState(967);
			match(NEWLINE);
			setState(968);
			((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount = match(WORD);
			setState(969);
			match(NEWLINE);
			setState(970);
			eof();

				log.info("{} 영수증::두레생협 구매 내역(『{} {} {}』)", Utility.indentMiddle()
					, (((ReceiptDureSupplyHistoryDetailContext)_localctx).date!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).date.getText():null), (((ReceiptDureSupplyHistoryDetailContext)_localctx).time!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).time.getText():null), (((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount.getText():null)
				);

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("두레생협 구매 내역");

				STATEMENT.setTime((((ReceiptDureSupplyHistoryDetailContext)_localctx).date!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).date.getText():null), (((ReceiptDureSupplyHistoryDetailContext)_localctx).time!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).time.getText():null));
				STATEMENT.setDescription("[두레생협]", (((ReceiptDureSupplyHistoryDetailContext)_localctx).date!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).date.getText():null), (((ReceiptDureSupplyHistoryDetailContext)_localctx).time!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).time.getText():null), (((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount.getText():null).replaceAll("[^0-9,]", ""));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle("[두레생협]", (((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount.getText():null).replaceAll("[^0-9,]", ""));
				statement.setTime((((ReceiptDureSupplyHistoryDetailContext)_localctx).date!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).date.getText():null), (((ReceiptDureSupplyHistoryDetailContext)_localctx).time!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).time.getText():null));
				statement.setIncome((((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount!=null?((ReceiptDureSupplyHistoryDetailContext)_localctx).oamount.getText():null));
				statement.setDescription("[두레생협]");
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptDureSupplyHistoryDetailItemContext extends ParserRuleContext {
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token unit;
		public Token ea;
		public Token amount;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public TerminalNode NEWLINE() { return getToken(ReceiptParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public ReceiptDureSupplyHistoryDetailItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptDureSupplyHistoryDetailItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptDureSupplyHistoryDetailItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptDureSupplyHistoryDetailItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptDureSupplyHistoryDetailItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptDureSupplyHistoryDetailItemContext receiptDureSupplyHistoryDetailItem() throws RecognitionException {
		ReceiptDureSupplyHistoryDetailItemContext _localctx = new ReceiptDureSupplyHistoryDetailItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_receiptDureSupplyHistoryDetailItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title = word();
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(974);
				((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title1 = word();
				}
				break;
			}
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(977);
				((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title2 = word();
				}
				break;
			}
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(980);
				((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title3 = word();
				}
				break;
			}
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(983);
				((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title4 = word();
				}
				break;
			}
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(986);
				((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title5 = word();
				}
				break;
			}
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(989);
				((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title6 = word();
				}
				break;
			}
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(992);
					((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title7 = word();
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(998);
			match(WORD);
			setState(999);
			((ReceiptDureSupplyHistoryDetailItemContext)_localctx).unit = match(NUMBER);
			setState(1001); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1000);
				match(WORD);
				}
				}
				setState(1003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1005);
			((ReceiptDureSupplyHistoryDetailItemContext)_localctx).ea = match(NUMBER);
			setState(1007); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1006);
				match(WORD);
				}
				}
				setState(1009); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1011);
			((ReceiptDureSupplyHistoryDetailItemContext)_localctx).amount = match(NUMBER);
			setState(1013); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1012);
				match(WORD);
				}
				}
				setState(1015); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1017);
			match(NEWLINE);

				log.info("{} 영수증::두레생협 구매 내역(『{} {} {} {} {} {} {}』『{} {} {}』)", Utility.indentMiddle()
					, (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title1!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title1.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title1.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title2!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title2.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title2.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title3!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title3.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title3.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title4!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title4.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title4.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title5!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title5.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title5.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title6!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title6.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title6.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title7!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title7.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title7.stop):null)
					, (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).unit!=null?((ReceiptDureSupplyHistoryDetailItemContext)_localctx).unit.getText():null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).ea!=null?((ReceiptDureSupplyHistoryDetailItemContext)_localctx).ea.getText():null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).amount!=null?((ReceiptDureSupplyHistoryDetailItemContext)_localctx).amount.getText():null)
				);
				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle((((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title1!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title1.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title1.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title2!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title2.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title2.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title3!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title3.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title3.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title4!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title4.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title4.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title5!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title5.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title5.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title6!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title6.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title6.stop):null), (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title7!=null?_input.getText(((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title7.start,((ReceiptDureSupplyHistoryDetailItemContext)_localctx).title7.stop):null));
				statement.setOutcome((((ReceiptDureSupplyHistoryDetailItemContext)_localctx).amount!=null?((ReceiptDureSupplyHistoryDetailItemContext)_localctx).amount.getText():null));
				statement.setDescription((((ReceiptDureSupplyHistoryDetailItemContext)_localctx).unit!=null?((ReceiptDureSupplyHistoryDetailItemContext)_localctx).unit.getText():null), "x", (((ReceiptDureSupplyHistoryDetailItemContext)_localctx).ea!=null?((ReceiptDureSupplyHistoryDetailItemContext)_localctx).ea.getText():null));
				statement.setCategoryName("분류.지출.식비.주식");

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
	public static class ReceiptICoorpHtmlContext extends ParserRuleContext {
		public Token date;
		public Token time;
		public Token key1;
		public Token value1;
		public Token amount;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<TerminalNode> DATE() { return getTokens(ReceiptParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ReceiptParser.DATE, i);
		}
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public TerminalNode NUMBER() { return getToken(ReceiptParser.NUMBER, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ReceiptICoorpHtmlSummaryContext> receiptICoorpHtmlSummary() {
			return getRuleContexts(ReceiptICoorpHtmlSummaryContext.class);
		}
		public ReceiptICoorpHtmlSummaryContext receiptICoorpHtmlSummary(int i) {
			return getRuleContext(ReceiptICoorpHtmlSummaryContext.class,i);
		}
		public List<ReceiptICoorpHtmlItemContext> receiptICoorpHtmlItem() {
			return getRuleContexts(ReceiptICoorpHtmlItemContext.class);
		}
		public ReceiptICoorpHtmlItemContext receiptICoorpHtmlItem(int i) {
			return getRuleContext(ReceiptICoorpHtmlItemContext.class,i);
		}
		public ReceiptICoorpHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptICoorpHtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptICoorpHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptICoorpHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptICoorpHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptICoorpHtmlContext receiptICoorpHtml() throws RecognitionException {
		ReceiptICoorpHtmlContext _localctx = new ReceiptICoorpHtmlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_receiptICoorpHtml);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1020);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1023); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1025);
			match(WORD);
			setState(1026);
			((ReceiptICoorpHtmlContext)_localctx).date = match(DATE);
			setState(1027);
			((ReceiptICoorpHtmlContext)_localctx).time = match(TIME);
			setState(1028);
			((ReceiptICoorpHtmlContext)_localctx).key1 = match(WORD);
			setState(1029);
			((ReceiptICoorpHtmlContext)_localctx).value1 = match(DATE);
			setState(1031); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1030);
				match(WORD);
				}
				}
				setState(1033); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1035);
			((ReceiptICoorpHtmlContext)_localctx).amount = match(NUMBER);
			setState(1037); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1036);
				match(WORD);
				}
				}
				setState(1039); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1041);
			match(NEWLINE);
			setState(1042);
			match(WORD);
			setState(1043);
			match(WORD);
			setState(1044);
			match(NEWLINE);
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1045);
				receiptICoorpHtmlSummary();
				setState(1047); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1046);
					receiptICoorpHtmlSummary();
					}
					}
					setState(1049); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(1051);
				match(NEWLINE);
				}
				break;
			}
			setState(1055);
			match(WORD);
			setState(1056);
			match(WORD);
			setState(1057);
			match(NEWLINE);
			setState(1059); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1058);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1061); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1064); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1063);
				match(WORD);
				}
				}
				setState(1066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1068);
			match(NEWLINE);
			setState(1070); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1069);
					receiptICoorpHtmlItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1072); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1075); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1074);
				match(WORD);
				}
				}
				setState(1077); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1079);
			match(NEWLINE);
			setState(1080);
			eof();

				log.info("{} receipt html 생협 parsing done! - (『{} {} {}』 『{} {}』)", Utility.indentMiddle()
					, (((ReceiptICoorpHtmlContext)_localctx).date!=null?((ReceiptICoorpHtmlContext)_localctx).date.getText():null), (((ReceiptICoorpHtmlContext)_localctx).time!=null?((ReceiptICoorpHtmlContext)_localctx).time.getText():null), (((ReceiptICoorpHtmlContext)_localctx).amount!=null?((ReceiptICoorpHtmlContext)_localctx).amount.getText():null)
					, (((ReceiptICoorpHtmlContext)_localctx).key1!=null?((ReceiptICoorpHtmlContext)_localctx).key1.getText():null), (((ReceiptICoorpHtmlContext)_localctx).value1!=null?((ReceiptICoorpHtmlContext)_localctx).value1.getText():null)
				);

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("두레생협 구매 내역");

				STATEMENT.setTime((((ReceiptICoorpHtmlContext)_localctx).date!=null?((ReceiptICoorpHtmlContext)_localctx).date.getText():null), (((ReceiptICoorpHtmlContext)_localctx).time!=null?((ReceiptICoorpHtmlContext)_localctx).time.getText():null));
				STATEMENT.setDescription("두레생협 영수증", (((ReceiptICoorpHtmlContext)_localctx).date!=null?((ReceiptICoorpHtmlContext)_localctx).date.getText():null), (((ReceiptICoorpHtmlContext)_localctx).time!=null?((ReceiptICoorpHtmlContext)_localctx).time.getText():null), (((ReceiptICoorpHtmlContext)_localctx).amount!=null?((ReceiptICoorpHtmlContext)_localctx).amount.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle("두레생협(온라인)", (((ReceiptICoorpHtmlContext)_localctx).amount!=null?((ReceiptICoorpHtmlContext)_localctx).amount.getText():null));
				statement.setTime((((ReceiptICoorpHtmlContext)_localctx).date!=null?((ReceiptICoorpHtmlContext)_localctx).date.getText():null), (((ReceiptICoorpHtmlContext)_localctx).time!=null?((ReceiptICoorpHtmlContext)_localctx).time.getText():null));
				statement.setIncome((((ReceiptICoorpHtmlContext)_localctx).amount!=null?((ReceiptICoorpHtmlContext)_localctx).amount.getText():null));
				statement.setDescription((((ReceiptICoorpHtmlContext)_localctx).key1!=null?((ReceiptICoorpHtmlContext)_localctx).key1.getText():null), (((ReceiptICoorpHtmlContext)_localctx).value1!=null?((ReceiptICoorpHtmlContext)_localctx).value1.getText():null));
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptICoorpHtmlSummaryContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public ReceiptICoorpHtmlSummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptICoorpHtmlSummary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptICoorpHtmlSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptICoorpHtmlSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptICoorpHtmlSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptICoorpHtmlSummaryContext receiptICoorpHtmlSummary() throws RecognitionException {
		ReceiptICoorpHtmlSummaryContext _localctx = new ReceiptICoorpHtmlSummaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_receiptICoorpHtmlSummary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			((ReceiptICoorpHtmlSummaryContext)_localctx).key = match(WORD);
			setState(1084);
			((ReceiptICoorpHtmlSummaryContext)_localctx).value = match(WORD);

				log.info("{} 두레생협 요약 (『{} {}』)", Utility.indentMiddle(), (((ReceiptICoorpHtmlSummaryContext)_localctx).key!=null?((ReceiptICoorpHtmlSummaryContext)_localctx).key.getText():null), (((ReceiptICoorpHtmlSummaryContext)_localctx).value!=null?((ReceiptICoorpHtmlSummaryContext)_localctx).value.getText():null));

				if ((((ReceiptICoorpHtmlSummaryContext)_localctx).value!=null?((ReceiptICoorpHtmlSummaryContext)_localctx).value.getText():null) != null && !(((ReceiptICoorpHtmlSummaryContext)_localctx).value!=null?((ReceiptICoorpHtmlSummaryContext)_localctx).value.getText():null).startsWith("0")) {
					StatementForm statement = new StatementForm();
					LIST_STATEMENT.add(statement);
					statement.setTitle((((ReceiptICoorpHtmlSummaryContext)_localctx).key!=null?((ReceiptICoorpHtmlSummaryContext)_localctx).key.getText():null));
					statement.setOutcome((((ReceiptICoorpHtmlSummaryContext)_localctx).value!=null?((ReceiptICoorpHtmlSummaryContext)_localctx).value.getText():null));
					statement.setCategoryName("분류.지출.이체/대체.기타");
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
	public static class ReceiptICoorpHtmlItemContext extends ParserRuleContext {
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token outcome;
		public Token ea;
		public Token unit;
		public Token total;
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
		}
		public TerminalNode NEWLINE() { return getToken(ReceiptParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public ReceiptICoorpHtmlItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptICoorpHtmlItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptICoorpHtmlItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptICoorpHtmlItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptICoorpHtmlItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptICoorpHtmlItemContext receiptICoorpHtmlItem() throws RecognitionException {
		ReceiptICoorpHtmlItemContext _localctx = new ReceiptICoorpHtmlItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_receiptICoorpHtmlItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				{
				setState(1087);
				((ReceiptICoorpHtmlItemContext)_localctx).title = word();
				setState(1089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1088);
					((ReceiptICoorpHtmlItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(1092);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1091);
					((ReceiptICoorpHtmlItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(1095);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1094);
					((ReceiptICoorpHtmlItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1097);
					((ReceiptICoorpHtmlItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(1101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1100);
					((ReceiptICoorpHtmlItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(1104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1103);
					((ReceiptICoorpHtmlItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(1109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1106);
						((ReceiptICoorpHtmlItemContext)_localctx).title7 = word();
						}
						} 
					}
					setState(1111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1112);
				((ReceiptICoorpHtmlItemContext)_localctx).outcome = match(WORD);
				setState(1113);
				match(WORD);
				setState(1114);
				((ReceiptICoorpHtmlItemContext)_localctx).ea = match(NUMBER);
				setState(1115);
				((ReceiptICoorpHtmlItemContext)_localctx).unit = match(WORD);
				setState(1116);
				match(TAB);
				setState(1117);
				match(TAB);
				setState(1118);
				match(TAB);
				setState(1119);
				match(TAB);
				setState(1120);
				match(NEWLINE);

						log.info("{} receipt html 생협적요(『{} {} {} {} {} {} {} {}』 『{} {} {}』)", Utility.indentMiddle()
							, (((ReceiptICoorpHtmlItemContext)_localctx).title!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title.start,((ReceiptICoorpHtmlItemContext)_localctx).title.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title1!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title1.start,((ReceiptICoorpHtmlItemContext)_localctx).title1.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title2!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title2.start,((ReceiptICoorpHtmlItemContext)_localctx).title2.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title3!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title3.start,((ReceiptICoorpHtmlItemContext)_localctx).title3.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title4!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title4.start,((ReceiptICoorpHtmlItemContext)_localctx).title4.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title5!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title5.start,((ReceiptICoorpHtmlItemContext)_localctx).title5.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title6!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title6.start,((ReceiptICoorpHtmlItemContext)_localctx).title6.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title7!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title7.start,((ReceiptICoorpHtmlItemContext)_localctx).title7.stop):null)
							, (((ReceiptICoorpHtmlItemContext)_localctx).ea!=null?((ReceiptICoorpHtmlItemContext)_localctx).ea.getText():null), (((ReceiptICoorpHtmlItemContext)_localctx).unit!=null?((ReceiptICoorpHtmlItemContext)_localctx).unit.getText():null), (((ReceiptICoorpHtmlItemContext)_localctx).total!=null?((ReceiptICoorpHtmlItemContext)_localctx).total.getText():null));
					
						StatementForm statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTitle((((ReceiptICoorpHtmlItemContext)_localctx).title!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title.start,((ReceiptICoorpHtmlItemContext)_localctx).title.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title1!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title1.start,((ReceiptICoorpHtmlItemContext)_localctx).title1.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title2!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title2.start,((ReceiptICoorpHtmlItemContext)_localctx).title2.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title3!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title3.start,((ReceiptICoorpHtmlItemContext)_localctx).title3.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title4!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title4.start,((ReceiptICoorpHtmlItemContext)_localctx).title4.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title5!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title5.start,((ReceiptICoorpHtmlItemContext)_localctx).title5.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title6!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title6.start,((ReceiptICoorpHtmlItemContext)_localctx).title6.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title7!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title7.start,((ReceiptICoorpHtmlItemContext)_localctx).title7.stop):null));
						statement.setDescription((((ReceiptICoorpHtmlItemContext)_localctx).outcome!=null?((ReceiptICoorpHtmlItemContext)_localctx).outcome.getText():null), (((ReceiptICoorpHtmlItemContext)_localctx).ea!=null?((ReceiptICoorpHtmlItemContext)_localctx).ea.getText():null), (((ReceiptICoorpHtmlItemContext)_localctx).unit!=null?((ReceiptICoorpHtmlItemContext)_localctx).unit.getText():null));
						statement.setOutcome(0);
						statement.setCategoryName("분류.지출.식비.주식");
					
				}
				}
				break;
			case 2:
				{
				{
				setState(1123);
				((ReceiptICoorpHtmlItemContext)_localctx).title = word();
				setState(1125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1124);
					((ReceiptICoorpHtmlItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(1128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1127);
					((ReceiptICoorpHtmlItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(1131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1130);
					((ReceiptICoorpHtmlItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1133);
					((ReceiptICoorpHtmlItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1136);
					((ReceiptICoorpHtmlItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(1140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1139);
					((ReceiptICoorpHtmlItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1142);
						((ReceiptICoorpHtmlItemContext)_localctx).title7 = word();
						}
						} 
					}
					setState(1147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				setState(1148);
				((ReceiptICoorpHtmlItemContext)_localctx).unit = match(NUMBER);
				setState(1149);
				match(WORD);
				setState(1150);
				match(WORD);
				setState(1151);
				((ReceiptICoorpHtmlItemContext)_localctx).ea = match(NUMBER);
				setState(1152);
				match(WORD);
				setState(1153);
				match(TAB);
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1154);
					match(NUMBER);
					}
				}

				setState(1157);
				match(TAB);
				setState(1158);
				((ReceiptICoorpHtmlItemContext)_localctx).total = match(NUMBER);
				setState(1159);
				match(WORD);
				setState(1160);
				match(TAB);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(1161);
					match(WORD);
					}
				}

				setState(1164);
				match(TAB);
				setState(1165);
				match(NEWLINE);

						log.info("{} receipt html 생협적요(『{} {} {} {} {} {} {} {}』 『{} {} {}』)", Utility.indentMiddle()
							, (((ReceiptICoorpHtmlItemContext)_localctx).title!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title.start,((ReceiptICoorpHtmlItemContext)_localctx).title.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title1!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title1.start,((ReceiptICoorpHtmlItemContext)_localctx).title1.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title2!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title2.start,((ReceiptICoorpHtmlItemContext)_localctx).title2.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title3!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title3.start,((ReceiptICoorpHtmlItemContext)_localctx).title3.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title4!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title4.start,((ReceiptICoorpHtmlItemContext)_localctx).title4.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title5!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title5.start,((ReceiptICoorpHtmlItemContext)_localctx).title5.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title6!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title6.start,((ReceiptICoorpHtmlItemContext)_localctx).title6.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title7!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title7.start,((ReceiptICoorpHtmlItemContext)_localctx).title7.stop):null)
							, (((ReceiptICoorpHtmlItemContext)_localctx).ea!=null?((ReceiptICoorpHtmlItemContext)_localctx).ea.getText():null), (((ReceiptICoorpHtmlItemContext)_localctx).unit!=null?((ReceiptICoorpHtmlItemContext)_localctx).unit.getText():null), (((ReceiptICoorpHtmlItemContext)_localctx).total!=null?((ReceiptICoorpHtmlItemContext)_localctx).total.getText():null));
					
						StatementForm statement = new StatementForm();
						LIST_STATEMENT.add(statement);
						statement.setTitle((((ReceiptICoorpHtmlItemContext)_localctx).title!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title.start,((ReceiptICoorpHtmlItemContext)_localctx).title.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title1!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title1.start,((ReceiptICoorpHtmlItemContext)_localctx).title1.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title2!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title2.start,((ReceiptICoorpHtmlItemContext)_localctx).title2.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title3!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title3.start,((ReceiptICoorpHtmlItemContext)_localctx).title3.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title4!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title4.start,((ReceiptICoorpHtmlItemContext)_localctx).title4.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title5!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title5.start,((ReceiptICoorpHtmlItemContext)_localctx).title5.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title6!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title6.start,((ReceiptICoorpHtmlItemContext)_localctx).title6.stop):null), (((ReceiptICoorpHtmlItemContext)_localctx).title7!=null?_input.getText(((ReceiptICoorpHtmlItemContext)_localctx).title7.start,((ReceiptICoorpHtmlItemContext)_localctx).title7.stop):null));
						statement.setDescription((((ReceiptICoorpHtmlItemContext)_localctx).unit!=null?((ReceiptICoorpHtmlItemContext)_localctx).unit.getText():null) + "x", (((ReceiptICoorpHtmlItemContext)_localctx).ea!=null?((ReceiptICoorpHtmlItemContext)_localctx).ea.getText():null), "=", (((ReceiptICoorpHtmlItemContext)_localctx).total!=null?((ReceiptICoorpHtmlItemContext)_localctx).total.getText():null));
						statement.setOutcome((((ReceiptICoorpHtmlItemContext)_localctx).total!=null?((ReceiptICoorpHtmlItemContext)_localctx).total.getText():null));
						statement.setCategoryName("분류.지출.식비.주식");
					
				}
				}
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
	public static class ReceiptStandardContext extends ParserRuleContext {
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public Token DATE;
		public Token TIME;
		public Token NUMBER;
		public TerminalNode DATE() { return getToken(ReceiptParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public TerminalNode NUMBER() { return getToken(ReceiptParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ReceiptStandardItemContext> receiptStandardItem() {
			return getRuleContexts(ReceiptStandardItemContext.class);
		}
		public ReceiptStandardItemContext receiptStandardItem(int i) {
			return getRuleContext(ReceiptStandardItemContext.class,i);
		}
		public ReceiptStandardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptStandard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptStandard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptStandard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptStandard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptStandardContext receiptStandard() throws RecognitionException {
		ReceiptStandardContext _localctx = new ReceiptStandardContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_receiptStandard);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1170);
					line();
					}
					} 
				}
				setState(1175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			setState(1176);
			((ReceiptStandardContext)_localctx).title1 = word();
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1177);
				((ReceiptStandardContext)_localctx).title2 = word();
				}
				break;
			}
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1180);
				((ReceiptStandardContext)_localctx).title3 = word();
				}
				break;
			}
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1183);
				((ReceiptStandardContext)_localctx).title4 = word();
				}
				break;
			}
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1186);
				((ReceiptStandardContext)_localctx).title5 = word();
				}
				break;
			}
			setState(1189);
			((ReceiptStandardContext)_localctx).DATE = match(DATE);
			setState(1190);
			((ReceiptStandardContext)_localctx).TIME = match(TIME);
			setState(1191);
			((ReceiptStandardContext)_localctx).NUMBER = match(NUMBER);
			setState(1192);
			match(NEWLINE);
			setState(1196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1193);
					line();
					}
					} 
				}
				setState(1198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			setState(1199);
			match(WORD);
			setState(1200);
			match(WORD);
			setState(1202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1201);
				match(WORD);
				}
				}
				setState(1204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1206);
			match(NEWLINE);
			setState(1208); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1207);
					receiptStandardItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1212);
			eof();

				log.info("{} receipt표준 parsing done! - (『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)"
					, Utility.indentMiddle(), (((ReceiptStandardContext)_localctx).title1!=null?_input.getText(((ReceiptStandardContext)_localctx).title1.start,((ReceiptStandardContext)_localctx).title1.stop):null), (((ReceiptStandardContext)_localctx).title2!=null?_input.getText(((ReceiptStandardContext)_localctx).title2.start,((ReceiptStandardContext)_localctx).title2.stop):null), (((ReceiptStandardContext)_localctx).title3!=null?_input.getText(((ReceiptStandardContext)_localctx).title3.start,((ReceiptStandardContext)_localctx).title3.stop):null), (((ReceiptStandardContext)_localctx).title4!=null?_input.getText(((ReceiptStandardContext)_localctx).title4.start,((ReceiptStandardContext)_localctx).title4.stop):null), (((ReceiptStandardContext)_localctx).title5!=null?_input.getText(((ReceiptStandardContext)_localctx).title5.start,((ReceiptStandardContext)_localctx).title5.stop):null), (((ReceiptStandardContext)_localctx).DATE!=null?((ReceiptStandardContext)_localctx).DATE.getText():null), (((ReceiptStandardContext)_localctx).TIME!=null?((ReceiptStandardContext)_localctx).TIME.getText():null), (((ReceiptStandardContext)_localctx).NUMBER!=null?((ReceiptStandardContext)_localctx).NUMBER.getText():null)
				);

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("영수증 일반");

				STATEMENT.setTime((((ReceiptStandardContext)_localctx).DATE!=null?((ReceiptStandardContext)_localctx).DATE.getText():null), (((ReceiptStandardContext)_localctx).TIME!=null?((ReceiptStandardContext)_localctx).TIME.getText():null));
				STATEMENT.setDescription((((ReceiptStandardContext)_localctx).title1!=null?_input.getText(((ReceiptStandardContext)_localctx).title1.start,((ReceiptStandardContext)_localctx).title1.stop):null), (((ReceiptStandardContext)_localctx).title2!=null?_input.getText(((ReceiptStandardContext)_localctx).title2.start,((ReceiptStandardContext)_localctx).title2.stop):null), (((ReceiptStandardContext)_localctx).title3!=null?_input.getText(((ReceiptStandardContext)_localctx).title3.start,((ReceiptStandardContext)_localctx).title3.stop):null), (((ReceiptStandardContext)_localctx).title4!=null?_input.getText(((ReceiptStandardContext)_localctx).title4.start,((ReceiptStandardContext)_localctx).title4.stop):null), (((ReceiptStandardContext)_localctx).title5!=null?_input.getText(((ReceiptStandardContext)_localctx).title5.start,((ReceiptStandardContext)_localctx).title5.stop):null), "영수증", (((ReceiptStandardContext)_localctx).DATE!=null?((ReceiptStandardContext)_localctx).DATE.getText():null), (((ReceiptStandardContext)_localctx).TIME!=null?((ReceiptStandardContext)_localctx).TIME.getText():null), (((ReceiptStandardContext)_localctx).NUMBER!=null?((ReceiptStandardContext)_localctx).NUMBER.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle((((ReceiptStandardContext)_localctx).title1!=null?_input.getText(((ReceiptStandardContext)_localctx).title1.start,((ReceiptStandardContext)_localctx).title1.stop):null), (((ReceiptStandardContext)_localctx).title2!=null?_input.getText(((ReceiptStandardContext)_localctx).title2.start,((ReceiptStandardContext)_localctx).title2.stop):null), (((ReceiptStandardContext)_localctx).title3!=null?_input.getText(((ReceiptStandardContext)_localctx).title3.start,((ReceiptStandardContext)_localctx).title3.stop):null), (((ReceiptStandardContext)_localctx).title4!=null?_input.getText(((ReceiptStandardContext)_localctx).title4.start,((ReceiptStandardContext)_localctx).title4.stop):null), (((ReceiptStandardContext)_localctx).title5!=null?_input.getText(((ReceiptStandardContext)_localctx).title5.start,((ReceiptStandardContext)_localctx).title5.stop):null), "영수증", (((ReceiptStandardContext)_localctx).DATE!=null?((ReceiptStandardContext)_localctx).DATE.getText():null), (((ReceiptStandardContext)_localctx).TIME!=null?((ReceiptStandardContext)_localctx).TIME.getText():null), (((ReceiptStandardContext)_localctx).NUMBER!=null?((ReceiptStandardContext)_localctx).NUMBER.getText():null));
				statement.setTime((((ReceiptStandardContext)_localctx).DATE!=null?((ReceiptStandardContext)_localctx).DATE.getText():null), (((ReceiptStandardContext)_localctx).TIME!=null?((ReceiptStandardContext)_localctx).TIME.getText():null));
				statement.setIncome((((ReceiptStandardContext)_localctx).NUMBER!=null?((ReceiptStandardContext)_localctx).NUMBER.getText():null));
				statement.setOutcome(0);
				//statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptStandardItemContext extends ParserRuleContext {
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token unit;
		public Token ea;
		public Token total;
		public TerminalNode NEWLINE() { return getToken(ReceiptParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public ReceiptStandardItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptStandardItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptStandardItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptStandardItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptStandardItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptStandardItemContext receiptStandardItem() throws RecognitionException {
		ReceiptStandardItemContext _localctx = new ReceiptStandardItemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_receiptStandardItem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			((ReceiptStandardItemContext)_localctx).title1 = word();
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1216);
				((ReceiptStandardItemContext)_localctx).title2 = word();
				}
				break;
			}
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1219);
				((ReceiptStandardItemContext)_localctx).title3 = word();
				}
				break;
			}
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1222);
				((ReceiptStandardItemContext)_localctx).title4 = word();
				}
				break;
			}
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1225);
				((ReceiptStandardItemContext)_localctx).title5 = word();
				}
				break;
			}
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1228);
				((ReceiptStandardItemContext)_localctx).title6 = word();
				}
				break;
			}
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1231);
					((ReceiptStandardItemContext)_localctx).title7 = word();
					}
					} 
				}
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			setState(1237);
			((ReceiptStandardItemContext)_localctx).unit = match(NUMBER);
			setState(1238);
			((ReceiptStandardItemContext)_localctx).ea = match(NUMBER);
			setState(1239);
			((ReceiptStandardItemContext)_localctx).total = match(NUMBER);
			setState(1240);
			match(NEWLINE);

				log.info("{} receipt표준적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
					, (((ReceiptStandardItemContext)_localctx).title1!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title1.start,((ReceiptStandardItemContext)_localctx).title1.stop):null), (((ReceiptStandardItemContext)_localctx).title2!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title2.start,((ReceiptStandardItemContext)_localctx).title2.stop):null), (((ReceiptStandardItemContext)_localctx).title3!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title3.start,((ReceiptStandardItemContext)_localctx).title3.stop):null), (((ReceiptStandardItemContext)_localctx).title4!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title4.start,((ReceiptStandardItemContext)_localctx).title4.stop):null), (((ReceiptStandardItemContext)_localctx).title5!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title5.start,((ReceiptStandardItemContext)_localctx).title5.stop):null), (((ReceiptStandardItemContext)_localctx).title6!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title6.start,((ReceiptStandardItemContext)_localctx).title6.stop):null), (((ReceiptStandardItemContext)_localctx).title7!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title7.start,((ReceiptStandardItemContext)_localctx).title7.stop):null), (((ReceiptStandardItemContext)_localctx).unit!=null?((ReceiptStandardItemContext)_localctx).unit.getText():null), (((ReceiptStandardItemContext)_localctx).ea!=null?((ReceiptStandardItemContext)_localctx).ea.getText():null), (((ReceiptStandardItemContext)_localctx).total!=null?((ReceiptStandardItemContext)_localctx).total.getText():null)
				);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle((((ReceiptStandardItemContext)_localctx).title1!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title1.start,((ReceiptStandardItemContext)_localctx).title1.stop):null), (((ReceiptStandardItemContext)_localctx).title2!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title2.start,((ReceiptStandardItemContext)_localctx).title2.stop):null), (((ReceiptStandardItemContext)_localctx).title3!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title3.start,((ReceiptStandardItemContext)_localctx).title3.stop):null), (((ReceiptStandardItemContext)_localctx).title4!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title4.start,((ReceiptStandardItemContext)_localctx).title4.stop):null), (((ReceiptStandardItemContext)_localctx).title5!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title5.start,((ReceiptStandardItemContext)_localctx).title5.stop):null), (((ReceiptStandardItemContext)_localctx).title6!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title6.start,((ReceiptStandardItemContext)_localctx).title6.stop):null), (((ReceiptStandardItemContext)_localctx).title7!=null?_input.getText(((ReceiptStandardItemContext)_localctx).title7.start,((ReceiptStandardItemContext)_localctx).title7.stop):null), "-", (((ReceiptStandardItemContext)_localctx).ea!=null?((ReceiptStandardItemContext)_localctx).ea.getText():null), "EA");
				statement.setOutcome((((ReceiptStandardItemContext)_localctx).total!=null?((ReceiptStandardItemContext)_localctx).total.getText():null));
				//statement.setCategoryName("분류.지출.식비.외식");

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
	public static class ReceiptICoorpContext extends ParserRuleContext {
		public Token place;
		public Token DATE;
		public Token TIME;
		public Token total;
		public TerminalNode DATE() { return getToken(ReceiptParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
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
		public List<ReceiptICoorpItemContext> receiptICoorpItem() {
			return getRuleContexts(ReceiptICoorpItemContext.class);
		}
		public ReceiptICoorpItemContext receiptICoorpItem(int i) {
			return getRuleContext(ReceiptICoorpItemContext.class,i);
		}
		public ReceiptICoorpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptICoorp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptICoorp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptICoorp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptICoorp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptICoorpContext receiptICoorp() throws RecognitionException {
		ReceiptICoorpContext _localctx = new ReceiptICoorpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_receiptICoorp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1243);
				match(WORD);
				setState(1244);
				((ReceiptICoorpContext)_localctx).place = match(WORD);
				setState(1245);
				match(NEWLINE);
				}
				break;
			}
			setState(1249); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1248);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1251); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1253);
				match(WORD);
				}
				}
				setState(1256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1258);
			((ReceiptICoorpContext)_localctx).DATE = match(DATE);
			setState(1259);
			((ReceiptICoorpContext)_localctx).TIME = match(TIME);
			setState(1260);
			match(WORD);
			setState(1262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1261);
				match(WORD);
				}
				}
				setState(1264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1266);
			match(NEWLINE);
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1267);
				match(WORD);
				setState(1268);
				match(NEWLINE);
				}
				break;
			}
			setState(1271);
			match(WORD);
			setState(1272);
			match(WORD);
			setState(1273);
			match(WORD);
			setState(1275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1274);
				match(WORD);
				}
				}
				setState(1277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1279);
			match(NEWLINE);
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1280);
				match(WORD);
				setState(1281);
				match(NEWLINE);
				}
				break;
			}
			setState(1285); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1284);
					receiptICoorpItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1287); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1289);
				match(WORD);
				setState(1290);
				match(NEWLINE);
				}
				break;
			}
			setState(1293);
			match(WORD);
			setState(1294);
			match(NUMBER);
			setState(1295);
			match(NEWLINE);
			setState(1297); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1296);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1299); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				{
				setState(1301);
				match(WORD);
				setState(1302);
				match(WORD);
				setState(1303);
				match(WORD);
				setState(1304);
				match(NUMBER);
				setState(1305);
				match(NEWLINE);
				setState(1306);
				match(WORD);
				setState(1307);
				((ReceiptICoorpContext)_localctx).total = match(NUMBER);
				setState(1308);
				match(NEWLINE);
				}
				}
				break;
			case 2:
				{
				{
				setState(1309);
				match(WORD);
				setState(1310);
				match(NEWLINE);
				setState(1311);
				match(WORD);
				setState(1312);
				match(WORD);
				setState(1313);
				((ReceiptICoorpContext)_localctx).total = match(NUMBER);
				setState(1314);
				match(NEWLINE);
				setState(1315);
				match(WORD);
				setState(1316);
				match(NUMBER);
				setState(1317);
				match(NEWLINE);
				setState(1318);
				match(WORD);
				setState(1319);
				match(NEWLINE);
				}
				}
				break;
			}
			setState(1322);
			eof();

				log.info("{} receipt생협 parsing done! - (『{}』, 『{}』, 『{}』)", Utility.indentMiddle(), (((ReceiptICoorpContext)_localctx).DATE!=null?((ReceiptICoorpContext)_localctx).DATE.getText():null), (((ReceiptICoorpContext)_localctx).TIME!=null?((ReceiptICoorpContext)_localctx).TIME.getText():null), (((ReceiptICoorpContext)_localctx).total!=null?((ReceiptICoorpContext)_localctx).total.getText():null));

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("두레생협 구매 내역");

				STATEMENT.setTime((((ReceiptICoorpContext)_localctx).DATE!=null?((ReceiptICoorpContext)_localctx).DATE.getText():null), (((ReceiptICoorpContext)_localctx).TIME!=null?((ReceiptICoorpContext)_localctx).TIME.getText():null));
				STATEMENT.setDescription("두레생협 영수증", (((ReceiptICoorpContext)_localctx).DATE!=null?((ReceiptICoorpContext)_localctx).DATE.getText():null), (((ReceiptICoorpContext)_localctx).TIME!=null?((ReceiptICoorpContext)_localctx).TIME.getText():null), (((ReceiptICoorpContext)_localctx).total!=null?((ReceiptICoorpContext)_localctx).total.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle("두레생협", (((ReceiptICoorpContext)_localctx).place!=null?((ReceiptICoorpContext)_localctx).place.getText():null), (((ReceiptICoorpContext)_localctx).total!=null?((ReceiptICoorpContext)_localctx).total.getText():null));
				statement.setTime((((ReceiptICoorpContext)_localctx).DATE!=null?((ReceiptICoorpContext)_localctx).DATE.getText():null), (((ReceiptICoorpContext)_localctx).TIME!=null?((ReceiptICoorpContext)_localctx).TIME.getText():null));
				statement.setIncome((((ReceiptICoorpContext)_localctx).total!=null?((ReceiptICoorpContext)_localctx).total.getText():null));
				statement.setOutcome(0);
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptICoorpItemContext extends ParserRuleContext {
		public WordContext title;
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token ea;
		public Token total;
		public Token unit;
		public Token display;
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public ReceiptICoorpItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptICoorpItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptICoorpItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptICoorpItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptICoorpItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptICoorpItemContext receiptICoorpItem() throws RecognitionException {
		ReceiptICoorpItemContext _localctx = new ReceiptICoorpItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_receiptICoorpItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				{
				setState(1325);
				((ReceiptICoorpItemContext)_localctx).title = word();
				setState(1327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1326);
					((ReceiptICoorpItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(1330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1329);
					((ReceiptICoorpItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(1333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1332);
					((ReceiptICoorpItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(1336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1335);
					((ReceiptICoorpItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(1339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1338);
					((ReceiptICoorpItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(1342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1341);
					((ReceiptICoorpItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(1344);
					((ReceiptICoorpItemContext)_localctx).title7 = word();
					}
					}
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1350);
				match(NEWLINE);
				setState(1351);
				((ReceiptICoorpItemContext)_localctx).ea = match(NUMBER);
				setState(1352);
				((ReceiptICoorpItemContext)_localctx).total = match(NUMBER);
				setState(1353);
				match(NEWLINE);
				}
				}
				break;
			case 2:
				{
				{
				setState(1355);
				((ReceiptICoorpItemContext)_localctx).title = word();
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1356);
					((ReceiptICoorpItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(1360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1359);
					((ReceiptICoorpItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(1363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1362);
					((ReceiptICoorpItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(1366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1365);
					((ReceiptICoorpItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(1369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1368);
					((ReceiptICoorpItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(1372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1371);
					((ReceiptICoorpItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(1377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1374);
						((ReceiptICoorpItemContext)_localctx).title7 = word();
						}
						} 
					}
					setState(1379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				}
				setState(1380);
				((ReceiptICoorpItemContext)_localctx).ea = match(NUMBER);
				setState(1381);
				((ReceiptICoorpItemContext)_localctx).unit = match(NUMBER);
				setState(1382);
				match(NEWLINE);
				setState(1383);
				((ReceiptICoorpItemContext)_localctx).total = match(NUMBER);
				setState(1384);
				match(NEWLINE);
				}
				}
				break;
			case 3:
				{
				{
				setState(1386);
				((ReceiptICoorpItemContext)_localctx).title = word();
				setState(1388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1387);
					((ReceiptICoorpItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1390);
					((ReceiptICoorpItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1393);
					((ReceiptICoorpItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1396);
					((ReceiptICoorpItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(1400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1399);
					((ReceiptICoorpItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1402);
					((ReceiptICoorpItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(1408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1405);
						((ReceiptICoorpItemContext)_localctx).title7 = word();
						}
						} 
					}
					setState(1410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				}
				setState(1411);
				((ReceiptICoorpItemContext)_localctx).ea = match(NUMBER);
				setState(1412);
				((ReceiptICoorpItemContext)_localctx).unit = match(NUMBER);
				setState(1413);
				match(NEWLINE);
				}
				}
				break;
			case 4:
				{
				{
				setState(1415);
				((ReceiptICoorpItemContext)_localctx).title = word();
				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1416);
					((ReceiptICoorpItemContext)_localctx).title1 = word();
					}
					break;
				}
				setState(1420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1419);
					((ReceiptICoorpItemContext)_localctx).title2 = word();
					}
					break;
				}
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1422);
					((ReceiptICoorpItemContext)_localctx).title3 = word();
					}
					break;
				}
				setState(1426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1425);
					((ReceiptICoorpItemContext)_localctx).title4 = word();
					}
					break;
				}
				setState(1429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1428);
					((ReceiptICoorpItemContext)_localctx).title5 = word();
					}
					break;
				}
				setState(1432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1431);
					((ReceiptICoorpItemContext)_localctx).title6 = word();
					}
					break;
				}
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
					{
					{
					setState(1434);
					((ReceiptICoorpItemContext)_localctx).title7 = word();
					}
					}
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1440);
				match(NEWLINE);
				setState(1441);
				match(NUMBER);
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1442);
					((ReceiptICoorpItemContext)_localctx).display = match(NUMBER);
					}
					break;
				}
				setState(1445);
				((ReceiptICoorpItemContext)_localctx).ea = match(NUMBER);
				setState(1446);
				((ReceiptICoorpItemContext)_localctx).unit = match(NUMBER);
				setState(1447);
				match(NEWLINE);
				setState(1458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WORD) {
						{
						setState(1449); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1448);
							match(WORD);
							}
							}
							setState(1451); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WORD );
						setState(1453);
						match(NUMBER);
						}
					}

					setState(1456);
					((ReceiptICoorpItemContext)_localctx).total = match(NUMBER);
					setState(1457);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				break;
			}

				log.info("{} 영수증 두레 생협 적요(『{} {} {} {} {} {} {} {}』 『{} {} {} {}』)", Utility.indentMiddle()
					, (((ReceiptICoorpItemContext)_localctx).title!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title.start,((ReceiptICoorpItemContext)_localctx).title.stop):null), (((ReceiptICoorpItemContext)_localctx).title1!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title1.start,((ReceiptICoorpItemContext)_localctx).title1.stop):null), (((ReceiptICoorpItemContext)_localctx).title2!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title2.start,((ReceiptICoorpItemContext)_localctx).title2.stop):null), (((ReceiptICoorpItemContext)_localctx).title3!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title3.start,((ReceiptICoorpItemContext)_localctx).title3.stop):null), (((ReceiptICoorpItemContext)_localctx).title4!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title4.start,((ReceiptICoorpItemContext)_localctx).title4.stop):null), (((ReceiptICoorpItemContext)_localctx).title5!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title5.start,((ReceiptICoorpItemContext)_localctx).title5.stop):null), (((ReceiptICoorpItemContext)_localctx).title6!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title6.start,((ReceiptICoorpItemContext)_localctx).title6.stop):null), (((ReceiptICoorpItemContext)_localctx).title7!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title7.start,((ReceiptICoorpItemContext)_localctx).title7.stop):null)
					, (((ReceiptICoorpItemContext)_localctx).display!=null?((ReceiptICoorpItemContext)_localctx).display.getText():null), (((ReceiptICoorpItemContext)_localctx).ea!=null?((ReceiptICoorpItemContext)_localctx).ea.getText():null), (((ReceiptICoorpItemContext)_localctx).unit!=null?((ReceiptICoorpItemContext)_localctx).unit.getText():null), (((ReceiptICoorpItemContext)_localctx).total!=null?((ReceiptICoorpItemContext)_localctx).total.getText():null));

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle((((ReceiptICoorpItemContext)_localctx).title!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title.start,((ReceiptICoorpItemContext)_localctx).title.stop):null), (((ReceiptICoorpItemContext)_localctx).title1!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title1.start,((ReceiptICoorpItemContext)_localctx).title1.stop):null), (((ReceiptICoorpItemContext)_localctx).title2!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title2.start,((ReceiptICoorpItemContext)_localctx).title2.stop):null), (((ReceiptICoorpItemContext)_localctx).title3!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title3.start,((ReceiptICoorpItemContext)_localctx).title3.stop):null), (((ReceiptICoorpItemContext)_localctx).title4!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title4.start,((ReceiptICoorpItemContext)_localctx).title4.stop):null), (((ReceiptICoorpItemContext)_localctx).title5!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title5.start,((ReceiptICoorpItemContext)_localctx).title5.stop):null), (((ReceiptICoorpItemContext)_localctx).title6!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title6.start,((ReceiptICoorpItemContext)_localctx).title6.stop):null), (((ReceiptICoorpItemContext)_localctx).title7!=null?_input.getText(((ReceiptICoorpItemContext)_localctx).title7.start,((ReceiptICoorpItemContext)_localctx).title7.stop):null));
				if ("1".equals((((ReceiptICoorpItemContext)_localctx).ea!=null?((ReceiptICoorpItemContext)_localctx).ea.getText():null)) && (((ReceiptICoorpItemContext)_localctx).unit!=null?((ReceiptICoorpItemContext)_localctx).unit.getText():null) == null) {
					statement.setDescription("두레생협", "x", (((ReceiptICoorpItemContext)_localctx).ea!=null?((ReceiptICoorpItemContext)_localctx).ea.getText():null));
					statement.setOutcome((((ReceiptICoorpItemContext)_localctx).total!=null?((ReceiptICoorpItemContext)_localctx).total.getText():null));
				} else if ("1".equals((((ReceiptICoorpItemContext)_localctx).ea!=null?((ReceiptICoorpItemContext)_localctx).ea.getText():null))) {
					statement.setDescription("두레생협", (((ReceiptICoorpItemContext)_localctx).unit!=null?((ReceiptICoorpItemContext)_localctx).unit.getText():null), "(", (((ReceiptICoorpItemContext)_localctx).display!=null?((ReceiptICoorpItemContext)_localctx).display.getText():null), ") x", (((ReceiptICoorpItemContext)_localctx).ea!=null?((ReceiptICoorpItemContext)_localctx).ea.getText():null), "=", (((ReceiptICoorpItemContext)_localctx).unit!=null?((ReceiptICoorpItemContext)_localctx).unit.getText():null));
					statement.setOutcome((((ReceiptICoorpItemContext)_localctx).unit!=null?((ReceiptICoorpItemContext)_localctx).unit.getText():null));
				} else {
					statement.setDescription("두레생협", (((ReceiptICoorpItemContext)_localctx).unit!=null?((ReceiptICoorpItemContext)_localctx).unit.getText():null), "(", (((ReceiptICoorpItemContext)_localctx).display!=null?((ReceiptICoorpItemContext)_localctx).display.getText():null), ") x", (((ReceiptICoorpItemContext)_localctx).ea!=null?((ReceiptICoorpItemContext)_localctx).ea.getText():null), "=", (((ReceiptICoorpItemContext)_localctx).total!=null?((ReceiptICoorpItemContext)_localctx).total.getText():null));
					statement.setOutcome((((ReceiptICoorpItemContext)_localctx).total!=null?((ReceiptICoorpItemContext)_localctx).total.getText():null));
				}
				statement.setCategoryName("분류.지출.식비.주식");

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
	public static class ReceiptTaeYoungHomeMartContext extends ParserRuleContext {
		public Token seller;
		public WordContext key1;
		public Token value1;
		public Token date;
		public Token time;
		public WordContext key2;
		public Token value2;
		public Token key3;
		public WordContext value3;
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ReceiptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ReceiptParser.WORD, i);
		}
		public List<TerminalNode> DATE() { return getTokens(ReceiptParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ReceiptParser.DATE, i);
		}
		public List<TerminalNode> TIME() { return getTokens(ReceiptParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(ReceiptParser.TIME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ReceiptTaeYoungHomeMartItemContext> receiptTaeYoungHomeMartItem() {
			return getRuleContexts(ReceiptTaeYoungHomeMartItemContext.class);
		}
		public ReceiptTaeYoungHomeMartItemContext receiptTaeYoungHomeMartItem(int i) {
			return getRuleContext(ReceiptTaeYoungHomeMartItemContext.class,i);
		}
		public ReceiptTaeYoungHomeMartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptTaeYoungHomeMart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptTaeYoungHomeMart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptTaeYoungHomeMart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptTaeYoungHomeMart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptTaeYoungHomeMartContext receiptTaeYoungHomeMart() throws RecognitionException {
		ReceiptTaeYoungHomeMartContext _localctx = new ReceiptTaeYoungHomeMartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_receiptTaeYoungHomeMart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			((ReceiptTaeYoungHomeMartContext)_localctx).seller = match(WORD);
			setState(1465);
			match(NEWLINE);
			setState(1466);
			match(WORD);
			setState(1467);
			match(WORD);
			setState(1468);
			match(WORD);
			setState(1469);
			match(WORD);
			setState(1471); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1470);
				word();
				}
				}
				setState(1473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(1475);
			match(NEWLINE);
			setState(1477); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1476);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1479); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1481);
			match(WORD);
			setState(1482);
			match(WORD);
			setState(1483);
			match(WORD);
			setState(1485); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1484);
				word();
				}
				}
				setState(1487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(1489);
			match(NEWLINE);
			setState(1491); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1490);
					receiptTaeYoungHomeMartItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1493); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1496); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1495);
					((ReceiptTaeYoungHomeMartContext)_localctx).key1 = word();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1498); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1500);
			((ReceiptTaeYoungHomeMartContext)_localctx).value1 = match(NUMBER);
			setState(1501);
			match(NEWLINE);
			setState(1503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1502);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1508); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1507);
					word();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1510); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1512);
			match(DATE);
			setState(1514); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1513);
					word();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1516); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1518);
			match(TIME);
			setState(1519);
			match(NEWLINE);
			setState(1521); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1520);
					word();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1523); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1525);
			((ReceiptTaeYoungHomeMartContext)_localctx).date = match(DATE);
			setState(1526);
			((ReceiptTaeYoungHomeMartContext)_localctx).time = match(TIME);
			setState(1528); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1527);
				word();
				}
				}
				setState(1530); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(1532);
			match(NEWLINE);
			setState(1533);
			match(WORD);
			setState(1535); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1534);
				word();
				}
				}
				setState(1537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(1539);
			match(NEWLINE);
			setState(1541); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1540);
					((ReceiptTaeYoungHomeMartContext)_localctx).key2 = word();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1543); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1545);
			((ReceiptTaeYoungHomeMartContext)_localctx).value2 = match(NUMBER);
			setState(1546);
			match(NEWLINE);
			setState(1547);
			((ReceiptTaeYoungHomeMartContext)_localctx).key3 = match(WORD);
			setState(1549); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1548);
				((ReceiptTaeYoungHomeMartContext)_localctx).value3 = word();
				}
				}
				setState(1551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0) );
			setState(1553);
			match(NEWLINE);
			setState(1555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1554);
				line();
				}
				}
				setState(1557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );

				log.info("{} 태영홈마트(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
					, (((ReceiptTaeYoungHomeMartContext)_localctx).date!=null?((ReceiptTaeYoungHomeMartContext)_localctx).date.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).time!=null?((ReceiptTaeYoungHomeMartContext)_localctx).time.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).seller!=null?((ReceiptTaeYoungHomeMartContext)_localctx).seller.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).key1!=null?_input.getText(((ReceiptTaeYoungHomeMartContext)_localctx).key1.start,((ReceiptTaeYoungHomeMartContext)_localctx).key1.stop):null), (((ReceiptTaeYoungHomeMartContext)_localctx).value1!=null?((ReceiptTaeYoungHomeMartContext)_localctx).value1.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).key2!=null?_input.getText(((ReceiptTaeYoungHomeMartContext)_localctx).key2.start,((ReceiptTaeYoungHomeMartContext)_localctx).key2.stop):null), (((ReceiptTaeYoungHomeMartContext)_localctx).value2!=null?((ReceiptTaeYoungHomeMartContext)_localctx).value2.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).key3!=null?((ReceiptTaeYoungHomeMartContext)_localctx).key3.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).value3!=null?_input.getText(((ReceiptTaeYoungHomeMartContext)_localctx).value3.start,((ReceiptTaeYoungHomeMartContext)_localctx).value3.stop):null)
				);

				ACCOUNT.setProducer("영수증");
				ACCOUNT.setNumber("태영홈마트 구매 내역");

				STATEMENT.setTime((((ReceiptTaeYoungHomeMartContext)_localctx).date!=null?((ReceiptTaeYoungHomeMartContext)_localctx).date.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).time!=null?((ReceiptTaeYoungHomeMartContext)_localctx).time.getText():null));
				STATEMENT.setIncome(0);
				STATEMENT.setOutcome(0);
				STATEMENT.setBalance(0);
				STATEMENT.setDescription("태영홈마트 영수증", (((ReceiptTaeYoungHomeMartContext)_localctx).seller!=null?((ReceiptTaeYoungHomeMartContext)_localctx).seller.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).value3!=null?_input.getText(((ReceiptTaeYoungHomeMartContext)_localctx).value3.start,((ReceiptTaeYoungHomeMartContext)_localctx).value3.stop):null));

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle("영수증", (((ReceiptTaeYoungHomeMartContext)_localctx).seller!=null?((ReceiptTaeYoungHomeMartContext)_localctx).seller.getText():null), (((ReceiptTaeYoungHomeMartContext)_localctx).value3!=null?_input.getText(((ReceiptTaeYoungHomeMartContext)_localctx).value3.start,((ReceiptTaeYoungHomeMartContext)_localctx).value3.stop):null), (((ReceiptTaeYoungHomeMartContext)_localctx).key1!=null?_input.getText(((ReceiptTaeYoungHomeMartContext)_localctx).key1.start,((ReceiptTaeYoungHomeMartContext)_localctx).key1.stop):null), (((ReceiptTaeYoungHomeMartContext)_localctx).value1!=null?((ReceiptTaeYoungHomeMartContext)_localctx).value1.getText():null));
				statement.setIncome((((ReceiptTaeYoungHomeMartContext)_localctx).value2!=null?((ReceiptTaeYoungHomeMartContext)_localctx).value2.getText():null));
				statement.setCategoryName("분류.수입.전월이월.이체");

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
	public static class ReceiptTaeYoungHomeMartItemContext extends ParserRuleContext {
		public WordContext title1;
		public WordContext title2;
		public WordContext title3;
		public WordContext title4;
		public WordContext title5;
		public WordContext title6;
		public WordContext title7;
		public Token unit;
		public Token ea;
		public Token outcome;
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReceiptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReceiptParser.NUMBER, i);
		}
		public ReceiptTaeYoungHomeMartItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiptTaeYoungHomeMartItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceiptTaeYoungHomeMartItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceiptTaeYoungHomeMartItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitReceiptTaeYoungHomeMartItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiptTaeYoungHomeMartItemContext receiptTaeYoungHomeMartItem() throws RecognitionException {
		ReceiptTaeYoungHomeMartItemContext _localctx = new ReceiptTaeYoungHomeMartItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_receiptTaeYoungHomeMartItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			((ReceiptTaeYoungHomeMartItemContext)_localctx).title1 = word();
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1562);
				((ReceiptTaeYoungHomeMartItemContext)_localctx).title2 = word();
				}
				break;
			}
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1565);
				((ReceiptTaeYoungHomeMartItemContext)_localctx).title3 = word();
				}
				break;
			}
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1568);
				((ReceiptTaeYoungHomeMartItemContext)_localctx).title4 = word();
				}
				break;
			}
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1571);
				((ReceiptTaeYoungHomeMartItemContext)_localctx).title5 = word();
				}
				break;
			}
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1574);
				((ReceiptTaeYoungHomeMartItemContext)_localctx).title6 = word();
				}
				break;
			}
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) {
				{
				{
				setState(1577);
				((ReceiptTaeYoungHomeMartItemContext)_localctx).title7 = word();
				}
				}
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1583);
			match(NEWLINE);
			setState(1584);
			word();
			setState(1585);
			((ReceiptTaeYoungHomeMartItemContext)_localctx).unit = match(NUMBER);
			setState(1586);
			((ReceiptTaeYoungHomeMartItemContext)_localctx).ea = match(NUMBER);
			setState(1587);
			((ReceiptTaeYoungHomeMartItemContext)_localctx).outcome = match(NUMBER);
			setState(1588);
			match(NEWLINE);

				log.info("{} receipt태영홈마트적요(『{}』, 『{}』, 『{}』, 『{}』, 『{}』, 『{}』)", Utility.indentMiddle()
					, (((ReceiptTaeYoungHomeMartItemContext)_localctx).title1!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title1.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title1.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title2!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title2.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title2.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title3!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title3.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title3.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title4!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title4.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title4.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title5!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title5.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title5.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title6!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title6.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title6.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title7!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title7.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title7.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).ea!=null?((ReceiptTaeYoungHomeMartItemContext)_localctx).ea.getText():null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).outcome!=null?((ReceiptTaeYoungHomeMartItemContext)_localctx).outcome.getText():null)
				);

				StatementForm statement = new StatementForm();
				LIST_STATEMENT.add(statement);
				statement.setTitle((((ReceiptTaeYoungHomeMartItemContext)_localctx).title1!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title1.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title1.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title2!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title2.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title2.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title3!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title3.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title3.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title4!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title4.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title4.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title5!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title5.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title5.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title6!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title6.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title6.stop):null), (((ReceiptTaeYoungHomeMartItemContext)_localctx).title7!=null?_input.getText(((ReceiptTaeYoungHomeMartItemContext)_localctx).title7.start,((ReceiptTaeYoungHomeMartItemContext)_localctx).title7.stop):null), "-", (((ReceiptTaeYoungHomeMartItemContext)_localctx).ea!=null?((ReceiptTaeYoungHomeMartItemContext)_localctx).ea.getText():null), "EA");
				statement.setOutcome((((ReceiptTaeYoungHomeMartItemContext)_localctx).outcome!=null?((ReceiptTaeYoungHomeMartItemContext)_localctx).outcome.getText():null));
				statement.setCategoryName("분류.지출.식비.주식");

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
		public TerminalNode WORD() { return getToken(ReceiptParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(ReceiptParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(ReceiptParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(ReceiptParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(ReceiptParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(ReceiptParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
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
		public TerminalNode NEWLINE() { return getToken(ReceiptParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1595);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1593);
					word();
					}
					break;
				case TAB:
					{
					setState(1594);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0) );
			setState(1599);
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
		public List<TerminalNode> TAB() { return getTokens(ReceiptParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ReceiptParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ReceiptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ReceiptParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceiptVisitor ) return ((ReceiptVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2040L) != 0)) {
				{
				setState(1604);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1601);
					word();
					}
					break;
				case TAB:
					{
					setState(1602);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1603);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1608);
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
		"\u0004\u0001\n\u064a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000E\b\u0000\u0001\u0001\u0004\u0001H\b\u0001\u000b\u0001\f\u0001"+
		"I\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001d\b\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0001\u0003"+
		"\u0001j\b\u0001\u0001\u0001\u0003\u0001m\b\u0001\u0001\u0001\u0003\u0001"+
		"p\b\u0001\u0001\u0001\u0003\u0001s\b\u0001\u0001\u0001\u0005\u0001v\b"+
		"\u0001\n\u0001\f\u0001y\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001~\b\u0001\u0001\u0001\u0003\u0001\u0081\b\u0001\u0001\u0001\u0003"+
		"\u0001\u0084\b\u0001\u0001\u0001\u0003\u0001\u0087\b\u0001\u0001\u0001"+
		"\u0003\u0001\u008a\b\u0001\u0001\u0001\u0003\u0001\u008d\b\u0001\u0001"+
		"\u0001\u0005\u0001\u0090\b\u0001\n\u0001\f\u0001\u0093\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u009c\b\u0001\u000b\u0001\f\u0001\u009d\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u00a3\b\u0001\u000b\u0001\f\u0001\u00a4"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00b0\b\u0001\u000b\u0001"+
		"\f\u0001\u00b1\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00ba\b\u0002\u0001\u0002\u0003\u0002\u00bd\b"+
		"\u0002\u0001\u0002\u0003\u0002\u00c0\b\u0002\u0001\u0002\u0003\u0002\u00c3"+
		"\b\u0002\u0001\u0002\u0003\u0002\u00c6\b\u0002\u0001\u0002\u0003\u0002"+
		"\u00c9\b\u0002\u0001\u0002\u0005\u0002\u00cc\b\u0002\n\u0002\f\u0002\u00cf"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004"+
		"\u0003\u00d6\b\u0003\u000b\u0003\f\u0003\u00d7\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003\u00e8\b\u0003\u000b\u0003\f\u0003\u00e9\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f6\b\u0003\u0001\u0003\u0003"+
		"\u0003\u00f9\b\u0003\u0001\u0003\u0003\u0003\u00fc\b\u0003\u0001\u0003"+
		"\u0003\u0003\u00ff\b\u0003\u0001\u0003\u0003\u0003\u0102\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0105\b\u0003\u0001\u0003\u0005\u0003\u0108\b\u0003"+
		"\n\u0003\f\u0003\u010b\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0115"+
		"\b\u0003\u000b\u0003\f\u0003\u0116\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u011b\b\u0003\n\u0003\f\u0003\u011e\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u0125\b\u0004\u000b\u0004\f"+
		"\u0004\u0126\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u0134\b\u0004\u000b\u0004\f\u0004\u0135\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u013f\b\u0004\u000b\u0004\f\u0004\u0140\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0157\b\u0005\u0001\u0005\u0003\u0005\u015a\b\u0005\u0001"+
		"\u0005\u0003\u0005\u015d\b\u0005\u0001\u0005\u0003\u0005\u0160\b\u0005"+
		"\u0001\u0005\u0003\u0005\u0163\b\u0005\u0001\u0005\u0005\u0005\u0166\b"+
		"\u0005\n\u0005\f\u0005\u0169\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u016f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u0176\b\u0005\u000b\u0005\f\u0005"+
		"\u0177\u0001\u0005\u0001\u0005\u0003\u0005\u017c\b\u0005\u0001\u0005\u0003"+
		"\u0005\u017f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006\u0184"+
		"\b\u0006\u000b\u0006\f\u0006\u0185\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u018a\b\u0006\u000b\u0006\f\u0006\u018b\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u0190\b\u0006\u000b\u0006\f\u0006\u0191\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u0196\b\u0006\u000b\u0006\f\u0006\u0197\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u019c\b\u0006\u000b\u0006\f\u0006\u019d\u0001\u0006"+
		"\u0004\u0006\u01a1\b\u0006\u000b\u0006\f\u0006\u01a2\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u01aa\b\u0006\u000b"+
		"\u0006\f\u0006\u01ab\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u01b5\b\u0006\u000b\u0006\f"+
		"\u0006\u01b6\u0001\u0006\u0001\u0006\u0005\u0006\u01bb\b\u0006\n\u0006"+
		"\f\u0006\u01be\t\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u01c2\b\u0006"+
		"\u000b\u0006\f\u0006\u01c3\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u01c9\b\u0006\u0001\u0006\u0003\u0006\u01cc\b\u0006\u0001\u0006\u0003"+
		"\u0006\u01cf\b\u0006\u0001\u0006\u0003\u0006\u01d2\b\u0006\u0001\u0006"+
		"\u0003\u0006\u01d5\b\u0006\u0001\u0006\u0003\u0006\u01d8\b\u0006\u0001"+
		"\u0006\u0005\u0006\u01db\b\u0006\n\u0006\f\u0006\u01de\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u01e3\b\u0006\u0001\u0006\u0003\u0006"+
		"\u01e6\b\u0006\u0001\u0006\u0003\u0006\u01e9\b\u0006\u0001\u0006\u0003"+
		"\u0006\u01ec\b\u0006\u0001\u0006\u0003\u0006\u01ef\b\u0006\u0001\u0006"+
		"\u0003\u0006\u01f2\b\u0006\u0001\u0006\u0005\u0006\u01f5\b\u0006\n\u0006"+
		"\f\u0006\u01f8\t\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u01fc\b\u0006"+
		"\u000b\u0006\f\u0006\u01fd\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u0204\b\u0006\u000b\u0006\f\u0006\u0205\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u020c\b\u0006\u000b\u0006\f"+
		"\u0006\u020d\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0004\u0007\u0216\b\u0007\u000b\u0007\f\u0007\u0217\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u0220\b\u0007\u000b\u0007\f\u0007\u0221\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u022e\b\u0007\u000b\u0007\f\u0007"+
		"\u022f\u0001\u0007\u0004\u0007\u0233\b\u0007\u000b\u0007\f\u0007\u0234"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u0239\b\u0007\u000b\u0007\f\u0007"+
		"\u023a\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\t\u025d\b\t\u0001\t\u0003\t\u0260\b\t\u0001\t\u0003\t\u0263\b\t\u0001"+
		"\t\u0003\t\u0266\b\t\u0001\t\u0003\t\u0269\b\t\u0001\t\u0003\t\u026c\b"+
		"\t\u0001\t\u0005\t\u026f\b\t\n\t\f\t\u0272\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0004\t\u0277\b\t\u000b\t\f\t\u0278\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0286\b\t\u000b"+
		"\t\f\t\u0287\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u028e\b\t\u000b\t"+
		"\f\t\u028f\u0001\t\u0004\t\u0293\b\t\u000b\t\f\t\u0294\u0001\t\u0001\t"+
		"\u0001\t\u0004\t\u029a\b\t\u000b\t\f\t\u029b\u0001\t\u0001\t\u0004\t\u02a0"+
		"\b\t\u000b\t\f\t\u02a1\u0001\t\u0004\t\u02a5\b\t\u000b\t\f\t\u02a6\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u02b4\b\n\u0001\n\u0003\n\u02b7\b\n\u0001\n\u0003\n"+
		"\u02ba\b\n\u0001\n\u0003\n\u02bd\b\n\u0001\n\u0003\n\u02c0\b\n\u0001\n"+
		"\u0003\n\u02c3\b\n\u0001\n\u0005\n\u02c6\b\n\n\n\f\n\u02c9\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u02d2\b\n\u000b"+
		"\n\f\n\u02d3\u0001\n\u0001\n\u0001\n\u0003\n\u02d9\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u02df\b\n\u0001\n\u0003\n\u02e2\b\n\u0001\n\u0003"+
		"\n\u02e5\b\n\u0001\n\u0003\n\u02e8\b\n\u0001\n\u0003\n\u02eb\b\n\u0001"+
		"\n\u0003\n\u02ee\b\n\u0001\n\u0005\n\u02f1\b\n\n\n\f\n\u02f4\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u02fd\b\n\u000b"+
		"\n\f\n\u02fe\u0001\n\u0001\n\u0001\n\u0003\n\u0304\b\n\u0001\n\u0001\n"+
		"\u0003\n\u0308\b\n\u0001\u000b\u0004\u000b\u030b\b\u000b\u000b\u000b\f"+
		"\u000b\u030c\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u0315\b\u000b\u000b\u000b\f\u000b\u0316\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u031b\b\u000b\u0001\u000b\u0003\u000b\u031e"+
		"\b\u000b\u0001\u000b\u0004\u000b\u0321\b\u000b\u000b\u000b\f\u000b\u0322"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004"+
		"\f\u0331\b\f\u000b\f\f\f\u0332\u0001\f\u0001\f\u0004\f\u0337\b\f\u000b"+
		"\f\f\f\u0338\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u033f\b\f\u0001\f"+
		"\u0003\f\u0342\b\f\u0001\f\u0003\f\u0345\b\f\u0001\f\u0003\f\u0348\b\f"+
		"\u0001\f\u0003\f\u034b\b\f\u0001\f\u0003\f\u034e\b\f\u0001\f\u0005\f\u0351"+
		"\b\f\n\f\f\f\u0354\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0361\b\f\u000b\f\f\f"+
		"\u0362\u0001\f\u0001\f\u0004\f\u0367\b\f\u000b\f\f\f\u0368\u0001\f\u0001"+
		"\f\u0001\r\u0004\r\u036e\b\r\u000b\r\f\r\u036f\u0001\r\u0001\r\u0004\r"+
		"\u0374\b\r\u000b\r\f\r\u0375\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u037c"+
		"\b\r\u0001\r\u0003\r\u037f\b\r\u0001\r\u0003\r\u0382\b\r\u0001\r\u0003"+
		"\r\u0385\b\r\u0001\r\u0003\r\u0388\b\r\u0001\r\u0003\r\u038b\b\r\u0001"+
		"\r\u0005\r\u038e\b\r\n\r\f\r\u0391\t\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0004\r\u03a3\b\r\u000b\r\f\r\u03a4\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u03ab\b\u000e\u000b\u000e\f\u000e"+
		"\u03ac\u0001\u000e\u0004\u000e\u03b0\b\u000e\u000b\u000e\f\u000e\u03b1"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u03b9\b\u000e\u000b\u000e\f\u000e\u03ba\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u03c2\b\u000e\u000b\u000e\f"+
		"\u000e\u03c3\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u03d0\b\u000f\u0001\u000f\u0003\u000f\u03d3\b\u000f\u0001\u000f\u0003"+
		"\u000f\u03d6\b\u000f\u0001\u000f\u0003\u000f\u03d9\b\u000f\u0001\u000f"+
		"\u0003\u000f\u03dc\b\u000f\u0001\u000f\u0003\u000f\u03df\b\u000f\u0001"+
		"\u000f\u0005\u000f\u03e2\b\u000f\n\u000f\f\u000f\u03e5\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u03ea\b\u000f\u000b\u000f\f\u000f"+
		"\u03eb\u0001\u000f\u0001\u000f\u0004\u000f\u03f0\b\u000f\u000b\u000f\f"+
		"\u000f\u03f1\u0001\u000f\u0001\u000f\u0004\u000f\u03f6\b\u000f\u000b\u000f"+
		"\f\u000f\u03f7\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"\u03fe\b\u0010\u000b\u0010\f\u0010\u03ff\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0408\b\u0010\u000b"+
		"\u0010\f\u0010\u0409\u0001\u0010\u0001\u0010\u0004\u0010\u040e\b\u0010"+
		"\u000b\u0010\f\u0010\u040f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u0418\b\u0010\u000b\u0010\f\u0010"+
		"\u0419\u0001\u0010\u0001\u0010\u0003\u0010\u041e\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0424\b\u0010\u000b\u0010\f"+
		"\u0010\u0425\u0001\u0010\u0004\u0010\u0429\b\u0010\u000b\u0010\f\u0010"+
		"\u042a\u0001\u0010\u0001\u0010\u0004\u0010\u042f\b\u0010\u000b\u0010\f"+
		"\u0010\u0430\u0001\u0010\u0004\u0010\u0434\b\u0010\u000b\u0010\f\u0010"+
		"\u0435\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0442"+
		"\b\u0012\u0001\u0012\u0003\u0012\u0445\b\u0012\u0001\u0012\u0003\u0012"+
		"\u0448\b\u0012\u0001\u0012\u0003\u0012\u044b\b\u0012\u0001\u0012\u0003"+
		"\u0012\u044e\b\u0012\u0001\u0012\u0003\u0012\u0451\b\u0012\u0001\u0012"+
		"\u0005\u0012\u0454\b\u0012\n\u0012\f\u0012\u0457\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0466\b\u0012\u0001\u0012\u0003\u0012\u0469\b\u0012\u0001\u0012"+
		"\u0003\u0012\u046c\b\u0012\u0001\u0012\u0003\u0012\u046f\b\u0012\u0001"+
		"\u0012\u0003\u0012\u0472\b\u0012\u0001\u0012\u0003\u0012\u0475\b\u0012"+
		"\u0001\u0012\u0005\u0012\u0478\b\u0012\n\u0012\f\u0012\u047b\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0484\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u048b\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0491\b\u0012\u0001\u0013\u0005\u0013\u0494"+
		"\b\u0013\n\u0013\f\u0013\u0497\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u049b\b\u0013\u0001\u0013\u0003\u0013\u049e\b\u0013\u0001\u0013\u0003"+
		"\u0013\u04a1\b\u0013\u0001\u0013\u0003\u0013\u04a4\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u04ab\b\u0013"+
		"\n\u0013\f\u0013\u04ae\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u04b3\b\u0013\u000b\u0013\f\u0013\u04b4\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u04b9\b\u0013\u000b\u0013\f\u0013\u04ba\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u04c2\b\u0014\u0001"+
		"\u0014\u0003\u0014\u04c5\b\u0014\u0001\u0014\u0003\u0014\u04c8\b\u0014"+
		"\u0001\u0014\u0003\u0014\u04cb\b\u0014\u0001\u0014\u0003\u0014\u04ce\b"+
		"\u0014\u0001\u0014\u0005\u0014\u04d1\b\u0014\n\u0014\f\u0014\u04d4\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u04df\b\u0015\u0001\u0015"+
		"\u0004\u0015\u04e2\b\u0015\u000b\u0015\f\u0015\u04e3\u0001\u0015\u0004"+
		"\u0015\u04e7\b\u0015\u000b\u0015\f\u0015\u04e8\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0004\u0015\u04ef\b\u0015\u000b\u0015\f\u0015"+
		"\u04f0\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u04f6\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u04fc\b\u0015\u000b"+
		"\u0015\f\u0015\u04fd\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0503"+
		"\b\u0015\u0001\u0015\u0004\u0015\u0506\b\u0015\u000b\u0015\f\u0015\u0507"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u050c\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0004\u0015\u0512\b\u0015\u000b\u0015\f\u0015"+
		"\u0513\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0529\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0530\b\u0016\u0001\u0016\u0003"+
		"\u0016\u0533\b\u0016\u0001\u0016\u0003\u0016\u0536\b\u0016\u0001\u0016"+
		"\u0003\u0016\u0539\b\u0016\u0001\u0016\u0003\u0016\u053c\b\u0016\u0001"+
		"\u0016\u0003\u0016\u053f\b\u0016\u0001\u0016\u0005\u0016\u0542\b\u0016"+
		"\n\u0016\f\u0016\u0545\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u054e\b\u0016\u0001"+
		"\u0016\u0003\u0016\u0551\b\u0016\u0001\u0016\u0003\u0016\u0554\b\u0016"+
		"\u0001\u0016\u0003\u0016\u0557\b\u0016\u0001\u0016\u0003\u0016\u055a\b"+
		"\u0016\u0001\u0016\u0003\u0016\u055d\b\u0016\u0001\u0016\u0005\u0016\u0560"+
		"\b\u0016\n\u0016\f\u0016\u0563\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u056d\b\u0016\u0001\u0016\u0003\u0016\u0570\b\u0016\u0001\u0016\u0003"+
		"\u0016\u0573\b\u0016\u0001\u0016\u0003\u0016\u0576\b\u0016\u0001\u0016"+
		"\u0003\u0016\u0579\b\u0016\u0001\u0016\u0003\u0016\u057c\b\u0016\u0001"+
		"\u0016\u0005\u0016\u057f\b\u0016\n\u0016\f\u0016\u0582\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u058a\b\u0016\u0001\u0016\u0003\u0016\u058d\b\u0016\u0001\u0016\u0003"+
		"\u0016\u0590\b\u0016\u0001\u0016\u0003\u0016\u0593\b\u0016\u0001\u0016"+
		"\u0003\u0016\u0596\b\u0016\u0001\u0016\u0003\u0016\u0599\b\u0016\u0001"+
		"\u0016\u0005\u0016\u059c\b\u0016\n\u0016\f\u0016\u059f\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u05a4\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0004\u0016\u05aa\b\u0016\u000b\u0016\f\u0016"+
		"\u05ab\u0001\u0016\u0003\u0016\u05af\b\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u05b3\b\u0016\u0003\u0016\u05b5\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0004\u0017\u05c0\b\u0017\u000b\u0017\f\u0017\u05c1\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u05c6\b\u0017\u000b\u0017\f\u0017\u05c7"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u05ce\b\u0017"+
		"\u000b\u0017\f\u0017\u05cf\u0001\u0017\u0001\u0017\u0004\u0017\u05d4\b"+
		"\u0017\u000b\u0017\f\u0017\u05d5\u0001\u0017\u0004\u0017\u05d9\b\u0017"+
		"\u000b\u0017\f\u0017\u05da\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017"+
		"\u05e0\b\u0017\u000b\u0017\f\u0017\u05e1\u0001\u0017\u0004\u0017\u05e5"+
		"\b\u0017\u000b\u0017\f\u0017\u05e6\u0001\u0017\u0001\u0017\u0004\u0017"+
		"\u05eb\b\u0017\u000b\u0017\f\u0017\u05ec\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u05f2\b\u0017\u000b\u0017\f\u0017\u05f3\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0004\u0017\u05f9\b\u0017\u000b\u0017\f\u0017"+
		"\u05fa\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u0600\b\u0017\u000b"+
		"\u0017\f\u0017\u0601\u0001\u0017\u0001\u0017\u0004\u0017\u0606\b\u0017"+
		"\u000b\u0017\f\u0017\u0607\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u060e\b\u0017\u000b\u0017\f\u0017\u060f\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u0614\b\u0017\u000b\u0017\f\u0017\u0615\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u061c\b\u0018\u0001\u0018"+
		"\u0003\u0018\u061f\b\u0018\u0001\u0018\u0003\u0018\u0622\b\u0018\u0001"+
		"\u0018\u0003\u0018\u0625\b\u0018\u0001\u0018\u0003\u0018\u0628\b\u0018"+
		"\u0001\u0018\u0005\u0018\u062b\b\u0018\n\u0018\f\u0018\u062e\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0004"+
		"\u001a\u063c\b\u001a\u000b\u001a\f\u001a\u063d\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0645\b\u001b\n\u001b"+
		"\f\u001b\u0648\t\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.0246\u0000\u0001\u0001\u0000\u0005\n\u0742\u0000D\u0001\u0000\u0000"+
		"\u0000\u0002G\u0001\u0000\u0000\u0000\u0004\u00b7\u0001\u0000\u0000\u0000"+
		"\u0006\u00d5\u0001\u0000\u0000\u0000\b\u0124\u0001\u0000\u0000\u0000\n"+
		"\u0153\u0001\u0000\u0000\u0000\f\u0183\u0001\u0000\u0000\u0000\u000e\u0215"+
		"\u0001\u0000\u0000\u0000\u0010\u0241\u0001\u0000\u0000\u0000\u0012\u025a"+
		"\u0001\u0000\u0000\u0000\u0014\u0307\u0001\u0000\u0000\u0000\u0016\u030a"+
		"\u0001\u0000\u0000\u0000\u0018\u0330\u0001\u0000\u0000\u0000\u001a\u036d"+
		"\u0001\u0000\u0000\u0000\u001c\u03aa\u0001\u0000\u0000\u0000\u001e\u03cd"+
		"\u0001\u0000\u0000\u0000 \u03fd\u0001\u0000\u0000\u0000\"\u043b\u0001"+
		"\u0000\u0000\u0000$\u0490\u0001\u0000\u0000\u0000&\u0495\u0001\u0000\u0000"+
		"\u0000(\u04bf\u0001\u0000\u0000\u0000*\u04de\u0001\u0000\u0000\u0000,"+
		"\u05b4\u0001\u0000\u0000\u0000.\u05b8\u0001\u0000\u0000\u00000\u0619\u0001"+
		"\u0000\u0000\u00002\u0637\u0001\u0000\u0000\u00004\u063b\u0001\u0000\u0000"+
		"\u00006\u0646\u0001\u0000\u0000\u00008E\u0003\u0002\u0001\u00009E\u0003"+
		"\b\u0004\u0000:E\u0003\u0006\u0003\u0000;E\u0003\f\u0006\u0000<E\u0003"+
		"\u000e\u0007\u0000=E\u0003\u0012\t\u0000>E\u0003\u0016\u000b\u0000?E\u0003"+
		".\u0017\u0000@E\u0003\u001c\u000e\u0000AE\u0003 \u0010\u0000BE\u0003*"+
		"\u0015\u0000CE\u0003&\u0013\u0000D8\u0001\u0000\u0000\u0000D9\u0001\u0000"+
		"\u0000\u0000D:\u0001\u0000\u0000\u0000D;\u0001\u0000\u0000\u0000D<\u0001"+
		"\u0000\u0000\u0000D=\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000"+
		"D?\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0001\u0001"+
		"\u0000\u0000\u0000FH\u00034\u001a\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0005\n\u0000\u0000LM\u0005\n\u0000\u0000"+
		"MN\u0005\b\u0000\u0000NO\u0005\n\u0000\u0000OP\u0005\b\u0000\u0000PQ\u0005"+
		"\u0004\u0000\u0000QR\u0005\n\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0005"+
		"\n\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0005\n\u0000\u0000VW\u0005"+
		"\u0003\u0000\u0000WX\u0005\n\u0000\u0000XY\u0005\u0003\u0000\u0000YZ\u0005"+
		"\n\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0005\u0003\u0000\u0000\\"+
		"\u00a2\u0005\u0004\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005\u0003\u0000"+
		"\u0000_`\u0005\u0006\u0000\u0000`a\u0005\u0003\u0000\u0000ac\u00032\u0019"+
		"\u0000bd\u00032\u0019\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000eg\u00032\u0019\u0000fe\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hj\u00032\u0019"+
		"\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000km\u00032\u0019\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000np\u00032\u0019\u0000on\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qs\u0003"+
		"2\u0019\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sw\u0001"+
		"\u0000\u0000\u0000tv\u00032\u0019\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0003\u0000"+
		"\u0000{}\u00032\u0019\u0000|~\u00032\u0019\u0000}|\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u00032\u0019\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0084\u0003"+
		"2\u0019\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0087\u00032\u0019"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u008a\u00032\u0019\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u008d\u00032\u0019\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u0091\u0001\u0000\u0000\u0000\u008e\u0090\u00032\u0019\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\u0003\u0000\u0000\u0095\u0096\u0005\b\u0000\u0000\u0096\u0097\u0005"+
		"\u0003\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0005"+
		"\u0004\u0000\u0000\u0099\u009b\u0006\u0001\uffff\uffff\u0000\u009a\u009c"+
		"\u0003\u0004\u0002\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005\u0003\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a2]\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\n\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000\u00a8\u00a9\u0005\n\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa\u00ab\u0005\n\u0000\u0000"+
		"\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad"+
		"\u00af\u0005\n\u0000\u0000\u00ae\u00b0\u0005\n\u0000\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0004\u0000\u0000\u00b4\u00b5"+
		"\u00036\u001b\u0000\u00b5\u00b6\u0006\u0001\uffff\uffff\u0000\u00b6\u0003"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\n\u0000\u0000\u00b8\u00ba\u0005"+
		"\n\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00bd\u0005\n\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00c0\u0005\n\u0000\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005\n\u0000\u0000\u00c2"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005\n\u0000\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\n\u0000\u0000\u00c8\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cd\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cc\u0005\n\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\n\u0000"+
		"\u0000\u00d1\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u0006\u0002\uffff\uffff"+
		"\u0000\u00d3\u0005\u0001\u0000\u0000\u0000\u00d4\u00d6\u00034\u001a\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\n\u0000\u0000\u00da"+
		"\u00db\u0005\u0006\u0000\u0000\u00db\u00dc\u0005\u0007\u0000\u0000\u00dc"+
		"\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0004\u0000\u0000\u00de\u00df"+
		"\u0005\n\u0000\u0000\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0005"+
		"\n\u0000\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u00e3\u0005\b\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4\u00e5\u0005\n\u0000\u0000"+
		"\u00e5\u00e7\u0005\u0004\u0000\u0000\u00e6\u00e8\u00034\u001a\u0000\u00e7"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\b\u0000\u0000\u00ec\u00ed"+
		"\u0005\u0004\u0000\u0000\u00ed\u00ee\u0005\n\u0000\u0000\u00ee\u00ef\u0005"+
		"\n\u0000\u0000\u00ef\u00f0\u0005\n\u0000\u0000\u00f0\u00f1\u0005\n\u0000"+
		"\u0000\u00f1\u0114\u0005\u0004\u0000\u0000\u00f2\u00f3\u0005\b\u0000\u0000"+
		"\u00f3\u00f5\u00032\u0019\u0000\u00f4\u00f6\u00032\u0019\u0000\u00f5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u00032\u0019\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u00032\u0019\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ff\u00032\u0019\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000"+
		"\u0000\u0100\u0102\u00032\u0019\u0000\u0101\u0100\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u00032\u0019\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0109\u0001\u0000\u0000\u0000\u0106"+
		"\u0108\u00032\u0019\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0004\u0000\u0000\u010d\u010e"+
		"\u0005\n\u0000\u0000\u010e\u010f\u0005\b\u0000\u0000\u010f\u0110\u0005"+
		"\b\u0000\u0000\u0110\u0111\u0005\b\u0000\u0000\u0111\u0112\u0005\u0004"+
		"\u0000\u0000\u0112\u0113\u0006\u0003\uffff\uffff\u0000\u0113\u0115\u0001"+
		"\u0000\u0000\u0000\u0114\u00f2\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011c\u0005"+
		"\n\u0000\u0000\u0119\u011b\u00032\u0019\u0000\u011a\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u0004"+
		"\u0000\u0000\u0120\u0121\u00036\u001b\u0000\u0121\u0122\u0006\u0003\uffff"+
		"\uffff\u0000\u0122\u0007\u0001\u0000\u0000\u0000\u0123\u0125\u00034\u001a"+
		"\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005\n\u0000\u0000"+
		"\u0129\u012a\u0005\u0006\u0000\u0000\u012a\u012b\u0005\u0007\u0000\u0000"+
		"\u012b\u012c\u0005\n\u0000\u0000\u012c\u012d\u0005\u0004\u0000\u0000\u012d"+
		"\u012e\u0005\n\u0000\u0000\u012e\u012f\u0005\n\u0000\u0000\u012f\u0130"+
		"\u0005\n\u0000\u0000\u0130\u0131\u0005\n\u0000\u0000\u0131\u0133\u0005"+
		"\u0004\u0000\u0000\u0132\u0134\u0003\n\u0005\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005\n\u0000\u0000\u0138\u0139\u0005\n\u0000"+
		"\u0000\u0139\u013a\u0005\n\u0000\u0000\u013a\u013b\u0005\n\u0000\u0000"+
		"\u013b\u013c\u0005\b\u0000\u0000\u013c\u013e\u0005\u0004\u0000\u0000\u013d"+
		"\u013f\u00034\u001a\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\n\u0000\u0000\u0143\u0144\u0005\u0005\u0000\u0000\u0144\u0145\u0005"+
		"\n\u0000\u0000\u0145\u0146\u0005\n\u0000\u0000\u0146\u0147\u0005\u0004"+
		"\u0000\u0000\u0147\u0148\u0005\n\u0000\u0000\u0148\u0149\u0005\u0004\u0000"+
		"\u0000\u0149\u014a\u0005\n\u0000\u0000\u014a\u014b\u0005\n\u0000\u0000"+
		"\u014b\u014c\u0005\u0004\u0000\u0000\u014c\u014d\u0005\n\u0000\u0000\u014d"+
		"\u014e\u0005\n\u0000\u0000\u014e\u014f\u0005\n\u0000\u0000\u014f\u0150"+
		"\u0005\u0004\u0000\u0000\u0150\u0151\u00036\u001b\u0000\u0151\u0152\u0006"+
		"\u0004\uffff\uffff\u0000\u0152\t\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"\b\u0000\u0000\u0154\u0156\u00032\u0019\u0000\u0155\u0157\u00032\u0019"+
		"\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u015a\u00032\u0019\u0000"+
		"\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u015d\u00032\u0019\u0000\u015c"+
		"\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"\u015f\u0001\u0000\u0000\u0000\u015e\u0160\u00032\u0019\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u0001\u0000\u0000\u0000\u0161\u0163\u00032\u0019\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0167\u0001"+
		"\u0000\u0000\u0000\u0164\u0166\u00032\u0019\u0000\u0165\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016e\u0005\u0004"+
		"\u0000\u0000\u016b\u016c\u0005\b\u0000\u0000\u016c\u016f\u0005\b\u0000"+
		"\u0000\u016d\u016f\u0005\n\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000"+
		"\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005\b\u0000\u0000\u0171\u0172\u0005\b\u0000\u0000\u0172"+
		"\u0173\u0005\b\u0000\u0000\u0173\u017e\u0005\u0004\u0000\u0000\u0174\u0176"+
		"\u0005\n\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0005"+
		"\b\u0000\u0000\u017a\u017c\u0005\b\u0000\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0005\u0004\u0000\u0000\u017e\u0175\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0006\u0005\uffff\uffff\u0000\u0181\u000b\u0001"+
		"\u0000\u0000\u0000\u0182\u0184\u00034\u001a\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0189\u0005\u0003\u0000\u0000\u0188\u018a\u0005\n\u0000"+
		"\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0005\u0003\u0000"+
		"\u0000\u018e\u0190\u0005\n\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000"+
		"\u0193\u0195\u0005\u0003\u0000\u0000\u0194\u0196\u0005\n\u0000\u0000\u0195"+
		"\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u01a0\u0005\u0003\u0000\u0000\u019a"+
		"\u019c\u0005\n\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1"+
		"\u0005\u0003\u0000\u0000\u01a0\u019b\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u020b"+
		"\u0005\u0004\u0000\u0000\u01a5\u01a6\u0005\b\u0000\u0000\u01a6\u01a7\u0005"+
		"\b\u0000\u0000\u01a7\u01a9\u0005\b\u0000\u0000\u01a8\u01aa\u0005\b\u0000"+
		"\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u0003\u0000"+
		"\u0000\u01ae\u01af\u0005\b\u0000\u0000\u01af\u01b0\u0005\u0003\u0000\u0000"+
		"\u01b0\u01b1\u0005\u0006\u0000\u0000\u01b1\u01b2\u0005\u0007\u0000\u0000"+
		"\u01b2\u01b4\u0005\u0003\u0000\u0000\u01b3\u01b5\u00032\u0019\u0000\u01b4"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bc\u0005\u0003\u0000\u0000\u01b9"+
		"\u01bb\u00032\u0019\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be"+
		"\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005\u0003\u0000\u0000\u01c0\u01c2"+
		"\u00032\u0019\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005"+
		"\u0003\u0000\u0000\u01c6\u01c8\u00032\u0019\u0000\u01c7\u01c9\u00032\u0019"+
		"\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc\u00032\u0019\u0000"+
		"\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cf\u00032\u0019\u0000\u01ce"+
		"\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d0\u01d2\u00032\u0019\u0000\u01d1\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d5\u00032\u0019\u0000\u01d4\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u00032\u0019\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01dc\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u00032\u0019\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u0003\u0000"+
		"\u0000\u01e0\u01e2\u00032\u0019\u0000\u01e1\u01e3\u00032\u0019\u0000\u01e2"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e4\u01e6\u00032\u0019\u0000\u01e5\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e9\u00032\u0019\u0000\u01e8\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ec\u00032\u0019\u0000\u01eb\u01ea\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ef\u00032\u0019\u0000\u01ee\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f2\u00032\u0019\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f5\u00032\u0019\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005\u0003\u0000\u0000\u01fa"+
		"\u01fc\u00032\u0019\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0005\u0003\u0000\u0000\u0200\u0201\u0005\n\u0000\u0000\u0201\u0203\u0005"+
		"\u0003\u0000\u0000\u0202\u0204\u00032\u0019\u0000\u0203\u0202\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0005\u0003\u0000\u0000\u0208\u0209\u0005\u0004"+
		"\u0000\u0000\u0209\u020a\u0006\u0006\uffff\uffff\u0000\u020a\u020c\u0001"+
		"\u0000\u0000\u0000\u020b\u01a5\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0005"+
		"\n\u0000\u0000\u0210\u0211\u0005\u0004\u0000\u0000\u0211\u0212\u00036"+
		"\u001b\u0000\u0212\u0213\u0006\u0006\uffff\uffff\u0000\u0213\r\u0001\u0000"+
		"\u0000\u0000\u0214\u0216\u00034\u001a\u0000\u0215\u0214\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0005\n\u0000\u0000\u021a\u021b\u0005\n\u0000\u0000"+
		"\u021b\u021c\u0005\b\u0000\u0000\u021c\u021d\u0005\n\u0000\u0000\u021d"+
		"\u021f\u0005\u0004\u0000\u0000\u021e\u0220\u00034\u001a\u0000\u021f\u021e"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u0003\u0000\u0000\u0224\u0225"+
		"\u0005\n\u0000\u0000\u0225\u0226\u0005\u0003\u0000\u0000\u0226\u0227\u0005"+
		"\n\u0000\u0000\u0227\u0228\u0005\u0003\u0000\u0000\u0228\u0229\u0005\n"+
		"\u0000\u0000\u0229\u022a\u0005\u0003\u0000\u0000\u022a\u022b\u0005\n\u0000"+
		"\u0000\u022b\u0232\u0005\u0003\u0000\u0000\u022c\u022e\u0005\n\u0000\u0000"+
		"\u022d\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000"+
		"\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0233\u0005\u0003\u0000\u0000"+
		"\u0232\u022d\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000"+
		"\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0238\u0005\u0004\u0000\u0000"+
		"\u0237\u0239\u0003\u0010\b\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0005\n\u0000\u0000\u023d\u023e\u0005\u0004\u0000\u0000\u023e\u023f"+
		"\u00036\u001b\u0000\u023f\u0240\u0006\u0007\uffff\uffff\u0000\u0240\u000f"+
		"\u0001\u0000\u0000\u0000\u0241\u0242\u0005\u0003\u0000\u0000\u0242\u0243"+
		"\u0005\b\u0000\u0000\u0243\u0244\u0005\u0003\u0000\u0000\u0244\u0245\u0005"+
		"\n\u0000\u0000\u0245\u0246\u0005\u0003\u0000\u0000\u0246\u0247\u0005\u0006"+
		"\u0000\u0000\u0247\u0248\u0005\u0007\u0000\u0000\u0248\u0249\u0005\u0003"+
		"\u0000\u0000\u0249\u024a\u0005\n\u0000\u0000\u024a\u024b\u0005\u0003\u0000"+
		"\u0000\u024b\u024c\u0005\b\u0000\u0000\u024c\u024d\u0005\u0003\u0000\u0000"+
		"\u024d\u024e\u0005\b\u0000\u0000\u024e\u024f\u0005\u0003\u0000\u0000\u024f"+
		"\u0250\u0005\b\u0000\u0000\u0250\u0251\u0005\u0003\u0000\u0000\u0251\u0252"+
		"\u0005\n\u0000\u0000\u0252\u0253\u0005\u0003\u0000\u0000\u0253\u0254\u0005"+
		"\n\u0000\u0000\u0254\u0255\u0005\u0003\u0000\u0000\u0255\u0256\u0005\n"+
		"\u0000\u0000\u0256\u0257\u0005\u0003\u0000\u0000\u0257\u0258\u0005\u0004"+
		"\u0000\u0000\u0258\u0259\u0006\b\uffff\uffff\u0000\u0259\u0011\u0001\u0000"+
		"\u0000\u0000\u025a\u025c\u00032\u0019\u0000\u025b\u025d\u00032\u0019\u0000"+
		"\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u025f\u0001\u0000\u0000\u0000\u025e\u0260\u00032\u0019\u0000\u025f"+
		"\u025e\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260"+
		"\u0262\u0001\u0000\u0000\u0000\u0261\u0263\u00032\u0019\u0000\u0262\u0261"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265"+
		"\u0001\u0000\u0000\u0000\u0264\u0266\u00032\u0019\u0000\u0265\u0264\u0001"+
		"\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0268\u0001"+
		"\u0000\u0000\u0000\u0267\u0269\u00032\u0019\u0000\u0268\u0267\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026b\u0001\u0000"+
		"\u0000\u0000\u026a\u026c\u00032\u0019\u0000\u026b\u026a\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u0270\u0001\u0000\u0000"+
		"\u0000\u026d\u026f\u00032\u0019\u0000\u026e\u026d\u0001\u0000\u0000\u0000"+
		"\u026f\u0272\u0001\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0273\u0001\u0000\u0000\u0000"+
		"\u0272\u0270\u0001\u0000\u0000\u0000\u0273\u0274\u0005\n\u0000\u0000\u0274"+
		"\u0276\u0005\u0004\u0000\u0000\u0275\u0277\u00034\u001a\u0000\u0276\u0275"+
		"\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0276"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0005\n\u0000\u0000\u027b\u027c\u0005"+
		"\n\u0000\u0000\u027c\u027d\u0005\u0007\u0000\u0000\u027d\u027e\u0005\n"+
		"\u0000\u0000\u027e\u027f\u0005\u0004\u0000\u0000\u027f\u0280\u0005\n\u0000"+
		"\u0000\u0280\u0281\u0005\u0004\u0000\u0000\u0281\u0282\u0005\n\u0000\u0000"+
		"\u0282\u0283\u0005\n\u0000\u0000\u0283\u0285\u0005\n\u0000\u0000\u0284"+
		"\u0286\u0005\n\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a"+
		"\u0005\u0004\u0000\u0000\u028a\u028b\u0005\n\u0000\u0000\u028b\u028d\u0005"+
		"\u0004\u0000\u0000\u028c\u028e\u0003\u0014\n\u0000\u028d\u028c\u0001\u0000"+
		"\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292\u0001\u0000"+
		"\u0000\u0000\u0291\u0293\u0005\n\u0000\u0000\u0292\u0291\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000"+
		"\u0000\u0296\u0297\u0005\b\u0000\u0000\u0297\u029f\u0005\u0004\u0000\u0000"+
		"\u0298\u029a\u0005\n\u0000\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u029a"+
		"\u029b\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b"+
		"\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d"+
		"\u029e\u0005\b\u0000\u0000\u029e\u02a0\u0005\u0004\u0000\u0000\u029f\u0299"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u029f"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a5\u0005\n\u0000\u0000\u02a4\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0005\b\u0000\u0000\u02a9\u02aa\u0005\u0004"+
		"\u0000\u0000\u02aa\u02ab\u0005\n\u0000\u0000\u02ab\u02ac\u0005\u0004\u0000"+
		"\u0000\u02ac\u02ad\u00036\u001b\u0000\u02ad\u02ae\u0006\t\uffff\uffff"+
		"\u0000\u02ae\u0013\u0001\u0000\u0000\u0000\u02af\u02b0\u0005\n\u0000\u0000"+
		"\u02b0\u0308\u0005\u0004\u0000\u0000\u02b1\u02b3\u00032\u0019\u0000\u02b2"+
		"\u02b4\u00032\u0019\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02b7"+
		"\u00032\u0019\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b9\u0001\u0000\u0000\u0000\u02b8\u02ba\u0003"+
		"2\u0019\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u02bd\u00032\u0019"+
		"\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bd\u02bf\u0001\u0000\u0000\u0000\u02be\u02c0\u00032\u0019\u0000"+
		"\u02bf\u02be\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02c3\u00032\u0019\u0000\u02c2"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c4\u02c6\u00032\u0019\u0000\u02c5\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02ca"+
		"\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0005\u0004\u0000\u0000\u02cb\u02cc\u00032\u0019\u0000\u02cc\u02cd\u0005"+
		"\b\u0000\u0000\u02cd\u02ce\u0005\b\u0000\u0000\u02ce\u02cf\u0005\b\u0000"+
		"\u0000\u02cf\u02d8\u0005\u0004\u0000\u0000\u02d0\u02d2\u00032\u0019\u0000"+
		"\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005\b\u0000\u0000\u02d6"+
		"\u02d7\u0005\u0004\u0000\u0000\u02d7\u02d9\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u0001\u0000\u0000\u0000\u02da\u02db\u0006\n\uffff\uffff\u0000\u02db"+
		"\u0308\u0001\u0000\u0000\u0000\u02dc\u02de\u00032\u0019\u0000\u02dd\u02df"+
		"\u00032\u0019\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02de\u02df\u0001"+
		"\u0000\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02e2\u0003"+
		"2\u0019\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e4\u0001\u0000\u0000\u0000\u02e3\u02e5\u00032\u0019"+
		"\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e8\u00032\u0019\u0000"+
		"\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02eb\u00032\u0019\u0000\u02ea"+
		"\u02e9\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ec\u02ee\u00032\u0019\u0000\u02ed\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f2"+
		"\u0001\u0000\u0000\u0000\u02ef\u02f1\u00032\u0019\u0000\u02f0\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005"+
		"\b\u0000\u0000\u02f6\u02f7\u0005\b\u0000\u0000\u02f7\u02f8\u0005\b\u0000"+
		"\u0000\u02f8\u02f9\u0005\u0004\u0000\u0000\u02f9\u02fa\u0005\b\u0000\u0000"+
		"\u02fa\u0303\u0005\u0004\u0000\u0000\u02fb\u02fd\u00032\u0019\u0000\u02fc"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0001\u0000\u0000\u0000\u0300\u0301\u0005\b\u0000\u0000\u0301\u0302"+
		"\u0005\u0004\u0000\u0000\u0302\u0304\u0001\u0000\u0000\u0000\u0303\u02fc"+
		"\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u0001\u0000\u0000\u0000\u0305\u0306\u0006\n\uffff\uffff\u0000\u0306\u0308"+
		"\u0001\u0000\u0000\u0000\u0307\u02af\u0001\u0000\u0000\u0000\u0307\u02b1"+
		"\u0001\u0000\u0000\u0000\u0307\u02dc\u0001\u0000\u0000\u0000\u0308\u0015"+
		"\u0001\u0000\u0000\u0000\u0309\u030b\u00034\u001a\u0000\u030a\u0309\u0001"+
		"\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030a\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0001"+
		"\u0000\u0000\u0000\u030e\u030f\u0005\u0006\u0000\u0000\u030f\u0310\u0005"+
		"\n\u0000\u0000\u0310\u0311\u0005\n\u0000\u0000\u0311\u0312\u0005\n\u0000"+
		"\u0000\u0312\u0314\u0005\n\u0000\u0000\u0313\u0315\u0005\n\u0000\u0000"+
		"\u0314\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031a\u0005\u0004\u0000\u0000"+
		"\u0319\u031b\u0003\u0018\f\u0000\u031a\u0319\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0001\u0000\u0000\u0000\u031b\u031d\u0001\u0000\u0000\u0000\u031c"+
		"\u031e\u0003\u001a\r\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000\u0000\u0000\u031f\u0321"+
		"\u00034\u001a\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001"+
		"\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001"+
		"\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0005"+
		"\u0005\u0000\u0000\u0325\u0326\u0005\u0004\u0000\u0000\u0326\u0327\u0005"+
		"\b\u0000\u0000\u0327\u0328\u0005\n\u0000\u0000\u0328\u0329\u0005\u0004"+
		"\u0000\u0000\u0329\u032a\u0005\n\u0000\u0000\u032a\u032b\u0005\n\u0000"+
		"\u0000\u032b\u032c\u0005\u0004\u0000\u0000\u032c\u032d\u00036\u001b\u0000"+
		"\u032d\u032e\u0006\u000b\uffff\uffff\u0000\u032e\u0017\u0001\u0000\u0000"+
		"\u0000\u032f\u0331\u00034\u001a\u0000\u0330\u032f\u0001\u0000\u0000\u0000"+
		"\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000"+
		"\u0334\u0336\u0005\n\u0000\u0000\u0335\u0337\u00032\u0019\u0000\u0336"+
		"\u0335\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338"+
		"\u0336\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0001\u0000\u0000\u0000\u033a\u0360\u0005\u0004\u0000\u0000\u033b"+
		"\u033c\u0005\u0003\u0000\u0000\u033c\u033e\u00032\u0019\u0000\u033d\u033f"+
		"\u00032\u0019\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001"+
		"\u0000\u0000\u0000\u033f\u0341\u0001\u0000\u0000\u0000\u0340\u0342\u0003"+
		"2\u0019\u0000\u0341\u0340\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000"+
		"\u0000\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u0345\u00032\u0019"+
		"\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000"+
		"\u0000\u0345\u0347\u0001\u0000\u0000\u0000\u0346\u0348\u00032\u0019\u0000"+
		"\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000"+
		"\u0348\u034a\u0001\u0000\u0000\u0000\u0349\u034b\u00032\u0019\u0000\u034a"+
		"\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b"+
		"\u034d\u0001\u0000\u0000\u0000\u034c\u034e\u00032\u0019\u0000\u034d\u034c"+
		"\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0352"+
		"\u0001\u0000\u0000\u0000\u034f\u0351\u00032\u0019\u0000\u0350\u034f\u0001"+
		"\u0000\u0000\u0000\u0351\u0354\u0001\u0000\u0000\u0000\u0352\u0350\u0001"+
		"\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0355\u0001"+
		"\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0356\u0005"+
		"\u0003\u0000\u0000\u0356\u0357\u0005\n\u0000\u0000\u0357\u0358\u0005\b"+
		"\u0000\u0000\u0358\u0359\u0005\n\u0000\u0000\u0359\u035a\u0005\n\u0000"+
		"\u0000\u035a\u035b\u0005\b\u0000\u0000\u035b\u035c\u0005\n\u0000\u0000"+
		"\u035c\u035d\u0005\u0003\u0000\u0000\u035d\u035e\u0005\u0004\u0000\u0000"+
		"\u035e\u035f\u0006\f\uffff\uffff\u0000\u035f\u0361\u0001\u0000\u0000\u0000"+
		"\u0360\u033b\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000"+
		"\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000"+
		"\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0366\u0005\n\u0000\u0000\u0365"+
		"\u0367\u00032\u0019\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0367\u0368"+
		"\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0368\u0369"+
		"\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000\u036a\u036b"+
		"\u0005\u0004\u0000\u0000\u036b\u0019\u0001\u0000\u0000\u0000\u036c\u036e"+
		"\u00034\u001a\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u036f\u0001"+
		"\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370\u0001"+
		"\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0373\u0005"+
		"\n\u0000\u0000\u0372\u0374\u00032\u0019\u0000\u0373\u0372\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000"+
		"\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000"+
		"\u0000\u0000\u0377\u03a2\u0005\u0004\u0000\u0000\u0378\u0379\u0005\u0003"+
		"\u0000\u0000\u0379\u037b\u00032\u0019\u0000\u037a\u037c\u00032\u0019\u0000"+
		"\u037b\u037a\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000"+
		"\u037c\u037e\u0001\u0000\u0000\u0000\u037d\u037f\u00032\u0019\u0000\u037e"+
		"\u037d\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f"+
		"\u0381\u0001\u0000\u0000\u0000\u0380\u0382\u00032\u0019\u0000\u0381\u0380"+
		"\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0384"+
		"\u0001\u0000\u0000\u0000\u0383\u0385\u00032\u0019\u0000\u0384\u0383\u0001"+
		"\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0387\u0001"+
		"\u0000\u0000\u0000\u0386\u0388\u00032\u0019\u0000\u0387\u0386\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u038a\u0001\u0000"+
		"\u0000\u0000\u0389\u038b\u00032\u0019\u0000\u038a\u0389\u0001\u0000\u0000"+
		"\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038f\u0001\u0000\u0000"+
		"\u0000\u038c\u038e\u00032\u0019\u0000\u038d\u038c\u0001\u0000\u0000\u0000"+
		"\u038e\u0391\u0001\u0000\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000"+
		"\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0392\u0001\u0000\u0000\u0000"+
		"\u0391\u038f\u0001\u0000\u0000\u0000\u0392\u0393\u0005\u0003\u0000\u0000"+
		"\u0393\u0394\u0005\n\u0000\u0000\u0394\u0395\u0005\b\u0000\u0000\u0395"+
		"\u0396\u0005\n\u0000\u0000\u0396\u0397\u0005\n\u0000\u0000\u0397\u0398"+
		"\u0005\b\u0000\u0000\u0398\u0399\u0005\n\u0000\u0000\u0399\u039a\u0005"+
		"\n\u0000\u0000\u039a\u039b\u0005\n\u0000\u0000\u039b\u039c\u0005\n\u0000"+
		"\u0000\u039c\u039d\u0005\b\u0000\u0000\u039d\u039e\u0005\n\u0000\u0000"+
		"\u039e\u039f\u0005\u0003\u0000\u0000\u039f\u03a0\u0005\u0004\u0000\u0000"+
		"\u03a0\u03a1\u0006\r\uffff\uffff\u0000\u03a1\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a2\u0378\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005\n\u0000\u0000\u03a7"+
		"\u03a8\u0005\u0004\u0000\u0000\u03a8\u001b\u0001\u0000\u0000\u0000\u03a9"+
		"\u03ab\u00034\u001a\u0000\u03aa\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ac"+
		"\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ad"+
		"\u0001\u0000\u0000\u0000\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u03b0"+
		"\u00032\u0019\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b4\u0005"+
		"\u0006\u0000\u0000\u03b4\u03b5\u0005\u0007\u0000\u0000\u03b5\u03b6\u0005"+
		"\n\u0000\u0000\u03b6\u03b8\u0005\u0006\u0000\u0000\u03b7\u03b9\u00032"+
		"\u0019\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000"+
		"\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000"+
		"\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005\u0004"+
		"\u0000\u0000\u03bd\u03be\u0005\n\u0000\u0000\u03be\u03bf\u0005\n\u0000"+
		"\u0000\u03bf\u03c1\u0005\u0004\u0000\u0000\u03c0\u03c2\u0003\u001e\u000f"+
		"\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000"+
		"\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6\u0005\n\u0000\u0000"+
		"\u03c6\u03c7\u0005\n\u0000\u0000\u03c7\u03c8\u0005\u0004\u0000\u0000\u03c8"+
		"\u03c9\u0005\n\u0000\u0000\u03c9\u03ca\u0005\u0004\u0000\u0000\u03ca\u03cb"+
		"\u00036\u001b\u0000\u03cb\u03cc\u0006\u000e\uffff\uffff\u0000\u03cc\u001d"+
		"\u0001\u0000\u0000\u0000\u03cd\u03cf\u00032\u0019\u0000\u03ce\u03d0\u0003"+
		"2\u0019\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d0\u03d2\u0001\u0000\u0000\u0000\u03d1\u03d3\u00032\u0019"+
		"\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4\u03d6\u00032\u0019\u0000"+
		"\u03d5\u03d4\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d8\u0001\u0000\u0000\u0000\u03d7\u03d9\u00032\u0019\u0000\u03d8"+
		"\u03d7\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9"+
		"\u03db\u0001\u0000\u0000\u0000\u03da\u03dc\u00032\u0019\u0000\u03db\u03da"+
		"\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03de"+
		"\u0001\u0000\u0000\u0000\u03dd\u03df\u00032\u0019\u0000\u03de\u03dd\u0001"+
		"\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e2\u00032\u0019\u0000\u03e1\u03e0\u0001\u0000"+
		"\u0000\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e6\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e6\u03e7\u0005\n\u0000"+
		"\u0000\u03e7\u03e9\u0005\b\u0000\u0000\u03e8\u03ea\u0005\n\u0000\u0000"+
		"\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000"+
		"\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ef\u0005\b\u0000\u0000\u03ee"+
		"\u03f0\u0005\n\u0000\u0000\u03ef\u03ee\u0001\u0000\u0000\u0000\u03f0\u03f1"+
		"\u0001\u0000\u0000\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f2"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f5"+
		"\u0005\b\u0000\u0000\u03f4\u03f6\u0005\n\u0000\u0000\u03f5\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001"+
		"\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001"+
		"\u0000\u0000\u0000\u03f9\u03fa\u0005\u0004\u0000\u0000\u03fa\u03fb\u0006"+
		"\u000f\uffff\uffff\u0000\u03fb\u001f\u0001\u0000\u0000\u0000\u03fc\u03fe"+
		"\u00034\u001a\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001"+
		"\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u0400\u0001"+
		"\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u0402\u0005"+
		"\n\u0000\u0000\u0402\u0403\u0005\u0006\u0000\u0000\u0403\u0404\u0005\u0007"+
		"\u0000\u0000\u0404\u0405\u0005\n\u0000\u0000\u0405\u0407\u0005\u0006\u0000"+
		"\u0000\u0406\u0408\u0005\n\u0000\u0000\u0407\u0406\u0001\u0000\u0000\u0000"+
		"\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000"+
		"\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000"+
		"\u040b\u040d\u0005\b\u0000\u0000\u040c\u040e\u0005\n\u0000\u0000\u040d"+
		"\u040c\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f"+
		"\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410"+
		"\u0411\u0001\u0000\u0000\u0000\u0411\u0412\u0005\u0004\u0000\u0000\u0412"+
		"\u0413\u0005\n\u0000\u0000\u0413\u0414\u0005\n\u0000\u0000\u0414\u041d"+
		"\u0005\u0004\u0000\u0000\u0415\u0417\u0003\"\u0011\u0000\u0416\u0418\u0003"+
		"\"\u0011\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000"+
		"\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000"+
		"\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041c\u0005\u0004"+
		"\u0000\u0000\u041c\u041e\u0001\u0000\u0000\u0000\u041d\u0415\u0001\u0000"+
		"\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000"+
		"\u0000\u0000\u041f\u0420\u0005\n\u0000\u0000\u0420\u0421\u0005\n\u0000"+
		"\u0000\u0421\u0423\u0005\u0004\u0000\u0000\u0422\u0424\u00034\u001a\u0000"+
		"\u0423\u0422\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000"+
		"\u0425\u0423\u0001\u0000\u0000\u0000\u0425\u0426\u0001\u0000\u0000\u0000"+
		"\u0426\u0428\u0001\u0000\u0000\u0000\u0427\u0429\u0005\n\u0000\u0000\u0428"+
		"\u0427\u0001\u0000\u0000\u0000\u0429\u042a\u0001\u0000\u0000\u0000\u042a"+
		"\u0428\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0001\u0000\u0000\u0000\u042c\u042e\u0005\u0004\u0000\u0000\u042d"+
		"\u042f\u0003$\u0012\u0000\u042e\u042d\u0001\u0000\u0000\u0000\u042f\u0430"+
		"\u0001\u0000\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u0431"+
		"\u0001\u0000\u0000\u0000\u0431\u0433\u0001\u0000\u0000\u0000\u0432\u0434"+
		"\u0005\n\u0000\u0000\u0433\u0432\u0001\u0000\u0000\u0000\u0434\u0435\u0001"+
		"\u0000\u0000\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0435\u0436\u0001"+
		"\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0438\u0005"+
		"\u0004\u0000\u0000\u0438\u0439\u00036\u001b\u0000\u0439\u043a\u0006\u0010"+
		"\uffff\uffff\u0000\u043a!\u0001\u0000\u0000\u0000\u043b\u043c\u0005\n"+
		"\u0000\u0000\u043c\u043d\u0005\n\u0000\u0000\u043d\u043e\u0006\u0011\uffff"+
		"\uffff\u0000\u043e#\u0001\u0000\u0000\u0000\u043f\u0441\u00032\u0019\u0000"+
		"\u0440\u0442\u00032\u0019\u0000\u0441\u0440\u0001\u0000\u0000\u0000\u0441"+
		"\u0442\u0001\u0000\u0000\u0000\u0442\u0444\u0001\u0000\u0000\u0000\u0443"+
		"\u0445\u00032\u0019\u0000\u0444\u0443\u0001\u0000\u0000\u0000\u0444\u0445"+
		"\u0001\u0000\u0000\u0000\u0445\u0447\u0001\u0000\u0000\u0000\u0446\u0448"+
		"\u00032\u0019\u0000\u0447\u0446\u0001\u0000\u0000\u0000\u0447\u0448\u0001"+
		"\u0000\u0000\u0000\u0448\u044a\u0001\u0000\u0000\u0000\u0449\u044b\u0003"+
		"2\u0019\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000"+
		"\u0000\u0000\u044b\u044d\u0001\u0000\u0000\u0000\u044c\u044e\u00032\u0019"+
		"\u0000\u044d\u044c\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000"+
		"\u0000\u044e\u0450\u0001\u0000\u0000\u0000\u044f\u0451\u00032\u0019\u0000"+
		"\u0450\u044f\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000"+
		"\u0451\u0455\u0001\u0000\u0000\u0000\u0452\u0454\u00032\u0019\u0000\u0453"+
		"\u0452\u0001\u0000\u0000\u0000\u0454\u0457\u0001\u0000\u0000\u0000\u0455"+
		"\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456"+
		"\u0458\u0001\u0000\u0000\u0000\u0457\u0455\u0001\u0000\u0000\u0000\u0458"+
		"\u0459\u0005\n\u0000\u0000\u0459\u045a\u0005\n\u0000\u0000\u045a\u045b"+
		"\u0005\b\u0000\u0000\u045b\u045c\u0005\n\u0000\u0000\u045c\u045d\u0005"+
		"\u0003\u0000\u0000\u045d\u045e\u0005\u0003\u0000\u0000\u045e\u045f\u0005"+
		"\u0003\u0000\u0000\u045f\u0460\u0005\u0003\u0000\u0000\u0460\u0461\u0005"+
		"\u0004\u0000\u0000\u0461\u0462\u0006\u0012\uffff\uffff\u0000\u0462\u0491"+
		"\u0001\u0000\u0000\u0000\u0463\u0465\u00032\u0019\u0000\u0464\u0466\u0003"+
		"2\u0019\u0000\u0465\u0464\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000"+
		"\u0000\u0000\u0466\u0468\u0001\u0000\u0000\u0000\u0467\u0469\u00032\u0019"+
		"\u0000\u0468\u0467\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000"+
		"\u0000\u0469\u046b\u0001\u0000\u0000\u0000\u046a\u046c\u00032\u0019\u0000"+
		"\u046b\u046a\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000\u0000\u0000"+
		"\u046c\u046e\u0001\u0000\u0000\u0000\u046d\u046f\u00032\u0019\u0000\u046e"+
		"\u046d\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f"+
		"\u0471\u0001\u0000\u0000\u0000\u0470\u0472\u00032\u0019\u0000\u0471\u0470"+
		"\u0001\u0000\u0000\u0000\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u0474"+
		"\u0001\u0000\u0000\u0000\u0473\u0475\u00032\u0019\u0000\u0474\u0473\u0001"+
		"\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0479\u0001"+
		"\u0000\u0000\u0000\u0476\u0478\u00032\u0019\u0000\u0477\u0476\u0001\u0000"+
		"\u0000\u0000\u0478\u047b\u0001\u0000\u0000\u0000\u0479\u0477\u0001\u0000"+
		"\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u047c\u0001\u0000"+
		"\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047c\u047d\u0005\b\u0000"+
		"\u0000\u047d\u047e\u0005\n\u0000\u0000\u047e\u047f\u0005\n\u0000\u0000"+
		"\u047f\u0480\u0005\b\u0000\u0000\u0480\u0481\u0005\n\u0000\u0000\u0481"+
		"\u0483\u0005\u0003\u0000\u0000\u0482\u0484\u0005\b\u0000\u0000\u0483\u0482"+
		"\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484\u0485"+
		"\u0001\u0000\u0000\u0000\u0485\u0486\u0005\u0003\u0000\u0000\u0486\u0487"+
		"\u0005\b\u0000\u0000\u0487\u0488\u0005\n\u0000\u0000\u0488\u048a\u0005"+
		"\u0003\u0000\u0000\u0489\u048b\u0005\n\u0000\u0000\u048a\u0489\u0001\u0000"+
		"\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000"+
		"\u0000\u0000\u048c\u048d\u0005\u0003\u0000\u0000\u048d\u048e\u0005\u0004"+
		"\u0000\u0000\u048e\u048f\u0006\u0012\uffff\uffff\u0000\u048f\u0491\u0001"+
		"\u0000\u0000\u0000\u0490\u043f\u0001\u0000\u0000\u0000\u0490\u0463\u0001"+
		"\u0000\u0000\u0000\u0491%\u0001\u0000\u0000\u0000\u0492\u0494\u00034\u001a"+
		"\u0000\u0493\u0492\u0001\u0000\u0000\u0000\u0494\u0497\u0001\u0000\u0000"+
		"\u0000\u0495\u0493\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000"+
		"\u0000\u0496\u0498\u0001\u0000\u0000\u0000\u0497\u0495\u0001\u0000\u0000"+
		"\u0000\u0498\u049a\u00032\u0019\u0000\u0499\u049b\u00032\u0019\u0000\u049a"+
		"\u0499\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b"+
		"\u049d\u0001\u0000\u0000\u0000\u049c\u049e\u00032\u0019\u0000\u049d\u049c"+
		"\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000\u0000\u0000\u049e\u04a0"+
		"\u0001\u0000\u0000\u0000\u049f\u04a1\u00032\u0019\u0000\u04a0\u049f\u0001"+
		"\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000\u0000\u04a1\u04a3\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a4\u00032\u0019\u0000\u04a3\u04a2\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000"+
		"\u0000\u0000\u04a5\u04a6\u0005\u0006\u0000\u0000\u04a6\u04a7\u0005\u0007"+
		"\u0000\u0000\u04a7\u04a8\u0005\b\u0000\u0000\u04a8\u04ac\u0005\u0004\u0000"+
		"\u0000\u04a9\u04ab\u00034\u001a\u0000\u04aa\u04a9\u0001\u0000\u0000\u0000"+
		"\u04ab\u04ae\u0001\u0000\u0000\u0000\u04ac\u04aa\u0001\u0000\u0000\u0000"+
		"\u04ac\u04ad\u0001\u0000\u0000\u0000\u04ad\u04af\u0001\u0000\u0000\u0000"+
		"\u04ae\u04ac\u0001\u0000\u0000\u0000\u04af\u04b0\u0005\n\u0000\u0000\u04b0"+
		"\u04b2\u0005\n\u0000\u0000\u04b1\u04b3\u0005\n\u0000\u0000\u04b2\u04b1"+
		"\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b2"+
		"\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000\u04b5\u04b6"+
		"\u0001\u0000\u0000\u0000\u04b6\u04b8\u0005\u0004\u0000\u0000\u04b7\u04b9"+
		"\u0003(\u0014\u0000\u04b8\u04b7\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001"+
		"\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001"+
		"\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04bd\u0003"+
		"6\u001b\u0000\u04bd\u04be\u0006\u0013\uffff\uffff\u0000\u04be\'\u0001"+
		"\u0000\u0000\u0000\u04bf\u04c1\u00032\u0019\u0000\u04c0\u04c2\u00032\u0019"+
		"\u0000\u04c1\u04c0\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c4\u0001\u0000\u0000\u0000\u04c3\u04c5\u00032\u0019\u0000"+
		"\u04c4\u04c3\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000"+
		"\u04c5\u04c7\u0001\u0000\u0000\u0000\u04c6\u04c8\u00032\u0019\u0000\u04c7"+
		"\u04c6\u0001\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8"+
		"\u04ca\u0001\u0000\u0000\u0000\u04c9\u04cb\u00032\u0019\u0000\u04ca\u04c9"+
		"\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cd"+
		"\u0001\u0000\u0000\u0000\u04cc\u04ce\u00032\u0019\u0000\u04cd\u04cc\u0001"+
		"\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u04d2\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d1\u00032\u0019\u0000\u04d0\u04cf\u0001\u0000"+
		"\u0000\u0000\u04d1\u04d4\u0001\u0000\u0000\u0000\u04d2\u04d0\u0001\u0000"+
		"\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d5\u04d6\u0005\b\u0000"+
		"\u0000\u04d6\u04d7\u0005\b\u0000\u0000\u04d7\u04d8\u0005\b\u0000\u0000"+
		"\u04d8\u04d9\u0005\u0004\u0000\u0000\u04d9\u04da\u0006\u0014\uffff\uffff"+
		"\u0000\u04da)\u0001\u0000\u0000\u0000\u04db\u04dc\u0005\n\u0000\u0000"+
		"\u04dc\u04dd\u0005\n\u0000\u0000\u04dd\u04df\u0005\u0004\u0000\u0000\u04de"+
		"\u04db\u0001\u0000\u0000\u0000\u04de\u04df\u0001\u0000\u0000\u0000\u04df"+
		"\u04e1\u0001\u0000\u0000\u0000\u04e0\u04e2\u00034\u001a\u0000\u04e1\u04e0"+
		"\u0001\u0000\u0000\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e1"+
		"\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000\u0000\u0000\u04e4\u04e6"+
		"\u0001\u0000\u0000\u0000\u04e5\u04e7\u0005\n\u0000\u0000\u04e6\u04e5\u0001"+
		"\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u04e6\u0001"+
		"\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001"+
		"\u0000\u0000\u0000\u04ea\u04eb\u0005\u0006\u0000\u0000\u04eb\u04ec\u0005"+
		"\u0007\u0000\u0000\u04ec\u04ee\u0005\n\u0000\u0000\u04ed\u04ef\u0005\n"+
		"\u0000\u0000\u04ee\u04ed\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001\u0000"+
		"\u0000\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f5\u0005\u0004"+
		"\u0000\u0000\u04f3\u04f4\u0005\n\u0000\u0000\u04f4\u04f6\u0005\u0004\u0000"+
		"\u0000\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f5\u04f6\u0001\u0000\u0000"+
		"\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04f8\u0005\n\u0000\u0000"+
		"\u04f8\u04f9\u0005\n\u0000\u0000\u04f9\u04fb\u0005\n\u0000\u0000\u04fa"+
		"\u04fc\u0005\n\u0000\u0000\u04fb\u04fa\u0001\u0000\u0000\u0000\u04fc\u04fd"+
		"\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fd\u04fe"+
		"\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0502"+
		"\u0005\u0004\u0000\u0000\u0500\u0501\u0005\n\u0000\u0000\u0501\u0503\u0005"+
		"\u0004\u0000\u0000\u0502\u0500\u0001\u0000\u0000\u0000\u0502\u0503\u0001"+
		"\u0000\u0000\u0000\u0503\u0505\u0001\u0000\u0000\u0000\u0504\u0506\u0003"+
		",\u0016\u0000\u0505\u0504\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000"+
		"\u0000\u0000\u0507\u0505\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000"+
		"\u0000\u0000\u0508\u050b\u0001\u0000\u0000\u0000\u0509\u050a\u0005\n\u0000"+
		"\u0000\u050a\u050c\u0005\u0004\u0000\u0000\u050b\u0509\u0001\u0000\u0000"+
		"\u0000\u050b\u050c\u0001\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000"+
		"\u0000\u050d\u050e\u0005\n\u0000\u0000\u050e\u050f\u0005\b\u0000\u0000"+
		"\u050f\u0511\u0005\u0004\u0000\u0000\u0510\u0512\u00034\u001a\u0000\u0511"+
		"\u0510\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000\u0513"+
		"\u0511\u0001\u0000\u0000\u0000\u0513\u0514\u0001\u0000\u0000\u0000\u0514"+
		"\u0528\u0001\u0000\u0000\u0000\u0515\u0516\u0005\n\u0000\u0000\u0516\u0517"+
		"\u0005\n\u0000\u0000\u0517\u0518\u0005\n\u0000\u0000\u0518\u0519\u0005"+
		"\b\u0000\u0000\u0519\u051a\u0005\u0004\u0000\u0000\u051a\u051b\u0005\n"+
		"\u0000\u0000\u051b\u051c\u0005\b\u0000\u0000\u051c\u0529\u0005\u0004\u0000"+
		"\u0000\u051d\u051e\u0005\n\u0000\u0000\u051e\u051f\u0005\u0004\u0000\u0000"+
		"\u051f\u0520\u0005\n\u0000\u0000\u0520\u0521\u0005\n\u0000\u0000\u0521"+
		"\u0522\u0005\b\u0000\u0000\u0522\u0523\u0005\u0004\u0000\u0000\u0523\u0524"+
		"\u0005\n\u0000\u0000\u0524\u0525\u0005\b\u0000\u0000\u0525\u0526\u0005"+
		"\u0004\u0000\u0000\u0526\u0527\u0005\n\u0000\u0000\u0527\u0529\u0005\u0004"+
		"\u0000\u0000\u0528\u0515\u0001\u0000\u0000\u0000\u0528\u051d\u0001\u0000"+
		"\u0000\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u052b\u00036\u001b"+
		"\u0000\u052b\u052c\u0006\u0015\uffff\uffff\u0000\u052c+\u0001\u0000\u0000"+
		"\u0000\u052d\u052f\u00032\u0019\u0000\u052e\u0530\u00032\u0019\u0000\u052f"+
		"\u052e\u0001\u0000\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530"+
		"\u0532\u0001\u0000\u0000\u0000\u0531\u0533\u00032\u0019\u0000\u0532\u0531"+
		"\u0001\u0000\u0000\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0535"+
		"\u0001\u0000\u0000\u0000\u0534\u0536\u00032\u0019\u0000\u0535\u0534\u0001"+
		"\u0000\u0000\u0000\u0535\u0536\u0001\u0000\u0000\u0000\u0536\u0538\u0001"+
		"\u0000\u0000\u0000\u0537\u0539\u00032\u0019\u0000\u0538\u0537\u0001\u0000"+
		"\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539\u053b\u0001\u0000"+
		"\u0000\u0000\u053a\u053c\u00032\u0019\u0000\u053b\u053a\u0001\u0000\u0000"+
		"\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u053e\u0001\u0000\u0000"+
		"\u0000\u053d\u053f\u00032\u0019\u0000\u053e\u053d\u0001\u0000\u0000\u0000"+
		"\u053e\u053f\u0001\u0000\u0000\u0000\u053f\u0543\u0001\u0000\u0000\u0000"+
		"\u0540\u0542\u00032\u0019\u0000\u0541\u0540\u0001\u0000\u0000\u0000\u0542"+
		"\u0545\u0001\u0000\u0000\u0000\u0543\u0541\u0001\u0000\u0000\u0000\u0543"+
		"\u0544\u0001\u0000\u0000\u0000\u0544\u0546\u0001\u0000\u0000\u0000\u0545"+
		"\u0543\u0001\u0000\u0000\u0000\u0546\u0547\u0005\u0004\u0000\u0000\u0547"+
		"\u0548\u0005\b\u0000\u0000\u0548\u0549\u0005\b\u0000\u0000\u0549\u054a"+
		"\u0005\u0004\u0000\u0000\u054a\u05b5\u0001\u0000\u0000\u0000\u054b\u054d"+
		"\u00032\u0019\u0000\u054c\u054e\u00032\u0019\u0000\u054d\u054c\u0001\u0000"+
		"\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e\u0550\u0001\u0000"+
		"\u0000\u0000\u054f\u0551\u00032\u0019\u0000\u0550\u054f\u0001\u0000\u0000"+
		"\u0000\u0550\u0551\u0001\u0000\u0000\u0000\u0551\u0553\u0001\u0000\u0000"+
		"\u0000\u0552\u0554\u00032\u0019\u0000\u0553\u0552\u0001\u0000\u0000\u0000"+
		"\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0556\u0001\u0000\u0000\u0000"+
		"\u0555\u0557\u00032\u0019\u0000\u0556\u0555\u0001\u0000\u0000\u0000\u0556"+
		"\u0557\u0001\u0000\u0000\u0000\u0557\u0559\u0001\u0000\u0000\u0000\u0558"+
		"\u055a\u00032\u0019\u0000\u0559\u0558\u0001\u0000\u0000\u0000\u0559\u055a"+
		"\u0001\u0000\u0000\u0000\u055a\u055c\u0001\u0000\u0000\u0000\u055b\u055d"+
		"\u00032\u0019\u0000\u055c\u055b\u0001\u0000\u0000\u0000\u055c\u055d\u0001"+
		"\u0000\u0000\u0000\u055d\u0561\u0001\u0000\u0000\u0000\u055e\u0560\u0003"+
		"2\u0019\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u0560\u0563\u0001\u0000"+
		"\u0000\u0000\u0561\u055f\u0001\u0000\u0000\u0000\u0561\u0562\u0001\u0000"+
		"\u0000\u0000\u0562\u0564\u0001\u0000\u0000\u0000\u0563\u0561\u0001\u0000"+
		"\u0000\u0000\u0564\u0565\u0005\b\u0000\u0000\u0565\u0566\u0005\b\u0000"+
		"\u0000\u0566\u0567\u0005\u0004\u0000\u0000\u0567\u0568\u0005\b\u0000\u0000"+
		"\u0568\u0569\u0005\u0004\u0000\u0000\u0569\u05b5\u0001\u0000\u0000\u0000"+
		"\u056a\u056c\u00032\u0019\u0000\u056b\u056d\u00032\u0019\u0000\u056c\u056b"+
		"\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056f"+
		"\u0001\u0000\u0000\u0000\u056e\u0570\u00032\u0019\u0000\u056f\u056e\u0001"+
		"\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570\u0572\u0001"+
		"\u0000\u0000\u0000\u0571\u0573\u00032\u0019\u0000\u0572\u0571\u0001\u0000"+
		"\u0000\u0000\u0572\u0573\u0001\u0000\u0000\u0000\u0573\u0575\u0001\u0000"+
		"\u0000\u0000\u0574\u0576\u00032\u0019\u0000\u0575\u0574\u0001\u0000\u0000"+
		"\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576\u0578\u0001\u0000\u0000"+
		"\u0000\u0577\u0579\u00032\u0019\u0000\u0578\u0577\u0001\u0000\u0000\u0000"+
		"\u0578\u0579\u0001\u0000\u0000\u0000\u0579\u057b\u0001\u0000\u0000\u0000"+
		"\u057a\u057c\u00032\u0019\u0000\u057b\u057a\u0001\u0000\u0000\u0000\u057b"+
		"\u057c\u0001\u0000\u0000\u0000\u057c\u0580\u0001\u0000\u0000\u0000\u057d"+
		"\u057f\u00032\u0019\u0000\u057e\u057d\u0001\u0000\u0000\u0000\u057f\u0582"+
		"\u0001\u0000\u0000\u0000\u0580\u057e\u0001\u0000\u0000\u0000\u0580\u0581"+
		"\u0001\u0000\u0000\u0000\u0581\u0583\u0001\u0000\u0000\u0000\u0582\u0580"+
		"\u0001\u0000\u0000\u0000\u0583\u0584\u0005\b\u0000\u0000\u0584\u0585\u0005"+
		"\b\u0000\u0000\u0585\u0586\u0005\u0004\u0000\u0000\u0586\u05b5\u0001\u0000"+
		"\u0000\u0000\u0587\u0589\u00032\u0019\u0000\u0588\u058a\u00032\u0019\u0000"+
		"\u0589\u0588\u0001\u0000\u0000\u0000\u0589\u058a\u0001\u0000\u0000\u0000"+
		"\u058a\u058c\u0001\u0000\u0000\u0000\u058b\u058d\u00032\u0019\u0000\u058c"+
		"\u058b\u0001\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000\u058d"+
		"\u058f\u0001\u0000\u0000\u0000\u058e\u0590\u00032\u0019\u0000\u058f\u058e"+
		"\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u0592"+
		"\u0001\u0000\u0000\u0000\u0591\u0593\u00032\u0019\u0000\u0592\u0591\u0001"+
		"\u0000\u0000\u0000\u0592\u0593\u0001\u0000\u0000\u0000\u0593\u0595\u0001"+
		"\u0000\u0000\u0000\u0594\u0596\u00032\u0019\u0000\u0595\u0594\u0001\u0000"+
		"\u0000\u0000\u0595\u0596\u0001\u0000\u0000\u0000\u0596\u0598\u0001\u0000"+
		"\u0000\u0000\u0597\u0599\u00032\u0019\u0000\u0598\u0597\u0001\u0000\u0000"+
		"\u0000\u0598\u0599\u0001\u0000\u0000\u0000\u0599\u059d\u0001\u0000\u0000"+
		"\u0000\u059a\u059c\u00032\u0019\u0000\u059b\u059a\u0001\u0000\u0000\u0000"+
		"\u059c\u059f\u0001\u0000\u0000\u0000\u059d\u059b\u0001\u0000\u0000\u0000"+
		"\u059d\u059e\u0001\u0000\u0000\u0000\u059e\u05a0\u0001\u0000\u0000\u0000"+
		"\u059f\u059d\u0001\u0000\u0000\u0000\u05a0\u05a1\u0005\u0004\u0000\u0000"+
		"\u05a1\u05a3\u0005\b\u0000\u0000\u05a2\u05a4\u0005\b\u0000\u0000\u05a3"+
		"\u05a2\u0001\u0000\u0000\u0000\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4"+
		"\u05a5\u0001\u0000\u0000\u0000\u05a5\u05a6\u0005\b\u0000\u0000\u05a6\u05a7"+
		"\u0005\b\u0000\u0000\u05a7\u05b2\u0005\u0004\u0000\u0000\u05a8\u05aa\u0005"+
		"\n\u0000\u0000\u05a9\u05a8\u0001\u0000\u0000\u0000\u05aa\u05ab\u0001\u0000"+
		"\u0000\u0000\u05ab\u05a9\u0001\u0000\u0000\u0000\u05ab\u05ac\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad\u05af\u0005\b\u0000"+
		"\u0000\u05ae\u05a9\u0001\u0000\u0000\u0000\u05ae\u05af\u0001\u0000\u0000"+
		"\u0000\u05af\u05b0\u0001\u0000\u0000\u0000\u05b0\u05b1\u0005\b\u0000\u0000"+
		"\u05b1\u05b3\u0005\u0004\u0000\u0000\u05b2\u05ae\u0001\u0000\u0000\u0000"+
		"\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b5\u0001\u0000\u0000\u0000"+
		"\u05b4\u052d\u0001\u0000\u0000\u0000\u05b4\u054b\u0001\u0000\u0000\u0000"+
		"\u05b4\u056a\u0001\u0000\u0000\u0000\u05b4\u0587\u0001\u0000\u0000\u0000"+
		"\u05b5\u05b6\u0001\u0000\u0000\u0000\u05b6\u05b7\u0006\u0016\uffff\uffff"+
		"\u0000\u05b7-\u0001\u0000\u0000\u0000\u05b8\u05b9\u0005\n\u0000\u0000"+
		"\u05b9\u05ba\u0005\u0004\u0000\u0000\u05ba\u05bb\u0005\n\u0000\u0000\u05bb"+
		"\u05bc\u0005\n\u0000\u0000\u05bc\u05bd\u0005\n\u0000\u0000\u05bd\u05bf"+
		"\u0005\n\u0000\u0000\u05be\u05c0\u00032\u0019\u0000\u05bf\u05be\u0001"+
		"\u0000\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000\u05c1\u05bf\u0001"+
		"\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2\u05c3\u0001"+
		"\u0000\u0000\u0000\u05c3\u05c5\u0005\u0004\u0000\u0000\u05c4\u05c6\u0003"+
		"4\u001a\u0000\u05c5\u05c4\u0001\u0000\u0000\u0000\u05c6\u05c7\u0001\u0000"+
		"\u0000\u0000\u05c7\u05c5\u0001\u0000\u0000\u0000\u05c7\u05c8\u0001\u0000"+
		"\u0000\u0000\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9\u05ca\u0005\n\u0000"+
		"\u0000\u05ca\u05cb\u0005\n\u0000\u0000\u05cb\u05cd\u0005\n\u0000\u0000"+
		"\u05cc\u05ce\u00032\u0019\u0000\u05cd\u05cc\u0001\u0000\u0000\u0000\u05ce"+
		"\u05cf\u0001\u0000\u0000\u0000\u05cf\u05cd\u0001\u0000\u0000\u0000\u05cf"+
		"\u05d0\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1"+
		"\u05d3\u0005\u0004\u0000\u0000\u05d2\u05d4\u00030\u0018\u0000\u05d3\u05d2"+
		"\u0001\u0000\u0000\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d3"+
		"\u0001\u0000\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d8"+
		"\u0001\u0000\u0000\u0000\u05d7\u05d9\u00032\u0019\u0000\u05d8\u05d7\u0001"+
		"\u0000\u0000\u0000\u05d9\u05da\u0001\u0000\u0000\u0000\u05da\u05d8\u0001"+
		"\u0000\u0000\u0000\u05da\u05db\u0001\u0000\u0000\u0000\u05db\u05dc\u0001"+
		"\u0000\u0000\u0000\u05dc\u05dd\u0005\b\u0000\u0000\u05dd\u05df\u0005\u0004"+
		"\u0000\u0000\u05de\u05e0\u00034\u001a\u0000\u05df\u05de\u0001\u0000\u0000"+
		"\u0000\u05e0\u05e1\u0001\u0000\u0000\u0000\u05e1\u05df\u0001\u0000\u0000"+
		"\u0000\u05e1\u05e2\u0001\u0000\u0000\u0000\u05e2\u05e4\u0001\u0000\u0000"+
		"\u0000\u05e3\u05e5\u00032\u0019\u0000\u05e4\u05e3\u0001\u0000\u0000\u0000"+
		"\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u05e4\u0001\u0000\u0000\u0000"+
		"\u05e6\u05e7\u0001\u0000\u0000\u0000\u05e7\u05e8\u0001\u0000\u0000\u0000"+
		"\u05e8\u05ea\u0005\u0006\u0000\u0000\u05e9\u05eb\u00032\u0019\u0000\u05ea"+
		"\u05e9\u0001\u0000\u0000\u0000\u05eb\u05ec\u0001\u0000\u0000\u0000\u05ec"+
		"\u05ea\u0001\u0000\u0000\u0000\u05ec\u05ed\u0001\u0000\u0000\u0000\u05ed"+
		"\u05ee\u0001\u0000\u0000\u0000\u05ee\u05ef\u0005\u0007\u0000\u0000\u05ef"+
		"\u05f1\u0005\u0004\u0000\u0000\u05f0\u05f2\u00032\u0019\u0000\u05f1\u05f0"+
		"\u0001\u0000\u0000\u0000\u05f2\u05f3\u0001\u0000\u0000\u0000\u05f3\u05f1"+
		"\u0001\u0000\u0000\u0000\u05f3\u05f4\u0001\u0000\u0000\u0000\u05f4\u05f5"+
		"\u0001\u0000\u0000\u0000\u05f5\u05f6\u0005\u0006\u0000\u0000\u05f6\u05f8"+
		"\u0005\u0007\u0000\u0000\u05f7\u05f9\u00032\u0019\u0000\u05f8\u05f7\u0001"+
		"\u0000\u0000\u0000\u05f9\u05fa\u0001\u0000\u0000\u0000\u05fa\u05f8\u0001"+
		"\u0000\u0000\u0000\u05fa\u05fb\u0001\u0000\u0000\u0000\u05fb\u05fc\u0001"+
		"\u0000\u0000\u0000\u05fc\u05fd\u0005\u0004\u0000\u0000\u05fd\u05ff\u0005"+
		"\n\u0000\u0000\u05fe\u0600\u00032\u0019\u0000\u05ff\u05fe\u0001\u0000"+
		"\u0000\u0000\u0600\u0601\u0001\u0000\u0000\u0000\u0601\u05ff\u0001\u0000"+
		"\u0000\u0000\u0601\u0602\u0001\u0000\u0000\u0000\u0602\u0603\u0001\u0000"+
		"\u0000\u0000\u0603\u0605\u0005\u0004\u0000\u0000\u0604\u0606\u00032\u0019"+
		"\u0000\u0605\u0604\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000"+
		"\u0000\u0607\u0605\u0001\u0000\u0000\u0000\u0607\u0608\u0001\u0000\u0000"+
		"\u0000\u0608\u0609\u0001\u0000\u0000\u0000\u0609\u060a\u0005\b\u0000\u0000"+
		"\u060a\u060b\u0005\u0004\u0000\u0000\u060b\u060d\u0005\n\u0000\u0000\u060c"+
		"\u060e\u00032\u0019\u0000\u060d\u060c\u0001\u0000\u0000\u0000\u060e\u060f"+
		"\u0001\u0000\u0000\u0000\u060f\u060d\u0001\u0000\u0000\u0000\u060f\u0610"+
		"\u0001\u0000\u0000\u0000\u0610\u0611\u0001\u0000\u0000\u0000\u0611\u0613"+
		"\u0005\u0004\u0000\u0000\u0612\u0614\u00034\u001a\u0000\u0613\u0612\u0001"+
		"\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000\u0000\u0615\u0613\u0001"+
		"\u0000\u0000\u0000\u0615\u0616\u0001\u0000\u0000\u0000\u0616\u0617\u0001"+
		"\u0000\u0000\u0000\u0617\u0618\u0006\u0017\uffff\uffff\u0000\u0618/\u0001"+
		"\u0000\u0000\u0000\u0619\u061b\u00032\u0019\u0000\u061a\u061c\u00032\u0019"+
		"\u0000\u061b\u061a\u0001\u0000\u0000\u0000\u061b\u061c\u0001\u0000\u0000"+
		"\u0000\u061c\u061e\u0001\u0000\u0000\u0000\u061d\u061f\u00032\u0019\u0000"+
		"\u061e\u061d\u0001\u0000\u0000\u0000\u061e\u061f\u0001\u0000\u0000\u0000"+
		"\u061f\u0621\u0001\u0000\u0000\u0000\u0620\u0622\u00032\u0019\u0000\u0621"+
		"\u0620\u0001\u0000\u0000\u0000\u0621\u0622\u0001\u0000\u0000\u0000\u0622"+
		"\u0624\u0001\u0000\u0000\u0000\u0623\u0625\u00032\u0019\u0000\u0624\u0623"+
		"\u0001\u0000\u0000\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625\u0627"+
		"\u0001\u0000\u0000\u0000\u0626\u0628\u00032\u0019\u0000\u0627\u0626\u0001"+
		"\u0000\u0000\u0000\u0627\u0628\u0001\u0000\u0000\u0000\u0628\u062c\u0001"+
		"\u0000\u0000\u0000\u0629\u062b\u00032\u0019\u0000\u062a\u0629\u0001\u0000"+
		"\u0000\u0000\u062b\u062e\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000"+
		"\u0000\u0000\u062c\u062d\u0001\u0000\u0000\u0000\u062d\u062f\u0001\u0000"+
		"\u0000\u0000\u062e\u062c\u0001\u0000\u0000\u0000\u062f\u0630\u0005\u0004"+
		"\u0000\u0000\u0630\u0631\u00032\u0019\u0000\u0631\u0632\u0005\b\u0000"+
		"\u0000\u0632\u0633\u0005\b\u0000\u0000\u0633\u0634\u0005\b\u0000\u0000"+
		"\u0634\u0635\u0005\u0004\u0000\u0000\u0635\u0636\u0006\u0018\uffff\uffff"+
		"\u0000\u06361\u0001\u0000\u0000\u0000\u0637\u0638\u0007\u0000\u0000\u0000"+
		"\u06383\u0001\u0000\u0000\u0000\u0639\u063c\u00032\u0019\u0000\u063a\u063c"+
		"\u0005\u0003\u0000\u0000\u063b\u0639\u0001\u0000\u0000\u0000\u063b\u063a"+
		"\u0001\u0000\u0000\u0000\u063c\u063d\u0001\u0000\u0000\u0000\u063d\u063b"+
		"\u0001\u0000\u0000\u0000\u063d\u063e\u0001\u0000\u0000\u0000\u063e\u063f"+
		"\u0001\u0000\u0000\u0000\u063f\u0640\u0005\u0004\u0000\u0000\u06405\u0001"+
		"\u0000\u0000\u0000\u0641\u0645\u00032\u0019\u0000\u0642\u0645\u0005\u0003"+
		"\u0000\u0000\u0643\u0645\u0005\u0004\u0000\u0000\u0644\u0641\u0001\u0000"+
		"\u0000\u0000\u0644\u0642\u0001\u0000\u0000\u0000\u0644\u0643\u0001\u0000"+
		"\u0000\u0000\u0645\u0648\u0001\u0000\u0000\u0000\u0646\u0644\u0001\u0000"+
		"\u0000\u0000\u0646\u0647\u0001\u0000\u0000\u0000\u06477\u0001\u0000\u0000"+
		"\u0000\u0648\u0646\u0001\u0000\u0000\u0000\u0107DIcfilorw}\u0080\u0083"+
		"\u0086\u0089\u008c\u0091\u009d\u00a4\u00b1\u00b9\u00bc\u00bf\u00c2\u00c5"+
		"\u00c8\u00cd\u00d7\u00e9\u00f5\u00f8\u00fb\u00fe\u0101\u0104\u0109\u0116"+
		"\u011c\u0126\u0135\u0140\u0156\u0159\u015c\u015f\u0162\u0167\u016e\u0177"+
		"\u017b\u017e\u0185\u018b\u0191\u0197\u019d\u01a2\u01ab\u01b6\u01bc\u01c3"+
		"\u01c8\u01cb\u01ce\u01d1\u01d4\u01d7\u01dc\u01e2\u01e5\u01e8\u01eb\u01ee"+
		"\u01f1\u01f6\u01fd\u0205\u020d\u0217\u0221\u022f\u0234\u023a\u025c\u025f"+
		"\u0262\u0265\u0268\u026b\u0270\u0278\u0287\u028f\u0294\u029b\u02a1\u02a6"+
		"\u02b3\u02b6\u02b9\u02bc\u02bf\u02c2\u02c7\u02d3\u02d8\u02de\u02e1\u02e4"+
		"\u02e7\u02ea\u02ed\u02f2\u02fe\u0303\u0307\u030c\u0316\u031a\u031d\u0322"+
		"\u0332\u0338\u033e\u0341\u0344\u0347\u034a\u034d\u0352\u0362\u0368\u036f"+
		"\u0375\u037b\u037e\u0381\u0384\u0387\u038a\u038f\u03a4\u03ac\u03b1\u03ba"+
		"\u03c3\u03cf\u03d2\u03d5\u03d8\u03db\u03de\u03e3\u03eb\u03f1\u03f7\u03ff"+
		"\u0409\u040f\u0419\u041d\u0425\u042a\u0430\u0435\u0441\u0444\u0447\u044a"+
		"\u044d\u0450\u0455\u0465\u0468\u046b\u046e\u0471\u0474\u0479\u0483\u048a"+
		"\u0490\u0495\u049a\u049d\u04a0\u04a3\u04ac\u04b4\u04ba\u04c1\u04c4\u04c7"+
		"\u04ca\u04cd\u04d2\u04de\u04e3\u04e8\u04f0\u04f5\u04fd\u0502\u0507\u050b"+
		"\u0513\u0528\u052f\u0532\u0535\u0538\u053b\u053e\u0543\u054d\u0550\u0553"+
		"\u0556\u0559\u055c\u0561\u056c\u056f\u0572\u0575\u0578\u057b\u0580\u0589"+
		"\u058c\u058f\u0592\u0595\u0598\u059d\u05a3\u05ab\u05ae\u05b2\u05b4\u05c1"+
		"\u05c7\u05cf\u05d5\u05da\u05e1\u05e6\u05ec\u05f3\u05fa\u0601\u0607\u060f"+
		"\u0615\u061b\u061e\u0621\u0624\u0627\u062c\u063b\u063d\u0644\u0646";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
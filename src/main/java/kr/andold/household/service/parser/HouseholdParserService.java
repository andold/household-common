package kr.andold.household.service.parser;

import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.springframework.stereotype.Service;

import kr.andold.household.antlr.HanaLexer;
import kr.andold.household.antlr.HanaParser;
import kr.andold.household.antlr.HouseholdLexer;
import kr.andold.household.antlr.HouseholdParser;
import kr.andold.household.antlr.HouseholdParser.DocumentContext;
import kr.andold.household.antlr.JbBankLexer;
import kr.andold.household.antlr.JbBankParser;
import kr.andold.household.antlr.KdbLexer;
import kr.andold.household.antlr.KdbParser;
import kr.andold.household.antlr.KoreaInvestLexer;
import kr.andold.household.antlr.KoreaInvestParser;
import kr.andold.household.antlr.NaverLexer;
import kr.andold.household.antlr.NaverParser;
import kr.andold.household.antlr.NaverParser.NaverDocumentContext;
import kr.andold.household.antlr.ReceiptLexer;
import kr.andold.household.antlr.ReceiptParser;
import kr.andold.household.antlr.SamsungInsureLexer;
import kr.andold.household.antlr.SamsungInsureParser;
import kr.andold.household.antlr.ShinhanBankParser;
import kr.andold.household.antlr.ShinhanCardLexer;
import kr.andold.household.antlr.ShinhanCardParser;
import kr.andold.household.antlr.ShinhanInvestLexer;
import kr.andold.household.antlr.ShinhanInvestParser;
import kr.andold.household.web.AccountForm;
import kr.andold.household.web.StatementForm;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HouseholdParserService {
	private static final List<StatementForm> LIST_STATEMENT = StatementForm.LIST_STATEMENT;
	private static final StatementForm STATEMENT = StatementForm.STATEMENT;
	private static final AccountForm ACCOUNT = AccountForm.ACCOUNT;

	public static String tokens(String text) {
		log.info("{} tokens(『{}』)", Utility.indentStart(), Utility.ellipsis(text, 32, 32).replaceAll("\\n", "\\\\n"));

		if (text == null) {
			log.info("{} NULL_PARAMETER::tokens(...)", Utility.indentEnd());
			return Utility.BLANK;
		}

		HouseholdLexer lexer = new HouseholdLexer(CharStreams.fromString(text));
	    String result = tokens(lexer, "NEWLINE");
	 
		log.info("{} tokens(...) - 『{}』", Utility.indentEnd(), Utility.ellipsis(result.trim(), 32, 32).replaceAll("\\n", "\\\\n"));
		return result;
	}

	public static String tokens(Lexer lexer, String eol) {
		log.trace("{} tokens(..., 『{}』)", Utility.indentStart(), eol);

		if (lexer == null || eol == null) {
			log.trace("{} NULL_PARAMETER::tokens(..., 『{}』)", Utility.indentEnd(), eol);
			return Utility.BLANK;
		}

	    List<? extends Token> listToken = lexer.getAllTokens();
	    String result = Utility.BLANK;
	    String input = Utility.BLANK;
	    String output = Utility.BLANK;
	    int maxLength = 0;
	    Vocabulary vocabulary = lexer.getVocabulary();
	    for (int cx = 0, sizex = listToken.size(); cx < sizex; cx++) {
	    	Token token = listToken.get(cx);
	    	String tokenText = token.getText();
	    	int tokenType = token.getType();
	    	String symbolicName = vocabulary.getSymbolicName(tokenType);
	    	if (symbolicName == null) {
	    		symbolicName = Utility.append("【", tokenText, "】");
	    	}
			log.trace("{} 『{}』 『{}』", Utility.indentMiddle(), tokenText.replaceAll("\\n", "\\\\n"), symbolicName);
	    	if (eol.compareToIgnoreCase(symbolicName) == 0) {
	    		output = output.trim();
	    		maxLength = Math.max(maxLength, output.length());
	    		int tabs = Math.min(8, (maxLength - output.length() + 3) / 4);

	    		result += Utility.append(output, "\t\t", Utility.repeat("\t", tabs), symbolicName, "\t\t//\t", input.replaceAll("\\n", "\\\\n"), tokenText);
				log.trace("{} {}\t\t{}{}\t\t//\t{}", Utility.indentMiddle(), output, Utility.repeat("\t", tabs), symbolicName, input.replaceAll("\\n", "\\\\n"));

				input = "";
	    	    output = "";
	    	    continue;
	    	}

	    	input += (tokenText + " ");
    		output += (symbolicName + " ");
	    }
	 
		log.trace("{} tokens(..., 『{}』) - 『{}』", Utility.indentEnd(), eol, Utility.ellipsis(result.trim(), 32, 32).replaceAll("\\n", "\\\\n"));
		return result;
	}

	public static int executeParser(String content, String producer) {
		log.info("{} executeParser(『{}』, 『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32), producer);

		if (producer == null) {
			producer = "";
		}
		
		int result = 0;
		switch (producer) {
		case "기본":
			result = executeParserHousehold(content);
			break;
		case "네이버":
		case "네이버메일":
			result = executeParserNaver(content);
			break;
		case "산업은행":
			result = executeParserKdb(content);
			break;
		case "삼성생명":
			result = executeParserSamsungInsure(content);
			break;
		case "신한은행":
			result = executeParserShinhanBank(content);
			break;
		case "신한카드":
			result = executeParserShinhanCard(content);
			break;
		case "신한투자":
		case "신한투자증권":
			result = executeParserShinhanInvest(content);
			break;
		case "영수증":
			result = executeParserReceipt(content);
			break;
		case "전북은행":
			result = executeParserJbBank(content);
			break;
		case "하나은행":
			result = executeParserHana(content);
			break;
		case "한국투자":
		case "한국투자증권":
			result = executeParserKoreaInvest(content);
			break;
		default:
			result = executeParserHousehold(content);
			if (result <= 0) {
				result = executeParserNaver(content);
			}
			if (result <= 0) {
				result = executeParserKoreaInvest(content);
			}
			if (result <= 0) {
				result = executeParserShinhanInvest(content);
			}
			if (result <= 0) {
				result = executeParserHana(content);
			}
			if (result <= 0) {
				result = executeParserReceipt(content);
			}
			if (result <= 0) {
				result = executeParserJbBank(content);
			}
			if (result <= 0) {
				result = executeParserKdb(content);
			}
			if (result <= 0) {
				result = executeParserShinhanCard(content);
			}
			if (result <= 0) {
				result = executeParserShinhanBank(content);
			}
			break;
		}

		log.info("{} #{} executeParser(『{}』, 『{}』)", Utility.indentEnd(), result, Utility.toStringJson(content, 32, 32), producer);
		return LIST_STATEMENT.size();
	}

	protected static int executeParserHousehold(String content) {
		log.info("{} executeParserHousehold(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		HouseholdLexer lexer = new HouseholdLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		HouseholdParser parser = new HouseholdParser(tokens);

		parser.setTrace(false);
		// Specify our entry point
		@SuppressWarnings("unused") DocumentContext documentContext = parser.document();

		log.info("{} #{} executeParserHousehold(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserJbBank(String content) {
		log.info("{} executeParserJbBank(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		JbBankLexer lexer = new JbBankLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		JbBankParser parser = new JbBankParser(tokens);

		parser.setTrace(false);
		// Specify our entry point
		parser.jbBankDocument();

		log.info("{} #{} executeParserJbBank(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserSamsungInsure(String content) {
		log.info("{} executeParserSamsungInsure(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		SamsungInsureLexer lexer = new SamsungInsureLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		SamsungInsureParser parser = new SamsungInsureParser(tokens);

		parser.setTrace(false);
		parser.samsungInsureDocument();

		log.info("{} #{} executeParserSamsungInsure(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserShinhanBank(String content) {
		log.info("{} executeParserShinhanBank(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		NaverLexer lexer = new NaverLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		ShinhanBankParser parser = new ShinhanBankParser(tokens);

		parser.setTrace(false);
		// Specify our entry point
		parser.shinhanBankDocument();

		log.info("{} #{} executeParserShinhanBank(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserNaver(String content) {
		log.info("{} executeParserNaver(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		NaverLexer lexer = new NaverLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		NaverParser parser = new NaverParser(tokens);

		parser.setTrace(false);
		// Specify our entry point
		@SuppressWarnings("unused") NaverDocumentContext documentContext = parser.naverDocument();

		log.info("{} #{} executeParserNaver(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserKoreaInvest(String content) {
		log.info("{} executeParserKoreaInvest(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		KoreaInvestLexer lexer = new KoreaInvestLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		KoreaInvestParser parser = new KoreaInvestParser(tokens);

		parser.setTrace(false);
		// Specify our entry point
		parser.koreaInvestDocument();

		log.info("{} #{} executeParserKoreaInvest(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserShinhanInvest(String content) {
		log.info("{} executeParserShinhanInvest(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		ShinhanInvestLexer lexer = new ShinhanInvestLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		ShinhanInvestParser parser = new ShinhanInvestParser(tokens);

		parser.setTrace(false);
		parser.shinhanInvestDocument();

		log.info("{} #{} executeParserShinhanInvest(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserHana(String content) {
		log.info("{} executeParserHana(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		HanaLexer lexer = new HanaLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		HanaParser parser = new HanaParser(tokens);

		parser.setTrace(false);
		parser.hanaDocument();

		log.info("{} #{} executeParserHana(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserReceipt(String content) {
		log.info("{} executeParserReceipt(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		ReceiptLexer lexer = new ReceiptLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		ReceiptParser parser = new ReceiptParser(tokens);

		parser.setTrace(false);
		parser.receiptDocument();

		log.info("{} #{} executeParserReceipt(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserKdb(String content) {
		log.info("{} executeParserKdb(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		KdbLexer lexer = new KdbLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		KdbParser parser = new KdbParser(tokens);

		parser.setTrace(false);
		parser.kdbDocument();

		log.info("{} #{} executeParserKdb(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}
	protected static int executeParserShinhanCard(String content) {
		log.info("{} executeParserShinhanCard(『{}』)", Utility.indentStart(), Utility.toStringJson(content, 32, 32));

		ShinhanCardLexer lexer = new ShinhanCardLexer(CharStreams.fromString(content));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		ShinhanCardParser parser = new ShinhanCardParser(tokens);

		parser.setTrace(false);
		parser.shinhanCardDocument();

		log.info("{} #{} executeParserShinhanCard(『{}』)", Utility.indentEnd(), LIST_STATEMENT.size(), Utility.toStringJson(content, 32, 32));
		return LIST_STATEMENT.size();
	}

	public static void testExcelFile(String filename, String producer) {
		log.info("{} testFile(『{}』, 『{}』)", Utility.indentStart(), filename, producer);

		String text = Utility.readClassPathExcelFile(filename);
		testText(text, producer);

		log.info("{} testFile(『{}』, 『{}』)", Utility.indentEnd(), filename, producer);
	}

	public static void testExcelFile(String filename) {
		testExcelFile(filename, null);
	}

	public static void testHtmlFile(String filename) {
		testHtmlFile(filename, null);
	}

	public static void testHtmlFile(String filename, String producer) {
		log.info("{} testHtmlFile(『{}』, 『{}』)", Utility.indentStart(), filename, producer);

		String html = Utility.readClassPathFile(filename);
		String textFromHtml = HtmlParserService.extractTextFromHtml(html);

		testText(textFromHtml, producer);

		log.info("{} textFromHtml = 『\n{}\n』", Utility.indentMiddle(), textFromHtml);
		log.info("{} testHtmlFile(『{}』, 『{}』)", Utility.indentEnd(), filename, producer);
	}

	public static void testText(String text, String producer) {
		HouseholdLexer lexer = new HouseholdLexer(CharStreams.fromString(text));
		String tokensFromText = HouseholdParserService.tokens(lexer, "NEWLINE");

		executeParser(text, producer);

		log.info("{} ACCOUNT = 『{}』", Utility.indentMiddle(), ACCOUNT);
		log.info("{} STATEMENT = 『{}』", Utility.indentMiddle(), STATEMENT);
		log.debug("{} LIST_STATEMENT: #{}", Utility.indentMiddle(), LIST_STATEMENT.size());
		log.info("{} text = 『\n{}\n』", Utility.indentMiddle(), text);
		log.info("{} tokensFromText = 『\n{}\n』", Utility.indentMiddle(),  tokensFromText);

		for (int cx = 0, sizex = LIST_STATEMENT.size(); cx < sizex; cx++) {
			log.debug("{}├ list[{}/{}] = {}", Utility.indent(), cx, sizex, LIST_STATEMENT.get(cx));
		}
	}

	public static void testTextFile(String filename, String producer) {
		log.info("{} testHtmlFileJsoup(『{}』)", Utility.indentStart(), filename);

		String text = Utility.readClassPathFile(filename);
		testText(text, producer);

		log.info("{} testHtmlFileJsonp(『{}』)", Utility.indentEnd(), filename);
	}

	public static void testText(String filename) {
		testText(filename, null);
	}

}

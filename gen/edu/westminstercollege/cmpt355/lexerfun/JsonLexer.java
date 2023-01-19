// Generated from java-escape by ANTLR 4.11.1
package edu.westminstercollege.cmpt355.lexerfun;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, NULL=3, LBRACK=4, RBRACK=5, LBRACE=6, RBRACE=7, COMMA=8, 
		COLON=9, NUMBER=10, STRING=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRUE", "FALSE", "NULL", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", 
			"COLON", "NUMBER", "STRING", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'null'", "'['", "']'", "'{'", "'}'", "','", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "NULL", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"COMMA", "COLON", "NUMBER", "STRING", "WHITESPACE"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0003\t7"+
		"\b\t\u0001\t\u0004\t:\b\t\u000b\t\f\t;\u0001\t\u0001\t\u0004\t@\b\t\u000b"+
		"\t\f\tA\u0001\t\u0003\tE\b\t\u0001\t\u0004\tH\b\t\u000b\t\f\tI\u0003\t"+
		"L\b\t\u0001\n\u0001\n\u0005\nP\b\n\n\n\f\nS\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bX\b\u000b\u000b\u000b\f\u000bY\u0001\u000b\u0001\u000b"+
		"\u0001Q\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001"+
		"\u0000\u0003\u0002\u0000++--\u0001\u000009\u0003\u0000\t\n\r\r  d\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019"+
		"\u0001\u0000\u0000\u0000\u0003\u001e\u0001\u0000\u0000\u0000\u0005$\u0001"+
		"\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000"+
		"\u0000\u000b-\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f"+
		"1\u0001\u0000\u0000\u0000\u00113\u0001\u0000\u0000\u0000\u0013K\u0001"+
		"\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005t\u0000\u0000\u001a\u001b\u0005r\u0000\u0000\u001b"+
		"\u001c\u0005u\u0000\u0000\u001c\u001d\u0005e\u0000\u0000\u001d\u0002\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005f\u0000\u0000\u001f \u0005a\u0000"+
		"\u0000 !\u0005l\u0000\u0000!\"\u0005s\u0000\u0000\"#\u0005e\u0000\u0000"+
		"#\u0004\u0001\u0000\u0000\u0000$%\u0005n\u0000\u0000%&\u0005u\u0000\u0000"+
		"&\'\u0005l\u0000\u0000\'(\u0005l\u0000\u0000(\u0006\u0001\u0000\u0000"+
		"\u0000)*\u0005[\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005]\u0000"+
		"\u0000,\n\u0001\u0000\u0000\u0000-.\u0005{\u0000\u0000.\f\u0001\u0000"+
		"\u0000\u0000/0\u0005}\u0000\u00000\u000e\u0001\u0000\u0000\u000012\u0005"+
		",\u0000\u00002\u0010\u0001\u0000\u0000\u000034\u0005:\u0000\u00004\u0012"+
		"\u0001\u0000\u0000\u000057\u0007\u0000\u0000\u000065\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u00008:\u0007\u0001"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=?\u0005.\u0000\u0000>@\u0007\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BL\u0001\u0000\u0000\u0000CE\u0007\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FH\u0007"+
		"\u0001\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000K6\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000L\u0014\u0001"+
		"\u0000\u0000\u0000MQ\u0005\"\u0000\u0000NP\t\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TU\u0005\"\u0000\u0000U\u0016\u0001\u0000\u0000\u0000VX\u0007\u0002"+
		"\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0006\u000b\u0000\u0000\\\u0018\u0001\u0000\u0000\u0000\t\u00006;"+
		"ADIKQY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
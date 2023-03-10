// Generated from Grammar.g4 by ANTLR 4.7.2

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, STR=3, REA=4, FUN=5, ENQ=6, SE=7, ENT=8, SEN=9, COM=10, 
		APR=11, FPR=12, ACO=13, FCO=14, ACH=15, FCH=16, IMP=17, RET=18, LER=19, 
		ID=20, NUM=21, OP_ARIT=22, OP_REL=23, OP_LOG=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT", "STR", "REA", "FUN", "ENQ", "SE", "ENT", "SEN", "COM", 
			"APR", "FPR", "ACO", "FCO", "ACH", "FCH", "IMP", "RET", "LER", "ID", 
			"NUM", "OP_ARIT", "OP_REL", "OP_LOG", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'INTEIRO'", "'STRING'", "'REAL'", "'FUNCAO'", "'ENQUANTO'", 
			"'SE'", "'ENTAO'", "'SENAO'", "'#'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'IMPRIMIR'", "'RETORNA'", "'LER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "STR", "REA", "FUN", "ENQ", "SE", "ENT", "SEN", "COM", 
			"APR", "FPR", "ACO", "FCO", "ACH", "FCH", "IMP", "RET", "LER", "ID", 
			"NUM", "OP_ARIT", "OP_REL", "OP_LOG", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u0095\n\25\f\25\16\25\u0098\13\25\3\26\3\26\3\26"+
		"\5\26\u009d\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00aa\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\7\34\u00b3\n\34\f"+
		"\34\16\34\u00b6\13\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\2\65\2\67\33\3\2\7\5\2,-//\61\61\4\2((~~\4\2C\\c|\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3"+
		"\2\2\2\7C\3\2\2\2\tJ\3\2\2\2\13O\3\2\2\2\rV\3\2\2\2\17_\3\2\2\2\21b\3"+
		"\2\2\2\23h\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35"+
		"v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%\u0085\3\2\2\2\'\u008d\3\2\2"+
		"\2)\u0091\3\2\2\2+\u0099\3\2\2\2-\u009e\3\2\2\2/\u00a9\3\2\2\2\61\u00ab"+
		"\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b4\3\2\2\29:\7?\2\2:"+
		"\4\3\2\2\2;<\7K\2\2<=\7P\2\2=>\7V\2\2>?\7G\2\2?@\7K\2\2@A\7T\2\2AB\7Q"+
		"\2\2B\6\3\2\2\2CD\7U\2\2DE\7V\2\2EF\7T\2\2FG\7K\2\2GH\7P\2\2HI\7I\2\2"+
		"I\b\3\2\2\2JK\7T\2\2KL\7G\2\2LM\7C\2\2MN\7N\2\2N\n\3\2\2\2OP\7H\2\2PQ"+
		"\7W\2\2QR\7P\2\2RS\7E\2\2ST\7C\2\2TU\7Q\2\2U\f\3\2\2\2VW\7G\2\2WX\7P\2"+
		"\2XY\7S\2\2YZ\7W\2\2Z[\7C\2\2[\\\7P\2\2\\]\7V\2\2]^\7Q\2\2^\16\3\2\2\2"+
		"_`\7U\2\2`a\7G\2\2a\20\3\2\2\2bc\7G\2\2cd\7P\2\2de\7V\2\2ef\7C\2\2fg\7"+
		"Q\2\2g\22\3\2\2\2hi\7U\2\2ij\7G\2\2jk\7P\2\2kl\7C\2\2lm\7Q\2\2m\24\3\2"+
		"\2\2no\7%\2\2o\26\3\2\2\2pq\7*\2\2q\30\3\2\2\2rs\7+\2\2s\32\3\2\2\2tu"+
		"\7]\2\2u\34\3\2\2\2vw\7_\2\2w\36\3\2\2\2xy\7}\2\2y \3\2\2\2z{\7\177\2"+
		"\2{\"\3\2\2\2|}\7K\2\2}~\7O\2\2~\177\7R\2\2\177\u0080\7T\2\2\u0080\u0081"+
		"\7K\2\2\u0081\u0082\7O\2\2\u0082\u0083\7K\2\2\u0083\u0084\7T\2\2\u0084"+
		"$\3\2\2\2\u0085\u0086\7T\2\2\u0086\u0087\7G\2\2\u0087\u0088\7V\2\2\u0088"+
		"\u0089\7Q\2\2\u0089\u008a\7T\2\2\u008a\u008b\7P\2\2\u008b\u008c\7C\2\2"+
		"\u008c&\3\2\2\2\u008d\u008e\7N\2\2\u008e\u008f\7G\2\2\u008f\u0090\7T\2"+
		"\2\u0090(\3\2\2\2\u0091\u0096\5\63\32\2\u0092\u0095\5\65\33\2\u0093\u0095"+
		"\5\63\32\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097*\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0099\u009c\5\65\33\2\u009a\u009b\7\60\2\2\u009b\u009d\5\65\33"+
		"\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d,\3\2\2\2\u009e\u009f"+
		"\t\2\2\2\u009f.\3\2\2\2\u00a0\u00aa\4>@\2\u00a1\u00a2\7?\2\2\u00a2\u00aa"+
		"\7?\2\2\u00a3\u00a4\7>\2\2\u00a4\u00aa\7?\2\2\u00a5\u00a6\7@\2\2\u00a6"+
		"\u00aa\7?\2\2\u00a7\u00a8\7#\2\2\u00a8\u00aa\7?\2\2\u00a9\u00a0\3\2\2"+
		"\2\u00a9\u00a1\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac\62\3\2\2\2\u00ad\u00ae"+
		"\t\4\2\2\u00ae\64\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0\66\3\2\2\2\u00b1\u00b3"+
		"\t\6\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\34"+
		"\2\2\u00b88\3\2\2\2\b\2\u0094\u0096\u009c\u00a9\u00b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
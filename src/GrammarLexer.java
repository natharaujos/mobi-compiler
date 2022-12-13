// Generated from Grammar.g4 by ANTLR 4.7.2
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
		INT=1, STR=2, REA=3, FUN=4, ENQ=5, SE=6, ENT=7, SEN=8, COM=9, APR=10, 
		FPR=11, ACO=12, FCO=13, ACH=14, FCH=15, IMP=16, RET=17, LER=18, ID=19, 
		NUM=20, OP_ARIT=21, OP_REL=22, OP_LOG=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "STR", "REA", "FUN", "ENQ", "SE", "ENT", "SEN", "COM", "APR", 
			"FPR", "ACO", "FCO", "ACH", "FCH", "IMP", "RET", "LER", "ID", "NUM", 
			"OP_ARIT", "OP_REL", "OP_LOG", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INTEIRO'", "'STRING'", "'REAL'", "'FUNCAO'", "'ENQUANTO'", "'SE'", 
			"'ENTAO'", "'SENAO'", "'#'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'IMPRIMIR'", "'RETORNA'", "'LER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "STR", "REA", "FUN", "ENQ", "SE", "ENT", "SEN", "COM", "APR", 
			"FPR", "ACO", "FCO", "ACH", "FCH", "IMP", "RET", "LER", "ID", "NUM", 
			"OP_ARIT", "OP_REL", "OP_LOG", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24"+
		"\u0091\n\24\f\24\16\24\u0094\13\24\3\25\3\25\3\25\5\25\u0099\n\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00a6\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\7\33\u00af\n\33\f\33\16\33\u00b2\13\33"+
		"\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\32"+
		"\3\2\7\5\2,-//\61\61\4\2((~~\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ba"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\65\3\2\2\2\3\67\3\2\2\2\5?\3\2\2\2\7F\3\2\2\2\tK\3\2\2\2\13R\3\2"+
		"\2\2\r[\3\2\2\2\17^\3\2\2\2\21d\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3"+
		"\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#\u0081"+
		"\3\2\2\2%\u0089\3\2\2\2\'\u008d\3\2\2\2)\u0095\3\2\2\2+\u009a\3\2\2\2"+
		"-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00b0"+
		"\3\2\2\2\678\7K\2\289\7P\2\29:\7V\2\2:;\7G\2\2;<\7K\2\2<=\7T\2\2=>\7Q"+
		"\2\2>\4\3\2\2\2?@\7U\2\2@A\7V\2\2AB\7T\2\2BC\7K\2\2CD\7P\2\2DE\7I\2\2"+
		"E\6\3\2\2\2FG\7T\2\2GH\7G\2\2HI\7C\2\2IJ\7N\2\2J\b\3\2\2\2KL\7H\2\2LM"+
		"\7W\2\2MN\7P\2\2NO\7E\2\2OP\7C\2\2PQ\7Q\2\2Q\n\3\2\2\2RS\7G\2\2ST\7P\2"+
		"\2TU\7S\2\2UV\7W\2\2VW\7C\2\2WX\7P\2\2XY\7V\2\2YZ\7Q\2\2Z\f\3\2\2\2[\\"+
		"\7U\2\2\\]\7G\2\2]\16\3\2\2\2^_\7G\2\2_`\7P\2\2`a\7V\2\2ab\7C\2\2bc\7"+
		"Q\2\2c\20\3\2\2\2de\7U\2\2ef\7G\2\2fg\7P\2\2gh\7C\2\2hi\7Q\2\2i\22\3\2"+
		"\2\2jk\7%\2\2k\24\3\2\2\2lm\7*\2\2m\26\3\2\2\2no\7+\2\2o\30\3\2\2\2pq"+
		"\7]\2\2q\32\3\2\2\2rs\7_\2\2s\34\3\2\2\2tu\7}\2\2u\36\3\2\2\2vw\7\177"+
		"\2\2w \3\2\2\2xy\7K\2\2yz\7O\2\2z{\7R\2\2{|\7T\2\2|}\7K\2\2}~\7O\2\2~"+
		"\177\7K\2\2\177\u0080\7T\2\2\u0080\"\3\2\2\2\u0081\u0082\7T\2\2\u0082"+
		"\u0083\7G\2\2\u0083\u0084\7V\2\2\u0084\u0085\7Q\2\2\u0085\u0086\7T\2\2"+
		"\u0086\u0087\7P\2\2\u0087\u0088\7C\2\2\u0088$\3\2\2\2\u0089\u008a\7N\2"+
		"\2\u008a\u008b\7G\2\2\u008b\u008c\7T\2\2\u008c&\3\2\2\2\u008d\u0092\5"+
		"\61\31\2\u008e\u0091\5\63\32\2\u008f\u0091\5\61\31\2\u0090\u008e\3\2\2"+
		"\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093(\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0098\5\63\32\2\u0096"+
		"\u0097\7\60\2\2\u0097\u0099\5\63\32\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099*\3\2\2\2\u009a\u009b\t\2\2\2\u009b,\3\2\2\2\u009c\u00a6"+
		"\4>@\2\u009d\u009e\7?\2\2\u009e\u00a6\7?\2\2\u009f\u00a0\7>\2\2\u00a0"+
		"\u00a6\7?\2\2\u00a1\u00a2\7@\2\2\u00a2\u00a6\7?\2\2\u00a3\u00a4\7#\2\2"+
		"\u00a4\u00a6\7?\2\2\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u009f"+
		"\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6.\3\2\2\2\u00a7"+
		"\u00a8\t\3\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa\62\3\2\2\2\u00ab"+
		"\u00ac\t\5\2\2\u00ac\64\3\2\2\2\u00ad\u00af\t\6\2\2\u00ae\u00ad\3\2\2"+
		"\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\33\2\2\u00b4\66\3\2\2\2\b\2"+
		"\u0090\u0092\u0098\u00a5\u00b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
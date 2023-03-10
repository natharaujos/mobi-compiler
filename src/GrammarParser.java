// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, STR=3, REA=4, FUN=5, ENQ=6, SE=7, ENT=8, SEN=9, COM=10, 
		APR=11, FPR=12, ACO=13, FCO=14, ACH=15, FCH=16, IMP=17, RET=18, LER=19, 
		ID=20, NUM=21, OP_ARIT=22, OP_REL=23, OP_LOG=24, WS=25, RE=26;
	public static final int
		RULE_programa = 0, RULE_estrutura = 1, RULE_declaracao_funcao = 2, RULE_declaracao_variavel = 3, 
		RULE_parametros = 4, RULE_tipo = 5, RULE_bloco_expressao = 6, RULE_expressao = 7, 
		RULE_expressao_igualdade = 8, RULE_expressao_relacional = 9, RULE_expressao_soma = 10, 
		RULE_expressao_multiplicacao = 11, RULE_expressao_unaria = 12, RULE_expressao_primaria = 13, 
		RULE_print = 14, RULE_bloco_retorno = 15, RULE_leitura = 16, RULE_bloco_condicional = 17, 
		RULE_bloco_rep = 18, RULE_bloco = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "estrutura", "declaracao_funcao", "declaracao_variavel", 
			"parametros", "tipo", "bloco_expressao", "expressao", "expressao_igualdade", 
			"expressao_relacional", "expressao_soma", "expressao_multiplicacao", 
			"expressao_unaria", "expressao_primaria", "print", "bloco_retorno", "leitura", 
			"bloco_condicional", "bloco_rep", "bloco"
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
			"NUM", "OP_ARIT", "OP_REL", "OP_LOG", "WS", "RE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	 
		public ProgramaContext() { }
		public void copyFrom(ProgramaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NInicioContext extends ProgramaContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public NInicioContext(ProgramaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			_localctx = new NInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << RE))) != 0)) {
				{
				{
				setState(40);
				estrutura();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(EOF);
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

	public static class EstruturaContext extends ParserRuleContext {
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
	 
		public EstruturaContext() { }
		public void copyFrom(EstruturaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NEstruturaContext extends EstruturaContext {
		public Declaracao_funcaoContext declaracao_funcao() {
			return getRuleContext(Declaracao_funcaoContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public Bloco_expressaoContext bloco_expressao() {
			return getRuleContext(Bloco_expressaoContext.class,0);
		}
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Bloco_condicionalContext bloco_condicional() {
			return getRuleContext(Bloco_condicionalContext.class,0);
		}
		public Bloco_repContext bloco_rep() {
			return getRuleContext(Bloco_repContext.class,0);
		}
		public Bloco_retornoContext bloco_retorno() {
			return getRuleContext(Bloco_retornoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public NEstruturaContext(EstruturaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estrutura);
		try {
			_localctx = new NEstruturaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(48);
				declaracao_funcao();
				}
				break;
			case 2:
				{
				setState(49);
				leitura();
				}
				break;
			case 3:
				{
				setState(50);
				bloco_expressao();
				}
				break;
			case 4:
				{
				setState(51);
				declaracao_variavel();
				}
				break;
			case 5:
				{
				setState(52);
				print();
				}
				break;
			case 6:
				{
				setState(53);
				bloco_condicional();
				}
				break;
			case 7:
				{
				setState(54);
				bloco_rep();
				}
				break;
			case 8:
				{
				setState(55);
				bloco_retorno();
				}
				break;
			case 9:
				{
				setState(56);
				bloco();
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

	public static class Declaracao_funcaoContext extends ParserRuleContext {
		public Declaracao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_funcao; }
	 
		public Declaracao_funcaoContext() { }
		public void copyFrom(Declaracao_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NDeclaracaoFuncaoContext extends Declaracao_funcaoContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode FUN() { return getToken(GrammarParser.FUN, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode APR() { return getToken(GrammarParser.APR, 0); }
		public TerminalNode FPR() { return getToken(GrammarParser.FPR, 0); }
		public TerminalNode ACH() { return getToken(GrammarParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(GrammarParser.FCH, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public NDeclaracaoFuncaoContext(Declaracao_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNDeclaracaoFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNDeclaracaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_funcaoContext declaracao_funcao() throws RecognitionException {
		Declaracao_funcaoContext _localctx = new Declaracao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_funcao);
		int _la;
		try {
			_localctx = new NDeclaracaoFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			tipo();
			setState(60);
			match(FUN);
			setState(61);
			match(ID);
			setState(62);
			match(APR);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << RE))) != 0)) {
				{
				setState(63);
				parametros();
				}
			}

			setState(66);
			match(FPR);
			setState(67);
			match(ACH);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << RE))) != 0)) {
				{
				{
				setState(68);
				estrutura();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(FCH);
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

	public static class Declaracao_variavelContext extends ParserRuleContext {
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
	 
		public Declaracao_variavelContext() { }
		public void copyFrom(Declaracao_variavelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NDeclaracaoVariavelContext extends Declaracao_variavelContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public NDeclaracaoVariavelContext(Declaracao_variavelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNDeclaracaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_variavel);
		try {
			_localctx = new NDeclaracaoVariavelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			tipo();
			setState(77);
			match(ID);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	 
		public ParametrosContext() { }
		public void copyFrom(ParametrosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NlocoDeclaracaoParametroContext extends ParametrosContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public NlocoDeclaracaoParametroContext(ParametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNlocoDeclaracaoParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNlocoDeclaracaoParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNlocoDeclaracaoParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		int _la;
		try {
			_localctx = new NlocoDeclaracaoParametroContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			tipo();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(80);
				match(ID);
				}
				}
				setState(85);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode STR() { return getToken(GrammarParser.STR, 0); }
		public TerminalNode RE() { return getToken(GrammarParser.RE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << RE))) != 0)) ) {
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

	public static class Bloco_expressaoContext extends ParserRuleContext {
		public Bloco_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_expressao; }
	 
		public Bloco_expressaoContext() { }
		public void copyFrom(Bloco_expressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoDeclaracaoExpressaoContext extends Bloco_expressaoContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode ACO() { return getToken(GrammarParser.ACO, 0); }
		public TerminalNode FCO() { return getToken(GrammarParser.FCO, 0); }
		public BlocoDeclaracaoExpressaoContext(Bloco_expressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoDeclaracaoExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoDeclaracaoExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoDeclaracaoExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_expressaoContext bloco_expressao() throws RecognitionException {
		Bloco_expressaoContext _localctx = new Bloco_expressaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloco_expressao);
		int _la;
		try {
			_localctx = new BlocoDeclaracaoExpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACO) {
				{
				setState(89);
				match(ACO);
				setState(90);
				expressao();
				setState(91);
				match(FCO);
				}
			}

			setState(95);
			match(T__0);
			setState(96);
			expressao();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoContext extends ExpressaoContext {
		public List<Expressao_igualdadeContext> expressao_igualdade() {
			return getRuleContexts(Expressao_igualdadeContext.class);
		}
		public Expressao_igualdadeContext expressao_igualdade(int i) {
			return getRuleContext(Expressao_igualdadeContext.class,i);
		}
		public List<TerminalNode> OP_LOG() { return getTokens(GrammarParser.OP_LOG); }
		public TerminalNode OP_LOG(int i) {
			return getToken(GrammarParser.OP_LOG, i);
		}
		public BlocoExpressaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressao);
		int _la;
		try {
			_localctx = new BlocoExpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			expressao_igualdade();
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_LOG) {
					{
					{
					setState(99);
					match(OP_LOG);
					setState(100);
					expressao_igualdade();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Expressao_igualdadeContext extends ParserRuleContext {
		public Expressao_igualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_igualdade; }
	 
		public Expressao_igualdadeContext() { }
		public void copyFrom(Expressao_igualdadeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoIgualdadeContext extends Expressao_igualdadeContext {
		public List<Expressao_relacionalContext> expressao_relacional() {
			return getRuleContexts(Expressao_relacionalContext.class);
		}
		public Expressao_relacionalContext expressao_relacional(int i) {
			return getRuleContext(Expressao_relacionalContext.class,i);
		}
		public List<TerminalNode> OP_REL() { return getTokens(GrammarParser.OP_REL); }
		public TerminalNode OP_REL(int i) {
			return getToken(GrammarParser.OP_REL, i);
		}
		public BlocoExpressaoIgualdadeContext(Expressao_igualdadeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressaoIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressaoIgualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressaoIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_igualdadeContext expressao_igualdade() throws RecognitionException {
		Expressao_igualdadeContext _localctx = new Expressao_igualdadeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressao_igualdade);
		int _la;
		try {
			_localctx = new BlocoExpressaoIgualdadeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expressao_relacional();
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_REL) {
					{
					{
					setState(109);
					match(OP_REL);
					setState(110);
					expressao_relacional();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Expressao_relacionalContext extends ParserRuleContext {
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
	 
		public Expressao_relacionalContext() { }
		public void copyFrom(Expressao_relacionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoRelacionalContext extends Expressao_relacionalContext {
		public List<Expressao_somaContext> expressao_soma() {
			return getRuleContexts(Expressao_somaContext.class);
		}
		public Expressao_somaContext expressao_soma(int i) {
			return getRuleContext(Expressao_somaContext.class,i);
		}
		public List<TerminalNode> OP_REL() { return getTokens(GrammarParser.OP_REL); }
		public TerminalNode OP_REL(int i) {
			return getToken(GrammarParser.OP_REL, i);
		}
		public BlocoExpressaoRelacionalContext(Expressao_relacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao_relacional);
		try {
			int _alt;
			_localctx = new BlocoExpressaoRelacionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			expressao_soma();
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(119);
						match(OP_REL);
						setState(120);
						expressao_soma();
						}
						} 
					}
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Expressao_somaContext extends ParserRuleContext {
		public Expressao_somaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_soma; }
	 
		public Expressao_somaContext() { }
		public void copyFrom(Expressao_somaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoSomaContext extends Expressao_somaContext {
		public List<Expressao_multiplicacaoContext> expressao_multiplicacao() {
			return getRuleContexts(Expressao_multiplicacaoContext.class);
		}
		public Expressao_multiplicacaoContext expressao_multiplicacao(int i) {
			return getRuleContext(Expressao_multiplicacaoContext.class,i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(GrammarParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(GrammarParser.OP_ARIT, i);
		}
		public BlocoExpressaoSomaContext(Expressao_somaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressaoSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressaoSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressaoSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_somaContext expressao_soma() throws RecognitionException {
		Expressao_somaContext _localctx = new Expressao_somaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao_soma);
		int _la;
		try {
			_localctx = new BlocoExpressaoSomaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			expressao_multiplicacao();
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_ARIT) {
					{
					{
					setState(129);
					match(OP_ARIT);
					setState(130);
					expressao_multiplicacao();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Expressao_multiplicacaoContext extends ParserRuleContext {
		public Expressao_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_multiplicacao; }
	 
		public Expressao_multiplicacaoContext() { }
		public void copyFrom(Expressao_multiplicacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoMultiplicacaoContext extends Expressao_multiplicacaoContext {
		public List<Expressao_unariaContext> expressao_unaria() {
			return getRuleContexts(Expressao_unariaContext.class);
		}
		public Expressao_unariaContext expressao_unaria(int i) {
			return getRuleContext(Expressao_unariaContext.class,i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(GrammarParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(GrammarParser.OP_ARIT, i);
		}
		public BlocoExpressaoMultiplicacaoContext(Expressao_multiplicacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressaoMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressaoMultiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressaoMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_multiplicacaoContext expressao_multiplicacao() throws RecognitionException {
		Expressao_multiplicacaoContext _localctx = new Expressao_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao_multiplicacao);
		try {
			int _alt;
			_localctx = new BlocoExpressaoMultiplicacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			expressao_unaria();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						match(OP_ARIT);
						setState(140);
						expressao_unaria();
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Expressao_unariaContext extends ParserRuleContext {
		public Expressao_unariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_unaria; }
	 
		public Expressao_unariaContext() { }
		public void copyFrom(Expressao_unariaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoUnariaContext extends Expressao_unariaContext {
		public Expressao_primariaContext expressao_primaria() {
			return getRuleContext(Expressao_primariaContext.class,0);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(GrammarParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(GrammarParser.OP_ARIT, i);
		}
		public BlocoExpressaoUnariaContext(Expressao_unariaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressaoUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressaoUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressaoUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_unariaContext expressao_unaria() throws RecognitionException {
		Expressao_unariaContext _localctx = new Expressao_unariaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_unaria);
		int _la;
		try {
			_localctx = new BlocoExpressaoUnariaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				setState(148);
				match(OP_ARIT);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			expressao_primaria();
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

	public static class Expressao_primariaContext extends ParserRuleContext {
		public Expressao_primariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_primaria; }
	 
		public Expressao_primariaContext() { }
		public void copyFrom(Expressao_primariaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoPrimariaContext extends Expressao_primariaContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public TerminalNode APR() { return getToken(GrammarParser.APR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FPR() { return getToken(GrammarParser.FPR, 0); }
		public TerminalNode STR() { return getToken(GrammarParser.STR, 0); }
		public TerminalNode ACO() { return getToken(GrammarParser.ACO, 0); }
		public TerminalNode FCO() { return getToken(GrammarParser.FCO, 0); }
		public BlocoExpressaoPrimariaContext(Expressao_primariaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressaoPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressaoPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressaoPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_primariaContext expressao_primaria() throws RecognitionException {
		Expressao_primariaContext _localctx = new Expressao_primariaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao_primaria);
		int _la;
		try {
			_localctx = new BlocoExpressaoPrimariaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(156);
				match(ID);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACO) {
					{
					setState(157);
					match(ACO);
					setState(158);
					expressao();
					setState(159);
					match(FCO);
					}
				}

				}
				break;
			case NUM:
				{
				setState(163);
				match(NUM);
				}
				break;
			case APR:
				{
				setState(164);
				match(APR);
				setState(165);
				expressao();
				setState(166);
				match(FPR);
				}
				break;
			case STR:
				{
				setState(168);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoExpressaoImpressaoContext extends PrintContext {
		public TerminalNode IMP() { return getToken(GrammarParser.IMP, 0); }
		public TerminalNode APR() { return getToken(GrammarParser.APR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FPR() { return getToken(GrammarParser.FPR, 0); }
		public List<TerminalNode> COM() { return getTokens(GrammarParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(GrammarParser.COM, i);
		}
		public BlocoExpressaoImpressaoContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoExpressaoImpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoExpressaoImpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoExpressaoImpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			_localctx = new BlocoExpressaoImpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IMP);
			setState(172);
			match(APR);
			setState(173);
			expressao();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(174);
				match(COM);
				setState(175);
				expressao();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(FPR);
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

	public static class Bloco_retornoContext extends ParserRuleContext {
		public Bloco_retornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_retorno; }
	 
		public Bloco_retornoContext() { }
		public void copyFrom(Bloco_retornoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoRetornoContext extends Bloco_retornoContext {
		public TerminalNode RET() { return getToken(GrammarParser.RET, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoRetornoContext(Bloco_retornoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_retornoContext bloco_retorno() throws RecognitionException {
		Bloco_retornoContext _localctx = new Bloco_retornoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bloco_retorno);
		try {
			_localctx = new BlocoRetornoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(RET);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(184);
				expressao();
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

	public static class LeituraContext extends ParserRuleContext {
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
	 
		public LeituraContext() { }
		public void copyFrom(LeituraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NLeituraContext extends LeituraContext {
		public TerminalNode LER() { return getToken(GrammarParser.LER, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public NLeituraContext(LeituraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_leitura);
		try {
			_localctx = new NLeituraContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(LER);
			setState(188);
			match(ID);
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

	public static class Bloco_condicionalContext extends ParserRuleContext {
		public Bloco_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_condicional; }
	 
		public Bloco_condicionalContext() { }
		public void copyFrom(Bloco_condicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoCondicionalContext extends Bloco_condicionalContext {
		public TerminalNode SE() { return getToken(GrammarParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEN() { return getToken(GrammarParser.SEN, 0); }
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public TerminalNode ENT() { return getToken(GrammarParser.ENT, 0); }
		public BlocoCondicionalContext(Bloco_condicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_condicionalContext bloco_condicional() throws RecognitionException {
		Bloco_condicionalContext _localctx = new Bloco_condicionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloco_condicional);
		int _la;
		try {
			_localctx = new BlocoCondicionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(SE);
			setState(191);
			expressao();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(192);
				match(SEN);
				setState(193);
				estrutura();
				}
			}

			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(196);
				match(ENT);
				setState(197);
				estrutura();
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

	public static class Bloco_repContext extends ParserRuleContext {
		public Bloco_repContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_rep; }
	 
		public Bloco_repContext() { }
		public void copyFrom(Bloco_repContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoRepeticaoContext extends Bloco_repContext {
		public TerminalNode ENQ() { return getToken(GrammarParser.ENQ, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ACH() { return getToken(GrammarParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(GrammarParser.FCH, 0); }
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public BlocoRepeticaoContext(Bloco_repContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_repContext bloco_rep() throws RecognitionException {
		Bloco_repContext _localctx = new Bloco_repContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloco_rep);
		int _la;
		try {
			_localctx = new BlocoRepeticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ENQ);
			setState(201);
			expressao();
			setState(202);
			match(ACH);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << RE))) != 0)) {
				{
				{
				setState(203);
				estrutura();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(FCH);
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

	public static class BlocoContext extends ParserRuleContext {
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	 
		public BlocoContext() { }
		public void copyFrom(BlocoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoPrincipalContext extends BlocoContext {
		public TerminalNode ACH() { return getToken(GrammarParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(GrammarParser.FCH, 0); }
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public BlocoPrincipalContext(BlocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlocoPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlocoPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlocoPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bloco);
		int _la;
		try {
			_localctx = new BlocoPrincipalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ACH);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << RE))) != 0)) {
				{
				{
				setState(212);
				estrutura();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(FCH);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\5\4C\n\4"+
		"\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6T"+
		"\n\6\f\6\16\6W\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\5\tm\n\t\3\n\3\n\3\n\7\nr\n\n\f\n\16"+
		"\nu\13\n\5\nw\n\n\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\5\13"+
		"\u0081\n\13\3\f\3\f\3\f\7\f\u0086\n\f\f\f\16\f\u0089\13\f\5\f\u008b\n"+
		"\f\3\r\3\r\3\r\7\r\u0090\n\r\f\r\16\r\u0093\13\r\5\r\u0095\n\r\3\16\7"+
		"\16\u0098\n\16\f\16\16\16\u009b\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00a4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ac\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00b3\n\20\f\20\16\20\u00b6\13\20\3\20\3\20"+
		"\3\21\3\21\5\21\u00bc\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c5"+
		"\n\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24\3\24\3\24\7\24\u00cf\n\24\f"+
		"\24\16\24\u00d2\13\24\3\24\3\24\3\25\3\25\7\25\u00d8\n\25\f\25\16\25\u00db"+
		"\13\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(\2\3\4\2\4\5\34\34\2\u00ec\2-\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bN\3\2"+
		"\2\2\nQ\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20d\3\2\2\2\22n\3\2\2\2\24x\3\2"+
		"\2\2\26\u0082\3\2\2\2\30\u008c\3\2\2\2\32\u0099\3\2\2\2\34\u00ab\3\2\2"+
		"\2\36\u00ad\3\2\2\2 \u00b9\3\2\2\2\"\u00bd\3\2\2\2$\u00c0\3\2\2\2&\u00ca"+
		"\3\2\2\2(\u00d5\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61\3\3\2\2\2\62<\5\6\4\2\63<"+
		"\5\"\22\2\64<\5\16\b\2\65<\5\b\5\2\66<\5\36\20\2\67<\5$\23\28<\5&\24\2"+
		"9<\5 \21\2:<\5(\25\2;\62\3\2\2\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2;"+
		"\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\5\f"+
		"\7\2>?\7\7\2\2?@\7\26\2\2@B\7\r\2\2AC\5\n\6\2BA\3\2\2\2BC\3\2\2\2CD\3"+
		"\2\2\2DE\7\16\2\2EI\7\21\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2I"+
		"J\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\22\2\2M\7\3\2\2\2NO\5\f\7\2OP\7\26\2"+
		"\2P\t\3\2\2\2QU\5\f\7\2RT\7\26\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\13\3\2\2\2WU\3\2\2\2XY\t\2\2\2Y\r\3\2\2\2Z_\7\26\2\2[\\\7\17\2\2"+
		"\\]\5\20\t\2]^\7\20\2\2^`\3\2\2\2_[\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\3"+
		"\2\2bc\5\20\t\2c\17\3\2\2\2dl\5\22\n\2ef\7\32\2\2fh\5\22\n\2ge\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2li\3\2\2\2lm\3\2\2\2"+
		"m\21\3\2\2\2nv\5\24\13\2op\7\31\2\2pr\5\24\13\2qo\3\2\2\2ru\3\2\2\2sq"+
		"\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vs\3\2\2\2vw\3\2\2\2w\23\3\2\2\2"+
		"x\u0080\5\26\f\2yz\7\31\2\2z|\5\26\f\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080}\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\25\3\2\2\2\u0082\u008a\5\30\r\2\u0083\u0084\7\30\2\2\u0084"+
		"\u0086\5\30\r\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b\27\3\2\2\2\u008c\u0094\5\32\16"+
		"\2\u008d\u008e\7\30\2\2\u008e\u0090\5\32\16\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\31\3\2\2\2\u0096\u0098\7\30\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\5\34\17\2\u009d\33\3\2\2\2\u009e\u00a3\7\26\2\2\u009f"+
		"\u00a0\7\17\2\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\20\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ac\3\2\2\2\u00a5"+
		"\u00ac\7\27\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7"+
		"\16\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\7\5\2\2\u00ab\u009e\3\2\2\2\u00ab"+
		"\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\35\3\2\2"+
		"\2\u00ad\u00ae\7\23\2\2\u00ae\u00af\7\r\2\2\u00af\u00b4\5\20\t\2\u00b0"+
		"\u00b1\7\f\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3"+
		"\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\7\16\2\2\u00b8\37\3\2\2\2\u00b9\u00bb\7\24"+
		"\2\2\u00ba\u00bc\5\20\t\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"!\3\2\2\2\u00bd\u00be\7\25\2\2\u00be\u00bf\7\26\2\2\u00bf#\3\2\2\2\u00c0"+
		"\u00c1\7\t\2\2\u00c1\u00c4\5\20\t\2\u00c2\u00c3\7\13\2\2\u00c3\u00c5\5"+
		"\4\3\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c7\7\n\2\2\u00c7\u00c9\5\4\3\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc\5\20\t\2\u00cc\u00d0"+
		"\7\21\2\2\u00cd\u00cf\5\4\3\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d4\7\22\2\2\u00d4\'\3\2\2\2\u00d5\u00d9\7\21\2\2\u00d6"+
		"\u00d8\5\4\3\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7\22\2\2\u00dd)\3\2\2\2\33-;BIU_ilsv}\u0080\u0087\u008a\u0091\u0094"+
		"\u0099\u00a3\u00ab\u00b4\u00bb\u00c4\u00c8\u00d0\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
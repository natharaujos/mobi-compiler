// Generated from Grammar.g4 by ANTLR 4.7.2

    package antlr;

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
		INT=1, STR=2, REA=3, FUN=4, ENQ=5, SE=6, ENT=7, SEN=8, COM=9, APR=10, 
		FPR=11, ACO=12, FCO=13, ACH=14, FCH=15, IMP=16, RET=17, LER=18, ID=19, 
		NUM=20, OP_ARIT=21, OP_REL=22, ATR=23, OP_LOG=24, WS=25;
	public static final int
		RULE_programa = 0, RULE_estrutura = 1, RULE_declaracao_funcao = 2, RULE_declaracao_variavel = 3, 
		RULE_parametros = 4, RULE_tipo = 5, RULE_atribuicao = 6, RULE_comparacao = 7, 
		RULE_operacao = 8, RULE_print = 9, RULE_bloco_retorno = 10, RULE_leitura = 11, 
		RULE_bloco_condicional = 12, RULE_bloco_rep = 13, RULE_bloco = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "estrutura", "declaracao_funcao", "declaracao_variavel", 
			"parametros", "tipo", "atribuicao", "comparacao", "operacao", "print", 
			"bloco_retorno", "leitura", "bloco_condicional", "bloco_rep", "bloco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INTEIRO'", "'STRING'", "'REAL'", "'FUNCAO'", "'ENQUANTO'", "'SE'", 
			"'ENTAO'", "'SENAO'", "'#'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'IMPRIMIR'", "'RETORNA'", "'LER'", null, null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "STR", "REA", "FUN", "ENQ", "SE", "ENT", "SEN", "COM", "APR", 
			"FPR", "ACO", "FCO", "ACH", "FCH", "IMP", "RET", "LER", "ID", "NUM", 
			"OP_ARIT", "OP_REL", "ATR", "OP_LOG", "WS"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << REA) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(30);
				estrutura();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(38);
				declaracao_funcao();
				}
				break;
			case 2:
				{
				setState(39);
				leitura();
				}
				break;
			case 3:
				{
				setState(40);
				declaracao_variavel();
				}
				break;
			case 4:
				{
				setState(41);
				print();
				}
				break;
			case 5:
				{
				setState(42);
				bloco_condicional();
				}
				break;
			case 6:
				{
				setState(43);
				bloco_rep();
				}
				break;
			case 7:
				{
				setState(44);
				bloco_retorno();
				}
				break;
			case 8:
				{
				setState(45);
				bloco();
				}
				break;
			case 9:
				{
				setState(46);
				atribuicao();
				}
				break;
			case 10:
				{
				setState(47);
				comparacao();
				}
				break;
			case 11:
				{
				setState(48);
				operacao();
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
			setState(51);
			tipo();
			setState(52);
			match(FUN);
			setState(53);
			match(ID);
			setState(54);
			match(APR);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << REA))) != 0)) {
				{
				setState(55);
				parametros();
				}
			}

			setState(58);
			match(FPR);
			setState(59);
			match(ACH);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << REA) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(60);
				estrutura();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
			setState(68);
			tipo();
			setState(69);
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
			setState(71);
			tipo();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(72);
				match(ID);
				}
				}
				setState(77);
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
		public TerminalNode REA() { return getToken(GrammarParser.REA, 0); }
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
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << REA))) != 0)) ) {
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAtribuicaoContext extends AtribuicaoContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode ATR() { return getToken(GrammarParser.ATR, 0); }
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public List<ComparacaoContext> comparacao() {
			return getRuleContexts(ComparacaoContext.class);
		}
		public ComparacaoContext comparacao(int i) {
			return getRuleContext(ComparacaoContext.class,i);
		}
		public TerminalNode OP_ARIT() { return getToken(GrammarParser.OP_ARIT, 0); }
		public TerminalNode APR() { return getToken(GrammarParser.APR, 0); }
		public TerminalNode FPR() { return getToken(GrammarParser.FPR, 0); }
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao);
		int _la;
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(ATR);
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(83);
				match(ID);
				}
				break;
			case 3:
				{
				setState(84);
				operacao();
				}
				break;
			case 4:
				{
				setState(85);
				comparacao();
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARIT) {
				{
				setState(88);
				match(OP_ARIT);
				}
			}

			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==APR) {
					{
					setState(91);
					match(APR);
					}
				}

				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(94);
					comparacao();
					}
					break;
				case 2:
					{
					setState(95);
					operacao();
					}
					break;
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FPR) {
					{
					setState(98);
					match(FPR);
					}
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

	public static class ComparacaoContext extends ParserRuleContext {
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
	 
		public ComparacaoContext() { }
		public void copyFrom(ComparacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComparacaoContext extends ComparacaoContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode OP_REL() { return getToken(GrammarParser.OP_REL, 0); }
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public NComparacaoContext(ComparacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNComparacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNComparacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparacao);
		int _la;
		try {
			_localctx = new NComparacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(OP_REL);
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
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

	public static class OperacaoContext extends ParserRuleContext {
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	 
		public OperacaoContext() { }
		public void copyFrom(OperacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperacaoContext extends OperacaoContext {
		public TerminalNode OP_ARIT() { return getToken(GrammarParser.OP_ARIT, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammarParser.NUM, i);
		}
		public NOperacaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNOperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNOperacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacao);
		int _la;
		try {
			_localctx = new NOperacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			match(OP_ARIT);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
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
		public TerminalNode FPR() { return getToken(GrammarParser.FPR, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammarParser.NUM, i);
		}
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
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			_localctx = new BlocoExpressaoImpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IMP);
			setState(112);
			match(APR);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(114);
				match(COM);
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
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
		enterRule(_localctx, 20, RULE_bloco_retorno);
		int _la;
		try {
			_localctx = new BlocoRetornoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(RET);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
		enterRule(_localctx, 22, RULE_leitura);
		try {
			_localctx = new NLeituraContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LER);
			setState(128);
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
		public TerminalNode APR() { return getToken(GrammarParser.APR, 0); }
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public TerminalNode FPR() { return getToken(GrammarParser.FPR, 0); }
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
		enterRule(_localctx, 24, RULE_bloco_condicional);
		int _la;
		try {
			_localctx = new BlocoCondicionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(SE);
			setState(131);
			match(APR);
			setState(132);
			comparacao();
			setState(133);
			match(FPR);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(134);
				match(SEN);
				setState(135);
				estrutura();
				}
			}

			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(138);
				match(ENT);
				setState(139);
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
		public TerminalNode APR() { return getToken(GrammarParser.APR, 0); }
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public TerminalNode FPR() { return getToken(GrammarParser.FPR, 0); }
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
		enterRule(_localctx, 26, RULE_bloco_rep);
		int _la;
		try {
			_localctx = new BlocoRepeticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ENQ);
			setState(143);
			match(APR);
			setState(144);
			comparacao();
			setState(145);
			match(FPR);
			setState(146);
			match(ACH);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << REA) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(147);
				estrutura();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
		enterRule(_localctx, 28, RULE_bloco);
		int _la;
		try {
			_localctx = new BlocoPrincipalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ACH);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << REA) | (1L << ENQ) | (1L << SE) | (1L << ACH) | (1L << IMP) | (1L << RET) | (1L << LER) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(156);
				estrutura();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bY\n\b\3\b\5\b\\\n\b\3\b\5\b_\n\b\3\b\3\b\5\bc\n\b\3"+
		"\b\5\bf\n\b\5\bh\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\7\13w\n\13\f\13\16\13z\13\13\3\13\3\13\3\f\3\f\5\f\u0080\n\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\16\3\16\5"+
		"\16\u008f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0097\n\17\f\17\16\17"+
		"\u009a\13\17\3\17\3\17\3\20\3\20\7\20\u00a0\n\20\f\20\16\20\u00a3\13\20"+
		"\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2"+
		"\3\5\3\2\25\26\2\u00b3\2#\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\bF\3\2\2\2"+
		"\nI\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20i\3\2\2\2\22m\3\2\2\2\24q\3\2\2\2"+
		"\26}\3\2\2\2\30\u0081\3\2\2\2\32\u0084\3\2\2\2\34\u0090\3\2\2\2\36\u009d"+
		"\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2"+
		"%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(\64\5\6\4\2)\64\5\30\r\2*\64\5\b\5\2"+
		"+\64\5\24\13\2,\64\5\32\16\2-\64\5\34\17\2.\64\5\26\f\2/\64\5\36\20\2"+
		"\60\64\5\16\b\2\61\64\5\20\t\2\62\64\5\22\n\2\63(\3\2\2\2\63)\3\2\2\2"+
		"\63*\3\2\2\2\63+\3\2\2\2\63,\3\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2"+
		"\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\5\f\7"+
		"\2\66\67\7\6\2\2\678\7\25\2\28:\7\f\2\29;\5\n\6\2:9\3\2\2\2:;\3\2\2\2"+
		";<\3\2\2\2<=\7\r\2\2=A\7\20\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2"+
		"\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\21\2\2E\7\3\2\2\2FG\5\f\7\2GH\7\25"+
		"\2\2H\t\3\2\2\2IM\5\f\7\2JL\7\25\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2N\13\3\2\2\2OM\3\2\2\2PQ\t\2\2\2Q\r\3\2\2\2RS\7\25\2\2SX\7\31\2"+
		"\2TY\7\26\2\2UY\7\25\2\2VY\5\22\n\2WY\5\20\t\2XT\3\2\2\2XU\3\2\2\2XV\3"+
		"\2\2\2XW\3\2\2\2Y[\3\2\2\2Z\\\7\27\2\2[Z\3\2\2\2[\\\3\2\2\2\\g\3\2\2\2"+
		"]_\7\f\2\2^]\3\2\2\2^_\3\2\2\2_b\3\2\2\2`c\5\20\t\2ac\5\22\n\2b`\3\2\2"+
		"\2ba\3\2\2\2ce\3\2\2\2df\7\r\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2g^\3\2\2"+
		"\2gh\3\2\2\2h\17\3\2\2\2ij\7\25\2\2jk\7\30\2\2kl\t\3\2\2l\21\3\2\2\2m"+
		"n\t\3\2\2no\7\27\2\2op\t\3\2\2p\23\3\2\2\2qr\7\22\2\2rs\7\f\2\2sx\t\3"+
		"\2\2tu\7\13\2\2uw\t\3\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3"+
		"\2\2\2zx\3\2\2\2{|\7\r\2\2|\25\3\2\2\2}\177\7\23\2\2~\u0080\t\3\2\2\177"+
		"~\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\u0082\7\24\2\2\u0082"+
		"\u0083\7\25\2\2\u0083\31\3\2\2\2\u0084\u0085\7\b\2\2\u0085\u0086\7\f\2"+
		"\2\u0086\u0087\5\20\t\2\u0087\u008a\7\r\2\2\u0088\u0089\7\n\2\2\u0089"+
		"\u008b\5\4\3\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008d\7\t\2\2\u008d\u008f\5\4\3\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\33\3\2\2\2\u0090\u0091\7\7\2\2\u0091\u0092\7\f\2"+
		"\2\u0092\u0093\5\20\t\2\u0093\u0094\7\r\2\2\u0094\u0098\7\20\2\2\u0095"+
		"\u0097\5\4\3\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\7\21\2\2\u009c\35\3\2\2\2\u009d\u00a1\7\20\2\2\u009e\u00a0\5\4"+
		"\3\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\21"+
		"\2\2\u00a5\37\3\2\2\2\23#\63:AMX[^begx\177\u008a\u008e\u0098\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterNInicio(GrammarParser.NInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitNInicio(GrammarParser.NInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEstrutura}
	 * labeled alternative in {@link GrammarParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterNEstrutura(GrammarParser.NEstruturaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEstrutura}
	 * labeled alternative in {@link GrammarParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitNEstrutura(GrammarParser.NEstruturaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracaoFuncao}
	 * labeled alternative in {@link GrammarParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracaoFuncao(GrammarParser.NDeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracaoFuncao}
	 * labeled alternative in {@link GrammarParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracaoFuncao(GrammarParser.NDeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracaoVariavel}
	 * labeled alternative in {@link GrammarParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracaoVariavel(GrammarParser.NDeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracaoVariavel}
	 * labeled alternative in {@link GrammarParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracaoVariavel(GrammarParser.NDeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NlocoDeclaracaoParametro}
	 * labeled alternative in {@link GrammarParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterNlocoDeclaracaoParametro(GrammarParser.NlocoDeclaracaoParametroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NlocoDeclaracaoParametro}
	 * labeled alternative in {@link GrammarParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitNlocoDeclaracaoParametro(GrammarParser.NlocoDeclaracaoParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GrammarParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracaoExpressao}
	 * labeled alternative in {@link GrammarParser#bloco_expressao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracaoExpressao(GrammarParser.BlocoDeclaracaoExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracaoExpressao}
	 * labeled alternative in {@link GrammarParser#bloco_expressao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracaoExpressao(GrammarParser.BlocoDeclaracaoExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressao}
	 * labeled alternative in {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressao(GrammarParser.BlocoExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressao}
	 * labeled alternative in {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressao(GrammarParser.BlocoExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressaoIgualdade}
	 * labeled alternative in {@link GrammarParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressaoIgualdade(GrammarParser.BlocoExpressaoIgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressaoIgualdade}
	 * labeled alternative in {@link GrammarParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressaoIgualdade(GrammarParser.BlocoExpressaoIgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressaoRelacional}
	 * labeled alternative in {@link GrammarParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressaoRelacional(GrammarParser.BlocoExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressaoRelacional}
	 * labeled alternative in {@link GrammarParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressaoRelacional(GrammarParser.BlocoExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressaoSoma}
	 * labeled alternative in {@link GrammarParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressaoSoma(GrammarParser.BlocoExpressaoSomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressaoSoma}
	 * labeled alternative in {@link GrammarParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressaoSoma(GrammarParser.BlocoExpressaoSomaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressaoMultiplicacao}
	 * labeled alternative in {@link GrammarParser#expressao_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressaoMultiplicacao(GrammarParser.BlocoExpressaoMultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressaoMultiplicacao}
	 * labeled alternative in {@link GrammarParser#expressao_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressaoMultiplicacao(GrammarParser.BlocoExpressaoMultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressaoUnaria}
	 * labeled alternative in {@link GrammarParser#expressao_unaria}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressaoUnaria(GrammarParser.BlocoExpressaoUnariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressaoUnaria}
	 * labeled alternative in {@link GrammarParser#expressao_unaria}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressaoUnaria(GrammarParser.BlocoExpressaoUnariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressaoPrimaria}
	 * labeled alternative in {@link GrammarParser#expressao_primaria}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressaoPrimaria(GrammarParser.BlocoExpressaoPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressaoPrimaria}
	 * labeled alternative in {@link GrammarParser#expressao_primaria}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressaoPrimaria(GrammarParser.BlocoExpressaoPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoExpressaoImpressao}
	 * labeled alternative in {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterBlocoExpressaoImpressao(GrammarParser.BlocoExpressaoImpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoExpressaoImpressao}
	 * labeled alternative in {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitBlocoExpressaoImpressao(GrammarParser.BlocoExpressaoImpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoRetorno}
	 * labeled alternative in {@link GrammarParser#bloco_retorno}.
	 * @param ctx the parse tree
	 */
	void enterBlocoRetorno(GrammarParser.BlocoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoRetorno}
	 * labeled alternative in {@link GrammarParser#bloco_retorno}.
	 * @param ctx the parse tree
	 */
	void exitBlocoRetorno(GrammarParser.BlocoRetornoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link GrammarParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterNLeitura(GrammarParser.NLeituraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link GrammarParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitNLeitura(GrammarParser.NLeituraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoCondicional}
	 * labeled alternative in {@link GrammarParser#bloco_condicional}.
	 * @param ctx the parse tree
	 */
	void enterBlocoCondicional(GrammarParser.BlocoCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoCondicional}
	 * labeled alternative in {@link GrammarParser#bloco_condicional}.
	 * @param ctx the parse tree
	 */
	void exitBlocoCondicional(GrammarParser.BlocoCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoRepeticao}
	 * labeled alternative in {@link GrammarParser#bloco_rep}.
	 * @param ctx the parse tree
	 */
	void enterBlocoRepeticao(GrammarParser.BlocoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoRepeticao}
	 * labeled alternative in {@link GrammarParser#bloco_rep}.
	 * @param ctx the parse tree
	 */
	void exitBlocoRepeticao(GrammarParser.BlocoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoPrincipal}
	 * labeled alternative in {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBlocoPrincipal(GrammarParser.BlocoPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoPrincipal}
	 * labeled alternative in {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBlocoPrincipal(GrammarParser.BlocoPrincipalContext ctx);
}
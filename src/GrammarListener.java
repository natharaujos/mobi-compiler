// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(GrammarParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(GrammarParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_funcao(GrammarParser.Declaracao_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_funcao(GrammarParser.Declaracao_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variavel(GrammarParser.Declaracao_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variavel(GrammarParser.Declaracao_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GrammarParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GrammarParser.ParametrosContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#bloco_expressao}.
	 * @param ctx the parse tree
	 */
	void enterBloco_expressao(GrammarParser.Bloco_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloco_expressao}.
	 * @param ctx the parse tree
	 */
	void exitBloco_expressao(GrammarParser.Bloco_expressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GrammarParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GrammarParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_igualdade(GrammarParser.Expressao_igualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_igualdade(GrammarParser.Expressao_igualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(GrammarParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(GrammarParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_soma(GrammarParser.Expressao_somaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_soma(GrammarParser.Expressao_somaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_multiplicacao(GrammarParser.Expressao_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_multiplicacao(GrammarParser.Expressao_multiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao_unaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_unaria(GrammarParser.Expressao_unariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao_unaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_unaria(GrammarParser.Expressao_unariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao_primaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_primaria(GrammarParser.Expressao_primariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao_primaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_primaria(GrammarParser.Expressao_primariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloco_retorno}.
	 * @param ctx the parse tree
	 */
	void enterBloco_retorno(GrammarParser.Bloco_retornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloco_retorno}.
	 * @param ctx the parse tree
	 */
	void exitBloco_retorno(GrammarParser.Bloco_retornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(GrammarParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(GrammarParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloco_condicional}.
	 * @param ctx the parse tree
	 */
	void enterBloco_condicional(GrammarParser.Bloco_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloco_condicional}.
	 * @param ctx the parse tree
	 */
	void exitBloco_condicional(GrammarParser.Bloco_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloco_rep}.
	 * @param ctx the parse tree
	 */
	void enterBloco_rep(GrammarParser.Bloco_repContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloco_rep}.
	 * @param ctx the parse tree
	 */
	void exitBloco_rep(GrammarParser.Bloco_repContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GrammarParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GrammarParser.BlocoContext ctx);
}
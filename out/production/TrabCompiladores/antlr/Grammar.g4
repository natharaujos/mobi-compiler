grammar Grammar;

@header{
    package antlr;
}

programa: estrutura * EOF #NInicio;
estrutura: (declaracao_funcao
        | leitura
        | bloco_expressao
        | declaracao_variavel
        | print
        | bloco_condicional
        | bloco_rep
        | bloco_retorno
        | bloco) #NEstrutura;

declaracao_funcao: tipo FUN ID APR parametros? FPR ACH estrutura* FCH #NDeclaracaoFuncao;
declaracao_variavel: tipo ID #NDeclaracaoVariavel;
parametros: tipo ID* #NlocoDeclaracaoParametro;
tipo: INT | STR | RE #NTipo;
bloco_expressao: ID (ACO expressao FCO)? '=' expressao #BlocoDeclaracaoExpressao;
expressao: expressao_igualdade ((OP_LOG expressao_igualdade)*)? #BlocoExpressao;
expressao_igualdade: expressao_relacional ((OP_REL expressao_relacional)*)? #BlocoExpressaoIgualdade;
expressao_relacional: expressao_soma ((OP_REL expressao_soma)*)? #BlocoExpressaoRelacional;
expressao_soma: expressao_multiplicacao ((OP_ARIT expressao_multiplicacao)*)? #BlocoExpressaoSoma;
expressao_multiplicacao: expressao_unaria ((OP_ARIT expressao_unaria)*)? #BlocoExpressaoMultiplicacao;
expressao_unaria: (OP_ARIT)* expressao_primaria #BlocoExpressaoUnaria;
expressao_primaria: (ID (ACO expressao FCO)?
                   | NUM
                   | APR expressao FPR
                   | STR) #BlocoExpressaoPrimaria;
print: IMP APR expressao (COM expressao)* FPR #BlocoExpressaoImpressao;
bloco_retorno: RET expressao? #BlocoRetorno;
leitura: LER ID #NLeitura;
bloco_condicional: SE expressao (SEN estrutura)? (ENT estrutura)? #BlocoCondicional;
bloco_rep: ENQ expressao ACH estrutura* FCH #BlocoRepeticao;
bloco: ACH estrutura* FCH #BlocoPrincipal;

INT: 'INTEIRO';
STR: 'STRING';
REA: 'REAL';
FUN: 'FUNCAO';
ENQ: 'ENQUANTO';
SE: 'SE';
ENT: 'ENTAO';
SEN: 'SENAO';
COM: '#';
APR: '(';
FPR: ')';
ACO: '[';
FCO: ']';
ACH: '{';
FCH: '}';
IMP: 'IMPRIMIR';
RET: 'RETORNA';
LER: 'LER';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO ('.'DIGITO )?;
OP_ARIT: '+'|'-'|'*'|'/';
OP_REL: '='|'>'|'<'|'=='|'<='|'>='|'!=';
OP_LOG: '&'|'|';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* ->skip;

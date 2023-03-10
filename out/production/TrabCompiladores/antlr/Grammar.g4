grammar Grammar;

@header{
    package antlr;
}

programa: estrutura * EOF #NInicio;
estrutura: (declaracao_funcao
        | leitura
        | declaracao_variavel
        | print
        | bloco_condicional
        | bloco_rep
        | bloco_retorno
        | bloco
        | atribuicao
        | comparacao
        | operacao) #NEstrutura;

declaracao_funcao: tipo FUN ID APR parametros? FPR ACH estrutura* FCH #NDeclaracaoFuncao;
declaracao_variavel: tipo ID #NDeclaracaoVariavel;
parametros: tipo ID* #NlocoDeclaracaoParametro;
tipo: INT | STR | REA #NTipo;
atribuicao: ID ATR (NUM|ID|operacao|comparacao) OP_ARIT? (APR? (comparacao|operacao) FPR?)? #NAtribuicao;
comparacao: ID OP_REL (NUM|ID) #NComparacao;
operacao: (ID|NUM) OP_ARIT (NUM|ID) #NOperacao;
print: IMP APR (ID|NUM) (COM (ID|NUM))* FPR #BlocoExpressaoImpressao;
bloco_retorno: RET (ID|NUM)? #BlocoRetorno;
leitura: LER ID #NLeitura;
bloco_condicional: SE APR comparacao FPR (SEN estrutura)? (ENT estrutura)? #BlocoCondicional;
bloco_rep: ENQ APR comparacao FPR ACH estrutura* FCH #BlocoRepeticao;
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
OP_REL: '>'|'<'|'=='|'<='|'>='|'!=';
ATR: '=';
OP_LOG: '&'|'|';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* ->skip;

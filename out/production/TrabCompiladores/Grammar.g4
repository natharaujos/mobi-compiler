grammar Grammar;

programa: estrutura * EOF;
estrutura: declaracao_funcao
        | leitura
        | bloco_expressao
        | declaracao_variavel
        | print
        | bloco_condicional
        | bloco_rep
        | bloco_retorno
        | bloco;

declaracao_funcao: tipo FUN ID APR parametros? FPR ACH estrutura* FCH;
declaracao_variavel: tipo ID;
parametros: tipo ID*;
tipo: INT | STR | REA;
bloco_expressao: ID (ACO expressao FCO)? '=' expressao;
expressao: expressao_igualdade ((OP_LOG'^' expressao_igualdade)*)?;
expressao_igualdade: expressao_relacional ((OP_REL'^' expressao_relacional)*)?;
expressao_relacional: expressao_soma ((OP_REL'^' expressao_soma)*)?;
expressao_soma: expressao_multiplicacao ((OP_ARIT'^' expressao_multiplicacao)*)?;
expressao_multiplicacao: expressao_unaria ((OP_ARIT'^' expressao_unaria)*)?;
expressao_unaria: (OP_ARIT'^')* expressao_primaria;
expressao_primaria: ID (ACO expressao FCO)?
                   | NUM
                   | APR expressao FPR
                   | STR;
print: IMP APR expressao (COM expressao)* FPR;
bloco_retorno: RET expressao?;
leitura: LER ID;
bloco_condicional: SE expressao (SEN estrutura)? (ENT estrutura)?;
bloco_rep: ENQ expressao ACH estrutura* FCH;
bloco: ACH estrutura* FCH;

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


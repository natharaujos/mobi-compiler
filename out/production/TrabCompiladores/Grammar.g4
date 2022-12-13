grammar Grammar;

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


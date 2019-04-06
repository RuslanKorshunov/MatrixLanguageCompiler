grammar MatrixLanguage;

options{
    language = Java;
}

FUNCTION: 'function';

L_FBR: '{';
R_FBR: '}';
L_CBR: '[';
R_CBR: ']';
L_BR: '(';
R_BR: ')';

COMMA: ',';
DOT_COMMA: ';';
EQUALS: '=';

AND: 'and';
NOT: 'not';
OR: 'or';

IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
NULL: 'null';
MORE_THAN: '>';
LESS_THAN: '<';

ELEMENT: 'element';
SET: 'set';

WS : [\t\r\n]+ -> skip;

NAME: [a-zA-Z]+;
DIGIT: [0-9]+;

programInitialization: FUNCTION L_BR block L_FBR R_FBR;

elementInitialization: ELEMENT? NAME EQUALS DIGIT|NAME|addictiveElement|multiplicativeElement DOT_COMMA;

setInitialization: SET? NAME EQUALS (L_CBR (NAME|DIGIT)* R_CBR)|NAME|addElement|removeElement DOT_COMMA;

addictiveElement:
    NAME PLUS|MINUS DIGIT |
    DIGIT PLUS|MINUS NAME |
    DIGIT PLUS|MINUS DIGIT;

multiplicativeElement:
        NAME MULT|DIV DIGIT |
        DIGIT MULT|DIV NAME |
        DIGIT MULT|DIV DIGIT;

addElement:
    NAME PLUS NAME |
    NAME PLUS DIGIT;

removeElement:
    NAME MINUS NAME |
    NAME MINUS DIGIT;

lessThen:
    DIGIT LESS_THAN DIGIT|
    DIGIT LESS_THAN NAME|
    NAME LESS_THAN DIGIT|
    NAME LESS_THAN NAME;

moreThen:
    DIGIT MORE_THAN DIGIT|
    DIGIT MORE_THAN NAME|
    NAME MORE_THAN DIGIT|
    NAME MORE_THAN NAME;

/*ifElse: IF L_BR block R_BR L_FBR content R_FBR*/

block: L_BR R_BR;

content: ;

/*ELEMENT: ('0'..'9')+(COMMA('0'..'9')+)*;
SET: L_BR ELEMENT (COMMA ELEMENT)* R_BR;*/

/*addictiveExpression: multilicativeException ((PLUS|MINUS) multilicativeException)*;

multilicativeException: element ((MULT|DIV) element);

element: ELEMENT | L_BR addictiveExpression R_BR;*/


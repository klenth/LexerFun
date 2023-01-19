lexer grammar JsonLexer;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

NULL
    : 'null'
    ;

LBRACK
    : '['
    ;

RBRACK
    : ']'
    ;

LBRACE
    : '{'
    ;

RBRACE
    : '}'
    ;

COMMA
    : ','
    ;

COLON
    : ':'
    ;

NUMBER
    : [+-]? [0-9]+ '.' [0-9]+
    | [+-]? [0-9]+
    ;

STRING
    : '"' .*? '"'
    ;

WHITESPACE
    : [ \r\n\t]+    -> skip
    ;



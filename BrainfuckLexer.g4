// Name must match file (just like in Java)
lexer grammar BrainfuckLexer;

// Lexer rules — ALL_CAPS
INCREMENT_PTR
    : '>'
    ;

DECREMENT_PTR
    : '<'
    ;

INCREMENT
    : '+'
    ;

DECREMENT
    : '-'
    ;

OUTPUT
    : '.'
    ;

INPUT
    : ','
    ;

JUMP_FWD
    : '['
    ;

JUMP_BACK
    : ']'
    ;

COMMENT
    : .     -> skip
    ;
lexer grammar SheepLexer;

// B followed by at least two As (case ignored)
BAA
    : [Bb] [Aa] [Aa]+
    ;

COMMENT
    : .     -> skip
    ;

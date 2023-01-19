package edu.westminstercollege.cmpt355.lexerfun;

import org.antlr.v4.runtime.CharStreams;

public class BrainfuckMain {

    /*
    public static int sum(int... values) {
        int total = 0;
        for (int x : values)
            total += x;
        return total;
    }
    */

    public static void main(String... args) {
        var lexer = new BrainfuckLexer(CharStreams.fromString("[]+Blah--+<>Comment"));

        while (true) {
            var token = lexer.nextToken();
            if (token.getType() == BrainfuckLexer.EOF)
                break;
            System.out.println(token.getText());
        }
    }
}

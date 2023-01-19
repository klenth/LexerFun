package edu.westminstercollege.cmpt355.lexerfun;

import org.antlr.v4.runtime.CharStreams;

import java.util.Scanner;

public class SheepMain {

    public static void main(String... args) {
        var in = new Scanner(System.in);

        while (true) {
            String line = in.nextLine();

            if (line.isBlank())
                break;

            var lexer = new SheepLexer(CharStreams.fromString(line));

            while (true) {
                var token = lexer.nextToken();
                if (token.getType() == SheepLexer.EOF)
                    break;
                System.out.println(token.getText());
            }
        }
    }
}

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ExemploLexer {

    public static void  main (String[] args){
        String filename = "D:\\Projects\\TrabalhoPraticoGCC130\\codigo.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            GrammarLexer lexer = new GrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokens);
            ParseTree ast = parser.programa();
            System.out.println(ast.toStringTree());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

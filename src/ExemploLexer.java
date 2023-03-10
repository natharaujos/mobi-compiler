import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream ;
import org.antlr.v4.runtime.CharStreams ;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree ;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import antlr.GrammarParser;
import antlr.GrammarLexer;


import java.io.IOException;

public class ExemploLexer {

    public static void  main (String[] args){
        //parsing the input
        GrammarParser parser = getParser("D:\\Projects\\TrabalhoPraticoGCC130\\codigo.txt");

        //obter arvore
        ParseTree ast = parser.programa();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        Listener listener = new Listener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }

    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static GrammarParser getParser(String fileName){
        GrammarParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            GrammarLexer lexer = new GrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GrammarParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }


}

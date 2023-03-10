import java.util.HashMap;
import java.util.Map;
import antlr.*;

public class Listener extends GrammarBaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();

    @Override
    public void enterNDeclaracaoVariavel(GrammarParser.NDeclaracaoVariavelContext ctx) {
        System.out.println("In declaração: "+ctx.getText());
    }

    @Override
    public void exitNDeclaracaoVariavel(GrammarParser.NDeclaracaoVariavelContext ctx) {
        System.out.println("Out declaração: "+ctx.getText());
        String tipo = ctx.tipo().getText();
        String id = ctx.ID().toString();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
    }

    @Override
    public void enterNLeitura(GrammarParser.NLeituraContext ctx) {
        System.out.println("In declaração: "+ctx.getText());
    }

    @Override
    public void exitNLeitura(GrammarParser.NLeituraContext ctx) {
        System.out.println("Out declaração: "+ctx.getText());
        String id = ctx.ID().toString();
        String ler = ctx.LER().toString();
        tabelaSimbolos.put(ler, id);
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
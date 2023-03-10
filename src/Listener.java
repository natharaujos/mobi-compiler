import java.util.HashMap;
import java.util.Map;
import antlr.*;

public class Listener extends GrammarBaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    public boolean OcorreuErro = false;

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

    private boolean validarID(String id){
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração inexistente! Variável " + id + " não declarada");
            OcorreuErro = true;
            return false;
        }

        return true;
    }

    @Override
    public  void enterNAtribuicao(GrammarParser.NAtribuicaoContext ctx) {
        String id = ctx.ID().get(0).toString();

        if (validarID(id)) {
            switch (tabelaSimbolos.get(id)) {
                case "INTEIRO":
                    if (ctx.NUM() == null) {
                        if (ctx.ID().size() > 1) {
                            String segundoId = ctx.ID().get(1).toString();
                            String resultado = tabelaSimbolos.get(segundoId);
                            if (!resultado.equals("INTEIRO")) {
                                System.out.println("Conversão inválida:" + id + " é do tipo int");
                                OcorreuErro = true;
                            }
                        }
                    }
                    break;

                case "STRING":
                    if (ctx.NUM() == null) {
                        if (ctx.ID().size() > 1) {
                            String segundoId = ctx.ID().get(1).toString();
                            String resultado = tabelaSimbolos.get(segundoId);
                            if (!resultado.equals("STRING")) {
                                System.out.println("Conversão inválida:" + id + " é do tipo string");
                                OcorreuErro = true;
                            }
                        }
                    }

                    break;
                case "REAL":
                    if (ctx.NUM() == null) {
                        if (ctx.ID().size() > 1) {
                            String segundoId = ctx.ID().get(1).toString();
                            String resultado = tabelaSimbolos.get(segundoId);
                            if (resultado.equals("STRING")) {
                                System.out.println("Conversão inválida:" + id + " é do tipo real");
                                OcorreuErro = true;
                            }
                        }
                    }
                    break;
            }
        }
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
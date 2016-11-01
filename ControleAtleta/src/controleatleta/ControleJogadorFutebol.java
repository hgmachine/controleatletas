package controleatleta;

import java.util.ArrayList;

public class ControleJogadorFutebol {

    private ArrayList<JogadorFutebol> listaJogadoresFutebol;

    public ControleJogadorFutebol() {
        this.listaJogadoresFutebol = new ArrayList<JogadorFutebol>();
    }
    
    public ArrayList<JogadorFutebol> getListaJogadoresFutebol() {
        return listaJogadoresFutebol;
    }
    
    public void adicionar(JogadorFutebol umJogadorFutebol) {
        listaJogadoresFutebol.add(umJogadorFutebol);
    }
    
    public void remover(Boxeador umJogadorFutebol) {
        listaJogadoresFutebol.remove(umJogadorFutebol);
    }
    
    public JogadorFutebol pesquisar(String nome) {
        for (JogadorFutebol b: listaJogadoresFutebol) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}

package controleatleta;

import java.util.ArrayList;

public class JogadorFutebol extends Atleta {
    
    private char classificacao; // M=Masculino F=Feminino    
    private char posicao; // D=Defensor M=MeioDeCampo A=Atacante G=Goleiro
    private String categoria;
    /*
        Chupetinha  -> 06-07 anos
        Fraldinha   -> 08-09 anos
        Pré-Mirim   -> 10-11 anos
        Mirim       -> 12-13 anos
        Infantil    -> 14-15 anos
        Juvenil     -> 16-17 anos
        Adulto      -> 18+ anos
        Master      -> 40+ anos
    */
    private ArrayList<Premiacao> premiacoes;
    private int totalJogos;
    private int totalVitoriasEmCasa;
    private int totalVitoriasForaCasa;
    private int totalEmpates;
    private int totalDerrotas;
    private int totalCartoesVermelhos;
    
    public JogadorFutebol(String nome) {
        super(nome);
    }

    public char getClassificacao() {
        return classificacao;
    }
    
    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getTotalExpulsoes() {
        return totalCartoesVermelhos;
    }

    public void setTotalExpulsoes(int expulsoes) {
        this.totalCartoesVermelhos = expulsoes;
    }
    
    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int empates) {
        this.totalEmpates = empates;
    }
    
    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }
    
    public int getTotalJogos() {
        return totalJogos;
    }

    public void setTotalJogos(int numJogos) {
        this.totalJogos = numJogos;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }
    
    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalVitorias() {
        return totalVitoriasEmCasa;
    }

    public void setTotalVitorias(int vitorias) {
        this.totalVitoriasEmCasa = vitorias;
    }
    
    public int getTotalVitoriasEmCasa() {
        return totalVitoriasEmCasa;
    }

    public void setTotalVitoriasEmCasa(int vitoriasEmCasa) {
        this.totalVitoriasEmCasa = vitoriasEmCasa;
    }
    
    public void setCategoria(String categoria) {
        this.categoria= categoria;
    }
}

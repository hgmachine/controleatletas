package controleatleta;

import java.util.ArrayList;

public class JogadorFutebol extends Atleta {
    
    private char categoria; // A=Amador e P=Profissional 
    private char posicao; // D=Defensor M=MeioDeCampo A=Atacante G=Goleiro
    private char classe;
    /*
        "C" Chupetinha -> 06-07 anos
        "F" Fraldinha -> 08-09 anos
        "M" Mirim -> 10-11 anos
        "I" Infantil -> 12-13 anos
        "J" Juvenil -> 14-15 anos
        "U" Junior -> 16-17 anos
        "A" Adulto -> 18+ anos
        "S" Master -> 40+ anos
    */
    private ArrayList<Premiacao> premiacoes;
    private int totalGols;
    private int totalJogos;
    private int totalVitoriasEmCasa;
    private int totalVitoriasForaCasa;
    private int totalEmpates;
    private int totalDerrotas;
    private int totalCartoesVermelhos;
    
    public JogadorFutebol(String nome) {
        super(nome);
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    public char getCategoria() {
        return categoria;
    }
    
    public char getClasse() {
        return classe;
    }
    
    public void setClasse(char classe) {
        this.classe = classe;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalGols(int gols) {
        this.totalGols = gols;
    }
    
    public int getTotalGols() {
        return totalGols;
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

    public int getTotalVitoriasForaCasa() {
        return totalVitoriasForaCasa;
    }

    public void setTotalVitoriasForaCasa(int vitorias) {
        this.totalVitoriasForaCasa = vitorias;
    }
    
    public int getTotalVitoriasEmCasa() {
        return totalVitoriasEmCasa;
    }

    public void setTotalVitoriasEmCasa(int vitoriasEmCasa) {
        this.totalVitoriasEmCasa = vitoriasEmCasa;
    }  
}

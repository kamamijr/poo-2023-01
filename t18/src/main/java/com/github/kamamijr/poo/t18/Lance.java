package com.github.kamamijr.poo.t18;

public class Lance{
    private Posicao posicao;
    private Jogador jogador;
    private Peca peca;

    public Lance(String inicio, String pFinal, Peca peca, Jogador jogadorCorrespondente){
        this.posicao = new Posicao(inicio, pFinal);
        this.jogador = jogadorCorrespondente;
        this.peca = peca;
    }

    public Posicao getPosicao(){
        return this.posicao;
    }

    public Peca getPeca(){
        return this.peca;
    }

    public void setPosicao(Posicao posicao){
        this.posicao = posicao;
    }

    public void setPeca(Peca peca){
        this.peca = peca;
    }


    public String toString(){
        return "Jogador: " + this.jogador.getNome() + " - Posicao de saida: " + this.posicao.retornarPosicaoInicial() + " - Posicao de chegada: " + this.posicao.retornarPosicaoFinal() + " - Peca: " + this.peca.returnNome();
    }
}
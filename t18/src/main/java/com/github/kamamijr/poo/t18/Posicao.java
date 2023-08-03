package com.github.kamamijr.poo.t18;

public class Posicao{
    private String posicaoInicial;
    private String posicaoFinal;

    public Posicao(String posicaoInicialParametro, String posicaoFinalParametro){
    this.posicaoFinal = posicaoFinalParametro;
    this.posicaoInicial = posicaoInicialParametro;
    }
//    public String toString(){
//        return "Linha: " + this.posicaoInicial + " Coluna: " + this.posicaoFinal;
//    }

    public String retornarPosicaoInicial(){
        return this.posicaoInicial;
    }

    public String retornarPosicaoFinal(){
        return this.posicaoFinal;
    }
}
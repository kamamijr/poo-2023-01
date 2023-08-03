package com.github.kamamijr.poo.t18;

import java.util.ArrayList;

public class Partida{
    private ArrayList<Lance> lances = new ArrayList<>();
    private Jogador jogador1;
    private Jogador jogador2;

    public Partida(String j1, String j2){
        this.jogador1 = new Jogador(j1);
        this.jogador2 = new Jogador(j2);
    }

    public void adicionarLance(Posicao posicao, String nomePeca, int flag){
        switch(flag){
            case 1:
            this.lances.add(new Lance(posicao.retornarPosicaoInicial(), posicao.retornarPosicaoFinal(), new Peca(nomePeca), new Jogador(this.jogador1.getNome())));
            break;
            case 2:
            this.lances.add(new Lance(posicao.retornarPosicaoInicial(), posicao.retornarPosicaoFinal(), new Peca(nomePeca), new Jogador(this.jogador1.getNome())));
            break;
        }

    }

    public void imprimirJogadas(){
        for(int i = 0; i<this.lances.size();i++){
            System.out.println(this.lances.get(i).toString() + "\n");
        }
    }

}
package com.github.kamamijr.poo.t17;

import java.util.ArrayList;

public class Avaliacao {
    private ArrayList<Questao> questoes;
    private ArrayList<Prova> provas;

    public Avaliacao(){
        this.questoes.add(new Questao());
        this.provas.add(new Prova());
    }

    public void adicionarQuestoes(int quantidadeQuestoes){
        for(int i=0;i<quantidadeQuestoes;i++){
            this.questoes.add(new Questao());
        }
    }
    
    public void adicionarProvas(int quantidadeProvas){
        for(int i=0;i<quantidadeProvas;i++){
            this.provas.add(new Prova());
        }
    }

    public void verEnunciado(int numeroDaQuestao){
        String enunciado = new String();
        enunciado = this.questoes.get(numeroDaQuestao).getEnunciado();
        System.out.println(enunciado);
    }
}

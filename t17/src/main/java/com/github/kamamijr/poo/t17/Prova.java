package com.github.kamamijr.poo.t17;

import java.util.ArrayList;
import java.util.Scanner;

public class Prova {
    private String descricaoProva;
    private Aluno alunoCorrespondente;
    private ArrayList<Resposta> respostas;

    public Prova(){
        this.respostas.add(new Resposta());
        Scanner scanner = new Scanner(System.in);
        this.descricaoProva = scanner.nextLine();
    }

    public void adicionarRespostas(int quantidade){
        for(int i = 0;i<quantidade;i++){
            this.respostas.add(new Resposta());
        }
    }
}

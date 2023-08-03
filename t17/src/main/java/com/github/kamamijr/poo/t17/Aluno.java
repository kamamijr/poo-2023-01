package com.github.kamamijr.poo.t17;

import java.util.ArrayList;

public class Aluno {
    private ArrayList<Prova> provas;

    public Aluno(){
        this.provas.add(new Prova());
    }

    public void adicionarProvas(){
        this.provas.add(new Prova());
    }
}

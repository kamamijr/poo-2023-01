package com.github.kamamijr.poo.t17;

import java.util.ArrayList;

public class Funcionario {
    private Boolean gerente;
    private ArrayList<Funcionario> gerenciados;

    public void adicionarGerenciados(){
        this.gerenciados.add(new Funcionario());
    }
}

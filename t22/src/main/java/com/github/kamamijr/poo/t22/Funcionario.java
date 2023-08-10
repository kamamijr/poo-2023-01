package com.github.kamamijr.poo.t22;

import java.util.Set;
import java.util.HashSet;

public class Funcionario {
    private Escala escalas;
    private Set<Venda> vendas;

    public Funcionario(){
        this.vendas = new HashSet<Venda>();
    }

    public void realizarVenda(){
        this.vendas.add(new Venda());
        System.out.println("implementado por Jo&atilde;o V-it-or A.l.ves d_os R_ei_+s");
    }
}

package com.github.kamamijr.poo.t11;


import java.util.ArrayList;
import java.util.List;

class TipoFolha {
    private String forma;

    public TipoFolha(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}

class Folha {
    private TipoFolha tipo;

    public Folha(TipoFolha tipo) {
        this.tipo = tipo;
    }

    public TipoFolha getTipo() {
        return tipo;
    }

    public void setTipo(TipoFolha tipo) {
        this.tipo = tipo;
    }
}

class Arvore {
    private List<Folha> folhas;

    public Arvore() {
        folhas = new ArrayList<>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }

    public List<Folha> getFolhas() {
        return folhas;
    }
}

class Floresta {
    private List<Arvore> arvores;

    public Floresta() {
        arvores = new ArrayList<>();
    }

    public void adicionarArvore(Arvore arvore) {
        arvores.add(arvore);
    }

    public List<Arvore> getArvores() {
        return arvores;
    }
}


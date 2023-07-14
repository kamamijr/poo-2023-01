package com.github.kamamijr.poo.t11;


class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
}

class Frase {
    private Palavra[] palavras;

    public Frase(String[] palavras) {
        this.palavras = new Palavra[palavras.length];
        for (int i = 0; i < palavras.length; i++) {
            this.palavras[i] = new Palavra(palavras[i]);
        }
    }

    public Palavra[] getPalavras() {
        return palavras;
    }

    public void setPalavras(Palavra[] palavras) {
        this.palavras = palavras;
    }
}


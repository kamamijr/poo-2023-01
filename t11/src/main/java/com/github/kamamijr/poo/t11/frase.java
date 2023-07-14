<<<<<<< HEAD
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

=======
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

class Main {
    public static void main(String[] args) {
        String[] palavrasString = {"Esta", "é", "uma", "frase"};
        Frase frase = new Frase(palavrasString);

        Palavra[] palavras = frase.getPalavras();
        for (Palavra palavra : palavras) {
            System.out.println(palavra.getPalavra());
        }
    }
}
>>>>>>> fb486169b35d38609771a593e7dcfb2bcebef716

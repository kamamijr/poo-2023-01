package com.github.kamamijr.poo.t19.mensagem;

public class Objeto {
    
    public void printarMensagemDeObjeto(Objeto novoObjeto){
        novoObjeto.printarMensagemDeObjeto2(novoObjeto);
    }
    
    public void printarMensagem(){
        System.out.println("Mensagem de mikael junin");
    }

    public void printarMensagemDeObjeto2(Objeto novoObjeto){
        novoObjeto.printarMensagem();
    }
}

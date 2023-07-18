package com.github.kamamijr.poo.t09;

class Cliente {
    private Transacao[] transacoes;
}

public class Transacao {
    private Cliente cliente;
    private Fornecedor fornecedor; 
}

 class Fornecedor {
    private Transacao[] transacoes;
}


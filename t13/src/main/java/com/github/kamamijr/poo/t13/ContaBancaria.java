package com.github.kamamijr.poo.t13;
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado\n");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado\n");
        } else {
            System.out.println("Saldo insuficiente\n");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

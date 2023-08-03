package com.github.kamamijr.poo.t19.circulo;

public class CirculoDecomposto{
    private int raio;
    private Ponto centro;

    public CirculoDecomposto(){
        this.centro = new Ponto();
    }

    public void move(){
        this.centro.move();
    }
}

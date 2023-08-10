package com.github.kamamijr.poo.t22;

import java.util.Date;

public class Data {
    private Date dataAtual;

    public Data(){
        this.dataAtual = new Date();
    }
    public Date getData(){
        return this.dataAtual;
    }
}

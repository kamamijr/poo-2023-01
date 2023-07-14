package com.github.kamamijr.poo.t11;

import java.util.Date;

class Data {
    private Date data;

    public Data(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}

class Periodo {
    private Data dataInicial;
    private Data dataFinal;

    public Periodo(Data dataInicial, Data dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Data getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Data dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Data getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Data dataFinal) {
        this.dataFinal = dataFinal;
    }
}




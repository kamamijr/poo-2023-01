package com.github.kamamijr.poo.t11;

class Janela {
    private double area;

    public Janela(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

class JanelaComVidro extends Janela {
    private double areaVidro;

    public JanelaComVidro(double area, double areaVidro) {
        super(area);
        this.areaVidro = areaVidro;
    }

    public double getAreaVidro() {
        return areaVidro;
    }

    public void setAreaVidro(double areaVidro) {
        this.areaVidro = areaVidro;
    }

    public double getAreaRestante() {
        return getArea() - areaVidro;
    }
}


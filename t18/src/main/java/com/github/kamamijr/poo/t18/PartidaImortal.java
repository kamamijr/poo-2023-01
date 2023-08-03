package com.github.kamamijr.poo.t18;

public class PartidaImortal{
  //  private Posicao aux;
    public static void main(String args[]){

    Partida partidaImortal = new Partida("Adolf Anderssen", "Lionel Kieseritzky");

    partidaImortal.adicionarLance(new Posicao("e2", "e4"), "Peao", 1);
    partidaImortal.adicionarLance(new Posicao("e7", "e5"), "Peao", 2);
    partidaImortal.adicionarLance(new Posicao("f2", "f4"), "Peao", 1);
    partidaImortal.adicionarLance(new Posicao("e5", "f4"), "Peao", 2);
    partidaImortal.adicionarLance(new Posicao("f1", "c4"), "Bispo", 1);
    partidaImortal.adicionarLance(new Posicao("d8", "h4"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("e1", "f1"), "Rei", 1);
    partidaImortal.adicionarLance(new Posicao("b7", "b5"), "Peao", 2);
    partidaImortal.adicionarLance(new Posicao("c4", "b5"), "Bispo", 1);
    partidaImortal.adicionarLance(new Posicao("g8", "f6"), "Cavalo", 2);
    partidaImortal.adicionarLance(new Posicao("g1", "f3"), "Cavalo", 1);
    partidaImortal.adicionarLance(new Posicao("h4", "h6"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("d2", "d3"), "Peao", 1);
    partidaImortal.adicionarLance(new Posicao("f6", "h5"), "Cavalo", 2);
    partidaImortal.adicionarLance(new Posicao("f3", "h4"), "Cavalo", 1);
    partidaImortal.adicionarLance(new Posicao("h6", "g5"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("h4", "f5"), "Cavalo", 1);
    partidaImortal.adicionarLance(new Posicao("c7", "c6"), "Peao", 2);
    partidaImortal.adicionarLance(new Posicao("g2", "g4"), "Peao", 1);
    partidaImortal.adicionarLance(new Posicao("h5", "f2"), "Cavalo", 2);
    partidaImortal.adicionarLance(new Posicao("h1", "g1"), "Torre", 1);
    partidaImortal.adicionarLance(new Posicao("c6", "b5"), "Peao", 2);
    partidaImortal.adicionarLance(new Posicao("h2", "h4"), "Peao", 1);
    partidaImortal.adicionarLance(new Posicao("g5", "g6"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("h4", "h5"), "Peao", 1);
    partidaImortal.adicionarLance(new Posicao("g6", "g5"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("d1", "f3"), "Rainha", 1);
    partidaImortal.adicionarLance(new Posicao("f6", "g8"), "Cavalo", 2);
    partidaImortal.adicionarLance(new Posicao("c1", "f4"), "Bispo", 1);
    partidaImortal.adicionarLance(new Posicao("g5", "f6"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("b1", "c3"), "Cavalo", 1);
    partidaImortal.adicionarLance(new Posicao("f8", "c5"), "Bispo", 2);
    partidaImortal.adicionarLance(new Posicao("c3", "d5"), "Cavalo", 1);
    partidaImortal.adicionarLance(new Posicao("f6", "b2"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("f4", "d6"), "Bispo", 1);
    partidaImortal.adicionarLance(new Posicao("c5", "g1"), "Bispo", 2);
    partidaImortal.adicionarLance(new Posicao("e4", "e5"), "Peao", 1);
    partidaImortal.adicionarLance(new Posicao("b2", "a1"), "Rainha", 2);
    partidaImortal.adicionarLance(new Posicao("f1", "e2"), "Rei", 1);
    partidaImortal.adicionarLance(new Posicao("b8", "a6"), "Cavalo", 2);
    partidaImortal.adicionarLance(new Posicao("f5", "g7"), "Cavalo", 1);
    partidaImortal.adicionarLance(new Posicao("e8", "d8"), "Rei", 2);
    partidaImortal.adicionarLance(new Posicao("f3", "f3"), "Rainha", 1);
    partidaImortal.adicionarLance(new Posicao("g8", "f6"), "Cavalo", 2);
    partidaImortal.adicionarLance(new Posicao("d6", "e7"), "Bispo", 1);

    partidaImortal.imprimirJogadas();
    }
}
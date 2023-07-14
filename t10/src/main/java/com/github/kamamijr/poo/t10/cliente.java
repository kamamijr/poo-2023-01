package com.github.kamamijr.poo.t10;

import java.util.ArrayList;
import java.util.List;

// Classe principal que representa uma bicicleta
class Bike {
    private String modelo;
    private String marca;
    private int ano;

    public Bike(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    // Getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

// Classe que representa um serviço de manutenção
class ServicoManutencao {
    private String nome;
    private double preco;

    public ServicoManutencao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

// Classe que representa uma oficina
class Oficina {
    private List<Bike> bikes;
    private List<ServicoManutencao> servicos;

    public Oficina() {
        bikes = new ArrayList<>();
        servicos = new ArrayList<>();
    }

    // Métodos para adicionar e remover bicicletas e serviços

    public void adicionarBike(Bike bike) {
        bikes.add(bike);
    }

    public void removerBike(Bike bike) {
        bikes.remove(bike);
    }

    public void adicionarServico(ServicoManutencao servico) {
        servicos.add(servico);
    }

    public void removerServico(ServicoManutencao servico) {
        servicos.remove(servico);
    }

    // Outros métodos para a oficina

    public void realizarManutencao(Bike bike, ServicoManutencao servico) {
        // Lógica para realizar a manutenção na bicicleta usando o serviço especificado
        System.out.println("Realizando manutenção na bike " + bike.getModelo() + " com o serviço " + servico.getNome());
        System.out.println("Preço: R$" + servico.getPreco());
    }

    public void listarBikes() {
        System.out.println("Bicicletas na oficina:");
        for (Bike bike : bikes) {
            System.out.println("- " + bike.getModelo() + " (" + bike.getMarca() + ")");
        }
    }

    public void listarServicos() {
        System.out.println("Serviços disponíveis:");
        for (ServicoManutencao servico : servicos) {
            System.out.println("- " + servico.getNome() + " (R$" + servico.getPreco() + ")");
        }
    }
}

// Classe de teste
class Main {
    public static void main(String[] args) {
        // Criando instâncias de bicicletas
        Bike bike1 = new Bike("Speed", "Caloi", 2020);
        Bike bike2 = new Bike("Mountain", "Trek", 2021);

        // Criando instâncias de serviços de manutenção
        ServicoManutencao servico1 = new ServicoManutencao("Troca de pneus", 50.0);
        ServicoManutencao servico2 = new ServicoManutencao("Ajuste de freios", 30.0);

        // Criando uma instância da oficina
        Oficina oficina = new Oficina();

        // Adicionando bicicletas e serviços na oficina
        oficina.adicionarBike(bike1);
        oficina.adicionarBike(bike2);
        oficina.adicionarServico(servico1);
        oficina.adicionarServico(servico2);

        // Realizando uma manutenção na primeira bicicleta usando o primeiro serviço
        oficina.realizarManutencao(bike1, servico1);

        // Listando as bicicletas e os serviços disponíveis na oficina
        oficina.listarBikes();
        oficina.listarServicos();
    }
}

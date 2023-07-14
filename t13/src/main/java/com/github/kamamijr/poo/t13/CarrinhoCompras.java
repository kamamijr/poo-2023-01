package com.github.kamamijr.poo.t13;
import java.util.List;
import java.util.ArrayList;
public class CarrinhoCompras{
    private List<String> itens;

    public CarrinhoCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item adicionado ao carrinho\n");
    }

    public void removerItem(String item) {
        if (itens.contains(item)) {
            itens.remove(item);
            System.out.println("Item removido do carrinho\n");
        } else {
            System.out.println("Item não encontrado no carrinho\n");
        }
    }

    public void exibirItens() {
        System.out.println("Itens no carrinho: " + itens.toString() + "\n");
    }
}

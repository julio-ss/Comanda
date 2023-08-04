package com.example.comanda;

import java.util.HashMap;
import java.util.Map;

class Item {
    public String nome;
    public  double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Comanda {
    public  Map<Item, Integer> itens;

    public Comanda() {
        itens = new HashMap<>();
    }

    public void adicionarItem(Item item, int quantidade) {
        if (itens.containsKey(item)) {
            int novaQuantidade = itens.get(item) + quantidade;
            itens.put(item, novaQuantidade);
        } else {
            itens.put(item, quantidade);
        }
    }

    public void removerItem(Item item, int quantidade) {
        if (itens.containsKey(item)) {
            int quantidadeAtual = itens.get(item);
            if (quantidade >= quantidadeAtual) {
                itens.remove(item);
            } else {
                int novaQuantidade = quantidadeAtual - quantidade;
                itens.put(item, novaQuantidade);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Item, Integer> entry : itens.entrySet()) {
            Item item = entry.getKey();
            int quantidade = entry.getValue();
            double subtotal = item.getPreco() * quantidade;
            total += subtotal;
        }
        return total;
    }
}



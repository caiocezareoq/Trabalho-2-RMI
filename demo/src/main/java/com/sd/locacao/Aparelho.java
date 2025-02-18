package com.sd.locacao;

import java.io.Serializable;

public abstract class Aparelho implements Serializable {
    private String nome;
    private double precoLocacao;

    public Aparelho(String nome, double precoLocacao) {
        this.nome = nome;
        this.precoLocacao = precoLocacao;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public double getPrecoLocacao() {
        return precoLocacao;
    }
}

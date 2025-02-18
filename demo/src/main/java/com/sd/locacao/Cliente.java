package com.sd.locacao;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
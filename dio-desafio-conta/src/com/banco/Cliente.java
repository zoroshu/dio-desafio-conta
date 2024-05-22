package com.banco;

public class Cliente {

        private String nome;
        private int cpf;

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + ", " + "CPF: " + cpf +" \n";
    }
}

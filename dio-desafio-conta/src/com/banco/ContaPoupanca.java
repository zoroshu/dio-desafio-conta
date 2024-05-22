package com.banco;

import java.util.function.Consumer;

public class ContaPoupanca extends Conta {

    private static int contaSequencial = 1;

    public ContaPoupanca(Cliente cliente) {
        super.agencia = 1;
        super.numConta = contaSequencial++;
        super.cliente = cliente;
    }

    public void imprimirExtratoPoupanca(){
        System.out.println("-----Imprimindo Extrato Conta Poupanca: -----");
        super.imprimirExtrato();
    }
}

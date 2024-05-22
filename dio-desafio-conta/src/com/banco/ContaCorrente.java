package com.banco;


public class ContaCorrente  extends Conta{

    private static int contaSequencial = 1;

    public ContaCorrente(Cliente cliente) {
        super.agencia = 1;
        super.numConta = contaSequencial++;
        super.cliente = cliente;
    }

     public void imprimirExtratoCC(){
        System.out.println("-----Imprimindo Extrato Conta Corrente: -----");
        super.imprimirExtrato();
    }




}

package com.banco;

public abstract class Conta {
    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;


    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar (double valor){
        if(saldo < valor){
            System.out.println("Saldo Insuficiente!");
            System.out.printf("Saldo: %.2f%n", saldo);
        }else{
            saldo -= valor;
        }
    }

    public void depositar (double valor){
        this.saldo += valor;
    }

    public void transferir(double valor,Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirExtrato(){
        System.out.printf("Cliente: %s", this.cliente);
        System.out.printf("Agencia: %d %n", this.agencia);
        System.out.printf("Conta: %d %n", this.numConta);
        System.out.printf("Saldo: %.2f%n", this.saldo );
    }

}

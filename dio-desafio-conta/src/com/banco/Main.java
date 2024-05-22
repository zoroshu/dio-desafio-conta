package com.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Victor Felipe",578943210);
        Cliente cliente2 = new Cliente("Maria Aparecida", 547986201);

        ContaCorrente cc = new ContaCorrente(cliente1);
        ContaPoupanca cp = new ContaPoupanca(cliente2);

        cc.depositar(1200);
        cp.depositar(500);
        cp.sacar(1000);

        cp.imprimirExtratoPoupanca();
        cc.imprimirExtratoCC();

        cc.transferir(750,cp);
        cp.imprimirExtratoPoupanca();




    }
}

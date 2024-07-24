package org.example;

import org.example.contas.Conta;
import org.example.contas.ContaCorrente;
import org.example.contas.ContaPoupanca;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        venilton.setNome("Fabio");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(150);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
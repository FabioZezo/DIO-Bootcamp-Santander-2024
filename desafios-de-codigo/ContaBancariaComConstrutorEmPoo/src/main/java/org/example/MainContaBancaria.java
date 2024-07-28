package org.example;

import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Saldo Inicial");
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        System.out.println("Digite o Valor do Depósito");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("Digite o Valor do Saque");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        scanner.close();
    }
}


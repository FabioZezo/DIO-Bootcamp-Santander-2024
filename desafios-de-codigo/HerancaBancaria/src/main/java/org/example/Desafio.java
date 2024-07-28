package org.example;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Titular da Conta");
        String titular = scanner.next();

        System.out.println("Digite o Número da Conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o Saldo da Conta");
        double saldo = scanner.nextDouble();

        System.out.println("Digite a Taxa de Juros");
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}
package org.example;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.printf("Digite a Opção desejada:%n 1- Depósito %n 2- Saque %n 3- Ver Saldo %n 0- Encerrar a Operação %n");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digitge o Valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    saldo = valorDeposito + saldo;
                    System.out.printf("Saldo atual: %.1f %n", saldo);
                    break;
                case 2:
                    System.out.println("Digitge o Valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque < saldo) {
                        saldo = saldo - valorSaque;
                        System.out.printf("Saldo atual: %.1f %n", saldo);
                    } else {
                        System.out.printf("Saldo insuficiente. %n");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f %n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

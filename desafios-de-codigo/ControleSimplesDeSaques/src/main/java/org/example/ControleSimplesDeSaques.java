package org.example;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor do Limite Diario: ");
        double limiteDiario = scanner.nextDouble();

        for (int i = 1; limiteDiario > 0; i++) {

            System.out.println("Digite o Valor do Saque: ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                limiteDiario = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        scanner.close();
    }
}
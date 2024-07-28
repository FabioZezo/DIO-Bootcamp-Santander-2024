package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Valor Inicial da Conta");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o Total de Transações Desejadas");
        int quantidadeTransacoes = scanner.nextInt();

        List<String> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.printf("%nDigite a Transação Desejada: %nD(depósito) %nS(saque)%n");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            System.out.println("Digite o Valor da Transação");
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        System.out.printf("Saldo: " + saldo + "%nTransacoes:%n");
        int indice = 1;
        for (String i : transacoes) {

            System.out.println(indice++ + "." + i);
        }

        scanner.close();
    }
}
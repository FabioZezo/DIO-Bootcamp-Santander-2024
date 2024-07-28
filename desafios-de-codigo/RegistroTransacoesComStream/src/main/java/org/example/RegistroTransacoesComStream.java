package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dite o Saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Digite a Quantidade de Operações");
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            System.out.printf("%nDigite a Transação Desejada: %nD(depósito) %nS(saque)%n");
            char tipoTransacao = scanner.next().charAt(0);

            System.out.println("Digite o Valor da Transação");
            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);

            if (transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
            transacoes.add(transacao);
        }

        System.out.println("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        scanner.close();
    }
}
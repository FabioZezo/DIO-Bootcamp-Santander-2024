package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o número da Agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o Nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o Saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
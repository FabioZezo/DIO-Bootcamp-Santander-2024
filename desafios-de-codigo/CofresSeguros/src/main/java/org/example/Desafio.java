package org.example;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Tipo de Cofre: fisico ou digital");
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {

            System.out.println("Digite a senha");
            int senha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);

            System.out.println("Confirme a Senha");
            int confirmacaoSenha = scanner.nextInt();

            cofreDigital.imprimirInformacoes();

            if (cofreDigital.validarSenha(confirmacaoSenha) != true) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Cofre aberto!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
    }
}
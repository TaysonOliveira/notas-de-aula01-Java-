package Questao04;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("----- Bem vindo! -----");

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\nMENU:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                conta.consultarSaldo();
            } else if (opcao == 2) {
                System.out.print("Digite o valor do depósito: ");
                double valor = sc.nextDouble();
                conta.depositar(valor);
            } else if (opcao == 3) {
                System.out.print("Digite o valor do saque: ");
                double valor = sc.nextDouble();
                conta.sacar(valor);
            } else if (opcao == 4) {
                System.out.print("Digite o valor da transferência: ");
                double valor = sc.nextDouble();
                conta.transferir(valor);
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema bancário...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
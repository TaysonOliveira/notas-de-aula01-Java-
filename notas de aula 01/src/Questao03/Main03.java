package Questao03;

import java.util.Scanner;
public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("Digite o nome do produto: ");
        p.nome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        p.preco = sc.nextDouble();

        System.out.println("Digite a quantidade inicial em estoque: ");
        p.quantidade = sc.nextInt();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nMENU:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Quantos produtos deseja adicionar ao estoque? ");
                int qtdAdicionar = sc.nextInt();
                p.adicionarEstoque(qtdAdicionar);
                System.out.println("Estoque atualizado com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Quantos produtos deseja vender? ");
                int qtdVender = sc.nextInt();
                p.vender(qtdVender);
            } else if (opcao == 3) {
                p.exibirEstoque();
            } else if (opcao == 4) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
package Questao03;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int quantidadeAdicionada) {
        quantidade += quantidadeAdicionada;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void exibirEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}

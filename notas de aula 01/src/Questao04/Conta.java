package Questao04;

public class Conta {
    double saldo;

    void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }

    void transferir(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência!");
        } else {
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        }
    }
}
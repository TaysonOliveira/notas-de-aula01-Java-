package Questao02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        Calculadora m = new Calculadora();
        System.out.printf("----- Digite as notas os numeros a seguir para calcular ! -----\n");

        System.out.println("Primeiro numero: ");
        m.n1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        m.n2 = sc.nextInt();


        System.out.println("A seguir digite a opção desejada: ");
        System.out.println("1 (Soma), 2 (Subtrair), 3 (Dividir), 4 (Multiplicar) ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.print("A soma dos números é: ");
                System.out.print(m.somar());
                break;
            case 2:
                System.out.println("A subtração dos números são: ");
                System.out.print(m.subtrair());
                break;
            case 3:
                System.out.println("A divisão dos números são: ");
                System.out.print(m.dividir());
                break;
            case 4:
                System.out.println("A multiplicação dos números são: ");
                System.out.print(m.multiplicar());
            default:
                System.out.println("Opção inválido");
                break;
        }
    }
}
package exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = leitura.nextInt();
        System.out.println("Digite um número:");
        int n2 = leitura.nextInt();
        int soma = n1 + n2;

        System.out.println("Soma: " + soma);
    }
}

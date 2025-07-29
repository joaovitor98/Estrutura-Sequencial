package exercicios;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite 4 números: ");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();
        int n3 = leitura.nextInt();
        int n4 = leitura.nextInt();
        int diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + diferenca);
    }
}

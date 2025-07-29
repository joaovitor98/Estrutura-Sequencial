package exercicios;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado");

        double lado = leitura.nextDouble();

        double per = 4 * lado;

        System.out.printf("Perímetro: %.2f", per);
    }
}

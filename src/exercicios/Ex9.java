package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do Raio: ");
        double raio = leitura.nextDouble();

        double comp = 2 * Math.PI * raio;

        System.out.printf("Comprimento circunferência: %.2f", comp);
    }
}

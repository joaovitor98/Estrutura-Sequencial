package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do grau Celsius: ");
        double c = leitura.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.printf("Fahrenheit: %.1f", f);
    }
}

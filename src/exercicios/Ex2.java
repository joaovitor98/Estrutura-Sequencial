package exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        double raio = leitura.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Area do círculo: %.2f", area);
    }
}

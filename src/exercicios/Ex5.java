package exercicios;

import java.util.Scanner;

//Triângulo:
//Círculo:
//Trapézio:
//Quadrado:
//Retângulo:
public class Ex5 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite as 3 valores");

        double a = leitura.nextDouble();
        double b = leitura.nextDouble();
        double c = leitura.nextDouble();

        double area = (a * c) / 2;
        System.out.printf("Triângulo: %.2f%n", area);

        area = Math.PI * Math.pow(c, 2);
        System.out.printf("Círculo: %.2f%n", area);

        area = ((a + b) * c) / 2;
        System.out.printf("Trapézio: %.2f%n", area);

        area = Math.pow(b, 2);
        System.out.printf("Quadrado: %.2f%n", area);

        area = a * b;
        System.out.printf("Retângulo: %.2f%n", area);
    }
}

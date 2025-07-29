package exercicios;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do lado de um cubo: ");

        double ld = leitura.nextDouble();

        double volume = Math.pow(ld, 3);

        System.out.printf("Volume: %.2f", volume);
    }
}

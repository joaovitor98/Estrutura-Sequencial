package exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor de 3 notas: ");
        double n1 = leitura.nextDouble();
        double n2 = leitura.nextDouble();
        double n3 = leitura.nextDouble();
        double media = (n1 + n2 + n3) / 3;

        System.out.printf("Média: %.2f", media);
    }
}

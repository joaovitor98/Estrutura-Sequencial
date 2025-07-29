package aulas;

import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String text = leitura.next();
        int n1 = leitura.nextInt();
        double n2 = leitura.nextDouble();

        System.out.printf("Voce Digitou as sequintes coisas: %n%s %n%d %n%.2f", text, n1, n2);
    }
}

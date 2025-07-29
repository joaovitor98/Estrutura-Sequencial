package aulas;

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int x = leitura.nextInt();
        leitura.nextLine();
        String s1 = leitura.nextLine();
        String s2 = leitura.nextLine();
        String s3 = leitura.nextLine();

        System.out.printf("Dados digitados: %n%d %n%s %n%s %n%s", x, s1, s2, s3);
    }
}

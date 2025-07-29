package exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor de horas que um funcionário trabalha: ");
        int hr = leitura.nextInt();

        System.out.println("Digite o valor do salário do funcionário por hora: ");

        double valHr = leitura.nextDouble();
        double salario = valHr * (double) hr;

        System.out.printf("Salário: %.2f", salario);
    }
}

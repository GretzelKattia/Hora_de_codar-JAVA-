import java.util.Scanner;

public class exercicio24 {
    public static void main (String[] args) {
        /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
        trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
         com um acréscimo de 50%.

        Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por
        hora e escreva o salário total do funcionário, que deverá ser acrescido das
        horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)  */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas no mês:");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o salário por hora:");
        double salarioPorHora = scanner.nextDouble();

        int horasRegulares = Math.min(horasTrabalhadas, 160);
        int horasExtras = Math.max(0, horasTrabalhadas - 160);

        double salarioRegular = horasRegulares * salarioPorHora;
        double salarioExtra = horasExtras * salarioPorHora * 1.5;

        double salarioTotal = salarioRegular + salarioExtra;

        System.out.println("O salário total do funcionário é: " + salarioTotal);

        scanner.close();

    }
}

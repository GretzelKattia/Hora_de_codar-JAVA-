import java.util.Arrays;
import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args ){
        /*
        * Faça um programa que leia 10 valores informados pelo usuário,
        * calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
         */
        int somatoria = 0;

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = scanner.nextInt();
            somatoria += valores[i];

        }
        double mediaAritmetica = (double)somatoria / valores.length;

        System.out.println("A média aritmetíca entre esses valores é: " + mediaAritmetica);

    }
}

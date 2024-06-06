import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        /*
        * Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados
        * pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
        */
        Scanner valorDigitado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 =valorDigitado.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 =valorDigitado.nextInt();

        int soma = 0;
        int quantidade = 0;

        for (int i = valor1; i <= valor2; i++) {
            soma += i;
            quantidade++;
        }
        double mediaAritmetica = (double)soma/quantidade;
        System.out.println("A média disso é " + mediaAritmetica);

    }
}

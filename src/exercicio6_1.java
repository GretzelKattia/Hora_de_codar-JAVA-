import java.util.Scanner;

public class exercicio6_1 {
    public static void main (String[] args) {
        /*Faça um programa para ler 4 valores (considere que não
        serão informados valores iguais) e escrever o maior deles.
         */

        Scanner valores = new Scanner(System.in);
        System.out.println("Por favor, digite o primeiro valor:");
        float valor1 = valores.nextFloat();
        System.out.println("Por favor, digite o segundo valor");
        float valor2 = valores.nextFloat();
        System.out.println("Por favor, digite o terceiro valor");
        float valor3 = valores.nextFloat();
        System.out.println("Por favor, digite o quarto valor");
        float valor4 = valores.nextFloat();

        float maiorValor = Math.max(valor1, Math.max(valor2, Math.max(valor3, valor4)));


        System.out.println("O maior valor entre eles é " + maiorValor);
    }
}

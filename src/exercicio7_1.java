import java.util.Scanner;
import java.util.Arrays;

public class exercicio7_1 {
    public static void main(String[] args) {
        /*
        * Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
        */
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = scanner.nextInt();
        }

        Arrays.sort(valores);
        int somaDosMaiores = valores[3] + valores[4];

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
    }
}

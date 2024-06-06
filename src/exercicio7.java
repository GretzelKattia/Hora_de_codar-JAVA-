import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        /*Faça um programa que leia  3 valores (considere que não
        serão informados valores iguais) e escrever a soma dos 2 maiores.
         */

        /*
        * float[] valoresInseridos = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valoresInseridos[i] = scanner.nextFloat();
        }

        Arrays.sort(valoresInseridos);
        float somaDosMaiores = valoresInseridos[1] + valoresInteridos[2];
        * */
        Scanner valores = new Scanner(System.in);
        System.out.println("Por favor, digite o primeiro valor:");
        float valor1 = valores.nextFloat();
        System.out.println("Por favor, digite o segundo valor");
        float valor2 = valores.nextFloat();
        System.out.println("Por favor, digite o terceiro valor");
        float valor3 = valores.nextFloat();

        float maior1, maior2;

        if (valor1 > valor2) {
            if (valor1 > valor3) {
                maior1 = valor1;
                maior2 = Math.max(valor2, valor3);
            } else {
                maior1 = valor3;
                maior2 = valor1;
            }
        } else {
            if (valor2 > valor3) {
                maior1 = valor2;
                maior2 = Math.max(valor1, valor3);
            } else {
                maior1 = valor3;
                maior2 = valor2;
            }
        }

        float somaDosMaiores = maior1 + maior2;

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
    }
}

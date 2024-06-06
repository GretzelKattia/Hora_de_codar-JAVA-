import java.util.Scanner;

public class exercicio19 {
    public static void main (String[] args) {
        /*Crie um programa para ler 3 valores (A, B e C) representando as medidas dos lados
        de um triângulo e escrever se formam ou não um triângulo.

        Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        double A = scanner.nextDouble();

        System.out.println("Digite o valor B: ");
        double B = scanner.nextDouble();

        System.out.println("Digite o valor C: ");
        double C = scanner.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os valores informados formam um triângulo!!!");
        }
        else {
            System.out.println("Os valores informados NÃO formam um triângulo");
        }

        scanner.close();


    }
}

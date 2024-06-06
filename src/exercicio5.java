import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        /*Faça um programa que leia um valor informado pelo usuário
        e diga se o valor informado é positivo, negativo ou neutro.
         */
        Scanner valorInformado = new Scanner(System.in);
        System.out.println("Por favor usuario, digite um valor a seguir:");
        float valor = valorInformado.nextFloat();

        if (valor < 0) {
            System.out.println("O valor informado é negativo");
        }
        else if (valor > 0) {
            System.out.println("O valor informado é positivo");
        }
        else {
            System.out.println("Ué, o valor é igual a zero");
        }
    }
}

import java.util.Scanner;

public class exercicio25 {
    public static void main (String[] args) {
        /*
        Escreva um programa que para ler doze números informados pelo usuário e que serão armazenados em um vetor/array.
            No fim o programa deve dar duas saídas:
            1) o programa deve processar os dados invertendo a posição dos elementos trocando o primeiro elemento com o último, o segundo com penúltimo etc.
            2) o programa deve processar os dados invertendo a posição dos elementos trocando, mas separando os dados por tipo.
        Exemplo:
        Usuário informa: A, 1, B, 2, C, 3 D, 4, E, 5, F, 6
        Saída 1:  6, F, 5, E, 4, D, 3, 2, B, 1
        Saída 2:  6, 5, 4, 3, 2, 1 - F, E, D, C, A, B
        */

        Scanner scanner = new Scanner(System.in);
        String[] elementos = new String[12];

        // Leitura dos elementos
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ":");
            elementos[i] = scanner.next();
        }

        // Saída 1: Invertendo a posição dos elementos
        System.out.println("Saída 1:");
        for (int i = 11; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();

        // Saída 2: Invertendo a posição dos elementos e separando por tipo
        System.out.println("Saída 2:");
        for (int i = 11; i >= 0; i--) {
            if (Character.isDigit(elementos[i].charAt(0))) { // Se for um número
                System.out.print(elementos[i] + " ");
            }
        }
        System.out.print("- ");
        for (int i = 11; i >= 0; i--) {
            if (Character.isLetter(elementos[i].charAt(0))) { // Se for uma letra
                System.out.print(elementos[i] + " ");
            }
        }

        scanner.close();

    }
}

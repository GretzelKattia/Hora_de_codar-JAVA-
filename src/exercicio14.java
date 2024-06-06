import java.util.Scanner;
import java.util.*;

public class exercicio14 {
    public static void main(String[] args) {
        /*
         * Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final.
         * Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?"
         * e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente,
         * caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
         */


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        char escolhaUsuario = 's';
        int contadorAprovados = 0; // Adicionado um contador para alunos aprovados


        while (Character.toLowerCase(escolhaUsuario) == 's'){
            ArrayList<Float> notas = new ArrayList<Float>();
            double somasNotas = 0;

            for (int i = 0; i < 6; i++) {
                System.out.println("Digite a nota da prova " + (i+1) + ", por favor: ");
                float usuario = scanner.nextFloat();
                notas.add(usuario);
                somasNotas += usuario;
            }

            double media = somasNotas / 6;

            if (media >= 6.5) {
                System.out.println("Aluno aprovado");
                contadorAprovados++; // Incrementa o contador se o aluno for aprovado
            }
            else {
                System.out.println("Aluno reprovado");
            }

            System.out.println(media);
            System.out.println("Calcular a média de outro aluno s/n");
            escolhaUsuario = scanner.next().charAt(0);

        }

        System.out.println("Quantidade de alunos aprovados: " + contadorAprovados); // Exibe a quantidade de alunos aprovados
    }
}

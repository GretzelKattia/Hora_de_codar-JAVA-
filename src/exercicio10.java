import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        /*
        * Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre,
        * calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado!
        * somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
         */
        int somatoria = 0;

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = scanner.nextInt();
            somatoria += valores[i];
        }

        double mediaSemestral = (double)somatoria / valores.length;
        if (mediaSemestral > 10.0) {
            System.out.println("Suspeito isso daqui...");
        }
        else if (mediaSemestral >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }
        else {
            System.out.println("Infelizmente você reprovou nessa matéria :(");
        }
    }
}

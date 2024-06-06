import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args) {
        /*3 - A Bit of Information
         Escreva um programa em Java em que o usuário informe o seu nome e em
         seguida o programa perguntará a idade do usuário. Agora o programa deve
         exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".*/

        Scanner info = new Scanner(System.in);
        System.out.println("Qual é seu nome indivíduo não identificado?");
        String individuo = info.next();
        System.out.println("E qual é a sua idade" + individuo +"?");
        int idade = info.nextInt();

        System.out.println("Ata. Gente, o nome dela/dele é " + individuo + ", ela/ele tem " + idade + " anos.");

    }
}

import java.util.Scanner;

public class exercicio2 {
    public static void main ( String[] args) {
        /*2 -  Hello Clarice
        Escreva um programa em Java em que o usuário informe
        o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".*/

        Scanner nomePessoa = new Scanner(System.in);
                System.out.println("Olá, poderia digitar seu nome, por favor?");
                String nome = nomePessoa.next();
                System.out.println("Olá " + nome + ". Seja bem-vindo(a)!");
    }
}

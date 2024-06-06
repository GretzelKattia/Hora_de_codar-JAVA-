import java.util.Scanner;

public class exercicio8 {
    public static void main (String[] args) {
    /*
    * Faça um programa para ler 2 valores informados pelo
    * usuário e se o segundo valor informado for neutro, deve ser lido um
    * novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero
    * nem um valor negativo. O programa deve imprimir o resultado da divisão
    * do primeiro valor lido pelo segundo valor lido.
     */
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        float valor1 = valores.nextFloat();
        boolean resposta = false;
        while  (!resposta) {
            System.out.println("Agora digite o segundo valor: ");
            float valor2 = valores.nextFloat();
            if (valor2 == 0 || valor2 < 0) {
                System.out.println("O programa não aceita esses valores neutros");
            } else {
                float divisao = (valor1 / valor2);
                System.out.println("O resultado da divisão entre o " + valor1 + " e " + valor2 + "é de " + divisao);
                resposta = true;
            }
        }
    }

}

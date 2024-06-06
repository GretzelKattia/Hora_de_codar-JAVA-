import java.util.Scanner;

public class exercicio21 {
    public static void main (String[] args) {
    /*
    Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
    Para estar em condições, um dos seguintes requisitos deve ser satisfeito:

         - Ter no mínimo 65 anos de idade.
         - Ter trabalhado no mínimo 30 anos.
         - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

    Com base nas informações acima, faça um algoritmo que leia: o número do empregado
    (código), o ano de seu nascimento e o ano de seu ingresso na empresa.
    O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem
    'Requerer aposentadoria' ou 'Não requerer'.
    */
        Scanner scanner = new Scanner(System.in);

        int anoAtual = 2024;

        System.out.println("Digite o código do empregado: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int idadeEmpregado = anoAtual - anoNascimento;
        int tempoEmpregado = anoAtual - anoIngresso;

        if ( idadeEmpregado >= 65 || tempoEmpregado >=30) {
            System.out.println("O empregado número " + codigo + " necessita aposentadoria!!!");
        }
        else if (idadeEmpregado >= 60 && tempoEmpregado >= 25) {
            System.out.println("O empregado número " + codigo + " necessita aposentadoria!!!");
        }
        else {
            System.out.println("O empregado número " + codigo + " não necessita aposentadoria");
        }

    }
}

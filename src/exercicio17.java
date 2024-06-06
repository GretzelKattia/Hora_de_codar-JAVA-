import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        /*
        * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
        * do distribuidor e dos impostos (aplicados ao custo de fábrica).

        Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica,
        escreva um programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do custo de fabrica, por favor: ");
        double custoFabrica = scanner.nextDouble();

        //CONTA
        double custoDistribuidora = custoFabrica * 0.28;
        double custoImpostos = custoFabrica * 0.45;

        //CUSTO DO CONSUMIDOR
        double custoConsumidor = custoFabrica + custoDistribuidora + custoImpostos;
        System.out.println ("O preço que o consumidor precisa pagar é de " + custoConsumidor);

    }
}

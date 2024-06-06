import java.util.Scanner;

public class exercicio18 {
    public static void main (String[] args) {
        /*
        * Desenvolva um programa para uma revendedora de carros usados que calcula o salário final
        * de seus funcionários vendedores. O algoritmo deve receber como entrada o número de carros vendidos,
        * o valor total das vendas, o salário fixo mensal do vendedor e a comissão fixa por carro vendido.

        O salário final do vendedor é calculado somando o salário fixo mensal,
        a comissão fixa por carro vendido e 5% do valor total das vendas realizadas pelo vendedor.


        Considere que o salário inicial é de R$ 5.000,00.
        O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de caros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.println("Digite a comissão de carros vendidos pelo funcionario: ");
        double comissaoCarrosVendidos = scanner.nextDouble();

        // VALOR TOTAL DA COMISSAO
        double comissaoTotal = numCarrosVendidos * comissaoCarrosVendidos;


        System.out.println("Digite o valor total das vendas realizada pelo vendedor: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.println("Digite o sálario fixo mensal do vendedor: ");
        double salarioMensalInicial = scanner.nextDouble();

        // 5 PORCENTO DO VALOR TOTAL DE VENDAS
        double porcValorTotalVendas = 0.05 * valorTotalVendas;

        double salarioMensalFinal = salarioMensalInicial + comissaoTotal + porcValorTotalVendas;
        // System.out.println("O valor que ele ira receber no final do mes é " + salarioMensalFinal);

        System.out.printf("O valor que ele ira receber no final do mes é R$ %.2f%n", salarioMensalFinal);


        scanner.close();

    }
}

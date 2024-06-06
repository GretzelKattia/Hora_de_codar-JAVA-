import java.util.Scanner;

public class exercicio20 {
    public static void main (String[] args) {
    /*
    Faça um programa para ler:
        O nome do produto,
        A quantidade adquirida do produto,
        O preço unitário do produto.
    Agora o programa deve calcular e escrever:
        O valor da venda (valor da venda = quantidade adquirida * preço unitário),
        O percentual de desconto,
        O valor fixo de imposto que é 20%.
        O total a pagar (total a pagar = valor da venda - desconto).
    Sabendo-se que:
        Se quantidade <= 5 o desconto será de 2%
         -
        Se quantidade > 5 e quantidade <=10 o desconto será de 3%
         -
        Se quantidade > 10 o desconto será de 5%
    No fim, escreva um recibo que detalhe a compra como uma nota fiscal.
    * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String nomeProduto = scanner.next();

        System.out.println("Qual a quantidade adquirida?");
        int quantProduto = scanner.nextInt();

        System.out.println("Qual o preço unitário do produto?");
        double precoProduto = scanner.nextDouble();

        double valorVendas = (double) quantProduto * precoProduto;
        double desconto = 0.0;

        if ( quantProduto <= 5) {
            desconto = valorVendas * 0.02;

        }
        else if( 5 < quantProduto && quantProduto<= 10) {
            desconto = valorVendas * 0.03;
        }
        else if (quantProduto > 10) {
            desconto = valorVendas * 0.05;
        }
        else {
            System.out.println("Mulher, eu não entendi");
        }

        double imposto = valorVendas * 0.20;
        double totalPagar = valorVendas - desconto + imposto;

        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Quantidade Adquirida: " + quantProduto);
        System.out.println("Preço Unitário: " + precoProduto);
        System.out.println("Valor da Venda: " + valorVendas);
        System.out.println("Desconto: " + desconto);
        System.out.println("Imposto: " + imposto);
        System.out.println("Total a Pagar: " + totalPagar);

        scanner.close();


    }
}

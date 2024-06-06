import java.util.*;

public class exercicio16 {
    public static void main(String[] args) {
        /*
        * Escreva um programa para ler:
                o número total de eleitores de um município.
        Agora o programa deve receber a quantindade (percentual):
                o número de votos brancos;
                o número de votos válidos;
                o número de votos nulos.
        Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos)
        representa em relação ao total de eleitores.
        */

                Scanner scanner = new Scanner(System.in);

                System.out.println("digite a quantidade total de eleitores");
                int totalEleitores = scanner.nextInt();

                System.out.println("digite o percentual de votos brancos");
                float votosBrancos = scanner.nextInt();

                System.out.println("digite o percentual de votos validos");
                float votosValidos = scanner.nextInt();

                System.out.println("digite o percentual de votos nulos");
                float votosNulos = scanner.nextInt();

                int percetualVotosBrancos = Math.round(votosBrancos / 100 * totalEleitores);
                int percetualValidos = Math.round(votosValidos / 100 * totalEleitores);
                int percetualNulos = Math.round(votosNulos / 100 * totalEleitores);

                System.out.println("total de votos nulos é: "+percetualNulos);
                System.out.println("total de votos validos é: " + percetualValidos);
                System.out.println("total de votos brancos é:" + percetualVotosBrancos);


    }
}

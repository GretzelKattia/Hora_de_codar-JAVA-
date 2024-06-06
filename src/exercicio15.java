public class exercicio15 {
    public static void main(String[] args) {
        /*
        * Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
        Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.*/

        int anacletoAlt = 150; //centimetros
        int felisbertoAlt = 110; //centimetros

        int anoContador = 0;

        while (felisbertoAlt <= anacletoAlt) {
            anacletoAlt += 2;
            felisbertoAlt += 3;
            anoContador++;
        }

        System.out.println("Anacleto só vai estar maior que Felisberto daqui uns " + anoContador + " anos!" );

    }
}

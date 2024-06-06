import static java.lang.Thread.sleep;

public class exercicio11 {
    public static void main (String[] args) {
        /*
        * Crie uma bomba relógio (usando somente código - para deixar claro!)
        * cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e
        * no final da repetição escreva "EXPLOSÃO".
        */

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                sleep(500); // Atraso de 0,5 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("EXPLOSÃO");
    }
}

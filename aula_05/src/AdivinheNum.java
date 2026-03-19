import java.util.Scanner;

public class AdivinheNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Solicita o numero ao usuario
        System.out.print("Adivinhe o numero (Entre 0 e 10): ");
        // le o numero digitado pelo usuario
        int adivinha = scan.nextInt();
        // Gera um numero pseudoaleatorio entre 0 a 10
        // * multiplica
        int nunCerto = (int)(Math.random() * 11);

        if ( adivinha == nunCerto) {
            System.out.println("Voce acertou o numero " + nunCerto);
        } else{
            System.out.println(adivinha + " Voce errou o numero certo é " + nunCerto);
        }
        scan.close();
    }
}

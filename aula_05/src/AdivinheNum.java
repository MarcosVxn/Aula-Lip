import java.util.Scanner;

public class AdivinheNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adivinhe o numero (Entre 1 e 10): ");
        int adivinha = scan.nextInt();
        int nunCerto = (int)(Math.random() * 11);

        if ( adivinha == nunCerto) {
            System.out.println("Voce acertou o numero " + nunCerto);
        } else{
            System.out.println(adivinha + " Voce errou o numero certo é " + nunCerto);
        }
    }
}

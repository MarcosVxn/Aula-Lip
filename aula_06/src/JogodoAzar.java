import java.util.Scanner;

public class JogodoAzar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de jogos: ");
        int numuser = scan.nextInt();

        for(int linha = 1; linha <= numuser; linha++){
            System.out.print("Jogo " + linha + ":");
                for(int coluna = 0; coluna < 7; coluna ++){
                 System.out.print(" " + ((int)(Math.random() * 60) + 1));
                }
            System.out.println();
        }



        scan.close();
    }
}

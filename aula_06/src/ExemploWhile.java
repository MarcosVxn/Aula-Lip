import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        char c = 'S';

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Java é divertido!");
            System.out.print("digite S para repetir: ");
            // lê o primeiro caractere
            c = scan.next().charAt(0);
            // limpa o buffer de leitura
            scan.nextLine();
        }while (c == 'S' );


        System.out.println("Saindo...");

        scan.close();
    }
}

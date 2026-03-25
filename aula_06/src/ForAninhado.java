import java.util.Scanner;

public class ForAninhado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numuser = scan.nextInt();
        for (int linha = 0; linha < numuser; linha++){
            for (int coluna = 0; coluna < numuser; coluna++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

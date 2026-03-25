import java.util.Scanner;

public class ForAninhado {
    public static void main(String[] args) {
        // objeto para leitura de dados do teclado
        Scanner scan = new Scanner(System.in);
        // solicitado ao usuário um numero
        System.out.print("Digite um numero: ");
        // le o valor digitado pelo usuário
        int lado = scan.nextInt();
        for (int linha = 0; linha < lado; linha++){
            for (int coluna = 0; coluna < lado; coluna++){
                if (linha == 0 || linha == lado - 1 || coluna == 0 || coluna == lado -1) {
                    System.out.print("*");                    
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


        scan.close();
    }
}

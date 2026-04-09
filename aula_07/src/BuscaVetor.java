import java.util.Scanner;

public class BuscaVetor {
    public static void main(String[] args) {
        // variaveis
    int[] array = new int[10];

    Scanner scan = new Scanner(System.in);
    System.out.print("digite um numero entre 1 a 100: ");
    int numsort = scan.nextInt();

        // meu laço de repetição
    for(int i = 0; i < array.length; i++){
        int numalet = (int)(Math.random() * 100) + 1;
        array[i] = numalet;
        System.out.print(" | " + array[i]);
        if (array[i] ==  numsort) {
            System.out.println("Encontrado");
            return;
        }
    }
    System.out.println(" ");
    System.out.println(" Não encontrado");
    }
}

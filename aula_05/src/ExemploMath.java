import java.util.Scanner;

public class ExemploMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Digite um numero: ");
        double x = scan.nextDouble();

        if (x < 0) {
            System.out.println(" Vamos trabalhar com o módulo");
            x = Math.abs(x);
        }
        double raiz = Math.sqrt(x);
        System.out.printf("A raiz quadrada é : %.2f\n", raiz);
        double cubo = Math.pow(x, 3);
        System.out.printf("O número ao cubo é: %.2f\n", cubo);
        int sorte = (int)(Math.random() * 101);
        System.out.println("Seu numero da sorte é: " + sorte);

        scan.close();
    }
}

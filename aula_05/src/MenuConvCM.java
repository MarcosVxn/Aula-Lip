import java.util.Scanner;

public class MenuConvCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("1 - Centímetro para polegadas");
        System.out.println("2 - polegadas para Centímetro");
        System.out.println("===============================");
        System.out.print("Selecione: ");
        int selecionar = scan .nextInt();
        double centimetro;
        double polegadas;
        double resultado;


        if ( selecionar == 1) {
            System.out.print("Digite Centimetros:");
            centimetro = scan.nextDouble();
            resultado = centimetro / 2.54;
            System.out.printf(" deu %.2f",resultado, "centimetros");

        } else if (selecionar == 2) {
            System.out.print("Digite Polegadas:");
            polegadas = scan.nextDouble();
            resultado = polegadas * 2.54;
            System.out.printf(" deu %.2f",resultado, "polegadas");
        }
        scan.close();
    }
}

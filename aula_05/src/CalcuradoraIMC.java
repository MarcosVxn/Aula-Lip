import java.util.Scanner;

public class CalcuradoraIMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = scan.nextDouble();
        double imc;

        imc = peso / (altura * altura);

        if (imc >= 25.0) {
            System.out.println("seu imc é " + imc + " esta sobrepeso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("seu imc é " + imc + " esta normal");
        } else {
            System.out.println("seu imc é " + imc + " esta abaixo do peso");
        }
    }
}

import java.util.Scanner;

public class VerificarNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Digite seu numero: ");
        int numero = scan.nextInt();
        
        if (numero == 0) { 
            System.out.println(" seu numero é Zero");
        } else if ( numero %2 == 0) { 
            System.out.println(" Seu numero é par");
        } else {
            System.out.println(" Seu numero é impar");
        }

        scan.close();
    }
}

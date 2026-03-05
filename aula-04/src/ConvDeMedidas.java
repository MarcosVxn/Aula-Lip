import java.util.Scanner;

public class ConvDeMedidas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Digite Polegadas: ");
        double polegadas = scan.nextDouble();
        double centimetros = polegadas * 2.54;
    
    


        System.out.println( polegadas + " polegadas são " + centimetros + " centimetros");

        scan.close();
    }
}

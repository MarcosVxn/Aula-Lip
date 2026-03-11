import java.util.Scanner;

public class ExemploLerDadosVariados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        scan.nextLine(); // Limpa o buffer de recepção
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Olá, " + primeiroNome + 
          " você tem " + idade + " anos e tem " + altura + " metros de altura" 
        );

        scan.close();
    }   
}

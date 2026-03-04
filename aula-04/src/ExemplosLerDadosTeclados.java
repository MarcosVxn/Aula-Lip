import java.util.Scanner;


public class ExemplosLerDadosTeclados {
    public static void main(String[] args) {
        // cria o objeto do tipo Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Olá, " + nome + " Seja bem vindo(a)!");
        // finaliza o recurso Scanner
        scan.close();
    }
}

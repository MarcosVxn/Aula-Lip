import java.util.Scanner;

public class MediaAlun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual sua nota da materia A: ");
        double notaA = scan.nextDouble();
        System.out.print("Qual sua nota da materia B: ");
        double notaB = scan.nextDouble();
        System.out.print("Qual sua nota da materia A: ");
        double notaC = scan.nextDouble();
        System.out.print("Digite suas faltas? ");
        int faltas = scan.nextInt();
        System.out.print("As quantidade de aulas? ");
        int qtdaulas = scan.nextInt();
        double calculo = (notaA + 3 * notaB + 5 * notaC) / 9;
        double frequencia = ((double)(qtdaulas - faltas) / qtdaulas) * 100.0;
        System.out.printf("sua media de aulas %.2f" , frequencia);
        System.out.printf("%n");
        System.out.printf("sua media de notas %.2f" , calculo);
        System.out.printf("%n");
        
        if (frequencia >= 75 && calculo >= 50) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scan.close();
    }
}

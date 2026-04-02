public class ExemploVetor {
    public static void main(String[] args) {
        int[] valor = new int[11];
        for (int i = 0; i < 11; i++){
            valor[i] = 7 * i;
        }
        for (int i = 0; i < 11; i++){
            System.out.println("7 x "+ i + " = " + valor[i] + "");
        }

    }
}

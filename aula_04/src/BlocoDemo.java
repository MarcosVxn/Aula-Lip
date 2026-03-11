public class BlocoDemo {
    public static void main(String[] args) {
        double x, y, z;
        x = 5.0;
        y = 10.0;

        // isso só vai acontecer caso o X não for zero que é o caso
        if ( x != 0){
            System.out.println("x não é zero");
            // Z vai receber a divisão de y com x
            z = y / x;
            System.out.println("y / x é: " + z);
        }


    }
}

public class ConvPolCm {
    public static void main(String[] args) {
        double Polegadas = 1;
        double Centimetros = 1;

        Centimetros = Polegadas * 2.54;
        Polegadas = Centimetros / 2.54;

        System.out.println(Polegadas + " Polegadas" + " é centimentros " + Centimetros );
        System.out.println(Centimetros + " Centimetros" + " é Polegada " + Polegadas);
    }
}

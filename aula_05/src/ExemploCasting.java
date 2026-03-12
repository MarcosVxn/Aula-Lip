public class ExemploCasting {
    public static void main(String[] args) {
        byte b1 = 65;
        char c1 = (char) b1;

        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        int i1 = 819377;
        short s1 = (short) i1;

        System.out.println("i1: " + i1);
        System.out.println("s1: " + s1);

        float f1 = 2.75f;
        i1 = (int)f1; 

        System.out.println("f1: " + f1);
        System.out.println("i1: " + i1);
    }
}

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b)
            System.out.println(" a é maior que b");
        if (a == b)
            System.out.println(" a é igual a b");

        System.out.println(); // Pula linha

        c = a - b;
        // concatena um texto com o valor de uma variavel
        System.out.println(" o valor de c é: " + c);

        if (c >= 0)
            System.out.println(" c é positivo");
        if (c < 0)
            System.out.println(" c é negativo");

        c = b - a;

        // concatena um texto com o valor de uma variavel
        System.out.println(" o valor de c é: " + c);

        if (c >= 0)
            System.out.println(" c é positivo");
        if (c < 0)
            System.out.println(" c é negativo");

    }

}

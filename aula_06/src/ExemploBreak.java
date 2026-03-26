public class ExemploBreak {
    public static void main(String[] args) {
        for(int i =0; i < 100; i++){
            System.out.println(i);
            if (i * i >= 100){
                break;
            }
        }
    }
}

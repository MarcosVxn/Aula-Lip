public class BuscaBina {
    public static void main(String[] args) {
        //Variaveis
       int[] num = new int[101];

       // Busca 
       for(int i = 0; i < num.length; i++){
        num[i] = (int)(Math.random()* 100)+ 1;

        System.out.println("num: " + num);
       }
        
    }
}

public class TableCMPL {
    public static void main(String[] args) {
        double conv;
        int pol;
        for(pol = 1; pol <= 100; pol++){
            System.out.println(pol + " Polegas são: " + (conv = pol * 25.4) + " Milimetro");
          if (pol %10 == 0) {
            System.out.println("  ");
        }  
        
        }
        
    }
}

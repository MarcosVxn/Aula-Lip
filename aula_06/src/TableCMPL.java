public class TableCMPL {
    public static void main(String[] args) {
        
        int pol;
        for(pol = 1; pol <= 100; pol++){
          double mm = pol * 25.4;
          System.out.printf("%d pol = %.2f mm\n", pol, mm);
          if (pol %10 == 0) {
            System.out.println("  ");
        }  
        
        }
        
    }
}

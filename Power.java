import java.util.Scanner; 
                                                                    //power of any number
class Power
{                                                                   //b--base 
                                                                    //e -- exponent 
                                                                    // r -- result 
   public static void main(String[] amg)
   { 
     Scanner sc = new Scanner(System.in);     
      double b = sc.nextInt(); 
      double e = sc.nextInt();  
      double r = Math.pow(b,e); 
      
      
        System.out.print(r); 
 
        sc.close(); 
   } 
}

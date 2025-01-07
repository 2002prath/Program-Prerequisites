import java.util.Scanner; 
                                 //Average of three numbers
class Avg
{  
  public static void main(String[] amg)
   { 
     Scanner sc = new Scanner(System.in);     
      int a = sc.nextInt(); 
      int b = sc.nextInt(); 
      int c = sc.nextInt();  
      float avg = (a+b+c)/3; 
        System.out.print(avg); 
 
        sc.close(); 
   } 
}

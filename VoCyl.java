import java.util.Scanner; 
                                       //VoCyl=> volume of cylinder
class VoCyl                               
{ 
  public static void main(String[] amg)
  {   
    Scanner sc = new Scanner(System.in); 
     double r = sc.nextInt(); 
     double h = sc.nextInt(); 
     float pi = 3.14; 
     
     double volume_of_cyl = pi * r * r * h;  
   
      System.out.print(volume_of_cyl);
  
         sc.close(); 
   } 
}
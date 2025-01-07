import java.util.Scanner; 

class Temp 
{ 
  public static void main(String[] amg)
   { 
     Scanner sc = new Scanner(System.in); 
       int c = sc.nextInt();                   //c=celsius, f= farenhite

       int f =0; 
       f= ( c*9/5)+32; 
       System.out.println(f); 
        sc.close(); 
    } 
}  


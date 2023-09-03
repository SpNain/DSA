//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_pattern()
    {
         /* Function to print the pattern */
         
         for(int r = 1; r<=5; r++){
             for(int c = 1; c<=r; c++){
                 System.out.print(r);
             }
             System.out.println();
         }
       
        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        print_pattern();
    }
}
//========== User's Code Ends Here ==========

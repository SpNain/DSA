//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_pattern(int n)
    {
         /* Function to print the pattern */

        int str = 1;
        int spc = n-1;

        for(int r =1 ; r <= n; r++)
        {
            //print left stars
            for(int c = 1; c <=str; c++)
            {
                System.out.print("*");
            }
            
            //print spaces
            for(int c = 1; c <= spc; c++)
            {
                System.out.print(" ");
            }
            
            //print right stars
            for(int c = 1; c <=str; c++)
            {
                System.out.print("*");
            }

            // Agli row me jaane me ki tayari 
            System.out.println();
            spc--;
            str++;
        }
       
        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        print_pattern(n);
    }
}
//========== User's Code Ends Here ==========

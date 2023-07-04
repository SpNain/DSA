
//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_pattern(int n)
    {
         /* Function to print the pattern */

        for(int r= 1; r<=n; r++)
        {
            for(int c=n; c>= r; c--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int r = 1; r<=n; r++)  // jitni rows print krni h
        {
            for(int c = 1; c<=r; c++)  // hr row me kitne stars print krne hai
            {
                System.out.print("*");
            }
            System.out.println();
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

//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_series(int n)
    {
         /* Print the following series 
            1 4 9 16 25 36 to n. Note print all the numbers in a seperate line*/
            
            // Method : 1
            int a = 1;
            int d = 3;
            
            while (a <= n) {
                System.out.println(a);
                a += d;
                d += 2;
            }
            
            // Method : 2
            for (int i = 1; i*i <= n; i++) {
                System.out.println(i*i);
            }
            
        /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        print_series(n);
    }
}
//========== User's Code Ends Here ==========

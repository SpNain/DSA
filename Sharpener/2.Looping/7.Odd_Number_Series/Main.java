//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_series(int n)
    {
         /* Print all odd numbers from 1 to n (including)
            . Note print all the numbers in a seperate line*/
            
        for(int i = 1; i<=n; i+=2){
            System.out.println(i);
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

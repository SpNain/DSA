
//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_series(int n)
    {
         /* Print the following series 
            1 8 27 64 125 to n (including) . Note print all the numbers in a seperate line*/
            
        for(int i = 1; i*i*i<=n; i++){
            System.out.println(i*i*i);
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

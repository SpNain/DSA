//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_even(int n)
    {
         /*Print all even numbers from 1 to n*/
         
         int evenNum = 2;
         
         while(evenNum<=n){
             System.out.println(evenNum);
             evenNum += 2;
         }
       
        /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        print_even(n);
    }
}
//========== User's Code Ends Here ==========

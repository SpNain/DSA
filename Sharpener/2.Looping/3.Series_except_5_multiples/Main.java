//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_output(int n)
    {
          /*Print all numbers from 1 to n except the ones divisible by 5
    use the help of continue statement to leverage this  */
    
        // Method : 1
        // int a = 1;
        
        // while(a<=n){
        //     if(a%5 == 0) 
        //         a++;
        //     else{
        //         System.out.println(a);
        //         a++;
        //     }
        // }
        
        
        // Method : 2
        int a = 0;
        
        while(a<n){
            a++;
            if(a%5 == 0) continue;
            System.out.println(a);
        }
        
       
        /* Do not change the code beyond this point*/
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        print_output(n);
    }
}
//========== User's Code Ends Here ==========

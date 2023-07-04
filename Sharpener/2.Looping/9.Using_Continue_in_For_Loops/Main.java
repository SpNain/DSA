//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_output(int n)
    {
          /*Print all even numbers from 1 to n except the ones divisible by 4
    use the help of continue statement to leverage this  */

        for(int i = 2; i<=n; i+=2){
            if(i%4 == 0) continue;
            System.out.println(i);
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

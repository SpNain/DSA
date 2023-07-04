//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_series(int n, int m)
    {
         /* Print the following series from 1 to n if m is present stop printing the series 
            . Note print all the numbers in a seperate line*/

        for(int i=1; i<=n; i++){
            if(i==m) break;
            System.out.println(i);
        }
       
        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print_series(n,m);
    }
}
//========== User's Code Ends Here ==========

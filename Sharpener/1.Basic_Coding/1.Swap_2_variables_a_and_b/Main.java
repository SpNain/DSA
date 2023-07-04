//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
    public static void swap(int a,int b)
    {
        /* Write your code inside this block*/
        int temp = a;
        a = b;
        b = temp;
        
        
        /* Do not change the code beyond this point*/
        System.out.println("a value is = "+a);
        System.out.println("b value is = "+b);
    
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
    }
}
//========== User's Code Ends Here ==========

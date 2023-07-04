//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void has_passed(int marks)
    {
       /*write the code to find the whether a candidate has passed or failed 
        only print "pass" or "fail" After printing make the cursor point to the new line */

        String result = marks >= 40 ? "pass": "fail";
        System.out.println(result);
       
        /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        has_passed(a);
    }
}
//========== User's Code Ends Here ==========

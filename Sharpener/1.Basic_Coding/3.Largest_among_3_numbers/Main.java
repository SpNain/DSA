//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void find_max(int a, int b, int c)
    {
        /*write the code inside this block to find the maximum between three numbers
        only print the maximum number. After printing make the cursor point to the new line */
        
        // 1st Method
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        
        
        // 2nd Method
        // int x = a>b ? a : b;
        // int y = x>c ? x : c;
        
        // System.out.println(y);
       
       
        /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        find_max(a,b,c);
    }
}
//========== User's Code Ends Here ==========

//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void weekday_name(int n)
    {
        /*write the code to print the weekday name in lower case when
        the weekday number is given using switch statements*/
        
        switch(n){
            case 1 : System.out.println("monday"); break;
            case 2 : System.out.println("tuesday"); break;
            case 3 : System.out.println("wednesday"); break;
            case 4 : System.out.println("thursday"); break;
            case 5 : System.out.println("friday"); break;
            case 6 : System.out.println("saturday"); break;
            case 7 : System.out.println("sunday"); break;
            default : System.out.println("invalid"); break;
        }
        
        
        
        
       
       
        /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        weekday_name(a);
    }
}
//========== User's Code Ends Here ==========

//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_cost(int distance)
    {
        /*write the code below to print the cost
        if the distance is given   */
        
        int cost = 0;
        
        if(distance>=0 && distance<=100){
            cost = 5;
        }
        else if(distance>100 && distance<=500){
            cost = 8;
        }
        else if(distance>500 && distance<=1000){
            cost = 10;
        }
        else{
            cost = 12;
        }

        System.out.println(cost);
        
        /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        print_cost(a);
    }
}
//========== User's Code Ends Here ==========

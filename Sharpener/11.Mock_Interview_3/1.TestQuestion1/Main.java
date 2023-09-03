//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int[] sharpees(int n)
    {
        /* Function to store first n sharpees in an array
            Return the array containing the sharpees numbers*/
            
            int[] res = new int[n];
            
            for(int num = 5, i = 0; i<n; num++){
                
                int temp = num;
                int sum = 0;
                
                while(temp != 0){
                    int rd = temp%10;
                    temp /= 10;
                    sum += rd;
                }
                
                if(sum%5 == 0){
                    res[i] = num;
                    i++;
                }
            }
            
            return res;
 
        /* Dont change anything below. If changed click on reset. */
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        int[] output = sharpees(n);
        for(int i=0;i<n;i++)
            System.out.println(output[i]);
    }
}
//========== User's Code Ends Here ==========

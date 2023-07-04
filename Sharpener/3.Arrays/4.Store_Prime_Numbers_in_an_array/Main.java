
//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int[] prime_numbers(int n)
    {
        /* Function to store first n prime_numbers in an array
            Return the array containing the prime numbers*/
        
        int arr[] = new int[n];  // kyunki arr me utni hi values store krwani h jitna n h
        int num = 2;
        int i = 0;  // arr me values store krnwane me index ka kaam krega i
        
        while(i<n){
            
            int count = 0;
            
            for (int j = 2; j * j <= num; j++) {  // number check hoga ki prime h ki nhi

                if (num % j == 0) {
                    count++;
                    break;
                }
            }
            
            if(count == 0){  // agr num prime hua to use arr me daalenge aur i bda denge taki next prime agle index pe store ho
               arr[i]= num;
               i++;
            }
            
            num++; // aur number ko bda denge
        }
        
        return arr;

 
 
 
        /* Dont change anything below. If changed click on reset. */
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        int[] output = prime_numbers(n);
        for(int i=0;i<n;i++)
            System.out.println(output[i]);
    }
}
//========== User's Code Ends Here ==========

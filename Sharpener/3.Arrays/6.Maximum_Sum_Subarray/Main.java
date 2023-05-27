//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int find_maximum_subarray(int arr[],int n)
    {
       /*write the code to find the maximum subarray sum
        only return the maximum sum of the subarray . 
        Both array and size of array is given */
        
        int sum = arr[0];
        
        for(int i = 0 ; i < n ; i++){  // jitne no h utne hi set print ho rhe h like for 3 nos teen set h {10,10-20,10-20-30} {20,20-30} {30}
            for(int j = i ; j < n ; j++){   // har ek set ki row i se start ho rhi h && har ek set 1 se kam ho rha h like first set contains 3 element, 2nd contains 2 and 3rd contains 1. So, these make a pattern that count of element are from i to n
                int subArraySum = 0;
                for(int idx = i ; idx <= j ; idx++){  // har ek set ki ek row me i se start hokar j tak element h
                    subArraySum += arr[idx];
                }
                if(subArraySum > sum){
                    sum = subArraySum;
                }
            }
        }
        
        return sum;
       
        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max= find_maximum_subarray(arr,n);
        System.out.println(max);
    }
}
//========== User's Code Ends Here ==========

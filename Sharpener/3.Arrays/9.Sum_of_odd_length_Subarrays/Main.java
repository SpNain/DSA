import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n = arr.length;
        int sum = 0;


        for(int i = 0 ; i < n ; i++){  // jitne no h utne hi set print ho rhe h like for 3 nos teen set h {10,10-20,10-20-30} {20,20-30} {30}
            
            for(int j = i ; j < n ; j++){   // har ek set ki row i se start ho rhi h && har ek set 1 se kam ho rha h like first set contains 3 element, 2nd contains 2 and 3rd contains 1. So, these make a pattern that count of element are from i to n
                
                if((j+1-i)%2 != 0){ // yhape humne check kra ki subarray me kitne element honge. 3rd loop i se j ke brabar tk chlta h joki agr chlne ke hisab se nikale to j+1 hoga isiliye agr hume element nikalne h to wo honge j+1-i.
                    
                    for(int idx = i ; idx <= j ; idx++){  // har ek set ki ek row me i se start hokar j tak element h
                        sum += arr[idx];
                    }
                }
            }
        }

        return sum;
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Solution s = new Solution();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int output = s.sumOddLengthSubarrays(arr);
        
        System.out.println(output);
    }
}
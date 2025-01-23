import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[] rotate(int[] nums, int k) {
        // write your code here
        
        int n = nums.length;
        
        k = k % n;  // effective rotation

        if (k<0)
        {
            // -ve rotation -> +ve rotation number
            k = k + n;
        }
        
        int[] res = new int[n];

        // MY SOLUTION
        for (int i = 0; i < n; i++) {
            if (n - k + i < n) {
                res[i] = nums[n - k + i];
            } else {
                res[i] = nums[i - k];
            }
        }
        

        // SHARPENER SOLUTION
        for (int i = 0; i < n; i++) {
            
            int new_position = (i+k) % n;
            res[new_position] = nums[i];
        }
        
        return res;
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String y=sc.nextLine();
        String n =sc.nextLine();
        Solution s = new Solution();
        String s_arr[]=n.split(" ");
        int arr[]=new int[s_arr.length];
        for(int i=0;i<s_arr.length;i++)
        {
            arr[i]=Integer.parseInt(s_arr[i]);
        }
        int k= sc.nextInt();
        int output[] = s.rotate(arr,k);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}
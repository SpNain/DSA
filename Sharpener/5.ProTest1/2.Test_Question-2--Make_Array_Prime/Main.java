import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    
    public static boolean checkPrime(int n){
        
        if(n == 0 || n == 1){
            return false;
        }
        
        for(int div = 2; div*div <=n; div++){
            if(n%div == 0){
                return false;
            }
        }
        return true;
    }
    
    public int[] isPrime(int[] nums, int k) {
        
        for(int i = 0; i<nums.length; i++){
            
            int temp = k;
            do{
                nums[i] += 1;
                temp--;
            }
            while(temp>0 && !checkPrime(nums[i]));
            
            if(!checkPrime(nums[i])){
                nums[i] = -1;
            }
        }
        
        return nums;
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
        int output[] = s.isPrime(arr,k);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}
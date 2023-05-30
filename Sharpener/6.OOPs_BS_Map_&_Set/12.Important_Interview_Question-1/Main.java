import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int findPeakElement(int[] nums) {
        // Sp Sol : TC - O(n)
        // if(nums.length == 1){
        //     return 0;
        // }

        // int lo = -1;
        // int idx = 0;
        // int hi = 1;

        // while(idx<nums.length){

        //     if(lo<0 && nums[idx]>nums[hi]){
        //         return idx;
        //     }
        //     else if(lo<0 && nums[idx]<nums[hi]){
        //         lo++;
        //         idx++;
        //         hi++;
        //     }
        //     else if(hi==nums.length && nums[idx]>nums[lo]){
        //         return idx;
        //     }
        //     // else if(hi==nums.length && nums[idx]<nums[lo]){
        //     //     return -1;
        //     // }
        //     else if(nums[idx]>nums[lo] && nums[idx]>nums[hi]){
        //         return idx;
        //     }
        //     else if(nums[idx]<nums[lo] || nums[idx]<nums[hi]){
        //         lo++;
        //         idx++;
        //         hi++;
        //     }
        // }

        // return -1;
        
        
        if(nums.length == 1){
            return 0;
        }
        int n = nums.length;
        int lo = 0;
        int hi = n-1;

        while(lo<hi){

            int mid = (lo+hi)/2;

            if(mid == 0){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }
                else{
                    return mid+1;
                }
            }
            else if(mid == n-1){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }
                else{
                    return mid-1;
                }
            }
            else if(nums[mid-1]>nums[mid]){
                hi = mid-1;
            }
            else if(nums[mid+1]>nums[mid]){
                lo = mid+1;
            }
            else{
                return mid;
            }
        }
        return (lo+hi)/2;
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
        
        int output= s.findPeakElement(arr);
        
        if(output == 0 && arr[output]>arr[1] || output == arr.length-1 && arr[output]>arr[output-1] )
    {
        System.out.println("true");
    }
    else if(output != 0 && output != arr.length-1 && arr[output]>arr[output-1] &&arr[output]>arr[output+1])
    {
        System.out.println("true");
    }
    else
    System.out.println("false");
    }
}
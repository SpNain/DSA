import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[] arrange(int[] arr) {
        
        // Method 1 :
        int n = arr.length;
        
        // nyi arraylist bnai
        ArrayList<Integer> list = new ArrayList<>();
        
        // saare -ve numbers usme daale
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);
            }
        }
        
        // nya res array bnaya
        int[] res = new int[n];
        
        int j = 0; // res aaray ko fill up krne ke liye
        
        // saare +ve numbers res me daale
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                res[j] = arr[i];
                j++;
            }
        }
        
        // fir -ve numbers res me daale
        for (int val : list) {
            res[j] = val;
            j++;
        }
        
        // res ko return kr diya
        return res;

        /*
        // Method 2 :
        int n = arr.length;
        
        // nya res array bnaya
        int[] res = new int[n];
        
        int lo = 0, hi = n-1; // res aaray ko fill up krne ke liye
        int i = 0, j = n-1; // original array ko traverse krne ke liye
        
        while(lo<=hi){
          if(arr[i] >=0){
            res[lo] = arr[i];
            i++;
            lo++;
          }
          else{
            i++;
          }
          
          if(arr[j] < 0){
            res[hi] = arr[j];
            j--;
            hi--;
          }else{
            j--;
          }
        }
        
        // res ko return kr diya
        return res;
        */
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
        int output[] = s.arrange(arr);
        
        int ele=0;
            for(int i=0;i<output.length;i++)
            {
                if(output[i]<0)
                {
                    ele=i;
                    break;
                }
            }
            int f=0;
             for(int i=ele;i<output.length;i++)
             {
                if(output[i]>=0)
                {
                    f=1;
                    break;
                }
             }
            if(f==1)
                System.out.println("false");
            else
                System.out.println("true");
    }
}
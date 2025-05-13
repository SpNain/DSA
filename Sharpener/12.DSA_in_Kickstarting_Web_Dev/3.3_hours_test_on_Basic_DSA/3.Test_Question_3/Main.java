import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[][] count(int[][] arr1,int[][] arr2) {
        
        //Dont print anything only return the Output.
        
        int[][] res = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[0].length; j++){
                
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        
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
        int n =sc.nextInt();
        Solution s = new Solution();
        int c=sc.nextInt();
        int arr[][]=new int[n][];
        for(int i=0;i<n;i++)
        {
            
            arr[i]=new int[c];
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int arr1[][]=new int[n][];
        for(int i=0;i<n;i++)
        {
            
            arr1[i]=new int[c];
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int[][] output = s.count(arr,arr1);
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<c;j++)
            {
               System.out.print(output[i][j]); 
            }
            System.out.println();
        }
       
        
    }
}
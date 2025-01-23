import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int maximum(int[][] arr) {
        int count = 0;
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == 5){
                    count++;
                }
            }
        }
        return count;
    }
}

//========== User's Code Ends Here ==========


public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Solution s = new Solution();
        String y=sc.nextLine();
        String col=sc.nextLine();
        int arr[][]=new int[Integer.parseInt(y)][];
        for(int j=0;j<Integer.parseInt(y);j++)
        {
            String n =sc.nextLine();
            String s_arr[]=n.split(" ");
            arr[j]=new int[s_arr.length];
            for(int i=0;i<s_arr.length;i++)
            {
                arr[j][i]=Integer.parseInt(s_arr[i]);
            }
        }
        
        int max= s.maximum(arr);
        
        System.out.println(max);
    }
}
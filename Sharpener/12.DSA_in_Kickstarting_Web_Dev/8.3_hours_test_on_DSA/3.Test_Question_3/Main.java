import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public List<Integer> topper(int[] arr) {
        Stack<Integer> st = new Stack<>();

        ArrayList<Integer> res = new ArrayList<>();

        res.add(arr[arr.length-1]);
        st.push(arr[arr.length-1]);

        for(int i = arr.length - 2; i>=0; i--){
            while(st.size()>0 && arr[i] > st.peek()){
                st.pop();
            }

            if(st.size() == 0 && res.get(0) != arr[i]){
                res.add(0,arr[i]);
            }

            st.push(arr[i]);

            
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
        
        List<Integer> max= s.topper(arr);
        for(int i:max)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
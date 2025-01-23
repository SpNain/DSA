import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int switches(String[] nums) {
        HashSet<String> set = new HashSet<>();
        
        for(String word : nums){
            if(word.equals("END")){
                set.clear();
                // System.out.println("clear");
            }
            else if(set.contains(word)){
                set.remove(word);
                // System.out.println("remove " + word);
            }
            else{
                set.add(word);
                // System.out.println("add " + word);
            }
        }
        
        return set.size();
        
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
        String arr[]=new String[s_arr.length];
        for(int i=0;i<s_arr.length;i++)
        {
            arr[i]=s_arr[i];
        }
        
        int max= s.switches(arr);
        
        System.out.println(max);
    }
}
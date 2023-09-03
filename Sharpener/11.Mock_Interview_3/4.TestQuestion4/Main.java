import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public boolean isValid(String s1, String s2) {
        
        for(int i = 0, j = 0; i<s2.length();){
            if(s2.charAt(i) == s1.charAt(j)){
                j++;
                i++;
            }
            else if (s2.charAt(i) >= '0' && s2.charAt(i) <= '9'){
                int num = 0;
                while(i<s2.length() && s2.charAt(i) >= '0' && s2.charAt(i) <= '9'){
                    num = num*10 + Integer.parseInt(s2.charAt(i)+"");
                    i++;
                }
                j += num;
            }
            else if(s2.charAt(i) != s1.charAt(j)){
                return false;
            }
        }
        
        return true;
    }
}

//========== User's Code Ends Here ==========



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String y=sc.nextLine();
        Solution s =new Solution();
        boolean max= s.isValid(n,y);
        System.out.println(max);
    }
}
import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    
    public static boolean isPalindrome(String s){
        int lo = 0;
        int hi = s.length()-1;

        while(lo < hi){  // = isiliye nhi lgaya kyunki = sirf odd length ke case me jaayega aur agr saari string palindromic h to bich wala char to check krne ki jrurat hi nhi hai.
            if(s.charAt(lo) != s.charAt(hi)){
                return false;
            }

            lo++;
            hi--;
        }

        return true;
    }
    
    
    public int minimum_count(String str) {
        
        int lpsfsLength = 0;  // length of longest palindromic substring from start
        
        for(int sp= 0, ep = sp+1 ; ep <= str.length() ; ep++){ // this loop will give us all the ss starting from 1st char
            String ss = str.substring(sp,ep); // ye hume sp se lekar ep-1 tak ki substring laakr de dega 

            if(isPalindrome(ss) && ss.length() > lpsfsLength){  // jise hum check krne ke liye bhej denge ki panlindromic h ki nhi. Agr palindromic hui to fir check krenge ki kya ye pichli wali lpsfs se bdi h ki nhi
                lpsfsLength = ss.length();
            }
        }
        
        return str.length() - lpsfsLength;
        
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
        Solution s =new Solution();
        int max= s.minimum_count(n);
        System.out.println(max);
    }
}


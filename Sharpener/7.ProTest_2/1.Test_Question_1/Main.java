import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    
    public static int countA(String word){
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
    public String[] AAA_sort(String[] s) {
        int n = s.length;
        for(int itr = 1; itr<n; itr++){
            for(int j = 0; j<n-itr; j++){
                if(countA(s[j+1])>countA(s[j])){
                    String temp = s[j+1];
                    s[j+1] = s[j];
                    s[j] = temp;
                }
                else if(countA(s[j+1]) == countA(s[j]) && s[j+1].length() > s[j].length()){
                    String temp = s[j+1];
                    s[j+1] = s[j];
                    s[j] = temp;
                }
            }
        }
        return s;
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        Solution s = new Solution();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        String output[] = s.AAA_sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(output[i]);
        }
    }
}
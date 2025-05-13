import java.util.Scanner;


//========== User's Code Starts Here ==========

class Solution {
     public long findK(long x) {
        int n = 1;
        int count = 0;
        while(x>=0){
            x = x - (n*n);
            count++;
            n++;
        }
        return count-1;
    }
}

//========== User's Code Ends Here ==========


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        Solution s= new Solution();
        long k = s.findK(X);
        System.out.println(k);
    }
}

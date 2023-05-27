//Tabulation
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
   
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int fibN = fibonacciT(n);
      System.out.println(fibN);
   
}
    public static int fibonacciT(int n){
        int dp[] = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            if(i == 0){
                dp[0] = 0;// fib(0) = 0
            }else if(i == 1){
                dp[1] = 1;// fib(1) = 1
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        
        return dp[n];
    }
}

/*
Tabulation : Tabulation me bhi dp bnate hai lekin isme hum filling start krte hai by asking simple question
Note : Tabulation recursion ke jaise hi code hi hai almost bas thode bhut changes krne hote hi dp filling ke liye 
*/
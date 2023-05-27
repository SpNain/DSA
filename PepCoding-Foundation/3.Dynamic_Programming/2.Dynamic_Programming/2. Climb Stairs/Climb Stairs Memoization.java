//Memoization method
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        int dp[] = new int[n+1];
        int tways = climbStairs(n,dp);
        System.out.println(tways);
    }
    public static int climbStairs(int n,int dp[]){
        if(n == 0){
            return dp[n] = 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int tways = 0;
        if(n-1 >= 0){
            tways += climbStairs(n-1,dp);// 1 len 
        }
        if(n-2 >= 0){
            tways += climbStairs(n-2,dp);// 2 len
        }
        if(n-3 >= 0){
            tways += climbStairs(n-3,dp);// 3 len
        }

        return dp[n] = tways;
    }

}
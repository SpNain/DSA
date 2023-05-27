//Memoization
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
   
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] dp = new int[n+1];
      int fibN = fibonacciM(n,dp);
      System.out.println(fibN);
   
}
    public static int fibonacciM(int n,int dp[]){
      if(n == 0 || n == 1){
            return dp[n] = n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int fibNm1 = fibonacciM(n-1,dp);
        int fibNm2 = fibonacciM(n-2,dp);

        int fibN = fibNm1 + fibNm2;
        return dp[n] = fibN;
 
    }
}

/*
Memoization : isme hum ek dp naam ka ek extra array rkhte hai 
              jisme hum alag alag indexes par n ki alag alag values ke liye answers store krwate rehte hai
              kuch index pe base case me value store hoti h aur kuch indexes me return krte time
              taki agr jab bhi dp[n] yani dp ke kisi index pe 0 na mile 
              to iska matlab humne n ki us value ke liye ans store krwa rkha hai aur hum use hi return kr dete hai
dp ka size n+1 isiliye hai kyunki base case 0 hai to 0 se lekar n tak values store hogi joki n+1 values hai.
*/
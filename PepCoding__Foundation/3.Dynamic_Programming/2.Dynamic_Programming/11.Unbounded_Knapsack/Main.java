import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] vls = new int[n];
    String str1 = br.readLine();
    for (int i = 0; i < n; i++) {
      vls[i] = Integer.parseInt(str1.split(" ")[i]);
    }

    int[] wts = new int[n];
    String str2 = br.readLine();
    for (int i = 0; i < n; i++) {
      wts[i] = Integer.parseInt(str2.split(" ")[i]);
    }

    int cap = Integer.parseInt(br.readLine());
    
    int[] dp = new int[cap + 1];
    
    // //logic-combination
    // // no need of dp[0]=0; b/c by default  hi hoti hai
    // for (int i = 1; i < dp.length; i++) {
    //   for (int j = 0; j < n; j++) {
    //     int val = vls[j];
    //     int wt = wts[j];

    //     if (i >= wt) {
    //       int inc = dp[i - wt] + val;
    //       if (inc > dp[i]) {
    //         dp[i] = inc;
    //       }
    //     }
    //   }
    // }
    
    
    //logic-permutation
    for (int i = 0; i < n; i++) {
        int val = vls[i];
        int wt = wts[i];
         for (int j = wt; j < dp.length; j++) {
             int inc = dp[j-wt]+val;
             int exc = dp[j];
             
             dp[j] = Math.max(inc,exc);
         }
    }
    System.out.println(dp[cap]);
  }
}
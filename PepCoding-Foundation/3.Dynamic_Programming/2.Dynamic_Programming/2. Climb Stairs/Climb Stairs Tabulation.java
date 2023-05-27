//Tabulation method
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        int dp[] = new int[n+1];
        
        for(int i = 0 ; i <= n ; i++){
            if(i == 0){
                dp[0] = 1;
            }else if(i == 1){  // 1 len 
                dp[i] += dp[i-1];  
            }else if(i == 2){  // 2 len
                dp[i] = dp[i-1] + dp[i-2];
            }else{             // 3 len
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        System.out.println(dp[n]);
    }

}
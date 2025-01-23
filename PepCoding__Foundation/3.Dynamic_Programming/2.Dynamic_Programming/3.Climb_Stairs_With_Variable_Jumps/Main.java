import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int moves[] = new int[n];
        for(int i = 0 ; i < moves.length ; i++){
            moves[i] = scn.nextInt();
        }
        
        // logic
        int dp[] = new int[n+1];
        
        for(int i = n ; i>= 0 ; i--){
            if(i == n){
                dp[i] = 1;
            }else{
                int maxJump = moves[i];  // maximum jump we can take from that step
                for(int len = 1 ; len <= maxJump && len + i <= n; len++){  // agr maxJump 0 hoga to uske liye ye loop execute ho nhi hoga
                    dp[i] += dp[i+len];
                }
            }
        }
        System.out.println(dp[0]);
    }

}
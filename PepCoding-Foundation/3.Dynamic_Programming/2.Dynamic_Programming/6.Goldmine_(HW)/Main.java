// check pep submission history of marks 3.3 and find what mistake are you doing


// Sp Nain - some help form jha code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int goldmine[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                goldmine[i][j] = scn.nextInt();
            }
        }
        
        // logic 
        int dp[][] = new int[nr][nc];
        for(int r = 0, c = 0; r < nr ; r++){
            dp[r][c] = goldmine[r][c];
        }
         for(int c = 1 ; c < nc ; c++){
            for(int r = 0; r < nr; r++){
                if(r == 0){
                    dp[r][c] = Math.max(dp[r][c-1],dp[r+1][c-1]) + goldmine[r][c];
                }else if(r == nr-1){
                    dp[r][c] = Math.max(dp[r][c-1],dp[r-1][c-1]) + goldmine[r][c];
                }else{
                    dp[r][c] = Math.max(dp[r-1][c-1],Math.max(dp[r][c-1],dp[r+1][c-1]))+goldmine[r][c];
                }
            }
        }
        int maxGold = Integer.MIN_VALUE;
        for(int r = 0, c = nc-1; r < nr; r++){
            if(dp[r][c]>maxGold)
            maxGold = dp[r][c];
        }
        System.out.println(maxGold);
    }

}
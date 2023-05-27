import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int coins[] = new int[n];
    for (int i = 0 ; i < n ; i++) {
      coins[i] = scn.nextInt();
    }
    int tar = scn.nextInt();

    // logic

    int dp[] = new int[tar + 1];

    dp[0] = 1;
    for (int t = 1 ; t <= tar ; t++) {
      for (int coin : coins) {

        dp[t] += (t - coin >= 0) ? dp[t - coin] : 0;
      }
    }

    System.out.println(dp[tar]);

  }
}
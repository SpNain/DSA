
//Sp Nain
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int vls[] = new int[n];
        for (int i = 0; i < n; i++) {
            vls[i] = scn.nextInt();
        }

        int wts[] = new int[n];
        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int[][] dp = new int[n + 1][cap + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= cap; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    int val = vls[i - 1];
                    int wat = wts[i - 1];

                    int exc = dp[i - 1][j];
                    int inc = (j - wat >= 0) ? ((dp[i - 1][j - wat]) + val) : 0; //[#1]

                    dp[i][j] = Math.max(exc, inc);
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
/*
exc : means ki hume item nhi liya hai to usse just uper jo block hai utni hai val rhegi 
inc : means ki item ki val add krdo aur i-1 (usse uper wale me),j-wat (jitni capacity bachi hai) wale block ki me jitni val ho wo add kro

#1.
ye shorter version hai niche wale code ka 
isme hum agr weight jyda hua to inc me 0 rkha rhe hai taki exc aur inc me se exc hi store ho jab weight jyada hai to
kyunki exc me minimum val 0 hi ho skti hai 
*/
/*
Aditya Verma 
for(int i = 0;i<=n;i++){
    for(int j = 0; j<=cap; j++){
        if(i==0 || j == 0){  // intialization
            dp[i][j] = 0;
        }
        else{
            int val = vls[i-1];
            int wat = wts [i-1];

            if(wat>j){  //[#2]
                int exc = dp[i-1][j];
                dp[i][j] = exc;
            }
            else if (wt<=j){  //[#3]
                int inc = (dp[i-1][j-wat])+val;
                int exc = dp[i-1][j];
                dp[i][j] = Math.max(exc,inc);
        }
    }
}

#2.
agr weight jyada hai to koi option nhi hai use exclude krna hi pdega
aur agr exc kr diya that means ki us item ko koi contribution nhi hai to uske bina jo max val thi 
joki usse just uper wale block me pdi hogi wohi iss block ki val hogi

#3.
agr weight kam hai to inc aur exc krne se jisme max mil rha hai use dp me store krwa lete hai
agr item inc ki means ki us item ki val to hogi hi 
uske saath saath us item ko add krne ke baad jo capacity bchi gyi hai usme jo max val aa skti thi wo bhi add hogi 
*/
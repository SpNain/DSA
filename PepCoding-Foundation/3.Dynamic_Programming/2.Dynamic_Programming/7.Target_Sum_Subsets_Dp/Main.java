// check pep submission history of marks 6.7 and find what mistake are you doing

//MB
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int coins[] = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scn.nextInt();
        }
        int tar = scn.nextInt();

        // logic
        boolean dp[][] = new boolean[n + 1][tar + 1];

        for (int r = 0; r <= n; r++) {
            for (int t = 0; t <= tar; t++) {
                if (r == 0 && t == 0) { // initialization
                    dp[0][0] = true;
                } else if (r == 0) {
                    dp[r][t] = false;
                } else if (t == 0) {
                    dp[r][t] = true;
                } else {
                    int coin = coins[r - 1];
                    boolean inc = (t - coin >= 0) ? dp[r - 1][t - coin] : false;// inc
                    boolean exc = dp[r - 1][t];// exc

                    dp[r][t] = inc || exc;
                }
            }
            if (dp[r][tar] == true) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}

/*
Aditya Verma 
for(int r = 0 ; r <= n ; r++){
    for(int t = 0 ; t <= tar ; t++){
        if(r == 0 && t == 0){ // initialization
            dp[0][0] = true;
        }else if(r == 0){
            dp[r][t] = false;
        }else if(t == 0){
            dp[r][t] = true;
        }else{   // [#1]
            int coin = coins[r-1];
            if(coin>t){
                boolean exc = dp[r-1][t];// exc
                dp[r][t] = exc;
            }
            else if(coin<=t){
                boolean inc = dp[r-1][t-coin];// inc
                boolean exc = dp[r-1][t];// exc
                dp[r][t] = inc || exc;
            }
                                
        }
    }
    if(dp[r][tar] == true){
        System.out.println(true);
        return;
    }
}

initialization :
agr 0 coin hai aur 0 ki payment krni hai then its possible
agr 0 coin hai aur x payment krni hai not possible
agr x coin ha aur 0 ki payment krni hai then its possible(tum koi coin hi na do)

#1.Choice diagram code
dekho agr coin bda hai target se to use inc nhi kr skte to use exc hi krna pdega means ki 
us coin ke bina agr given tar possible tha to iske saath bhi possible hoga(is coin ko use hi mat kro)
agr is coin ke bina given tar not possible tha to iske saath bhi not possible hoga kyunki ye given target se bda hai

agr koi chhota hua to usme hmare pass choice hogi ki usko le ya na le
aur inc aur exc dono me se jisko use krne pe tar reach ho rha hoga usme hum dp me dlwa denge that's why we use ||
agr inc kiya aur inc krne ke baad jo bche hue coins the unse jo tar bch gya tha agr to wo reach kr skte the to inc true hoga wrna false hoga
aur exc kiya to uska uper bta hi diya hai

aur jaise hi hmara tar achieve ho jaayega hum udhar se hi return kr jaayenge kyunki agr hum aadhe coin se tar achieve kr liye to bakio ke saath bhi kr hi lenge
unko use na krke 


agr mohit wale code ki explaination dekhni hai to 0/1 knapsack me smjha rkha hai mohit wala trika bhi
kyunki dono same hi to ye bhi smjh me aa jaayega usko smjhne ke baad
*/
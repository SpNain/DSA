
//Sp Nain
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = scn.nextInt();
        }
        System.out.println(BuyAndSellStockInfinteTransactionAllowed(price));

    }

    public static int BuyAndSellStockInfinteTransactionAllowed(int price[]) {
        int bp = 0, sp = 0, profit = 0;

        for (int day = 1; day < price.length; day++) {
            if (price[day] >= price[day - 1]) {
                sp = day;
            } else {
                profit += price[sp] - price[bp];
                sp = bp = day;
            }
        }
        profit += price[sp] - price[bp];
        return profit;
    }

}

/*
My appraoch

int bestBuy = 0,profit = 0;

for(int i = 1; i<n; i++){
    if(price[i]<price[bestBuy]){
        bestBuy = i;
    }
    else{
        profit += price[i] - price[bestBuy];
        bestBuy = i;
    }
    // System.out.println(profit);
}
System.out.println(profit);
*/
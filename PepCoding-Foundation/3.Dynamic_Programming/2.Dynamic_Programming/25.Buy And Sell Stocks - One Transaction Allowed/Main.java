import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] price = new int[n];
        
        for(int i=0; i<n; i++){
            price[i] = scn.nextInt();
        }
        System.out.println(BuyAndSellOneTransactionAllowed(price));
    }
     public static int BuyAndSellOneTransactionAllowed(int price[]){
        int bestBuy = price[0] , maxProfit = 0;
        
        for(int i = 1 ; i < price.length ; i++){
            if(price[i] < bestBuy){
                bestBuy = price[i];
            }else{
                if(price[i]-bestBuy > maxProfit){
                    maxProfit = price[i]-bestBuy;
                }
            }
        }
        
        return maxProfit;
    }

}
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
        
      System.out.println(BuyAndSellTwoTransactionAllowed(price));
    
    }
    
    public static int BuyAndSellTwoTransactionAllowed(int price[]){
        int pBD[] = profitConsideringBuyingDay(price);
        int pSD[] = profitConsideringSellingDay(price);
        
        // cumulative maximum
        for(int i = price.length-2 ; i>= 0; i--){
            pBD[i] = Math.max(pBD[i],pBD[i+1]);
        }
        for(int i = 1 ; i < price.length ; i++){
            pSD[i] = Math.max(pSD[i],pSD[i-1]);
        }
        
        int omax = 0;
        for(int i = 0 ; i < price.length ; i++){
            omax = Math.max(omax,pBD[i]+pSD[i]);
        }
        return omax;
    }
    public static int[] profitConsideringBuyingDay(int price[]){
        int res[] = new int[price.length];
        
        int bestSell = price[price.length-1];
        
        for(int i = price.length-2 ; i >= 0 ; i--){
            if(price[i] > bestSell){
                bestSell = price[i];
            }else{
                res[i] = bestSell - price[i];
            }
        }
        
        return res;
    }
    public static int[] profitConsideringSellingDay(int price[]){
        int res[] = new int[price.length];
        
        int bestBuy = price[0];
        
        for(int i = 1 ; i < price.length ; i++){
            if(price[i] < bestBuy){
                bestBuy = price[i];
            }else{
                res[i] = price[i] - bestBuy;
            }
        }
        
        return res;
    }

}
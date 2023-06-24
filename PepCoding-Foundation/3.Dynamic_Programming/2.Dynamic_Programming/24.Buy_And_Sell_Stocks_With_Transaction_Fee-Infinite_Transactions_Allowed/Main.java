// check pep submission history for 1.7 marks and find mistakes

//MB
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
        
        int fee = scn.nextInt();
        System.out.println(BuyAndSellStockInfinteTransactionWithTransactionFee(price,fee));
    }
    public static int BuyAndSellStockInfinteTransactionWithTransactionFee(int price[],int fee){
        int oBSP = -price[0] , oSSP = 0;
        for(int i = 1 ; i < price.length ; i++){
            int nBSP = Math.max(oBSP,oSSP-price[i]);
            int nSSP = Math.max(oSSP,price[i]-fee+oBSP);
            
            oBSP = nBSP;
            oSSP = nSSP;
        }
        
        return oSSP;
    }

}
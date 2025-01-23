//Tabulation Optimized
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
   
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int fibN = fibonacciTOptimized(n);
      System.out.println(fibN);
   
}
    public static int fibonacciTOptimized(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f = 0 , s = 1;
        for(int i = 2 ; i <= n ; i++){
            int t = f + s;
            f = s;
            s = t;
        }
        
        return s;
    }
}
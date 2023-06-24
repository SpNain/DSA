//Jha Ka Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
         int k=scn.nextInt();
        
        
        int [] []arr=new int[n][k];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int [][]dp=new int[n][k];
        
        for(int j=0;j<k;j++){
            dp[0][j]=arr[0][j];
        }
        
        
        for(int i=1;i<n;i++){
            for(int j=0;j<k;j++){
                
                int min=Integer.MAX_VALUE;
                for(int m=0;m<k;m++){
                    if(m!=j){
                        
                        if(min>dp[i-1][m]){
                            min=dp[i-1][m];
                        }
                    }
                }
                dp[i][j]=min+arr[i][j];
                
                
            }
        }
        int min=Integer.MAX_VALUE;
        for(int a=0;a<dp[0].length;a++){
            
            if(min>dp[n-1][a]){
                min=dp[n-1][a];
            }
        }
        
        
        System.out.println(min);
        
    }
}
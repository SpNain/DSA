import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];
        
        int max = 0;
     
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();

            if(arr[i] > max){
                max = arr[i];
            }
        }


        int nrow = max;
        int ncol = n;

        for(int row = 1 ; row <= nrow; row++){
            for(int i = 0 ; i < ncol ; i++){
                if(arr[i] >= row){   // jab bhi arr[i] ki value row se bdi hogi star print hoga.
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
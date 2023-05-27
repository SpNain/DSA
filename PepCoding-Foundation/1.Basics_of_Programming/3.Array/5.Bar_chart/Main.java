//Copied from Mohit Behl Git
package com.company;
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int max = 0; // 0 isiliye liya kyunk arr doesn't store -ve values.
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();

            if(arr[i] > max){
                max = arr[i];
            }
        }


        int nrow = max;
        int ncol = n;

        for(int row = nrow ; row >= 1 ; row--){    // kitni rows h us hisab se loop lgaya
            for(int col = 0 ; col < ncol ; col++){  // kitne cols h us hisab se loop lgaya
                if(arr[col] >= row){   // stars tabhi print hoge jab arr ke us index ki value row se bdi/equal hogi
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        // logic
        for (int gap = 0; gap < n; gap++) {
            for (int r = 0, c = gap; r < n && c < n; r++, c++) {
                System.out.println(mat[r][c]);
            }
        }
    }

}
/*
Logic behind logic :

1. jaise hi hum ek diagonal se dusre diagonal pe move krte hai gap bad rha hai r aur c ke bich ka 
2. aur har ek block jiski value print krni hai uska row start me 0 se start ho rha hai aur col gap se start ho rha hai

*/

/*
// SP Nain - 1st revision

    public static void sow(int[][] arr){
        for(int d = 0; d<arr.length; d++){
            for(int i = 0, j = i+d; i<arr.length && j<arr[0].length; i++){
                System.out.println(arr[i][j]);
            }
        }
    }
    
Logic behind logic :

1. no. of diagonals utne hi honge jitne arr ki length hogi kyunki saare diaginal 1st row se hi start hote hai
2. ab jaise hi hum ek diagonal se dusre diagonal pe move krte hai j ki value i se +1 ho jaati hai 
   e.g. 0th diagonal me i == j;
        1st diagonal me i == j+1;
        2nd diagonal me i == j+2;

        so that means i == j+d;
3. ab taki j bhi out of index na jaaye isiliye printing sirf tabhi hogi jab j<arr[0].length hoga  

*/
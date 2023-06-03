package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        transpose(mat);
        reverseRowWise(mat);
        display(mat);
    }
    public static void transpose(int mat[][]){
        // logic for transposing
        int n = mat.length;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
    }

    public static void reverseRowWise(int mat[][]){
        // logic for reversing each row
        int n = mat.length;
        for(int r = 0 ; r < n ; r++){
            int lo = 0 , hi = n-1;

            while(lo < hi){
                int tmp = mat[r][lo];
                mat[r][lo] = mat[r][hi];
                mat[r][hi] = tmp;

                lo++;
                hi--;
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

/*
Logic behind logic :

1. to rotate a 2d array by 90 one must go through 2 process : one transpose that array and second reverse each row of that array.
2. so to transpose a 2d array you have to swap arr[i][j] with arr[j][i] 
   lekin ye sb diagonal line ek sirf ek tarf krna hai wrna complete me krne pe wahi array waps mil jaaye thats why in 2nd loop we start j with i+1 so that only one diagonal covers in traveling.
3. reverse each row just like reverse a 1d array bas har ek row ko access krne ke liye ek loop lga do.

*/
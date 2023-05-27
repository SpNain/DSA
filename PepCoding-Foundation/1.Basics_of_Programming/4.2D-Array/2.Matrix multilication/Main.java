package com.company;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int nr1 = scn.nextInt();
        int nc1 = scn.nextInt();
        int mat1[][] = new int[nr1][nc1];
        for(int i = 0 ; i < nr1 ; i++){
            for(int j = 0 ; j < nc1 ; j++){
                mat1[i][j] = scn.nextInt();
            }
        }

        int nr2 = scn.nextInt();
        int nc2 = scn.nextInt();
        int mat2[][] = new int[nr2][nc2];
        for(int i = 0 ; i < nr2 ; i++){
            for(int j = 0 ; j < nc2 ; j++){
                mat2[i][j] = scn.nextInt();
            }
        }


        // logic
        if(nc1 == nr2){
            // multiplication poss.
            int res[][] = new int[nr1][nc2];

            // matrix multiplication

            for(int i = 0 ; i < res.length ; i++){      // ye res matrix ki row ko target krega saathi hi mat1 ki rows ko bhi target krega
                for(int j = 0 ; j < res[0].length ; j++){  // ye res matrix ki col ko target krega saath hi mat2 ki col ko bhi target krega

                    for(int k = 0 ; k < nc1 ; k++){   // mat1 ki col aur mat2 ki row ko target krne ke liye
                        res[i][j] = res[i][j] + (mat1[i][k] * mat2[k][j]);
                    }
                }
            }

            for(int i = 0 ; i < res.length ; i++){
                for(int j = 0 ; j < res[0].length ; j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid input");
        }

    }

}
/*
Logic behind logic :

1. matrix multiplication is only possible when no. of cols of first matrix is equal to the no. of rows of second matrix.
2. we created two loops to visit every block of res matrix 
3. we created third loop so that we can visit respective blocks of given two matrix for the multiplication of their elements.

*/
package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        printNQueens(chess, "", 0);

    }

    public static boolean isSafe(int[][] chess, int r, int c) { // why we are only checking three directions : refer image.

        //vertically upwards
        for (int i = r - 1, j = c; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        //diagonally upright side
        for (int i = r - 1, j = c + 1; i >= 0 && j < chess[0].length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        //diagonally upleft side
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {

        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;

        }
        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;

            }
        }
    }
}

/*
Logic : hume har row ke har ek col ko check krna hai ki wha pe queen place ho skti hai ki nhi 
        ab row to recursion call ke saath saath update hoti jaati hai 
        aur col ke liye humne for loop lga diya hai
        ab jaise hi kisi bhi row,col pe hum queen ko rkne ki sochte hai 
        to sbse pahle ye check krte hai ki wha pe queen ko place krna safe bhi hai ya nahi
        agr safe hota hai to hum us row,col ko 1 mark karke row-col ko qsf me add krke next row ke liye call lga dete hai
        aur jab ek row ke liye saari cols check ho jaati hai to backtracking ke time hum us row,col jisko 1 mark kiya tha firse 0 mark kr dete hai
        aur jab row chess length ke equal ho jaayegi means chess se bahar aa chuke hai saari ki saari queens place ho chuki hogi to qsf ko print kr dete hai
*/


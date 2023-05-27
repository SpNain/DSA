package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int r=scn.nextInt();
        int c=scn.nextInt();

        printKnightsTour(new int[n][n],r,c,1);


    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {


        if(r<0 || c<0 || r>=chess.length || c>=chess[0].length || chess[r][c]!=0){
            return;

        }

        // chess[r][c] = upcomingMove; // agr hum marking base case se pahle lgate hai to fir hume base case me alag se marking nhi krni pdegi lekin alag se htana jrur pdega
        
        if(upcomingMove==chess.length*chess[0].length){
            chess[r][c]=upcomingMove;  // why we mark one block explicitly in base case > refer pdf.
            displayBoard(chess);
            chess[r][c]=0; // kyunki base case me hume alag se mark kiya hai to backtrack ke liye alag se hi htana pdega
            return;
        }
        
        chess[r][c] = upcomingMove;
        
        printKnightsTour(chess,r-2,c+1,upcomingMove+1);
        printKnightsTour(chess,r-1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+2,c+1,upcomingMove+1);
        printKnightsTour(chess,r+2,c-1,upcomingMove+1);
        printKnightsTour(chess,r+1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-2,c-1,upcomingMove+1);


        chess[r][c]=0;





    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
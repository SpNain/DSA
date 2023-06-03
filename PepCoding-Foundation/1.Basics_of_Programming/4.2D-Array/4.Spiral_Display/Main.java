package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        spiralDisplay(mat);
    }

    public static void spiralDisplay(int mat[][]){
        int rmin = 0, cmin = 0, rmax = mat.length-1,cmax = mat[0].length-1;
        int count = 0 ;
        int totalEle = mat.length * mat[0].length;
        while(count < totalEle){
            for(int i = rmin , j = cmin ; i <= rmax && count < totalEle ; i++){
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i = rmax , j = cmin+1 ; j <= cmax && count < totalEle ; j++){
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i = rmax-1 , j = cmax ; i >= rmin && count < totalEle; i--){
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i = rmin , j = cmax-1 ; j >= cmin+1 && count < totalEle; j--){
                System.out.println(mat[i][j]);
                count++;
            }

            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }

    }
}

/*
How to reach to the logic 

1. dekho hume pta hai ki hume total saare element print krne hai -> humne ek while loop lgaya jo total no. of elements time chalega
2. ab hume printing start krni thi -> to humne basic outer lines ke liye printing code likha usnig rmin,rmax,
min and cmax.
3. ab hume next internal lines ya fir elements ko print krna tha ->to humne hmare variables ko usi hisab se update kiya jisse ki next operation of while loop me internal elements print ho ske.
4. ab problem ye aa rhi thi ki jab kaam khatam ho jaata tha to next lines ko print krne wale loop bhi chal rhe the -> to humne count ke condition lga di jisse jaise hi saare elements print ho jaaye to next wale loops na chale.


*/
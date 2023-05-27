package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int mat[][] = new int[n][n];

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();
        // logic
        int i = 0, j = n - 1;

        while (j >= 0 && i < n) {  // kyunki i ko increase kr rhe hai aur j ko decrease to j 0 se kam na ho aur i n se bdi na ho.
            if (mat[i][j] == x) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (x < mat[i][j]) {
                j--;
            } else if (x > mat[i][j]) {
                i++;
            }
        }

        System.out.println("Not Found");
    }

}

/*
Logic behind logic :

1. Hume element to find krna hai lekin hum ye smartly krenge 
   hum jo ye mat sorted mila hua hai rowwise and colwise hum isi property ka use krke element ko find krnege
2. Hum kya krte hai ki top left wale corner ko pkd lete hai kyunki uske left me smaller values hai aur uske bottom me larger values.(For more information - check img)
3. ab agr hume element mil gya to uske coordinate print kr dete hai 
   agr element smaller hai hmare current block wale element se to hum left move kr jaate hai aur agr bda hai to down.
4. ab hum return isilye lgate hai taki NOT FOUND har baar print na ho sirf tab print ho jab element mile na.

Note : Hum isi code ko first element pkd ke bhi kr skte the lekin usme code less optimized hota aur bhut saare cases handle krne pdte
       wrna saare test case pass nhi hote.(FMI-check Img)

       Complexity = O(n).
*/
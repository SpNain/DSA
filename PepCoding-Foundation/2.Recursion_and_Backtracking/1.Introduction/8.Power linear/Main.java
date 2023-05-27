package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powerLinear(x, n));
    }

    public static int powerLinear(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xPowNm1 = powerLinear(x, n - 1);
        int xPowN = x * xPowNm1;
        return xPowN;
    }

}

/*
Note :

 if(n == 1){
     return x;
 }
 
 Hum base ye uper wala nhi likh skte kyunki maanlo agr n ki value hi 0 dedi to us case me hmara program nhi chlega 
*/
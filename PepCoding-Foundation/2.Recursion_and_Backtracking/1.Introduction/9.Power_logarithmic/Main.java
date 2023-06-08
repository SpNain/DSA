package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner (System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powerActualSmart(x,n));
    }

    public static int powerActualSmart(int x, int n){
        if(n == 0){
            return 1;
        }
        int xPowNBy2 = powerActualSmart(x,n/2);
        int xPowN = xPowNBy2 * xPowNBy2;
        if(n%2 == 1){
            xPowN *= x;
        }
        return xPowN;
    }

    // public static int powerFakeSmart(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     int xPowN = powerFakeSmart(x,n/2) * powerFakeSmart(x,n/2);
    //     if(n%2 == 1){
    //         xPowN *= x;
    //     }
    //     return xPowN;
    // }

}
// Program to calc nth fibonacci term.

// package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int fibNm1 = fib(n - 1);
        int fibNm2 = fib(n - 2);
        int fibN = fibNm1 + fibNm2;

        return fibN;
    }
}

/*
Logic behind logic :
Faith and expectation model.
To calculate f(n) = f(n-1) + f(n-2)

Hume next fibnacci term calc krne ke liye need hai last two terms ki.
*/

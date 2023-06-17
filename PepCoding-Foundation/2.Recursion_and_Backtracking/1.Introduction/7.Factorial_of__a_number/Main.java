package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner (System.in);

        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
      return n * factorial(n-1);
    }

}

/*
Logic behind logic :
Faith and expectation model.
To calculate f(n) = n * f(n-1)
*/
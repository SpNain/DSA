//Sp Nain -- AWC
package com.company;

import java.io.*;
import java.util.*;

public class Main{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k){
        // write your code here
        int n = a.length;
        k = k % n;  // effective rotation

        if (k<0)
        {
            // -ve rotation -> +ve rotation number
            k = k + n;
        }

        //arr = p1+p2

        reverse(a,n-k,n-1);//reverse part2
        reverse(a,0,n-k-1);//reverse part1
        reverse(a,0,n-1);//reverse a
    }

    // reverse(a,lo,hi) : reverse part of array from [lo->hi]
    public static void reverse(int a[], int lo, int hi){
        while(lo<hi){
            int tmp = a[lo];
            a[lo] = a[hi];
            a[hi] = tmp;

            lo++;
            hi--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}

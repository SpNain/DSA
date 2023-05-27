//Copied from MB
package com.company;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0 ; i < n ; i++){  // jitne no h utne hi set print ho rhe h like for 3 nos teen set h {10,10-20,10-20-30} {20,20-30} {30}
            for(int j = i ; j < n ; j++){   // har ek set ki row i se start ho rhi h && har ek set 1 se kam ho rha h like first set contains 3 element, 2nd contains 2 and 3rd contains 1. So, these make a pattern that count of element are from i to n
                for(int idx = i ; idx <= j ; idx++){  // har ek set ki ek row me i se start hokar j tak element h
                    System.out.print(arr[idx]+"\t");
                }
                System.out.println();
            }
        }
    }

}

//Sp Nain -- After Watching Lecture
package com.company;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int ans=spanOfArray(arr);
        System.out.println(ans);
    }
    public static int spanOfArray(int[] arr){
        int max=arr[0];   // or max = Integer.MIN_VALUE;
        int min= arr[0]; //or min = Integer.MAX_VALUE;
        for(int i= 1;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return max-min;
    }
}

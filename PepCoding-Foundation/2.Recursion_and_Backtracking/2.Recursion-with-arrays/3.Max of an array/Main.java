package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i]= scn.nextInt();
        }

        System.out.println(maxOfArray(arr,0));

    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int res = maxOfArray(arr,idx+1);
        if(res > arr[idx]){
            return res;
        }else{
            return arr[idx];
        }
    }
}

/*
Logic : Hum faith rkhte hai ki humare array ke subpart ko max nikalana aata hai 
        to hum idx+1 ko call lga dete hai aur maan lete hai ki wo hume bche hue part ka max laake dega
        fir uske baad hum uske dwara laaye gye res(which will be max of subproblem) 
        aur apne idx wali value ko compare krte hai aur jo bda hota hai use return kr dete hai

        aur jab idx arr.length ke equal pahunch jaaye to hum Integer.MIN_VALUE return krte hai 
        agr base case me idx == arr.length - 1 hota to arr[idx] return krte 
        kyunki agr array me ek hi element hoga to wahi us array ka max element bhi hoga

For more refer : img
*/
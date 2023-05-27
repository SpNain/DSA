package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length){
            //array create
            return new int[fsf];
        }
        if(arr[idx] == x){ // is case me hum res arr ke andar index dlwa ke return kr rhe hai kyunki isme arr[idx] == x ke hai 
            // idx+1 , fsf + 1 ,  arr[fsf] = idx ,  return
            // fsf++; agr isko pahle increase kar denge to jab return hoag to fsf ki value bdi hui hi hogi
            int res[] = allIndices(arr,x,idx+1,fsf+1);
            res[fsf] = idx;
            return res; 
        }else{  // iss case me element match nhi ho rha hai to sidha jo aage se res arr aaya hoga use sidha directly return kr dete hai
            return allIndices(arr,x,idx+1,fsf);// idx+1 , directly return
        }
    }

}

/*
Logic : frequency so far hume count bta rha hai x ka to jab hum base case pe reach kr jaayenge 
        tab hum fsf ke size ka array return krenge to store indexes of x.

        Agr hum is trike se call lgaye

        if(arr[idx] == x){
            fsf++;
        }
        int[] res = allIndices(arr,x,idx+1,fsf);

        to store krwate time hum fsf ko decrease bhi krna hoga kyunki use hume call ke time nhi balki explicitaly increase kiya hai
        if(arr[idx] == x){
            res[fsf-1] = idx;
            fsf--;
        }
        return res;
*/
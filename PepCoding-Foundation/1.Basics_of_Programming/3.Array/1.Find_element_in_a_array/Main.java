// package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {

        //SP Nain--After Watching Lecture
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int element = scn.nextInt();

        int ans=find(arr,element);
        System.out.println(ans);
    }
    public static int find(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}

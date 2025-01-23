package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=scn.nextInt();
        }
        int x = scn.nextInt();

        int fi = firstIndex(arr,0,x);

        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }else{
            return firstIndex(arr,idx+1,x);
        }
    }

}

/*
Logic : sbse pahle to check krlo ki jis index pe abhi hai kahi usi pe to value nhi pdi
        agr udhar hi value mil jaaye to idx return kr dete hai 
        aur agr nhi milti to idx ko bdakar call lga dete hai 
        aur jaise hi jis idx pe value mil jaayegi use return kr denge 
        jo udhar hi aayegi jaha se call lgayi hai aur humne call lgate time sidhe return bhi likh diya 
        jisse jaise hi udhar koi value aaye wo return ho jaaye 
*/
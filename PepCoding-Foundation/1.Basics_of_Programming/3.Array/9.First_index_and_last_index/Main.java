//CFMB
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
        int k = scn.nextInt();

        System.out.println(firstIdx(arr,k));
        System.out.println(lastIdx(arr,k));
    }

    public static int firstIdx(int arr[],int k){
        int lo = 0 , hi = arr.length-1;
        int fi = -1;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(arr[mid] == k){
                fi = mid;       // we don't need to check explicity that Is mid < fi b/c it will be as we are decreasing hi that means next mid will be lesser compare to the old one.
                hi = mid-1;
            }else if(arr[mid] < k){
                lo = mid+1;
            }else if(arr[mid] > k){
                hi = mid-1;
            }
        }

        return fi;
    }

    public static int lastIdx(int arr[],int k){
        int lo = 0 , hi = arr.length-1;
        int li = -1;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(arr[mid] == k){
                li = mid;       // we don't need to check explicity that Is mid > li b/c it will be as we are increasing li that means next mid will be higher compare to the old one.
                lo = mid+1;
            }else if(arr[mid] < k){
                lo = mid+1;
            }else if(arr[mid] > k){
                hi = mid-1;
            }
        }

        return li;
    }

}
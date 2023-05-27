package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

        int li = lastIndex(arr, 0, x);

        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int res = lastIndex(arr, idx + 1, x);

        if (res == -1) {
            if (arr[idx] == x) {
                return idx;
            } 
        }
        return res;
    }
}

/*
Logic : hum idx increase kr kr ke call lgate jaate hai aur stack me uper chdte jaate hai
        jaise hi arr.length pe pahunch jaate hai waise hi hum -1 krte hai
        jo res me catch krte hai ab agr res == -1 hai iska matlab abhi tak hume element nhi mila 
        jaise hi hume arr[idx] == x mil jaaye hum idx return krenge jisse res me idx store ho jaayega
        aur fir uske baad arr[idx] == x check nhi hoga sidha res return hoga
*/
/*
Another approach :

 public static int LastIndex(int[] arr, int idx, int x){
        if(idx < 0){
            return -1;
        }
        
        if(arr[idx] == x){
            return idx;
        }
        return LastIndex(arr,idx-1,x);
    }
*/



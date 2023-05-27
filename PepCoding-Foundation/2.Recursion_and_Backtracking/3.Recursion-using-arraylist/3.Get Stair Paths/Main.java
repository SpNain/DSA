package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> list = getStairPaths(n);
        System.out.println(list);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (n < 0) {
            ArrayList<String> base = new ArrayList<>();

            return base;
        }
        ArrayList<String> mypath = new ArrayList<>();

        ArrayList<String> path1len = getStairPaths(n - 1);// 1 len
        for (String path : path1len) {
            mypath.add("1" + path);
        }

        ArrayList<String> path2len = getStairPaths(n - 2);// 2 len
        for (String path : path2len) {
            mypath.add("2" + path);
        }

        ArrayList<String> path3len = getStairPaths(n - 3);// 3 len
        for (String path : path3len) {
            mypath.add("3" + path);
        }

        return mypath;
    }
}


/*
Logic :

Hume given hai ki hum 3 type ki length se chad skte hai 1 len 2 len and 3 len
Ab maan lete hai hume 1 len ki call lgayi means hum 1 len se chad gye to bchi stairs (n-1) ke path hum program pe chhod dete hai
jab wo paath aa jaate hai to hum uske paths ke aage 1 jodkar apne myPath me add krwa lete hai kyunki humne 1 stair 1 len se chad li thi
Same reason for 2 len and 3 len.

Note : jab n 0 ho jaaye means stairs na bche chdne ke liye to hum wha pe arraylist with empty string return krte hai 
       kyunki hum already apne destination pe reach kr chuke hai aur yha tak ka path hume apne ans ka part bnana hai
       lekin jab n<0 ho jaaye to hum wha pe empty arraylist return krte hai kyunki n negative means ki stairs negative ho chuki hai
       which isn't possible to n negative pe reach krne ka path hume apne ans ka part nhi chahiye thats why we return empty arraylist
       jisse for loop run nhi hoga aur myPath me kuch bhi add nhi hoga.
*/

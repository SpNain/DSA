package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);

        int n = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();

        toh(src,dest,helper,n);
    }

    public static void toh(int src,int dest,int helper,int n){
        if(n == 0){
            return;
        }
        toh(src,helper,dest,n-1);
        System.out.println(n+"["+src+" -> "+dest+"]");
        toh(helper,dest,src,n-1);
    }

}

// For logic refer pdf.
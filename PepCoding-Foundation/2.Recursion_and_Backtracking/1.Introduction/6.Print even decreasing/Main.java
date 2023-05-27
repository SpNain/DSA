package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        int n = scn.nextInt();
        printEvenSmart(n);
    }
    public static void printEvenSmart(int n){
        if(n < 0){
            return;
        }
        if(n % 2 == 1){
            printEvenSmart(n-1);
        }else{
            System.out.println(n);
            printEvenSmart(n-2);

        }
    }
}

/*
Sp Nain - 1st Revision
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        if(n%2!=0)
        printEvenDecrease(n-1);
        else
        printEvenDecrease(n);
    }
    
    public static void printEvenDecrease(int n){
        
        if(n == 0){
            System.out.println(n);
            return;
        }
        
        System.out.println(n);
        printEvenDecrease(n-2);
       
    }
}
*/
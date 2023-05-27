package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        int n = scn.nextInt();
        printOddSmart(n);
    }
    public static void printOddSmart(int n){
        if(n <= 0){
            return;
        }
        if(n % 2 == 0){
            printOddSmart(n-1);
        }else{
            printOddSmart(n-2);
            System.out.println(n);
        }
    }
}

package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        String exp = scn.nextLine();
        printSS(exp,"");

    }

    public static void printSS(String ques, String asf) {
        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq,asf+ch);
        printSS(roq,asf);

    }

}

/*
Logic :

Hume 0th wala char nikal ke baki bachi hui substring par call lgate hai
call 2 basis pe lgayi jaati hai ki jo char nikala hai wo ans ka part bnna chahata hai ki nhi
if char wants to be the part of ans then usko ans me add krke call lagayi jaati hai
aur agr char doesn't wants to be the part of the ans then usko bina add kiye call lgayi jaati hai
aur jaise hi string ki length 0 ho jaati hai iska matlab saare char ko chance diya jaa chuka hai 
to jo sequence bna hai use print kr dete hai
*/
package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        ArrayList<String> res = getKPC(exp);
        System.out.println(res);

    }

    public static String keypad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        String roq = str.substring(1);
        ArrayList<String> rres = getKPC(roq);
        String word = keypad[Integer.parseInt(str.charAt(0) + "")]; //[#1]
       
        ArrayList<String> list = new ArrayList<>();

        for(int idx = 0 ; idx < word.length() ; idx++){
            for(String comb : rres){
                list.add(word.charAt(idx)+comb);
            }
        }
        return list;
    }
}

/*
Logic :

Logic ye hai ki hum roq yani ki substring ko call lgate rhenge 
aur jaise hi base case pe reach kr jaayenge wha pe se arraylist with empty string return kr denge
ab jo string hai uska 0th char nikalenge aur us word ke index ke correponding keypad array se word mangwa lenge.
aur fir word ke char ek ek krke nikal ke rres me sbke aage add krte hue apni list me add krte rhnege.

#1. Agr hum direct index me str.charAt(0) bhejte to ye apni asci value me convert hoke us index wala element leke aata 
    lekin hume iski ascii value wale index ka nhi balki iss char ke equivalent number wale index ka element chahiye hai
    to string ko as it is int me convert krne ke liye  we use Integer.parseInt(String)
    ab kyunki ye string leta hai isiliye "" lgaye hai.
*/
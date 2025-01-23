package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        ArrayList<String> list =gss(str);
        System.out.println(list);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");

            return blist;

        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList<String> subSeq = gss(roq);
        ArrayList<String> mySubSeq = new ArrayList<>();

        for(String s : subSeq){
            mySubSeq.add(s);
        }
        for(String s : subSeq){
            mySubSeq.add(ch+s);
        }
        return mySubSeq;
    }
}

/*
Note : agr humne base case se sirf ek new arraylist create krke return krdi bina khaali string add kiye 
       to problem ye hogi ki mySubSeq me kabhi koi string yani subsequence add hi nhi hoga
       kyunki arraylist empty hai to for loop chlenge hi nhi aur hmari mySubSeq empty hi return hoti rhegi

       let examine it : maanlo humne empty arraylist return krdi to subSeq me empty arraylist aayegi 
                        jisse for loop nhi chalenge aur mySubSeq bhi empty hi rhegi 
                        fir hum mySubSeq ko return kr dete hai jo fise subSeq me catch hogi aur 
                        subSeq me firse empty arraylist aayegi aur firse loop nhi chalenge 
                        yahi process chalti rhegi aur in the end mySubSeq empty reh jaayegi.

Logic : Hum faith rkhte hai ki uski substring ke sequence hmara code lana jaanta hai
        to uski substring ke sequence se string ke sequence create krne ka pattern dunda 
        aur for loop lga ke string ke sequence create kr liye
*/
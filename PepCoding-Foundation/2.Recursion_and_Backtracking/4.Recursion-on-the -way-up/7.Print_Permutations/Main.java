package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();

        printPermutations(str,"");

    }

    public static void printPermutations(String ques, String asf) {

        if(ques.length()==0){
            System.out.println(asf);
            return;

        }

        for (int i = 0; i < ques.length(); i++) {
            
            char ch = ques.charAt(i);
            
            String lpart = ques.substring(0, i);
            String rpart = ques.substring(i + 1);
            
            String roq = lpart + rpart;
            
            printPermutations(roq, asf + ch);
            

        }
    }

}

/*
Logic : hmare logic ka base aata hai ki har ek level pe utni hi calls lg rhi hai jitni string ki length hai
        to bas humne ek ek krke string ke saare char ko moka diya aur use nikal kr asf me add kr diya 
        aur bachi string ko aage call lga diya
        For more refer img.         
*/
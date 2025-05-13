//CFMB
package com.company;
import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPalindrome(String s){
        int lo = 0;
        int hi = s.length()-1;

        while(lo < hi){  // = isiliye nhi lgaya kyunki = sirf odd length ke case me jaayega aur agr saari string palindromic h to bich wala char to check krne ki jrurat hi nhi hai.
            if(s.charAt(lo) != s.charAt(hi)){
                return false;
            }

            lo++;
            hi--;
        }

        return true;
    }
    public static void solution(String str){
        for(int sp = 0 ; sp <= str.length()-1 ; sp++){
            for(int ep = sp+1 ; ep <= str.length() ; ep++){
                String ss = str.substring(sp,ep); // ye hume sp se lekar ep-1 tak ki substring laakr de dega 

                if(isPalindrome(ss)){  // jise hum check krne ke liye bhej denge ki panlindromic h ki nhi
                    System.out.println(ss);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}

// Palidromic = jo front aur end dono side se read krne pe same ho e.g. - naman.
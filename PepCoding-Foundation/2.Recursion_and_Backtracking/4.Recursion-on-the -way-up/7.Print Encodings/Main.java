package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        printEncodings(str,"");

    }
    public static void printEncodings(String str,String enc) {
        if(str.length() == 0){
            System.out.println(enc);
            return;
        }
        if(str.charAt(0) == '0'){ // it is given in the question to not solve when first char of a string is 0.
            return;
        }

        // single digit num
        char firstChar = str.charAt(0);
        int num1 = Integer.parseInt(firstChar+"");
        printEncodings(str.substring(1),enc +(char)('a'+num1-1)); // whenever a char is used with numerical values char converts into its ascii value.

        if(str.length() > 1){     // [#1]
            // double digit num
            char secondChar = str.charAt(1);
            int num2 = Integer.parseInt(""+firstChar+secondChar);//yaha pe tum in empty strings ko baad me nhi lga skte kyonki usse fir number add ho jaayenge e.g. : {(""+1+2)=("12")} & {(1+2+"")=("3")}
            if(num2 >= 10 && num2 <= 26){
                printEncodings(str.substring(2),enc +(char)('a'+num2-1));
            }
        }
    }
}

/*
Logic : Hum yato ek num ko encode krke add krte hai ans me ya fir 2 num ko
        to hum do alalg alag calls lagate hai 
        ek jisme sirf ek char ko nikal ke uske int value ke corresponding char ko add krte hai ans me
        aur ek jisme 2 char ko nikal ke uske int value ke corresponding char ko add krte hai ans me 
#1.ab kyunki kisi bhi string me se 2 char tabhi nikalenge na jab usme 2 char ho 
   to isiliye str ki length 1 se bdi yani 2 ya usse jyda ho is condition pe 2 char wali call lgayi hai
*/
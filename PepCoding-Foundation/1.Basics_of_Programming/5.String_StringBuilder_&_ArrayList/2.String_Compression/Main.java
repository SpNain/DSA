//CFMB
package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static String compression1(String str){
        String res = str.charAt(0)+"";
        for(int idx = 1 ; idx < str.length() ; idx++){
            char curr = str.charAt(idx);
            char prev = str.charAt(idx-1);

            if(curr == prev){
                // do nothing
            }else{
                res = res + curr;
            }
        }
        return res;
    }
    public static String compression2(String str){
        String res = str.charAt(0)+"";
        int count = 1;

        for(int idx = 1 ; idx < str.length() ; idx++){
            char curr = str.charAt(idx);
            char prev = str.charAt(idx-1);

            if(curr == prev){
                count = count+1;
            }else{
                if(count > 1){
                    res = res + count;
                    count = 1;  // next character ke liye count 1 set kr diya
                }
                res = res + curr;
            }
        }
        if(count > 1){ // last wale char ke liye agr wo 1 se jyada hue to
            res = res + count;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}

/*
StringBuilder Approach

import java.io.*;
import java.util.*;

public class Main {
    public static String compression1(String str){
        // jaha bhi hume lgega ki hume jyda updation krne hai string me to hum use StringBuilder ke type ka bna lenge
        StringBuilder res = new StringBuilder(); 
        res = res.append(str.charAt(0));
        
        for(int idx = 1 ; idx < str.length() ; idx++){
            char curr = str.charAt(idx);
            char prev = str.charAt(idx-1);

            if(curr == prev){
                // do nothing
            }else{
                res.append(curr);
            }
        }
        return res.toString(); // kyunki iska return type string hai naki stringbuilder to toString sb ko string me convert kr deta hai
    }
    
    public static StringBuilder compression2(String str){
        StringBuilder res = new StringBuilder();
        res = res.append(str.charAt(0));
        int count = 1;

        for(int idx = 1 ; idx < str.length() ; idx++){
            char curr = str.charAt(idx);
            char prev = str.charAt(idx-1);

            if(curr == prev){
                count = count+1;
            }else{
                if(count > 1){
                    res.append(count);
                    count = 1;  // next character ke liye count 1 set kr diya
                }
                res.append(curr);
            }
        }
        if(count > 1){ // last wale char ke liye agr wo 1 se jyada hue to
            res.append(count);
        }
        return res;  // yha pe humne return type change kr diya isiliye .toString ki jrurat nhi pdi
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}


*/

/*
Sp Nain - 1st Revision

public static String compression1(String str){
		// write your code here
		char ch = str.charAt(0);
		String cs = ""+ch;
		for(int i = 1; i<str.length(); i++){
		    if(str.charAt(i)==ch){
		        continue;
		    }
		    else{
		        ch = str.charAt(i);
		        cs += ch;
		    }
		}

		return cs;
	}

	public static String compression2(String str){
		// write your code here
		char ch = str.charAt(0);
		String cs = ""+ch;
		int count = 1;
		for(int i = 1; i<str.length(); i++){
		    if(str.charAt(i)==ch){
		        count++;
		    }
		    else{
		        ch = str.charAt(i);
		        if(count>1){
		           cs = cs+count+ch;
		           count = 1;
		        }
		        else{
		            cs +=ch;
		        }
		    }
		}
		if(count>1) cs +=count;

		return cs;

	}

*/
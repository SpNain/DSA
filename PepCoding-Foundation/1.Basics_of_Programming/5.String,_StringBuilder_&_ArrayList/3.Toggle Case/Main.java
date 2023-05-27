//CFMB
package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static String toggleCase(String str){
        String res = "";
        for(int idx = 0 ; idx < str.length() ; idx++){
            char ch = str.charAt(idx);

            if(ch >= 'a' && ch <= 'z'){  // the comparision is in their decimal values internally.
                // lower case letter
                char uc = (char)('A'+(ch-'a')); // force casting b/c int takes more space than char
                res = res + uc;
            }else if(ch >= 'A' && ch <= 'Z'){
                // upper case letter
                char lc = (char)('a'+(ch-'A'));
                res = res + lc;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}

/*
// StringBuilder Approach
import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder res = new StringBuilder();
		for(int i = 0; i<str.length(); i++){
		    
		    char ch = str.charAt(i);
		    
		    if(ch >= 'A' && ch <= 'Z'){
		        // uc
		        char lc = (char)(ch + 'a' - 'A');
		        res.append(lc);
		        
		    }
		    else if(ch >= 'a' && ch <= 'z'){
		        // lc
		        char uc = (char)(ch + 'A' - 'a');
		        res.append(uc);
		    }
		}
		return res.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
*/
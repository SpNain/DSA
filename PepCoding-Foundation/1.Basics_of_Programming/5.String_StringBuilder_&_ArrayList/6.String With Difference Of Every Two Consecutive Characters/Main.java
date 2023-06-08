// Stringbuilder approach
import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		StringBuilder res = new StringBuilder();
		res.append(str.charAt(0));
		
		for(int i = 1; i<str.length(); i++){
		    char curr = str.charAt(i);
		    char prev = str.charAt(i-1);
		    
		    int diff = curr - prev;
		    
		    res.append(diff);
		    res.append(curr);
		}
		return res.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));

	}

}


/*
String approach

import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		String res = ""+str.charAt(0);
		
		for(int i = 1; i<str.length(); i++){
		    char curr = str.charAt(i);
		    char prev = str.charAt(i-1);
		    
		    int diff = curr - prev;
		    
		    res = res + diff + curr ;
		    
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));

	}

}
*/
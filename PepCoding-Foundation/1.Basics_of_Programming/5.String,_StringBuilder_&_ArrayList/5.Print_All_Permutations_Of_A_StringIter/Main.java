//CFMB
package com.company;
import java.io.*;
import java.util.*;

public class Main {
    public static int fact(int num){
        int res = 1;
        for(int i = 1; i <= num ; i++){
            res = res * i;
        }

        return res;
    }
    public static void solution(String str){
        int n = str.length();
        int totalPerm = fact(n);  // b/c there will n! permutation for a string of length n.

        for(int num = 0 ; num < totalPerm ; num++){
            int div = n;            // [#1]
            String mStr = str;      // [#2]
            String perm = "";
            int val = num;          // [#3]
            while(div != 0){
                int rem = val % div;
                val = val/div;
                perm = perm + mStr.charAt(rem);

                String lp = mStr.substring(0,rem);
                String rp = mStr.substring(rem+1);
                mStr = lp+rp;  // string me se rem index wala char remove ho gya
                div--;       // next division ke liye tmp ko decrease kr diya
            }
            System.out.println(perm);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}

/*

Check pdf for logic

#1. jo length hoti h string ki hum usi no. se divide krna start krte hai aur fir use reduce krte jaate hai
    lekin hume har ek num ko n se hi divide krna start krna hoga 
    to n change nhi kr skte isiliye usko tmp me store kra liya 
    taki jb next num ki baari aaye to firse tmp me n dalwake division str.length() se hi start ho ske

#2. jab ek division ho jaaye to fir hum rem index wale char ko nikal dete hai 
    left wali substring alag krke aur right wali substring alag krke baad me unhe jod dete hai
    ab iske liye hume str ko chhota krna pdta aur fir usi string ko hume next perm find krne ke liye bhi use krna hai
    to isiliye hum str ko ek alag string var me store krwa lete hai.

#3. agr hume num ko hi while loop me use kr liya sidhe hi to while loop khtam hote hote num ki value 0 ho jaayegi
    aur fir for loop use 1 se increase kr dega fir wahi num while loop khtam hote hote 0 ho jaayega
    firse for loop use 1 kar dega aur yahi chlta rhega aur num kabhi bhi totalPerm tak nhi pahunch paayega 
    aur hume sirf 0 aur uske baad 1 ke hi permutation milte rhenge
    isi se bchne ke liye hum use ek val var me store krwa lete hai taki agr while loop ke baad val 0 bhi ho to 
    num to increase hoga hi aur wo val me store hona hai to isse hmara program 0 se lekar totalPerm-1 tak ke liye execute ho paayega
    aur hume saare permutations mil paayenge
*/



/*
// StringBuilder Approach
import java.io.*;
import java.util.*;

public class Main {
    public static int fact(int num){
        int res = 1;
        for(int i = 1; i <= num ; i++){
            res = res * i;
        }

        return res;
    }
    public static void solution(String str){
        int n = str.length();
        int totalPerm = fact(n); 

        for(int num = 0 ; num < totalPerm ; num++){
            
            int tmp = n;
            
            StringBuilder mStr = new StringBuilder();
            mStr.append(str); 
            
            StringBuilder perm = new StringBuilder();
           
            int val = num;   
            
            while(tmp != 0){
                
                int rem = val % tmp;
                val = val/tmp;
                
                perm.append(mStr.charAt(rem));
                
                mStr = mStr.deleteCharAt(rem);
                tmp--;       
            }
            System.out.println(perm);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}


*/

//SP Nain
//package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int dec = anyBaseTodecimal(n, sourceBase);
        int ans = decToAnyBase(dec, destBase);
        System.out.println(ans);
    }

    // public static int getValueIndecimal(int n, int sourceBase, int destBase){
    // write your code here
    // int pow=1,ans=0;
    // while(n!=0)
    // {
    // int remainder = n%destBase; // jisme covert karna h uska base yaha hoga
    // ans += remainder*pow;
    // pow*=sourcebase; // current base number ka yaha hoga
    // n/=destBase; // jisme covert karna h uska base yaha hoga
    // }
    // return ans;

    public static int anyBaseTodecimal(int n, int b) {
        // write your code here
        int pow = 1, ans = 0;
        while (n != 0) {
            int remainder = n % 10;
            ans += remainder * pow;
            pow *= b;
            n /= 10;
        }
        return ans;
    }

    public static int decToAnyBase(int n, int b) {
        int pow = 1, ans = 0;
        while (n != 0) {
            int remainder = n % b;
            ans += remainder * pow;
            pow *= 10;
            n /= b;
        }
        return ans;
    }
}

/*
 * 
 * Note :- Agar number system decimal se bda ho yani ki jaise hexadecimal ho
 * to hume remainder ko pahle string me convert krna hoga
 * aur usi hisab se concatenate krna hoga
 * Aur agr hexadecimal system se kisi dusre system me convert krne ko bola jaaye
 * jisme sirf numbers ho to hume fir usi hisab se remainder ko numric value me
 * convert krke use krna hoga
 */
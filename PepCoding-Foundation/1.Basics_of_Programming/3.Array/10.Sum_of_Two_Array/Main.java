//Sp Nain --AWC
package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int arr1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int arr2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        // Add Two Arrays

        int size = n1 > n2 ? n1 : n2;
        int res[] = new int[size];  // res ka size us array ke equal hoga jiska size bda h

        int p1 = n1 - 1, p2 = n2 - 1, p3 = size - 1, carry = 0;

        while (p1 >= 0 || p2 >= 0) {
            int d1 = p1 < 0 ? 0 : arr1[p1];  // jab tk pointer 0 ya usse bda hoga tb tak array se val nikelgi
            int d2 = p2 < 0 ? 0 : arr2[p2];

            int sum = d1 + d2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            res[p3] = digit;
            p1--;
            p2--;
            p3--;
        }

        //output
        if (carry != 0) {
            System.out.println(carry); // agar last me carry bachta hai to pahle hum use print krwayenge
        }
        for (int val : res) {
            System.out.println(val);
        }
    }

}

/*

Here we are printing just values 
but in case we have to return a array and carry left 
then we have to make and another array of size+1 and copy res array in the new res array.

like this :

int[] new_res = new int[size+1];

new_res[0] = carry;

for(int i = 0; i<res.length-1; i++){
    new_res[i+1] = res[i];
}

return new_res;

*/
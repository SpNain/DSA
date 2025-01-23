//SP Nain
package com.company;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        int ans = 0;
        int pow = 1;
        int borrow = 0;
        while(n2>0)           // ye question me hi mentioned hai ki n2 bda hai to jab tak bda number khtam nhi hota tab tak while loop chalega
        {                     // agr mentioned nhi hota to ternary operator ka istemaal krke bda chhota pta lga lete aur usi hisab se adjust kr dete.*
            int d1 = n1%10;
            int d2 = n2%10;

            n1=n1/10;
            n2=n2/10;

            int sub = (d2+borrow)-d1;
            int d = sub;
            if(sub<0)
            {
                d +=b;
                borrow =  -1;
            }
            else {
                borrow = 0;
            }

            ans += d*pow;
            pow*=10;
        }
        return ans;
    }
}


/*
     *  int big = n1>n2 ? n1 : n2;
        int small = n1<n2 ? n1 : n2;
        
        n2 = big;
        n1 = small;
 */
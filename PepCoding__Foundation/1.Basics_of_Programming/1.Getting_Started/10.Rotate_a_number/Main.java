import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int d = 0, temp = n;

        while (temp != 0) {
            d++;
            temp = temp / 10;
        }

        int ek = k % d;   // [#1] 
        if (ek < 0) {     // [#2]
            ek = d + ek;
        }

        int anspow = 1, pow = 1, i = ek, j = d - ek;

        while (i != 0) {
            pow = pow * 10;
            i--;
        }

        int a = n / pow;
        int b = n % pow;

        while (j != 0) {
            anspow = anspow * 10;
            j--;
        }
        int rtn = b * anspow + a;
        System.out.println(rtn);

    }
}

/*
#1.
if k = 12 and d = 5 then ek(effective k) will be 2 
that means if we rotate a no by 12 times and by 2 times they give us the same result 
then why to do mehnat of rotating a number by 12 times jab kaam 2 baat ke rotation me chal rha ho

#2. 
when k is -ve that means aage se k digits utha ke piche lga do
if number have 5 digits then rotating a number by -1 times is equal to rotating a number by 4 times 
that why when k is -ve we add no of digits in it so that we could get the acutal k 

*/
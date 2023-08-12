import java.io.*;
import java.util.*;

public class Main {

    public static int countSetBit(int n) {

        int count = 0;

        while (n != 0) {

            // method 1 : Shreesh
            int rsbm = (n & (-n));
            n = n - rsbm;
            count++;
            
            //Method 3 : Sp Nain
            // int rsbm = (n & (-n));
            // n = n ^ rsbm;
            // count++;

            //Method 3 : Pep Website Sol
            // n &= (n - 1);
            // count++;

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(countSetBit(n));
    }

}

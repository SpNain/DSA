import java.io.*;
import java.util.*;

public class Main {

    public static void printRSBM(int n) {
        int rsbm = (n & (-n));
        System.out.println(Integer.toBinaryString(rsbm));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printRSBM(n);
    }

}
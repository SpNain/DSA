import java.io.*;
import java.util.*;

public class Main {

    public static void sortDates(String[] arr) {

        countSort(arr, 1000000, 100, 32);  // days
        countSort(arr, 10000, 100, 13);    // months
        countSort(arr, 1, 10000, 2501);    // years [#1]
    }

    public static void countSort(String[] arr, int div, int mod, int range) {

        int freq[] = new int[range];

        for (String val : arr) {
            int pos = (Integer.parseInt(val) / div) % mod;
            freq[pos]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        String res[] = new String[arr.length];

        for (int idx = arr.length - 1; idx >= 0; idx--) {
            String val = arr[idx];
            int pos = (Integer.parseInt(val) / div) % mod;
            int place = freq[pos];
            res[place - 1] = val;
            freq[pos]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }

    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }

}

/*
Total 3 calls lgti hai days, months aur years ke liye 
Saara kaam radix sort ke jaisa hi hai bas isme hum div, mod aur range pahle se bhejte hai alag alag calls me
aur kyunki given arr String type ka hai to hum res array bhi String type ka hi bnate hai
aur kyunki given arr string type ka hai to jab uski val nikali jaati hai 
to use hum Integer.parseInt() ki help se int me convert kr dete hai calc ke liye
baki sb radix sort ke jaise hi hai


#1. yaha pe ques me given hai ki years 0 to 2500 hai to isiliye years ki range 2501 rkhi hai
*/
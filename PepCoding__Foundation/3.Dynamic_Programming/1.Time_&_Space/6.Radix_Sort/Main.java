import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    int max = Integer.MIN_VALUE;
    for(int val : arr){
        if(val > max){
            max = val;
        }
    }    
    int count = 0;
    
    while(max != 0){
        count++;
        max = max / 10;
    }
    int exp = 1;
    while(count != 0){
        countSort(arr,exp);
        count--;
        exp = exp * 10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    int freq[] = new int[10]; //[#1]
    for (int val : arr) {
        int pos = (val/exp)%10;
        freq[pos]++;
    }
    
    for(int i = 1; i < 10 ; i++){
        freq[i] += freq[i-1];
    }
    
    int res[] = new int[arr.length];
    
    for(int idx = arr.length-1 ; idx >= 0 ; idx--){
        int val = arr[idx];
        int pos = (val / exp) % 10;
        int place = freq[pos];
        res[place-1] = val;
        freq[pos]--;
    }
    for(int i = 0 ; i < arr.length ; i++){
        arr[i] = res[i];
    }
    
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}


/*
Note : Radix sort is always used from Least Significant Value to Most Significant Value.

#1. Hmari range always 10 hogi kyunki single digit hi hai saari jisko hume sort krna hai
    range = (max-min) + 1 isiliye => range = (9-0)+1 = 10;


Logic : Radix sort basically count sort ka hi ek usage hai 
        Radix sort ek stable sort hai like count sort means ki jis order me values hai usi order me sorting hogi [$].
        To hum max value nikal lete hai kyunki usse jyada digit aur kisi me nhi hogi
        uske baad us max value ki digit nikal lete hai taki ye pta lag jaaye ki total kitni baar count sort chalana hai
        to bas uske baad to wahi count sort hi lgta hai bas val se pos nikalne ki trika badal jaata hai
        iss baar pos wahi hogi wo digit hum nikalenge value se means ki maanlo val hai 4988 
        to 3rd round me digit nikali 9 to fir freq array me pos bhi 9 hi hogi 
        
$ -> Stable Sort :
Matlab ki agr maanlo do four hai to maanlo ek four ka index tha 6 to iss four ko hum bol dete hai 4(6)
aur dusre four ka index tha 8 to iss four ko hum bol dete hai 4(8)
to jab sorting hogi to kyunki random me 4(6) pahle tha 4(8) se to sorting ke baad bhi 4(6) pahle hi place hoga 4(8) se.

*/
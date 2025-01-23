import java.io.*;
import java.util.*;

public class Main {
    public static void quickSort(int[] arr, int lo, int hi) {
        if(lo > hi){
            return;
        }
        int pivot = arr[hi];
        int pidx = partition(arr,pivot,lo,hi);
        quickSort(arr,lo,pidx-1);
        quickSort(arr,pidx+1,hi);
      }
    
      public static int partition(int[] arr, int pivot, int lo, int hi) {
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while (i <= hi) {
          if (arr[i] <= pivot) {
            swap(arr, i, j);
            i++;
            j++;
          } else {
            i++;
          }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
      }
    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        quickSort(arr, 0, arr.length - 1);
        print(arr);
      }
}

/*
Logic behind logic :

Logic hmara ye hai ki jab bhi partition hota hai array ka last element(pivot) ke basis pe 
to uske baad last element apni correct place pe aa jaata hai 

to hum isi baat ka faayda uthate hai aur last element ko pivot maankar recursion calls lgate hai 
Hum last wale element ko pivot maanke partition ki call lgate hai
jisse pivot apni correct place pe aa jaata hai 
aur partition ek index return krta hai j-1 kyunki partition hone ke baad pivot j-1 pe pda hota hai
aur kyunki wo element to already sorted hai isiliye pidx-1 aur pidx+1 ki do alag alag calls lgti hai

*/
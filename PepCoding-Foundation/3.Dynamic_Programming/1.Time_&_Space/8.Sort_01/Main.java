import java.io.*;
import java.util.*;

public class Main {

  public static void sort01(int[] arr){
    int i = 0 , j = 0;
    
    while(i < arr.length){ // [#1]
        if(arr[i] == 1){
            i++;
        }else{
            swap(arr,i,j);
            i++;
            j++;
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}


/*
Logic : Hum areas define kr dete hai like
        0 to j-1 -> 0's
        j to i-1 -> 1's
        i to len-1 -> unknown

To hume in areas ko maintain rkhna hai
agr i pe 1 mila to simple i++ se area maintain rehga
agr i pe 0 mila to swap krke i aur j dono ko ++ krne se area maintain rhega

#1. kyunki unknowns i se len-1 tak hai isiliye hume tab tak kaam krna pdega jab tak i<len or i<=len-1.
For more refer img.
*/
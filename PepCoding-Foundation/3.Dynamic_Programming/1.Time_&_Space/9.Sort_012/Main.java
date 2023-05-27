import java.io.*;
import java.util.*;

public class Main {

  public static void sort012(int[] arr){
    int i = 0 , j = 0 , k = arr.length-1; //[#1]
    
    while(i <= k){  //[#2]
        if(arr[i] == 0){
            swap(arr,i,j);
            i++;
            j++;
        }else if(arr[i] == 1){
            i++;
        }else{
            swap(arr,i,k);
            k--;
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
    sort012(arr);
    print(arr);
  }

}




/*
Logic : Hum areas define kr dete hai like
        0 to j-1 -> 0's
        j to i-1 -> 1's
        i to k -> unknown
        k+1 to len-1 -> 2's

To hume in areas ko maintain rkhna hai
agr i pe 1 mila to simple i++ se area maintain rehga
agr i pe 0 mila to swap krke i aur j dono ko ++ krne se area maintain rhega
agr i pe 2 milta hai to i aur k dono ko swap krke k-- kr denge

#1. k ko len-1 isiliye diya kyunki K+1 se len-1 tak hi to hmare saare 2's hai.
    aur agr yaad rkhna ho to aise yaad rkhlo ki k ko decrease krna hai isiliye usko len-1 se hi intialize krna pdega
#2. kyunki unknowns i se k tak hai isiliye hume tab tak kaam krna pdega jab tak i<=k.
For more refer img.
*/

/*

Note : Sort to iss trike se bhi ho jaayene but no. of operation will be more 

 public static void sort012(int[] arr){
    //write your code here
    int n = arr.length;

    int i = 0, j = 0,k = 0;

    while(i<n){
      int val = arr[i];
      if(val == 2){
          i++;
      }
      else if(val == 1){
        swap(arr,i,k);
        i++;
        k++;
      }
      else if(val == 0){
        swap(arr,i,j);
        swap(arr,i,k);
        j++;
        i++;
        k++;
      }
    }
    
    
  }
*/
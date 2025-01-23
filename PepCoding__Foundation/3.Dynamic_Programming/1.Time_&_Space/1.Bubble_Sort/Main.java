// MB Code -- Without swapCount and count
import java.io.*;
import java.util.*;

public class Main {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
  
        for(int itr = 1 ; itr <= n-1 ; itr++){ // [#1]
            for(int j = 0 ; j <= n-itr-1 ; j++){ // [#2]
                if(isSmaller(arr,j+1,j)) {
                    swap(arr,j+1,j); // swapping the values
                }
            }
        }
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        bubbleSort(arr);
        print(arr);
    }

}

/*
SP Nain Optimization -- Maine swapCount byaya aur dekha agr kisi bhi itrth iteration me (which may be 2nd,3rd any iteration) 
                        agr swapCount 0 hua to that means ki koi swapping nhi hui aur us iteration se pahle saare element sort ho chuke hai
                        to ab baki bchi hui iterations krne ka koi matlab nhi bnta isiliye hum for loop ko break krke bahar aa jaate hai 
                       
count to sirf check karne ke liye bnaya tha ki actually me operations decrease ho rhe hai kya.

Agr iss code ko nados pe run kroge to test cases fail honge kyunki swapping aur comparing jitni baar print hone chahiye the 
wo loop bich me break hone ke kaaran print nhi honge
isiliye swapCount ko comment krke hi submit krna nados pe.
*/

/*
// Sp Nain Code -- With count & swapCount
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    int count = 0;
    for (int itr = 1; itr <= n - 1; itr++) { // [#1]
        int swapCount = 0;
        for (int j = 0; j <= n - itr - 1; j++) { // [#2]
            if (isSmaller(arr, j + 1, j)) {
                swap(arr, j + 1, j); // swapping the values
                swapCount++;
            }
            count++;
        }
        if (swapCount == 0) {
            break;
        }
    }
    System.out.println(count);

}
*/

/*
// Sp Nain Code -- With only swapCount
public static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int itr = 1; itr <= n - 1; itr++) { // [#1]
        int swapCount = 0;
        for (int j = 0; j <= n - itr - 1; j++) { // [#2]
            if (isSmaller(arr, j + 1, j)) {
                swap(arr, j + 1, j); // swapping the values
                swapCount++;
            }
        }
        if (swapCount == 0) {
            break;
        }
    }
}
*/

/*
// Sp Nain Code -- Without count & swapCount && isSmaller() & swap() fxns
public static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int itr = 1; itr <= n-1; itr++) { // [#1]
        for (int j = 0; j <= n-1-itr; j++) { // [#2]
            if (arr[j+1] < arr[j]) {
                // swapping the values
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

*/
  


/*
#1.
for n elements there wil be n-1 iterations in bubble sort b/c
har ek iteration me ek element sort ho jaata h to agr n-1 elements ko sort krna h to uske liye n-1 iterations lgenge
aur agr n me se n-1 elements sorted h to bcha hua 1 element bhi sorted hi hoga
agr kisi array me 5 element hai aur usme se 4 apni shi jagah pe hai to 5th bhi apni shi jagah pe hi hoga

#2.
In each iteration one element get sorted so no. of checks decrease
Agr sorting increasing order me krni hogi to
1st iteration me array ka sbse bda number pda hoga to next iteration me use check krne ki jrurat hi nhi h
isiliye for n = 5 
1st iteration me 4 checks honge -> (0 with 1) (1 with 2) (2 with 3) (3 with 4)
2nd iteration me 3 and so on. 

*/
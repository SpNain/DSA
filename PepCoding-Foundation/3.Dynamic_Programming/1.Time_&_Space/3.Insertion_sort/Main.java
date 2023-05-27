import java.io.*;
import java.util.*;

public class Main {

  public static void insertionSort(int[] arr) {
    int n = arr.length;
    
    for(int itr = 1; itr <= n-1 ; itr++){  // [#1]
        for(int j = itr ; j > 0 ; j--){
            if(isGreater(arr,j-1,j)){
                swap(arr,j-1,j);
            }else{
                break;
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

  // return true if jth element is greater than ith element
  public static boolean isGreater(int[] arr, int j, int i) {
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
    insertionSort(arr);
    print(arr);
  }

}

/*
#1.
wahi BS wala scene
kyunki har ek iteration me sorted array me 1 index judta jaata h(means sorted array ka size 1 se increase hota jaata h) to n-1 iteration me pura array sort ho jaayega

Logic :

Hum maanke chalte hai ki jo 1st element hai wo already sorted hai
aur apna kaam 2nd element se start krte hai isiliye j itr se start hai
to 1st iteration me hota ye hai ki hum 0th index wale element ko 1st index wale element se compare krte hai 
ki 0th wala(piche wala) 1st wale(aage wale) se bda hai ki nhi agr wo bda hua to swap kr dete hai agr bda nhi hota to break kr jaate hai
fir 2nd iteration me kaam start hota hai aur 1st wala 2nd index wale se compare hota hai 
aur agr 1st wala 2nd wale se bda mila to swapping hoti hai aur fir 1st wala firse 0th wale se compare hota hai aur fir agr 0th wala 1st wale se bda nikalta hai to unki swapping hoti hai agr bda nhi niklta to break kr jaate hai
aur agr 1st wala 2nd wale se bda nhi milta to break kr jaate hai aur fir 3rd iteration start hoti aur jab tak pura array sort nhi ho jaata tab tak ye chlta rehta hai

2nd for loop me j ko greater than 0 isiliye rkha hai kyunki hum comparision ke time already j-1 krke comparision kr rhe hai 
to jab j 1 hoga to us time 0th element bhi compare ho jaayega
Insertion sort is better than bubble and selection sort because isme break krne ka option hota hai jisse saare elements ko check krna isn't compulsory.
*/
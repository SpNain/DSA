import java.io.*;
import java.util.*;

public class Main {

  public static void selectionSort(int[] arr) {
 
    int n = arr.length;
    
    for(int itr = 1 ; itr <= n-1 ; itr++){  // [#1] 
        int minIdx = itr-1;                 // hum start karte hai 0 index se aur
                                            // usko ek ek karke uske aage bache hue element se check karte jaate hai
        for(int j = itr ; j < n ; j++){     // isiliye j ki value itr se start hai 
            if(isSmaller(arr,j,minIdx)){
                minIdx = j;
            }
        }
        
        swap(arr,itr-1,minIdx);
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
    selectionSort(arr);
    print(arr);
  }

}

/*
#1.
wahi BS wala scene
kyunki ek iteration me ek element sort ho jaata h to n element n-1 iteration me sort ho jaayenge


Logic :

Yha pe sorting hoti h select kr kr ke kyunki Hum ek iteration me ek index ko pkadte(select krte) h aur us index ko sort krte h

Hum ek index ko select krte hai(minIdx)(itr-1) aur uspe pdi value ko ek ek krke pure array ki values se compare krte hai
aur maanlo hume minIdx pe pdi value se chhoti value(if we are sorting in increasing order) mil jaati hai lets say x index pe
to hum minIdx joki filhaal itr-1 h usko update krke usme x daal dete hai 
aur aage comparision continue rkhte hai x index pe pdi value se chhoti value dundne ke liye
aur maanlo agr hume x index wali value se chhoti value mil gyi y index pe to fir minIdx me y daal dete h aur aise hi process chlta rehta h jb tak hume array me se sbse chhoti value ka index nhi mil jaata 
jab ek baar pure array ko traverse kr lete hai to hume sbse chhoti value jo h array me uska index mil jaata h
fir jo index suru me select kiya(itr-1) tha use aur jis index pe sbse chhoti value pdi hai (yani minIdx) pe swap krwa dete hai
aur fir next iteration me next wale index ko select krte h aur ye procedure continue rkhte hai jab tak pura array sort nhi ho jaata
*/
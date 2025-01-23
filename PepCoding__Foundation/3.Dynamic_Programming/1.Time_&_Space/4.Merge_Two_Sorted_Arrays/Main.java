import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
    int n1 = a.length;
    int n2 = b.length;
    int res[] = new int[n1 + n2];

    int i = 0, j = 0, k = 0;

    while (i < n1 && j < n2) {
      if (a[i] <= b[j]) {
        res[k] = a[i];
        i++;
        k++;
      } else if (a[i] > b[j]) {
        res[k] = b[j];
        j++;
        k++;
      }
    }

    while (i < n1) {
      res[k] = a[i];
      i++;
      k++;
    }

    while (j < n2) {
      res[k] = b[j];
      j++;
      k++;
    }

    return res;
  }

  public static void print(int[] arr) {
    for (int i = 0 ; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for (int i = 0 ; i < n; i++) {
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for (int i = 0 ; i < m; i++) {
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a, b);
    print(mergedArray);
  }

}

/*
Approach : 

Approach ye hai ki hum 2 pointer lete hai a,b,res ke liye
ab jab tak inke a ya fir b ka pointer resp lenght se chhota hai tab tak 
dono arrays me se values nikalo compare kro jiski value chhoti ho uski value ko res me rkhwa do 
aur unke pointer increase krdo
agr values brabar ho to kisi ki bhi values rkhwa do

jab inme se kisi ek ka pointer length-1 pe reach kr jaayega 
tab to ye while loop nhi chalega aur fir humne a aur b ke liye separate while loops lga rkhe hai
jisme values bchi hogi wo values sidhi res me rkhwa denge
aur last me res ko return krwa denge.
*/
import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int s = scn.nextInt();
    int r = scn.nextInt();

    rotateShell(arr, s, r);
    display(arr);
  }

  public static void rotateShell(int[][] arr, int s, int r) {
    int[] oned = fillOnedFromShell(arr, s);
    rotate(oned, r);
    fillShellFromOned(arr, s, oned);
  }

  public static void rotate(int[] oned, int r) {
    r = r % oned.length;
    if (r < 0) {
      r += oned.length;
    }

    reverse(oned, 0, oned.length - r - 1);
    reverse(oned, oned.length - r, oned.length - 1);
    reverse(oned, 0, oned.length - 1);
  }

  public static void reverse(int[] arr, int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public static int[] fillOnedFromShell(int[][] arr, int s) {
    int minr = s - 1;
    int minc = s - 1;
    int maxr = arr.length - s;
    int maxc = arr[0].length - s;
    int size = 2 * (maxr - minr) + 2 * (maxc - minc);
    int[] oned = new int[size];

    int index = 0;

    //lw 
    for (int i = minr, j = minc; i <= maxr; i++) {
        oned[index] = arr[i][j];
        index++;
    }
    
    //bw
    for (int i = maxr, j = minc + 1; j <= maxc; j++) {
        oned[index] = arr[i][j];
        index++;
    }

    //rw
    for (int i = maxr - 1, j = maxc; i >= minr; i--) {
        oned[index] = arr[i][j];
        index++;
    }

    //tw
    for (int i = minr, j = maxc - 1; j > minc; j--) {
      oned[index] = arr[i][j];
      index++;
    }

    return oned;
  }

  public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
    int minr = s - 1;
    int minc = s - 1;
    int maxr = arr.length - s;
    int maxc = arr[0].length - s;

    int index = 0;
    for (int i = minr, j = minc; i <= maxr; i++) {
      arr[i][j] = oned[index];
      index++;
    }

    for (int i = maxr, j = minc + 1; j <= maxc; j++) {
      arr[i][j] = oned[index];
      index++;
    }

    for (int i = maxr - 1, j = maxc; i >= minr; i--) {
      arr[i][j] = oned[index];
      index++;
    }

    for (int i = minr, j = maxc - 1; j > minc; j--) {
      arr[i][j] = oned[index];
      index++;
    }
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}


/*
Logic behind logic :

Dekho isme basically 3 steps hai 

1st - fill oned array form 2d array.
2nd - reverse that oned array using linear array reverse.
3rd - fill 2d array from that reversed oned array.


1st step :

-> hum minr,minc,maxr,maxc nikal lete hai in terms of s taki oned array ka size pta lga ske aur oned array ko fill krte time 2d array ke liye i aur j manage kiye 
aa ske.
-> ab hum size nikal lete hai oned ka aur ek oned array create krte hai 
-> aur fir us oned array ko left wall,bottom wall,right wall,top wall me i aur j ko manage krte hue fill kr dete hai

2nd step :

-> filled oned array ko linear array ko jaise reverse krte the waise hi reverse kr dete hai
   matlab reverse part one ,reverse part two and then reverse whole array.

3rd step :

-> is step me hum jaise oned ko 2d se fill kiya tha waise hi bas assigning positions change krke 2d array ko fill kr dete hai oned array se.
*/
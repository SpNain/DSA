import java.util.*;

//========== User's Code Starts Here ==========

class Solution {

    public static void rotate(int[] a, int k) {
        // write your code here

        int n = a.length;

        k = k % n; // effective rotation

        if (k < 0) {
            // -ve rotation -> +ve rotation number
            k = k + n;
        }

        // BRUTE FORCE METHOD TO ROTATE AN ARRAY
        for (int j = 0; j < k; j++) {
            int val = a[0];

            for (int i = 1; i < n; i++) {
                int temp = val;
                val = a[i];
                a[i] = temp;
            }
            a[0] = val;

        }
    }
}

// ========== User's Code Ends Here ==========

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        String n = sc.nextLine();
        Solution s = new Solution();
        String s_arr[] = n.split(" ");
        int arr[] = new int[s_arr.length];
        for (int i = 0; i < s_arr.length; i++) {
            arr[i] = Integer.parseInt(s_arr[i]);
        }
        int k = sc.nextInt();
        s.rotate(arr, k);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
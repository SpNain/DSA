import java.util.*;

public class Main {

    public static int solution(int[] arr) {

        // Step 1 : Create Hashmap in which we will store prefix sum and its first occurence
        HashMap < Integer, Integer > map = new HashMap < > (); //prefix sum vs it's first occ
        int ps = 0;
        int maxLen = 0;

        map.put(0, -1);

        // Step 2 : Iterate on array and find largest subarray with zero sum
        for (int i = 0; i < arr.length; i++) {
            ps += arr[i];

            if (!map.containsKey(ps)) {
                map.put(ps, i);
            } else {
                int len = i - map.get(ps);

                if (maxLen < len) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = Integer.parseInt(br.readLine());
        }

        int n2 = Integer.parseInt(br.readLine());
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = Integer.parseInt(br.readLine());
        }

        // Logic
        // Step 1 : create a map
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2 : iterate array 1 and fill map
        for (int ele : a1) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Step 3 : iterate array 2 and find common elements
        for (int ele : a2) {
            if (map.containsKey(ele) && map.get(ele) > 0) {
                // print
                System.out.println(ele);
                // decrease freq
                map.put(ele, map.get(ele) - 1);
            }
        }
    }
}
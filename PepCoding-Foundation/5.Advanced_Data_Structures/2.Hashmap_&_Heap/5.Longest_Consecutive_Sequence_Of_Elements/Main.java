import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
        //Sp Sol : Got TLE in some cases
        
        //Step 1 : Create hashmap and store unique values of array in hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int val : nums) {
            if (!hm.containsKey(val)) {
                hm.put(val, 1);
            }
        }
        
        // Step 2 : Iterate hashmap and find longest Sequence
        int longSeq = 0;
        for (int key : hm.keySet()) {
        
            int currSeq = 1;
        
            int val = key;
            while (hm.containsKey(val - 1)) {
                currSeq++;
                val = val - 1;
            }
        
            val = key;
            while (hm.containsKey(val + 1)) {
                currSeq++;
                val = val + 1;
            }
        
            if (currSeq > longSeq) {
                longSeq = currSeq;
            }
        }
        
        return longSeq;
        */

        /*========================================================================================*/

        //MB Sol : TC - O(n)

        // Step 1 : Create hashmap and store values of array in hashmap
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int val : nums) {
            hm.put(val, true);
        }

        // Step 2 : Distinguish worthy and unworthy starting points
        for (int key : hm.keySet()) {

            if (hm.containsKey(key - 1)) {
                hm.put(key, false);
            }
        }

        // Step 3 : Iterate hashmap and find longest Sequence
        int longSeq = 0;
        int sp = -1;

        for (int key : hm.keySet()) {

            if (hm.get(key)) {

                int currSeq = 1;
                while (hm.containsKey(key + currSeq)) {
                    currSeq++;
                }

                if (currSeq > longSeq) {
                    longSeq = currSeq;
                    sp = key;
                }
            }
        }

        // Step 4 : Prepare ans
        for (int i = 0; i < longSeq; i++) {
            System.out.println(sp + i);
        }

        /*
        // Sreesh Solution
        // Step 1 : Create hashmap and store values of array in hashmap
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int ele : arr) {
            map.put(ele,false);
        }
        
            
        
        // Step 2 : Distinguish worthy and unworthy starting points
        for(int key : map.keySet()){
            if(!(map.containsKey(key - 1)){
                map. put(key,true);
            }
        }

        // Step 3 : Iterate hashmap and find longest Sequence
        int longSeq = 0;
        int sp = -1;

        for (int key : hm.keySet()) {

            if (hm.get(key)) {

                int currSeq = 1;
                while (hm.containsKey(key + currSeq)) {
                    currSeq++;
                }

                if (currSeq > longSeq) {
                    longSeq = currSeq;
                    sp = key;
                }
            }
        }

        // Step 4 : Prepare ans
        for (int i = 0; i < longSeq; i++) {
            System.out.println(sp + i);
        }

        */
        // return longSeq;
    }
}


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 5;

        int[] arr = { 10, 19, 6, 5, 3 };
        
        
        int[] res = new int[n];
        
        for(int i = 0; i<arr.length; i++){
            res[i] = arr[i];
        }
        
        Arrays.sort(res);
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<res.length; i++){
            hm.put(res[i], i);
        }
        
        
        int i = 0;
        int val = arr[0];
        int count = 0;
        
        while (i < n) {
            
            int pos = hm.get(val);
            
            if(i==pos){
                i = (i+1)%n; // next element index
                val = arr[i]; // value  for next iteration
                continue; // taki value ghadbda na jaaye
            }
            
            int temp = arr[pos];
            arr[pos] = val;
            arr[i] = temp;
            
            count++;
            
            val = temp;
            
        }
        
        System.out.println(count);


    }
}
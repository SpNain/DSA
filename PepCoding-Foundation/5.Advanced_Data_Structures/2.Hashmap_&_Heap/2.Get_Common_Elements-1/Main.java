import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int idx = 0 ; idx < arr1.length ; idx++){
        arr1[idx] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int idx = 0 ; idx < arr2.length ; idx++){
        arr2[idx] = scn.nextInt();
    }
    
    // MB Solution
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    for (int v1 : arr1) {
        if(hm.containsKey(v1))
            hm.put(v1, hm.get(v1) + 1);
        else
            hm.put(v1, 1);
    }
    
    for (int v2 : arr2) {
        if (hm.containsKey(v2)) {
            System.out.println(v2);
            hm.remove(v2);
        }

        // agr bich me hi map khaali ho gya to aage wale element common ho hi nhi skte
        if (hm.size() == 0)
            break;
    }
    
    //Sreesh Solution
    HashSet<Integer> set = new HashSet<>();
    
    for (int ele : arr1) {
        set.add(ele);
    }
    
    for (int ele : arr2) {
        if (set.contains(ele)) {
            System.out.println(ele); // print
            set.remove(ele); // remove
        }
        
        // agr bich me hi set khaali ho gya to aage wale element common ho hi nhi skte
        if (set.size() == 0)
            break;
    }
 }

}
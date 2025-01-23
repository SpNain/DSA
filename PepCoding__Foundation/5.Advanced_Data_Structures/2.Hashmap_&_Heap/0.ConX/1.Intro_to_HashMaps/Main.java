import java.util.*;

public class hashmap {
    
    public static void demo() {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100000);
        map.put("Pakistan", 1000);
        map.put("UK", 1000);
        map.put("USA", 1500);
        map.put("China", 1700);
        map.put("SriLanka", 5000);
        
        System.out.println(map);
        map.put("India", 2700);

        System.out.println(map.size());

        System.out.println("India Check : " + map.containsKey("India"));
        System.out.println("London Check : " + map.containsKey("London"));
        
        System.out.println("India get : " + map.get("India"));
        System.out.println("London get : " + map.get("London"));

        System.out.println(map.keySet());

        for (String key : map.keySet()) {
            System.out.println("key : " + key + ", value : " + map.get(key));
        }
    }
    
    public static void main(String[] args) {
        demo();
    }
}
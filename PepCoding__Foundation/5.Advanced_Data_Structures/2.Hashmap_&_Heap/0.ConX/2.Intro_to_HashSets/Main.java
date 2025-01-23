import java.util.*;

public class hashset {
    
    public static void demo() {

        Hashset<String> set = new Hashset<>();

        set.add("India");
        set.add("Pakistan");
        set.add("UK");
        set.add("USA");
        set.add("China");
        set.add("SriLanka");
        
        System.out.println(set);
        
        System.out.println("India Find : " + set.contains("India"));
        System.out.println("London Find : " + set.contains("London"));
        
        set.remove("China");
        System.out.println(set);

        System.out.println("China Find : " + set.contains("China"));
    }
    
    public static void main(String[] args) {
        demo();
    }
}
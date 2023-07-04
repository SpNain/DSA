import java.util.*;

public class HashMapCode {
    
    // Hume HashMap naam ki class bnayi jisme <K,V> generics use kiya
    static class HashMap<K, V> {

        // Humne HashMap class ke andar ek aur class bnayi Node naam ki
        // Iss class me humne key ka type K rkha aur value ka type V
        // Hmari key aur value constructor ki help se set hongi
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N; // N - buckets

        // Humne ek array bnaya buckets naam ka jiksa type h LinkedList<Node> means linkedlist of type Node(class)
        private LinkedList<Node> buckets[]; // N = buckets.length

        // Kuch java ke versions me humne Linkedlist ka type btana pdta h jb bhi hum define krte h
        // To agr humne type nhi btaya to wo kuch warnings throw krta h
        // Un warning ko supress krne ke liye humne ye line likhi h
        @SuppressWarnings("unchecked")
        public HashMap() { // Constructor of HashMap class
            this.N = 4; // Define size of array
            this.buckets = new LinkedList[4]; // Create array

            // Array ke har ek index pe khaali linkedlist dlwa di
            // Why ? Agr humne khaali linkedlist nhi bnayi to data put kisme krenge
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        
        // Key pe hashCode() fxn chalaya
        // Aur bi ko absolute bnake aur 0 to N ki range me laake return kr diya
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        // Buckets me se linkedlist nikali using bi
        // Aur check kra ki hmari key konse wale node pe h aur fir us node ka index return kr diya
        // Agr key kahi nhi mili to -1 return kr denge last me
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }
            return -1;
        }

        // purana bucket store krwaya
        // new bucket bnaya bde size ka
        // new bucket me linkedlist initialize krwayi
        // purani bucket pe loop maara
        // aur har ek index pe se ll utahai
        // fir us linkedlist pe loop maara ko  
        // aur ek ek krke node nikali aur put(our fxn) ko call lgadi data bhejke
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            
            int bi = hashFunction(key);                 // Bucket index yani array me konse index pe h wo leke aaye
            int di = searchInLL(key, bi);               // Fir bucket index pe jo linkedlist pdi h unme se hmara data kis index pe h wo leke aaye
            
            if (di == -1) {
            
                // key doesn't exist -> Added new node
                // And increase n kyunki new node add hui h
                buckets[bi].add(new Node(key, value));
                n++;
            
            } else {

                // key exists -> Update existing node
                Node node = buckets[bi].get(di);
                node.value = value;

            }
            
            double lambda = (double) n / N;
            // Check whether ⋋ > thresold value or not. If yes ? Rehash.
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return false;
            } else { // key exists
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].remove(di);  // remove & store node
                n--;                                 // decrease size kyunki node minus hui h
                return node.value;                   // stored node ka use krke us node ki value ko return krdo
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        // keys naam ki arraylist bnai jiska type h K
        // buckets pe loop maara aur ek ek krke linkedlists nikali
        // linkedlists pe loop maara aur ek ek krke node nikali
        // node me se key nikal ke use keys arraylist me add krwa diya
        // last me keys arraylist ko return krwa diya
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) { // bi
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { // di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // agr hashmap me 1 bhi node nhi h that means ki hashmap khaali h
        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();  // here we are creating this hashmap using our class. This isn't inbuilt hashmap.
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}
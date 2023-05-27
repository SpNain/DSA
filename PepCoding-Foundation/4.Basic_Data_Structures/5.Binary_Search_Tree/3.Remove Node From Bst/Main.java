
import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  public static int max(Node node) {
    if (node.right == null) {
      return node.data;
    } else {
      return max(node.right);
    }
  }
  
  // Main logic : jis node ko hum remove karna chahte hai hume uski jagah wahi bhejna chahiye jo hum uski jagah lagana chahte hai
  public static Node remove(Node node, int data) {
    if (node == null) {  // agr jo node remove karne ke liye boli hai wo tree me exist hi nhi karti to uski jagah null return kar denge
      return null;
    }
    if (data < node.data) {   // data ko dhundne ka process
      node.left = remove(node.left, data);
      return node;
    } else if (data > node.data) {   // data ko dhundne ka process
      node.right = remove(node.right, data);
      return node;
    } else {   // data mil gya 
      if (node.left == null && node.right == null) { // leaf node
        return null;
      }
      // hume iss baat ki tension nhi leni ki kahi uska right/left bhi to null nhi hai kyunki agr uska right/left bhi null hota to wo if wale case me chala jata pahle hi aur idhar tak aata hi nhi
      else if (node.left == null) { // single child : right child exists 
        Node rep = node.right;   // rep : replacement
        node.right = null;
        return rep;
      } else if (node.right == null) { // single child : left child exists
        Node rep = node.left;
        node.left = null;
        return rep;
      } else { // both child exists
        int max = max(node.left);  // yaha pe hum node.right se bhi kar skte hai
        node.data = max;
        remove(node.left, max);  // yaha pe hum node.right se bhi kar skte hai // aur jab dobara se remove fxn chlega to iss case me aa hi nhi skta kyunki max ka ya to sirf left child hoga ya 0 child
        return node;            // uper wali line me humne node ko remove krne ke liye nhi bheja balki node.left ke max ko remove krne ke liye bheja hai kyunki node ke data me to hum already max rkhwa chuke hai to wo node to waise hi mit gyi hai ab uski jagah jise rkhwaya tha yani max usko remove krne ke liye bhejna pdega na
      }
    }

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    root = remove(root, data);

    display(root);
  }

}
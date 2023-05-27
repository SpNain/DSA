import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    // My logic
    // int myMax = node.data;
    // for(Node child : node.children){
    //     myMax = Math.max(myMax,max(child));
    // }
    // return myMax;
    
    //Sir logic
    int myMax = Integer.MIN_VALUE;

    for(Node child : node.children){
        myMax = Math.max(myMax,max(child)); // child se aane wale max ko compare karke apne myMax me store karwa lenge
    }

    myMax = Math.max(myMax, node.data);  // ab childs me se jo max hoga wo to aa gya lekin baad me khud ke data se bhi compare karne pdega 

    return myMax;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    int m = max(root);
    System.out.println(m);
    // display(root);
  }

}
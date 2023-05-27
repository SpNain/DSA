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
  //SM
  static class Pair{
      Node node;
      int state;
      
      Pair(Node node,int state){
          this.node = node;
          this.state = state;
      }
  }
  public static void IterativePreandPostOrder(Node node) {
    Stack<Pair> st = new Stack<>();
    st.push(new Pair(node,-1));
    
    String pre = "", post = "";
    
    while(st.size()>0){
        Pair top = st.peek();
        
        if(top.state == -1){ // pre area 
            pre += top.node.data+" "; // add in pre string
            top.state++;   // increase state
        }
        else if(top.state == top.node.children.size()){  // post area  
            post += top.node.data+" "; // add in post string 
            st.pop();  // pop out the top kyunki uska kaam ho gya hai uske saare child traverse kar liye hai
        }
        else{ // in btw
            Node child = top.node.children.get(top.state); // get relevant child Node 
            st.push(new Pair(child,-1)); // push in stack in Pair
            top.state++; // incraese the state
        }
    }
    System.out.println(pre+"\n"+post);
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
    IterativePreandPostOrder(root);
  }

}
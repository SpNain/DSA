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

  // Travel & Change method
  //Sp Nain -- Sir ka Code bhi almost same hi tha
  static int diaOfTree;
  public static int diameter1(Node node) {
    if (node == null) {
      return -1;
    }

    int diaOfNode = 0;
    int ht = -1;

    // Expectation and faith model 
    int lch = diameter1(node.left);
    int rch = diameter1(node.right);

    ht = Math.max(lch, rch);
    diaOfNode = lch + rch + 2;

    if (diaOfNode > diaOfTree) {
      diaOfTree = diaOfNode;
    }
    return ht + 1;
  }

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  }

//   //MB - 2nd Method without static use (T.C. = O(n^2))
//   public static int diameter2(Node node){
//       if(node == null){
//           return 0; //Note : returns 0 b/c returning diameter not heigth
//       }
//       // Expectation and faith model 
//       int ldia = diameter2(node.left);
//       int rdia = diameter2(node.right);

//       int lch = height(node.left);
//       int rch = height(node.right);

//       int diaOfNode = lch + rch + 2;

//       return Math.max(diaOfNode, Math.max(lch,rch));
//   }

  //MB - 3rd Method without static use (Optimized)
  public static class diaPair {  // isme pair class bna li hai taki hum ek saath do chije calc karke return kar ske aur code ki complexity ghat jaaye
    int ht, dia;

    diaPair(int ht, int dia) {
      this.ht = ht;
      this.dia = dia;
    }
  }
  public static diaPair diameter3(Node node) {
    if (node == null) {
      return new diaPair(-1, 0); // -1 for ht and 0 for dia
    }
    // Expectation and faith model
    diaPair lpair = diameter3(node.left);
    diaPair rpair = diameter3(node.right);

    // hume jo jo return karna hai hum idhar wo wo calc kar lete hai i mean ht and diaOfTree
    // ab diaOfTree ke liye diaOfNode bhi chahiye tha to wo bhi nikala 
    int ht = Math.max(lpair.ht, rpair.ht) + 1;
    int diaOfNode = lpair.ht + rpair.ht + 2;
    int diaOfTree = Math.max(diaOfNode, Math.max(lpair.dia, rpair.dia));

    return new diaPair(ht, diaOfTree);
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

    Node root = construct(arr);

    // diaOfTree = 0; // static variables ko use karne se pahle hmesha initialize karna chahiye
    // diameter1(root); // returns height
    // System.out.println(diaOfTree); // but we have to print diameter

    // System.out.println(diameter2(root));// returns diameter
    diaPair res = diameter3(root);
    System.out.println(res.dia);
  }

}

//Tip : iss type ke questions me hum find karte hai ki hum apna ans nikalne ke liye kya kya chahiye aur unko nikalne ke liye bhi kya kya chahiye
// e.g. : jaise iss question me humara aim diameter nikalna tha lekin usko calc karne ke liye hum node ka diameter bhi chahiye hoga aur node ka diameter nikalne ke liye hum ht bhi chahiye hogi 
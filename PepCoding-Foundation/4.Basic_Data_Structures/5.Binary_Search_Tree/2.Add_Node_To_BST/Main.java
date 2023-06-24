
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
//   //Sp Nain
//   public static Node add(Node node, int data) {
//     if (node.left == null && node.right == null) {
//       if (data < node.data) {
//         Node newNode = new Node(data, null, null);
//         node.left = newNode;
//         return node;
//       }
//       else {
//         Node newNode = new Node(data, null, null);
//         node.right = newNode;
//         return node;
//       }
//     }
//     if (data < node.data) {
//       node.left = add(node.left, data);
//       return node;
//     }
//     else {
//       node.right = add(node.right, data);
//       return node;
//     }
//   }

  //MB
  public static Node add(Node node, int data) {
    if (node == null) {
      Node newnode = new Node(data, null, null);
      return newnode;
    }

    if (data == node.data) {
      return node;
    } else if (data > node.data) {
      node.right = add(node.right, data);
      return node;
    } else {
      node.left = add(node.left, data);
      return node;
    }
  }
 // Note : agr yaha pe last me else ki jagah else if lagaya hota to error show hota "return statement missing"
 // kyunki compiler ke hisab se hum usme on condition basis pe jaayenge beshak hume condition lgake saare cases cover kar liye ho fir bhi usko return statement chahiye hi hoga
 // lekin jab hum else lga dete hai to usme bina condition ke entry hogi to compiler ke hisab se saare cases handle honnge to return statement ki jrurat nhi hogi

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
    root = add(root, data);

    display(root);
  }

}
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
    // // Sir approach
    // public static boolean find(Node node, int data) {
    //     // agr usi node ka data match ho gya to aage kaam krne ki jrurat nhi hogi
    //     if (node.data == data) {
    //         return true;
    //     }

    //     for (Node child : node.children) {
    //         boolean res = find(child, data);
    //         if (res) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    // My appraoch
    static int count = 0;

    public static boolean find(Node node, int data) {
        // agr usi node ka data match ho gya to aage kaam krne ki jrurat nhi hogi
        if (node.data == data) {
            count++;
            return true;
        }

        for (Node child : node.children) {
            // hum node ke child ke data ko pahle hi compare kr lenge aur agr data mil gya
            // usi true return kar denge
            if (child.data == data) {
                return true;
            }
            count++;
            // hum aage call tabhi lagyenge jab child ke aage child honge kyonki agr uske
            // aage child nhi hai to us child ka data to humne pahle hi compare kr liya hai
            if (child.children.size() > 0) {
                boolean res = find(child, data);
                if (res) {
                    return true;
                }
            }
        }
        count++;
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        int data = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        boolean flag = find(root, data);
        System.out.println(flag);
        // display(root);
    }

}
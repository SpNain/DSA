import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class GenericTree{
    public static class Node{
        int data;
        ArrayList<Node> children;
    
        Node(){
            children = new ArrayList<>();
        }
        Node(int val){
            data = val;
            children = new ArrayList<>();
        }
    }

    public static Node construct(int input[]){
        Node root = new Node(input[0]);

        Stack<Node> st = new Stack<>();
        st.push(root);

        for(int i = 1 ; i < input.length ; i++){
            if(input[i] == -1){
                st.pop();
            }else{
                Node newNode = new Node(input[i]);
                st.peek().children.add(newNode);
                st.push(newNode);
            }
        }

        return root;
    }

    public static void display(Node node){
        System.out.print(node.data +" -> " );
        for(Node child : node.children){
            System.out.print(child.data+" ");
        }
        System.out.println();

        for(Node child : node.children){
            display(child);
        }
    }

    public static int size(Node node){
        int res = 0;
        for(Node child : node.children){
            res += size(child);
        }

        res += 1;

        return res;
    }

    public static int max(Node node) {
        int myMax = Integer.MIN_VALUE;

        for(Node child : node.children){
            myMax = Math.max(myMax,max(child));
        }

        myMax = Math.max(myMax, node.data);

        return myMax;
    }

    public static int height(Node node) {
        // int ht = 0; // on the basis of nodes
        int ht = -1; // on the basis of edges
        
        for(Node child : node.children){
            ht = Math.max(ht,height(child));
        }
        
        return ht+1;
    }

    public static int sum(Node node){
        int res = 0;
        for(Node child : node.children){
            res += sum(child);
        }

        res += node.data;

        return res;
    }
    static int size , sum , max , min;
    public static void multiSolver(Node node){
        size++;
        sum += node.data;
        max = Math.max(max,node.data);
        min = Math.min(min,node.data);

        for(Node child : node.children){
            multiSolver(child);
        }
    }

    
    public static void main(String[] args) {
        int input[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = construct(input);

        // System.out.println(size(root));

        // size = 0;
        // sum = 0;
        // max = Integer.MIN_VALUE;
        // min = Integer.MAX_VALUE;
        // multiSolver(root);
        // System.out.println("Size : "+size);
        // System.out.println("sum : "+sum);
        // System.out.println("max : "+max);
        // System.out.println("min : "+min);
        
    }
}
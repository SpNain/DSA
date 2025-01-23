import java.util.Stack;

public class Main {
    public static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
        }
    }

    public static class Pair{ // we construct this pair class so that we can push two things on stack in group
        Node node;
        int state;
        Pair(Node node){  // Pair class parameterized constructor.
            this.node = node;
            this.state = 0;
        }
    }
    public static Node construct(Integer input[]){
        if(input.length == 0){
            return null;
        }
        Node root = new Node(input[0]);  // create a new node which is root 

        Stack<Pair> st = new Stack<>();    
        st.push(new Pair(root));  // make root node a pair so that we can have both node and state
        int idx = 1;
        while(st.size() > 0){
            Pair top = st.peek();  // note : stack me pair push kiya hai isisliye top pair type ka hoga

            if(top.state == 0){ // 0 child processed
                Integer val = input[idx++]; // post increament : pahle idx se val nikal li fir usko increase kiya : note value integer type ki hogi
                if(val != null){
                    Node newNode = new Node(val); // val se nyi node bnayi
                    top.node.left = newNode;    // usko left child set kiya kyunki abhi tak 1 bhi child process nhi hua tha
                    st.push(new Pair(newNode)); // pair bnake stack me push kar diya
                }
                top.state++;
            }else if(top.state == 1){ // 1 child processed
                Integer val = input[idx++];
                if(val != null){
                    Node newNode = new Node(val);
                    top.node.right = newNode;  // newNode ko right child set kiya kyunki abhi tak 1 child process hua tha
                    st.push(new Pair(newNode));
                }
                top.state++;
            }else{   // 2 child processed
                // top.state == 2
                st.pop();
            }
        }
        return root;
    }

    public static void display(Node node){  // we use expectation faith model
        if(node == null){  // agr node hi null hui to kuch nhi karna 
            return;
        }
        // ye apna kaam kiya
        System.out.print(node.left == null ? "." : node.left.data);
        System.out.print(" <- "+node.data+" -> ");
        System.out.println(node.right == null ? "." : node.right.data);

        // aur baaki childs pe chhod diya
        display(node.left);
        display(node.right);
    }
     public static void main(String[] args) {
         // Integer is refer to the wrapper class of int data type.
         // Here we use  Integer instead of int because int can't store null and we have to store null in the input array.
        Integer input[] = {10 , 20 , 40 , null , null , 50 ,80 , null , null , null , 30 , 60 , null , 90 , null , null , 70 , null , null};

        Node root = construct(input);

        display(root);
    }
}

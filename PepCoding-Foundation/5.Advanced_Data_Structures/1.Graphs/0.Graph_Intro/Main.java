import java.util.*;

public class Main {
    public static class Edge{ // class kyunki arraylist ke har ek idx pe ek se jayada values rkhwani hai
        int src,nbr,wt;
        Edge(int src,int nbr,int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void display(ArrayList<Edge>[] graph){
        int vtces = graph.length;
        for(int i = 0 ; i < vtces ; i++){
            ArrayList<Edge> list = graph[i];
            System.out.print(i+" -> ");  // yaha pe first vertice print ho jaayega 
            for(Edge e : list){
                System.out.print(e.nbr+" "); // yaha pe second vertices jo first vertice se connected hai
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);

        int vtces = scn.nextInt();
        int edges = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vtces];  // graph naam ka array jo arraylist type ka hai

        for(int i = 0 ; i < vtces ; i++){ // graph array ke har ek idx pe ek khaali arraylist pdi hogi
            graph[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < edges ; i++){
            int v1 = scn.nextInt();
            int v2 = scn.nextInt();
            int wt = scn.nextInt();

            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt)); 
        }  // kyunki humne input bidirectional graph ke hisab se li hai to dono vertices ki res. arraylist me jaake edge add karni pdegi

        display(graph);     
    }
}

// Note : humne graph ki har edge ko bidirectional assumne krke yeh code kiya hia 
// hum isi code ko directed graph ke liye bhi use kar skte hai bas hume input usi hisab se manage karna hoga


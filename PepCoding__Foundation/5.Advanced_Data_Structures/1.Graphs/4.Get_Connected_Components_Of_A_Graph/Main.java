import java.io.*;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.*;

public class Main {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    // Main logic : ek visited array rkh lenge jiske one by one karke har ek index pe jaayenge 
    // aur agr wo wala idx false hua to usko aur usse related saare neighbours ko arraylist me dalwa lenge 
   // jisko finally comps ke arraylist me dalwaka return kar denge
  public static ArrayList<ArrayList<Integer>> gcc(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        ArrayList<ArrayList<Integer>> allComps = new ArrayList<>();
        
        for(int vtx = 0 ; vtx < graph.length ; vtx++){
            if(!visited[vtx]){
                ArrayList<Integer> comp = new ArrayList<>();
                gccHelper(graph,vtx,comp,visited);
                
                allComps.add(comp); 
            }
        }
        
        return allComps;
    }
    
    public static void gccHelper(ArrayList<Edge>[] graph,int vtx,ArrayList<Integer> comp,boolean[] visited){
        visited[vtx] = true;
        comp.add(vtx);
        
        for(Edge e : graph[vtx]){
            if(!visited[e.nbr]){
                gccHelper(graph,e.nbr,comp,visited);
            }
        }
    }
    
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int vtces = Integer.parseInt(br.readLine());
    ArrayList<Edge>[] graph = new ArrayList[vtces];
    for (int i = 0; i < vtces; i++) {
      graph[i] = new ArrayList<>();
    }

    int edges = Integer.parseInt(br.readLine());
    for (int i = 0; i < edges; i++) {
      String[] parts = br.readLine().split(" ");
      int v1 = Integer.parseInt(parts[0]);
      int v2 = Integer.parseInt(parts[1]);
      int wt = Integer.parseInt(parts[2]);
      graph[v1].add(new Edge(v1, v2, wt));
      graph[v2].add(new Edge(v2, v1, wt));
    }

    ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

    // write your code here
    comps = gcc(graph);
    System.out.println(comps);
  }
}



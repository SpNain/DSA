import java.io.*;
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
  public static ArrayList<ArrayList<Integer>> gcc(ArrayList<Edge>[] graph) {
    boolean visited[] = new boolean[graph.length];
    ArrayList<ArrayList<Integer>> allComps = new ArrayList<>();

    for (int vtx = 0 ; vtx < graph.length ; vtx++) {
      if (!visited[vtx]) {
        ArrayList<Integer> comp = new ArrayList<>();
        gccHelper(graph, vtx, comp, visited);

        allComps.add(comp);
      }
    }

    return allComps;
  }

  public static void gccHelper(ArrayList<Edge>[] graph, int vtx, ArrayList<Integer> comp, boolean[] visited) {
    visited[vtx] = true;
    comp.add(vtx);

    for (Edge e : graph[vtx]) {
      if (!visited[e.nbr]) {
        gccHelper(graph, e.nbr, comp, visited);
      }
    }
  }
 //  Main logic : agr gcc se jo arraylist aa rhi h uska size 1 hota h to matlb saare appas me connected hai 
  public static boolean isGraphConnected(ArrayList<Edge>[] graph) {
    return gcc(graph).size() == 1;
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

    // write your code here
    System.out.println(isGraphConnected(graph));
  }
}
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

  public static void allPath(ArrayList<Edge>[] graph, int src, int dest) {
    boolean[] visited = new boolean[graph.length];
    allPathHelper(graph, src, visited, dest, "" + src);
  }

  public static void allPathHelper(ArrayList<Edge>[] graph, int vtx, boolean[] visited, int dest, String psf) {
    if (vtx == dest) {
      System.out.println(psf);
      return;
    }

    visited[vtx] = true;

    for (Edge e : graph[vtx]) {
      if (visited[e.nbr] == false) {
        allPathHelper(graph, e.nbr, visited, dest, psf + e.nbr);
      }
    }

    visited[vtx] = false;
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

    int src = Integer.parseInt(br.readLine());
    int dest = Integer.parseInt(br.readLine());

    // write all your codes here
    allPath(graph, src, dest);
  }
}

// Ye mostly has Path? ke jaisa hi hai bas isme thodi backtracking apply ho rhi
// hoti hai

// jab hum jaate hai to visited ko true mark karte chlte hai taki cyclic problem
// na occur ho
// jab hum ek path ko completely explore kar lete hai for aate wakt visited ko
// false mark karte chlte hai taki saare multiple paths ko explore kiya jaa ske

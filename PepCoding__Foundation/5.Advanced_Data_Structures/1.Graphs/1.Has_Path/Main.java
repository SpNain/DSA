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

  public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest) {
    boolean[] visited = new boolean[graph.length];
    return hasPathHelper(graph, src, visited, dest);
  }

  public static boolean hasPathHelper(ArrayList<Edge>[] graph, int vtx, boolean[] visited, int dest) {
    if (vtx == dest) {
      return true;
    }

    visited[vtx] = true;

    for (Edge e : graph[vtx]) {
      if (visited[e.nbr] == false) {
        boolean res = hasPathHelper(graph, e.nbr, visited, dest);

        if (res) {
          return true;
        }
      }
    }

    return false;
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

    System.out.println(hasPath(graph, src, dest));
  }

}

// hum ek visited type ka array bnate hai jisme hum jo jo edges ko visit kar
// liye hai unki info rkhte hai taki cyclic problem se bacha jaa ske

// agr vtx == dest ho jaata hai to iska matlab path mil gya hai true return kar
// dete hai

// graph[vtx] ek arraylist deta hai jiski hum ek ek karke edges nikalte hai aur
// edge me nbr ko check krte hai ki false hai ya true agr false hota hai to
// matlab visited nhi hai aur usko visit krte hai

// agr ek baar true mil gya to aage visit karne ki jrurat nhi hai aur wahi se
// return kardo true

// agr kahi bhi true nhi mila to last me false return kardo

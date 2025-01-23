import java.io.*;
import java.util.*;

public class Main {

  public static class Edge {
    int src, nbr, wt;
    Edge(int src, int nbr, int wt) {
      this.src = src;
      this.nbr = nbr;
      this.wt = wt;
    }
  }

  public static void main(String[] args) {
    Scanner  scn = new Scanner(System.in);

    int vtces = scn.nextInt();
    int edges = scn.nextInt();

    ArrayList<Edge>[] graph = new ArrayList[vtces];

    for (int i = 0 ; i < vtces ; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int i = 0 ; i < edges ; i++) {
      int v1 = scn.nextInt();
      int v2 = scn.nextInt();
      int wt = 0;

      graph[v1].add(new Edge(v1, v2, wt));
      graph[v2].add(new Edge(v2, v1, wt));
    }

    System.out.print(perfectFriends(graph));
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


  public static int perfectFriends(ArrayList<Edge>[] graph) {
    ArrayList<ArrayList<Integer>> allComps = gcc(graph);
    int ways = 0;
    for (int i = 0 ; i < allComps.size() ; i++) {
      for (int j = i + 1 ; j < allComps.size() ; j++) {
        ways += (allComps.get(i).size() * allComps.get(j).size());
      }
    }
    return ways;
  }

}



/*
Logic : A.B + A.C. + B.C 

input ke hisab se graph bna lo 
fir unke connected comps nikal to taki pta chal jaaye ki kon kon kis kis grp ko belong kar rha hai
uske baad mathematical formula create kra
formula logic : ek arraylist ke bnde uske aage wali arraylist ke bndo ke saath grp bna skte hai
Note ; yaha pe har ek list me se ek baar me 1 hi bnda choose karna tha to sirf sidha size likhne se kaam chal gya kyunki 2 bndo me se 1 bnde ko 2 trike se hi choose kiyo jaa skta hai - ya to uske 1st time choose karlo ya fir 2nd time
lekin agr ek saath ek se jyada bndo ko choose karna hota to hum permutation & combination ka use kar skte the.
*/







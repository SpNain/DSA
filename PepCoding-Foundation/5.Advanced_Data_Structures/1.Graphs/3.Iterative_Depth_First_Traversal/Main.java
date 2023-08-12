import java.io.*;
import java.util.*;

public class Main {
  static class Edge {
    int src;
    int nbr;

    Edge(int src, int nbr) {
      this.src = src;
      this.nbr = nbr;
    }
  }

  public static class DFSPair {
    int vtx;
    String psf;
    DFSPair(int vtx, String psf) {
      this.vtx = vtx;
      this.psf = psf;
    }
  }
  
  public static void dfsIter(ArrayList<Edge>[] graph, int src) {
    Stack<DFSPair> st = new Stack<>();
    st.push(new DFSPair(src, src + ""));
    boolean visited[] = new boolean[graph.length];

    while (st.size() > 0) {
      DFSPair tpair = st.pop();

      if (visited[tpair.vtx] == false) {  
        visited[tpair.vtx] = true;

        System.out.println(tpair.vtx + "@" + tpair.psf);

        for (Edge e : graph[tpair.vtx]) {
          if (visited[e.nbr] == false) {
            st.push(new DFSPair(e.nbr, tpair.psf + e.nbr));
          }
        }
      }
    }
  }
//Note :- agr visited nhi hai to hi kuch kaam hoga warna koi kaam nhi hoga

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
      graph[v1].add(new Edge(v1, v2));
      graph[v2].add(new Edge(v2, v1));
    }

    int src = Integer.parseInt(br.readLine());

    // write your code here
    dfsIter(graph, src);
  }
}


// Approach Theory

// sbse pahle stack bnao DFSPair type ki aur usme intially src aur uska path daal do pair bnake
// ab kaam kab tak karna hai - jab tak stack khaali nhi ho jaati
// ek pair nikala top se
// dekha wo visited nhi hai to uspe kaam hoga - agr visited hota to kuch nhi hota
// jaate hi sbse se pahle visited true mark kiya aur usko print kar diya
// ab dekha ki uski correspodance arraylist me kon kon pda hai yani uske nbrs kon kon hai
// jo jo nbrs unvisited the unko stack me pair bnake daal diya


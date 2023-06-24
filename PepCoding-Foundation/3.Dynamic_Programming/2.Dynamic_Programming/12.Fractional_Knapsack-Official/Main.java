import java.io.*;
import java.util.*;

public class Main {

  public static class Item implements Comparable<Item> {
    int vl, wt;
    Double vwr;

    // this - o : ins
    // o - this : dec
    public int compareTo(Item o) {
      if (o.vwr < this.vwr) {
        return -1;
      } else if (o.vwr == this.vwr) {
        return 0;
      } else {
        return 1;
      }
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int vls[] = new int[n];
    for (int i = 0 ; i < n ; i++)
      vls[i] = scn.nextInt();

    int wts[] = new int[n];
    for (int i = 0 ; i < n ; i++)
      wts[i] = scn.nextInt();

    int cap = scn.nextInt();

    // logic

    Item items[] = new Item[n];

    for (int i = 0 ; i < n ; i++) {
      items[i] = new Item();
      items[i].vl = vls[i];
      items[i].wt = wts[i];
      items[i].vwr = (vls[i] * 1.0) / wts[i];
    }

    Arrays.sort(items);

    int idx = 0 ;
    double tval = 0.0;
    while (idx < n && cap != 0) {
      if (items[idx].wt <= cap) {
        cap -= items[idx].wt;
        tval += items[idx].vl;
        idx++;
      } else {
        tval += cap * items[idx].vwr;
        cap = 0;
      }
    }
    System.out.println(tval);
  }
}
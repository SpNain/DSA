import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    // logic
    int f = 1, s = 1;

    for (int i = 2 ; i <= n ; i++) {
      int t = (i - 1) * f + (s);

      f = s;
      s = t;
    }

    System.out.println(s);
  }

}
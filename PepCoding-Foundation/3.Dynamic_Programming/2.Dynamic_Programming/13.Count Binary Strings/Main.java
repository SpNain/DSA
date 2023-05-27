import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int oSEW0 = 1, oSEW1 = 1;

    for (int i = 2 ; i <= n ; i++) {
      int nSEW0 = oSEW1;
      int nSEW1 = oSEW0 + oSEW1;

      oSEW0 = nSEW0;
      oSEW1 = nSEW1;
    }

    System.out.println(oSEW0 + oSEW1);
  }

}
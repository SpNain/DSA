// check pep submission history of marks 5 and find what mistake are you doing

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

      int ob=1;
      int os=1;
      
      for(int i=2;i<=n;i++){
          
         int nb=os;
         int ns=os+ob;
         
         os=ns;
         ob=nb;
      }
      
      long tways=os+ob;
      long bothSideWays = tways*tways;
      System.out.println(bothSideWays);
      
   }

}
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code

        int n = scn.nextInt();

        int spc = 2 * n - 3;

        for (int r = 1; r <= n; r++) {

            //print left values
            int lv = 1;
            for (int c = 1; c <= r; c++) {  // agr ek side ki dekhe to jow row no. utni hi values us row me hai 
                System.out.print(lv + "\t");
                lv++;
            }

            //print spaces
            for (int c = 1; c <= spc; c++) {
                System.out.print("\t");
            }

            //print right values
            int rcnt = (r == n) ? r - 1 : r; //rcnt = row count matlab row me kitni values hai //kyonki last line me right values r-1 se start hai 
            int rv = rcnt;  // row value ko hum rcnt se start krte hai kyunki humne rcnt ko iss trike se manage kiya hai ki wo last wali row ko chhodke baki rows ke liye usi row no. ke equal hoga, jisko hum decreasing order me fir print kar denge
            for (int c = 1; c <= rcnt; c++) {
                System.out.print(rv + "\t");
                rv--;
            }
            System.out.println();
            spc -= 2;
        }
    }
}

/*

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // Sp Nain Code - In 1st Revision

     int n = scn.nextInt();
     
     int valc = 2;
     int val = 1;
     int spc = 2*n-3;
     
     for(int r = 1; r<=n; r++){
         
        // left values
         for(int c = 1; c<=valc/2; c++){
             System.out.print(val+"\t");
             val++;
         }
         
         // spaces
         for(int c = 1; c<=spc; c++){
             System.out.print("\t");
         }

         // middle one value for last row
         if(r==n){
             System.out.print(n+"\t");
         }

         // right values
         for(int c = 1; c<=valc/2; c++){
             val--;
             System.out.print(val+"\t");
         }
         
         System.out.println();
         
         if(r!=n-1){  // har ek row usse agle wali row ke liye spaces aur values counts set krti hai to last row ke liye usse just pahle wali row wo kaam kregi
             spc-=2;
             valc+=2;
         }
         else{
             spc--;
             valc++; // agr hum ise nhi bhi bdayenge to bhi chalega kyunki humne us valc ke kiye pahle hi code likh liya hai bich me 
                     // to humne last me technically n-1 wale jitne hi values print krne hai (12 in this case) jiska valc n-2 ne pahle se hi set kr diya tha kyunki har ek row usse next wali row ke liye parameters set karti hai
         }
     }

 }
}

*/

/* Same uper wala hi logic h bas thoda code me change h

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int valc = 1;
        int spc = 2 * n - 3;

        for (int r = 1; r <= n; r++) {

            int val = 1;
            
            for (int c = 1; c <= valc; c++) {
                System.out.print(val++ + "\t");
            }
            for (int c = 1; c <= spc; c++) {
                System.out.print("\t");
            }
            if (r == n) {
                System.out.print(n + "\t");
            }
            for (int c = 1; c <= valc; c++) {
                System.out.print(--val + "\t");
            }

            System.out.println();

            spc -= 2;
            if (r != n - 1)
                valc++;
        }

    }
}
*/
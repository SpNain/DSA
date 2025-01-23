import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code

        int n = scn.nextInt();

        int rstc = 1;

        for (int r = 1; r <= n; r++) {

            //print spaces
            int spc = (r == (n + 1) / 2) ? 0 : n / 2;
            for (int c = 1; c <= spc; c++) {
                System.out.print("\t");
            }

            //print left stars
            int lstc = (r == (n + 1) / 2) ? n / 2 : 0;
            for (int c = 1; c <= lstc; c++) {
                System.out.print("*\t");
            }

            //print right stars
            for (int c = 1; c <= rstc; c++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (r <= n / 2) {
                rstc++;
            } else {
                rstc--;
            }

        }
    }
}

/*

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Sp Nain Code - 1st Revision
        int n = scn.nextInt();
        int spc = n/2;
        int rstc = 1;
        for(int r = 1; r<=n; r++){
            
            // print left spaces and stars
            for(int c = 1; c<= spc; c++){
                if(r==(n+1)/2){
                    System.out.print("*\t");;
                }
                else{
                    System.out.print("\t");
                }
            }
            
            // print right stars
            for(int c = 1; c<=rstc; c++){
                System.out.print("*\t");
            }

            System.out.println();
            if(r<=n/2){
                rstc++;   
            }
            else{
                rstc--;
            }
        }

    }
}

*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code
        // Method 1. spc&str method

        int n = scn.nextInt();

        //1. Row spilitting(work)

        int spc = 0;
        int str = n;

        for(int r =1 ; r <= n; r++)
        {
            //print spaces
            for(int c = 1; c <= spc; c++)
            {
                System.out.print("	");
            }
            //print stars
            for(int c = 1; c <=str; c++)
            {
                System.out.print("*	");
            }
            System.out.println();
            spc++;
            str--;
        }

    }
}

//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//
//        // Manisha Ka code
//        // Method 2.Row Coloumn Relation theory
//
//        int n = scn.nextInt();
//
//        for(int r =1 ; r <= n; r++)
//        {
//
//            for(int c = 1; c <= n; c++)
//            {
//                if(r<=c)
//                {
//                    System.out.print("*	");
//                }
//
//                else if(r>c)
//                {
//                    System.out.print("	");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}


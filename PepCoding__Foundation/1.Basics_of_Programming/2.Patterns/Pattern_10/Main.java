import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code
        // Method : Row Coloumn Relation theory

        int n = scn.nextInt();

        for (int r = 1 ; r <= n; r++)
        {

            for (int c = 1; c <= n; c++)
            {
                if ((r + c == (n + 3) / 2) || (c - r == (n - 1) / 2) || (r + c == (3 * n + 1) / 2) || (r - c == (n - 1) / 2))
                {
                    System.out.print("*	");
                }

                else
                {
                    System.out.print("	");
                }
            }
            System.out.println();
        }

    }
}


//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//
//        // Manisha Ka code
//        //Method: str&spc theory
//        int n = scn.nextInt();
//
//        //1. Row spilitting(work)
//
//        int lspc = n / 2;
//        int mspc = -1;  // why -1? ans : by analization agr hum ise -1 rkhe to hmesha +2 kr skenge
//
//        for (int r = 1 ; r <= n; r++)
//        {
//            //print left spaces
//            for (int c = 1; c <= lspc; c++)
//            {
//                System.out.print("	");
//            }
//
//            //print left star
//            System.out.print("*	");
//
//            //print middle spaces
//            for (int c = 1; c <= mspc; c++)
//            {
//                System.out.print("	");
//            }
//            //print right star
//            if (r != 1 && r != n)
//            {
//                System.out.print("*	");
//            }
//
//            System.out.println();
//
//            if (r <= n / 2)
//            {
//                lspc--;
//                mspc += 2;
//            }
//            else
//            {
//                lspc++;
//                mspc -= 2;
//            }
//        }
//    }
//}

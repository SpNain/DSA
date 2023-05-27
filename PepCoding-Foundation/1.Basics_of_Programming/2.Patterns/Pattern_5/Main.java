import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code
        // Method 1. spc&str method

        int n = scn.nextInt();

        //1. Row spilitting(work)
        
        int spc = n / 2;
        int str = 1;

        for (int r = 1 ; r <= n; r++)
        {
            //print spaces
            for (int c = 1; c <= spc; c++)
            {
                System.out.print("	");
            }
            //print stars
            for (int c = 1; c <= str; c++)
            {
                System.out.print("*	");
            }
            
            System.out.println();

            //Note : yaha pe ye code next lines ke liye space aur stars ko set kar rhe hai naki khud ki line ke space aur stars ko
            if (r <= n / 2)
            {
                spc--;
                str += 2;
            }
            else if (r > n / 2)
            {   spc++;
                str -= 2;
            }

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
//        // Method 2.Row Coloumn Relation theory
//
//        int n = scn.nextInt();
//
//        for (int r = 1 ; r <= n; r++)
//        {
//
//            for (int c = 1; c <= n; c++)
//            {
//                if ((r + c < (n + 3) / 2) || (c - r > (n - 1) / 2) || (r + c > (3 * n + 1) / 2) || (r - c > (n - 1) / 2))
//                {
//                    System.out.print("	");
//                }
//
//                else
//                {
//                    System.out.print("*	");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}




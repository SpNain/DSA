import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code
        // Method 1. spc&str method

        int n = scn.nextInt();

        //1. Row spilitting(work)

        int spc = 1;
        int str = (n + 1) / 2;

        for (int r = 1 ; r <= n; r++)
        {
            //print left stars
            for (int c = 1; c <= str; c++)
            {
                System.out.print("*	");
            }
            //print spaces
            for (int c = 1; c <= spc; c++)
            {
                System.out.print("	");
            }
            //print right stars
            for (int c = 1; c <= str; c++)
            {
                System.out.print("*	");
            }
            System.out.println();
            if (r <= n / 2)
            {
                str--;
                spc += 2;
            }
            else if (r > n / 2)
            {
                str++;
                spc -= 2;
            }

        }
    }
}

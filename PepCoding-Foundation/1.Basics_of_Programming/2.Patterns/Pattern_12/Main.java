import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        int a = 0;
        int b = 1;

        for (int r = 1; r <= n; r++)
        {
            for (int i = 1; i <= r; i++)  // c replaced with i b/c c is used in fb series.
            {
                System.out.print(a + "	");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}

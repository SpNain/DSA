import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int num = 1;  //number intialization

        for (int r = 1; r <= n; r++)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print(num + "	"); // 	 for spcaes btw num.
                num++;
            }
            System.out.println();
        }

    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Manisha ka code
        int n = scn.nextInt();
        for(int r= 1; r<=n; r++)
        {
            for(int c=n; c>= r; c--)
            {
                System.out.print("*	");
            }
            System.out.println();
        }
    }
}
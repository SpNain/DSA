import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Manisha ka code

        int n = scn.nextInt();
        for(int r = 1; r<=n; r++)  // jitni rows print krni h
        {
            for(int c = 1; c<=r; c++)  // hr row me kitne stars print krne hai
            {
                System.out.print("*	");
            }
            System.out.println();
        }

    }
}

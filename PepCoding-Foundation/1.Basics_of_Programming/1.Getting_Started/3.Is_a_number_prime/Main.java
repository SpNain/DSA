import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int count = 0; // we can take boolean variable also -- boolean isPrime = true;
            for (int j = 2; j * j <= n; j++) {

                if (n % j == 0) {
                    count++; // isPrime = false;
                    break;
                }
            }
            if (count == 0) // if(isPrime == true)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
    }
}
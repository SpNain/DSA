import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 10;

        // // Edge cases
        // if(n == 0 || n == 1 || n == 2){
        //     System.out.println(0);
        // }
        // else if(n == 3){
        //     System.out.println(1);
        // }

        int countPrimes = 0;
        for (int num = 2; num < n; num++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= num; j++) {

                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) // agr num prime h to countPrimes ko increase krdo
                countPrimes++;
        }
        
        System.out.println(countPrimes);


    }
}
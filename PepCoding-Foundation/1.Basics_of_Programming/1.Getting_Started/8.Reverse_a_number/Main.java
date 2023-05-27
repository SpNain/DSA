import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rd = 0;
        while (n != 0)
        {
            rd = n % 10;
            System.out.println(rd);
            n = n / 10;
        }
    }
}

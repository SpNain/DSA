import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();   // number jiska table print karna hai
        int m = scn.nextInt();   // number upto which table is to be printed
        for (int i = 1; i <= m; i++) {
            int result = n * i;
            System.out.print(n + " * " + i + " = " + result);
            System.out.println();
        }
    }
}
    
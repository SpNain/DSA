import java.util.*;

public class Main {

    public static void main(String[] args) {

        //BETTER OPTIMIZED CODE -- Mansiha Pawar

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fv = 0, in = 0;
        while (n != 0) {
            int rd = n % 10;
            fv++;
            in = in + fv * (int) (Math.pow(10, rd - 1));
            n = n / 10;
        }
        System.out.println(in);
    }

}

/*
LESS OPTIMIZED CODE - Sp Nain

Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int x = 0, pow = 1, in = 0,i=0;
while (n != 0)
{   x = n % 10;
    i++;
    for (int j = 1; j < x; j++)
    {
        pow = pow * 10;
    }
    in = in + (i * pow);
    n = n / 10;
    pow = 1;

}
System.out.println(in);

*/
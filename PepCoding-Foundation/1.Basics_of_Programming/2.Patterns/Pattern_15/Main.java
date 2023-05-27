import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code

        int n = scn.nextInt();

        int valc = 1;                         //valc represent ki ek row me kitni values print hogi
        int spc = n / 2;
        int rstr = 1;                         // rstr represents ki row kis value se start hogi

        for (int r = 1 ; r <= n; r++)
        {

            //print spaces
            for (int c = 1; c <= spc; c++)
            {
                System.out.print("\t");
            }

            //print values
            int val = rstr;                      
            for (int c = 1; c <= valc; c++)
            {
                System.out.print(val + "\t");

                if(c<= valc/2)                   //kyunki jitni values us column me aa skti h, uski addhe tk to val bdti h aur baad km hone lg jaati hai 
                {
                    val++;
                }
                else
                {
                    val--;
                }
            }
            System.out.println();
            if (r <= n / 2)
            {
                spc--;
                valc+=2;
                rstr++; // kyunki row ki starting value aadhe rows tk to bdti h uske baad ghat ti h
            }
            else if (r > n / 2)
            {   spc++;
                valc-=2;
                rstr--;
            }

        }
    }
}


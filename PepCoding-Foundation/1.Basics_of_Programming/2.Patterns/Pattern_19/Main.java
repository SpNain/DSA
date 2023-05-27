import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int  n = scn.nextInt();

        for (int r = 1; r<=n; r++ )
        {
            for(int c=1;c<=n; c++)
            {
                if((r==(n+1)/2) || (c==(n+1)/2) || (c==1&&r>(n+1)/2) || (c==n&&r<(n+1)/2) || (r==1&&c<(n+1)/2) || (r==n&&c>(n+1)/2))
                    System.out.print("*\t");
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

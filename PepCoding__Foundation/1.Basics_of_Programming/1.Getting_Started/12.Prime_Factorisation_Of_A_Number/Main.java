import java.util.*;

public class Main{

    public static void main(String[] args) {
        // write your code here
        //Sp Nain -- Optimzed code
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div=2;
        while(div*div<=n)  // kynki prime ke case me n!=1 condition me code bhut kharab complexity dega
        {
            while(n%div==0)
            {
                n=n/div;
                System.out.print(div+" ");

            }
            div++;
        }
        if(n!=1) System.out.print(n);  // agr while(n!=1) hai to yaha pe ye line nhi aayegi
    }
}

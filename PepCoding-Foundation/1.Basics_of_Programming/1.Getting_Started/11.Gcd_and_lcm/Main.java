import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int gcd = 0;
        int divisior = n1;
        int dividend = n2;

        // Method 1
        int remainder = 1;
        while (remainder != 0)
        {
            remainder = dividend % divisior;
            dividend = divisior;
            divisior = remainder;
        }
        gcd = dividend;

        // Method 2
        // while(dividend%divisior!=0)
        // {
        //     int remainder = dividend % divisior;
        //     dividend = divisior;
        //     divisior = remainder;
        // }
        // gcd = divisior; // b/c in this case condition check first and fail thats why last iteration not hapened.

        int lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}

/* LESS OPTIMIZED APPROACH 

int num = Math.min(n1,n2);

if(n1%div == 0 && n2%div == 0){
    gcd = div;
}
else{
    for(int div = num/2; div>=2; div--){
        if(n1%div== 0 && n2 % div == 0){
            gcd = div;
            break;
        }
    }
}
System.out.println(div);   // gcd
System.out.println(n1*n2/div); // lcm

*/
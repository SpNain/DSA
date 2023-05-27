import java.util.*;

public class Main{

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int d = 0,temp=n; // temp = kyonki agr hum original number ko hi divide kr denge to baad me uska use bhi to krna hai
        while(temp!=0)
        {
            d++;
            temp=temp/10;
        }

        int pow = 1, i = 0;
        while(i<(d-1))
        {
            pow=pow*10;
            i++;
        }
        int x=0;
        while(d/*pow*/!=0)
        {
            x=n/pow;   // yha pe hue use ki baat kar rha tha
            n=n%pow;
            System.out.println(x);
            pow=pow/10;
            d--;

        }


    }
}
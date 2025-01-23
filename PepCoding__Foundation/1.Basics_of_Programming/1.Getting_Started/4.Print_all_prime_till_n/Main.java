import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(;low<=high;low++)
        {
            int count=0;
            for(int i=2;i*i<=low;i++)  
            {

                if(low%i==0)
                {   count++;
                    break;
                }

            }
            if(count==0)
                System.out.println(low);
        }
    }
}
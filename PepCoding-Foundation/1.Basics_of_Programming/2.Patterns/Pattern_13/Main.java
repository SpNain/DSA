import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            //Manisha ka Code
            Scanner scn= new Scanner(System.in);

            int n = scn.nextInt();

            for(int i = 0; i<n; i++)
            {
                int val = 1;  //it is iC0
                for(int j = 0; j<= i; j++)
                {
                    System.out.print(val+"\t");
                    // Calcultion of iC(j+1) using iCj
                    val = val* (i-j)/(j+1);  //B/c nCr+1=nCr*(n-r)/(r+1) [#1]
                }
                System.out.println();
            }

        }
    }

// [#1]

// do not write this expression like this
// val = val* ((i-j)/(j+1));

// kyunki isse pahle integer division hoga 
// aur integer division 0 dega jisse pattern me jo num hum chahte h uski jagah 0 aa jaayega
// kyunki val*0 = 0.
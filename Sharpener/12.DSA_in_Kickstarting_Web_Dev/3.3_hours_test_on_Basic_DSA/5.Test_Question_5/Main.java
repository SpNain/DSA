import java.util.Scanner;

public class Main {
    

//========== User's Code Starts Here ==========

    public static int isDivisible(int num) {
        
        if(num%69 == 0) return 0; 
        else return 69-(num%69);
    }

//========== User's Code Ends Here ==========


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(isDivisible(num));

        scanner.close();
    }
}
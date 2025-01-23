/*
Yaha pe alag alag fibonacci ke code likhe hue hai ab unka matlab smjhte hai

fibonacci series : 0 1 1 2 3 5 8 

*/

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n + 1];
        int fibN = fibonacciM(n, dp);
        System.out.println(fibN);

    }

    /*
    ye wala normal code hai means isme recursion use nhi hai
    ye code for input n -> n number of fibonacci terms print krta hai 
    means for n = 6 -> iska output hoga : 0 1 1 2 3 5 (6 terms)
    */

    public static void normal(int n) {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;

        }
    }

    /*
    Iss code me recursion use hai isiliye 
    ye code for input n -> nth fibonacci term return krta hai 
    means for n = 6 -> iska output hoga 5 (6th term)
    kyunki humne base case n == 1 aur n == 2 ke liye lga rkha hai isiliye
    for n = 1 fibonacci term = 0
    for n = 2 fibonacci term = 1
    for n = 3 fibonacci term = 1
    for n = 4 fibonacci term = 2
    for n = 5 fibonacci term = 3
    for n = 6 fibonacci term = 5
    
    */
    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int fibNm1 = fib(n - 1);
        int fibNm2 = fib(n - 2);
        int fibN = fibNm1 + fibNm2;

        return fibN;
    }

    /*
    Iss code me recursion use hai isiliye 
    ye code for input n -> (n+1)th fibonacci term return krta hai 
    means for n = 6 -> iska output hoga 8 (7th term)
    kyunki humne base case n == 0 aur n == 1 ke liye lga rkha hai isiliye
    for n = 0 fibonacci term returned = 0
    for n = 1 fibonacci term returned = 1
    for n = 2 fibonacci term returned = 1
    for n = 3 fibonacci term returned = 2
    for n = 4 fibonacci term returned = 3
    for n = 5 fibonacci term returned = 5
    for n = 6 fibonacci term returned = 8
    
    */
    public static int fibonacciM(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return dp[n] = n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int fibNm1 = fibonacciM(n - 1, dp);
        int fibNm2 = fibonacciM(n - 2, dp);

        int fibN = fibNm1 + fibNm2;
        return dp[n] = fibN;

    }

    /*
    yha pe bhi fibonacciM wala hi logic hai 
    bas yaha pe hume i == 0 ke liye 0 aur i == 1 ke liye 1 lga rkha instead of n == 0 & n == 1
    */
    public static int fibonacciT(int n) {
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[0] = 0;// fib(0) = 0
            } else if (i == 1) {
                dp[1] = 1;// fib(1) = 1
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    /*
    
    ye code for input n -> (n+1)th fibonacci term return krta hai 
    means for n = 6 -> iska output hoga 8 (7th term)
    
    for i = 2 s = 1 
    for i = 3 s = 2 
    for i = 4 s = 3 
    for i = 5 s = 5
    for i = 6 s = 8 
    
    so 8 (7th term) return hogi
    
    
    */
    public static int fibonacciTOptimized(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f = 0, s = 1;
        for (int i = 2; i <= n; i++) {
            int t = f + s;
            f = s;
            s = t;
        }

        return s;
    }


    /*
    agr hum uper wale me f return krte to  n = 6 ke liye 5 (6th term) return hota
    ab dobut ye aa skta hai ki fbto me hum n ke brabar tak loop chla rhe hai aur normal wale me less than n tak 
    fir bhi dono me n = 6 ke liye 5 tak value jaati hai 
    iska reason ye hai ki jab normal wale me i ki value 4 hogi tab 3 print hoga
    aur jab fbto wale me i ki value 4 hogi tab f me 2 pda hoga 
    isiliye jab fbto ko equal tak chlaya jaata hai tab bhi wo 5 return krta hai
    */
}

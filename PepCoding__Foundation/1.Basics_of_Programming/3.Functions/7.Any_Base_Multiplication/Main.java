import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        // Manisha Ka Code
        int res = 0;
        int pow = 1;

        while (n2 > 0) {

            int d2 = n2 % 10;
            n2 = n2 / 10;

            int ans = singleDigitMult(d2, n1, b);
            res = anyBaseAddition(res, ans * pow, b);  // yha pe dhyan rkhna ki pow ko ans se multiply krke bhej rhe h aur res me sidha store krwa rhe h jo result aa rha h naki res me + krwa rhe h

            pow = pow * 10;

        }

        return res;
    }

    public static int anyBaseAddition(int n1, int n2, int b) {

        int ans = 0;
        int pow = 1;
        int carry = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = d1 + d2 + carry;
            int d = sum % b;
            carry = sum / b;

            ans += d * pow;
            pow = pow * 10;

        }

        return ans;
    }

    public static int singleDigitMult(int d2, int n1, int b) {

        int ans = 0;
        int pow = 1;
        int carry = 0;

        while (n1 > 0 || carry > 0) {

            int d1 = n1 % 10;

            n1 = n1 / 10;

            int mult = d1 * d2 + carry;
            int d = mult % b;
            carry = mult / b;

            ans += d * pow;

            pow = pow * 10;

        }

        return ans;

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = scn.nextInt();
        int rd = 0, rn = 0;
        while (n != 0) {
            rd = n % 10;
            rn = rn * 10 + rd;
            n = n / 10;
        }
    }
}

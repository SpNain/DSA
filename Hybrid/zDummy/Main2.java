// int sum =0;

// int n=5; // (you can take any number manually)

// for(int i=0;i<10;i=i+2)

// {

// if(i==n)

// {

// break;

// }

// sum =sum+i;

// }

// System.out.println(sum);

class Main{
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        int i = 0;
        System.out.println(printSum(sum, n, i));
    }

    public static int printSum(int sum, int n, int i){
        if (i == n || i >= 10) {
            return sum;
        }
        return printSum(sum + i, n, i + 2);
    }
}

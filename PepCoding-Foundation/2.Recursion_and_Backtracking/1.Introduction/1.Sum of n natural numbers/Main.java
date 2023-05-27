package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        // num = num -1;    agr number ko idhar minus kroge to sum n-1 ka print hoga kyunki tumhara function call se phale hi 1 baar no. already decrease ho rha hai
        int rres = sum(num - 1); // aur yaha pe num to vo iss fxn ke liye hai wahi hai lekin bs call decrease hoke lg rhi hai
        return (rres + num);
    }
}

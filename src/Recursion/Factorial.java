package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long ans = fact(input);
        System.out.println(input + "! is " + ans);
    }
    static long fact(long n){
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }
}

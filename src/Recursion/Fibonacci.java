package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long ans = fibo(input);
        System.out.println(ans);
    }
    static long fibo(long n){
        if(n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}

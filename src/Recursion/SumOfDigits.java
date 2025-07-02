package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ans = sum(input);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n <= 10) return n;
        return sum(n/10) + n % 10;
    }
}
/*
            Iterative Solution

            int getSum(int n){
                int res = 0;
                while(n >= 0){
                    res = res + n % 10;
                    n = n / 10;
                }
                return res;
            }

            Better Time Complexity
 */
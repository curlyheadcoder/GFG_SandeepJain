package Recursion;

public class indirectRecursion {
    public static void main(String[] args) {
        fun1(5);
    }
    static void fun1(int n){
        if(n <= 3) return;      // <------- Base Case
        System.out.println("Test");
        fun1(n-1);
    }
}

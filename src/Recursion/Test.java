package Recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println("Before fun2");
        fun2();
        System.out.println("After fun2");
    }
    static void fun1(){
        System.out.println("fun1");
    }
    static void fun2(){
        System.out.println("before fun2");
        fun1();
        System.out.println("After fun1");
    }
}

package com.bridgelabz.basics;

public class MethodDefsCalls {

    // methods
    // variables
    // blocks

    // method definitions or implementation
    static void m1(){
        System.out.println("m1()");
    }

    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }

    // JVM will call this main method
    public static void main(String[] args) {
        System.out.println("main()");
        m1(); // method call
        int addition = sum(6,8);
        System.out.println("Sum = " + addition); // Concatenation

    }
}

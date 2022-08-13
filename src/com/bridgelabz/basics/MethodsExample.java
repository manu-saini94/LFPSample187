package com.bridgelabz.basics;

// 2 Types of methods
// Static and Non-Static

// static keyword is used to create static methods
// static methods are class level methods.
// static methods will be accessed directly within the class
// static methods will be accessed by the class name outside the class.

// non-static methods are object level methods.
// non-static methods will be accessed using an object always.
public class MethodsExample {

    static int staticVar;

    int instanceVar;


    static void m1(){
        System.out.println("m1");
        MethodsExample obj1 = new MethodsExample();
        System.out.println(obj1.instanceVar);
    }

    void m2(){
        m1();
        System.out.println(staticVar);
        int instanceVar = 10;
        System.out.println("m2");
        System.out.println(instanceVar);
        System.out.println(this.instanceVar);
    }

    public static void main(String[] args) {
        m1();
        System.out.println(staticVar);
        MethodsExample obj1 = new MethodsExample();

        System.out.println(obj1.instanceVar);
        obj1.m2();

    // From the static context(static-methods) I cannot access non-static things directly , I need to create instance(Objects) to access
        // From the non-static context(non-static methods), I can access static things directly



    }
}

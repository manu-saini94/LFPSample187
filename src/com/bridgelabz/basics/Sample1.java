package com.bridgelabz.basics;

public class Sample1 {
    public static void main(String[] args) {
        System.out.println(VariablesTypes.staticVar);
        VariablesTypes obj1 = new VariablesTypes();
        System.out.println(obj1.instanceVar); // 0
        obj1.instanceVar = 20;
        System.out.println(obj1.instanceVar); // 20
        VariablesTypes obj2 = new VariablesTypes();
        System.out.println(obj2.instanceVar); // 0

        // We cannot access non-static method or non-static variable with class-name
        // We can access static methods and variables using an object also
        obj1.m2(5);
        VariablesTypes.m1(5);
        obj1.m1(9);
        System.out.println(obj1.staticVar);



    }
}

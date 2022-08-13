package com.bridgelabz.basics;

// 3 Variables Types
// Local , Instance , Static

// Local variables
// Variables declared within a method or a block
// Mandatory to initialize

// Static Variables
// These variables are declared using static keyword
// Static Variables are declared within the class and outside any of the methods
// It is not mandatory to initialize.
// If I am not inititalizing then default value will be assigned according to the data type.
// Class-level variable
// Static Variables will get the memory at the time of class loading.
// Static variable will have only one copy at the class level and this variable is shared throughout the class
// Within the same class I can access the static variable directly
// If I am outside the class, then I can access using class name

// Instance Variable
// These variables are declared without using static keyword
// Instance Variables are declared within the class and outside any of the methods
// It is not mandatory to initialize.
// If I am not inititalizing then default value will be assigned according to the data type.
// Object-level variable
// Instance Variables will get the memory when the object is created.
// Instance variable will have  one copy at the object level and this variable is not shared among the objects.
// Within the same class or outside the class I can access the instance variable using the object.


public class VariablesTypes {

    //static variable
    static int staticVar;   // 0

    // non-static variable or instance variable
    int instanceVar; // 0


// method definition
    static void m1(int x){
        System.out.println("m1()");
        System.out.println(x);
        System.out.println("before "+staticVar); // 0
        staticVar = 10;
        System.out.println("after "+staticVar); // 10

    }

    void m2(int y){
        System.out.println("****************************");
        System.out.println("m2");
        System.out.println(y);
        System.out.println(instanceVar);
    }


    public static void main(String[] args) {
      // ********* static variable ********//
        System.out.println("main()");
        System.out.println(staticVar); // 0
        m1(2); // method call
        System.out.println("after m1 ends " + staticVar); // 10

     // ********* instance variable *******//
        VariablesTypes obj1 = new VariablesTypes(); // One copy of instance variable is created for this object and instance variable will get the memory
        System.out.println(obj1.instanceVar); // 0
        obj1.instanceVar = 20;
        obj1.m2(5);

        System.out.println(obj1.instanceVar); // 20
        VariablesTypes obj2 = new VariablesTypes();
        System.out.println(obj2.instanceVar); // 0
        obj2.m2(6);

        int z = 10;
        System.out.println(z);

        if(z == 10){
            int i = 9;
            System.out.println("if block");
//            System.out.println(k);
        }else{
            int k = 9;
//            System.out.println(i);
            System.out.println("else block");
        }
//        System.out.println(k + " === " + i);

        for(int l = 1 ; l<= 10 ; l++){
            int c = 0;
            System.out.print(l + " ");
        }
//        System.out.println(c);
//        System.out.println(l);
    }
}

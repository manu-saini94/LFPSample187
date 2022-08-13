package com.bridgelabz.oops;

public class Sample2 {

    public static void main(String[] args) {



        // Constructor is a special method having same name as class name
        // Constructor is required to initialize an object
        int x = 10;

        // Compiler can only create a default constructor
        // Compiler will create a default constructor, if We are not creating ourselves.
        // If we are creating any constructor, then compiler will not create a constructor.
        // Dog obj1 = new Dog(); // memory allocation happens for the object
        // new keyword along with constructor call is called object

         Dog obj2 = new Dog(); //
        System.out.println(obj2.color);
        System.out.println(obj2.breed);
        System.out.println(obj2.age);

        obj2.color = "black";
        obj2.breed = "labrador";
        obj2.age = 2;

        System.out.println(obj2.color);
        System.out.println(obj2.breed);
        System.out.println(obj2.age);

        Dog obj3 = new Dog("Husky","white",3);

        Dog obj4 = new Dog("skksk","black",5);


        System.out.println(obj3.color);
        System.out.println(obj3.breed);
        System.out.println(obj3.age);

        System.out.println(obj4.color);
        System.out.println(obj4.breed);
        System.out.println(obj4.age);

        System.out.println();
    }
}

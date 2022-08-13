package com.bridgelabz.basics;

// Data types => Primitive and Non-Primitive
// Primitive(8) => byte short int long float double char boolean
// Non-Primitive => Array,Interface,Class,Enum


public class DataTypes {

    public static void main(String[] args) {

        // A variable is a container holding some data
        // The container is the memory where the data is stored

        byte b = 127;  // 0     // 1 byte    // -128 to 127
        short s = 128; // 0     // 2 byte
        int i = 128;   // 0     // 4 byte
        long l = 128;  // 0     // 8 byte
        float f = 2.4F; // 0.0F  // 4 byte
        double d = 1.5; // 0.0   // 8 byte
        char c = 'a';  // \u0000  // 2 byte
        boolean bool = true; // false // 1 bit
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);


        //****************************************

        int[] arr = new int[10];

        int x = 5;
        String str = "ABC";


    }
}

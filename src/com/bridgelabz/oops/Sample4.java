package com.bridgelabz.oops;

import com.bridgelabz.basics.AccessSpecifiers;

public class Sample4 {

    public static void main(String[] args) {
        AccessSpecifiers obj = new AccessSpecifiers();
//        System.out.println(obj.x1);
//        obj.m1();
//        System.out.println(AccessSpecifiers.y1);
//        AccessSpecifiers.method1();

//        System.out.println(obj.x2);
//        obj.m2();
//        System.out.println(AccessSpecifiers.y2);
//        AccessSpecifiers.method2();

        System.out.println(obj.x3);
        obj.m3();
        System.out.println(AccessSpecifiers.y3);
        AccessSpecifiers.method3();

        System.out.println("First commit on branch1 by dev-1");
        System.out.println("Second commit on branch1 by dev-1");
        System.out.println("first commit on brnach2 by dev-1 , modified by dev-2");
        System.out.println("first commit on brnach2 by dev-1, modified by dev-1");

    }
}

package com.bridgelabz.basics;

import java.util.Scanner;

public class Statments {
    static void m1(){
        System.out.println("m1()");
    }

    // Sequential , Conditional , Repetitive
    public static void main(String[] args) {
        int x = 11;
        System.out.println("main");
        System.out.println(x);
        m1();
        System.out.println("End of main");

        if(x == 10)
            System.out.println("if block");
        else
            System.out.println("else block");


        if (x == 11)
            System.out.println("x = 11");
        else if (x > 11)
            System.out.println("x > 11");
         else
            System.out.println("x < 11");

        System.out.println("Enter one number");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();

        switch (ch){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("default");
        }


        // Loops
        // for , while , do-while

        int a = 11;
        System.out.println(a);
        int res = a++ + ++a + ++a + a++ + a; // 11 + 12 + 12 + 11 + 11 = 57
        // 11 + 13 + 14 + 14 + 15 = 67
        System.out.println(res); // 57 //
        System.out.println(a++); // 11 // 15
        System.out.println(a); // 16

        for (int i=0; i<10 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("end of for");

        int k=0;
        while(k<10){
            System.out.print(k+ " ");
        k++;
        }
        System.out.println();
        System.out.println("End of while");
        int m = 0;
        do {
            System.out.print(m + " ");
            m++;
        } while (m < 10);


    }
}

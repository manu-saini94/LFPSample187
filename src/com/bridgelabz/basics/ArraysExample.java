package com.bridgelabz.basics;

import com.bridgelabz.oops.Dog;

public class ArraysExample {

    public static void main(String[] args) {
        // Array
        // When we want to store multiple values of same kind of data in a single variable , we use array
        // Arrays -> 1D and Multi-Dimensional


        int[] arr1 = new int[10];  // Non-primitive

        String[] arr2 = new String[10];
        Dog[] arr3 = new Dog[10];
        Dog obj1 = new Dog();

        arr3[0] = obj1;
        arr3[1] = new Dog();

        arr2[0] = "ABC";



        arr1[0] = 30;
        arr1[1] = 40;
        arr1[2] = 50;

        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        int[][] arr4 =  new int[3][3];

        System.out.println("2D Array");
        for (int i=0;i<arr4.length;i++){

            for(int j=0;j<arr4[i].length;j++){
                arr4[i][j] = i+j;
                System.out.print(arr4[i][j] + " ");
            }

        }
        System.out.println();
        System.out.println("inline 1D array");
        int[] arr5 = {1,2,3,4,5};
        for (int i=0;i<arr5.length;i++){
            System.out.println(arr5[i]);
        }

        System.out.println("inline 2D");
        int[][] arr6 = {{1,2,3}, {3,4,5},{4,6,8}};
        for (int i=0;i<arr6.length;i++){
            for(int j=0;j<arr6[i].length;j++){
                System.out.print(arr6[i][j] + " ");
            }
        }






    }
}

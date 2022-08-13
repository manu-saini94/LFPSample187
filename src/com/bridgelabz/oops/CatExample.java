package com.bridgelabz.oops;

public class CatExample {

    public static void main(String[] args) {

       Cat cat1 = new Cat(); //

       cat1.age = 3;
       cat1.breed = "ABC";
       cat1.color = "black";
       cat1.showDetailsOfCat();


        System.out.println(cat1.sound);
        System.out.println(Cat.sound);
        cat1.sound = "hshshsh";

       Cat cat2 = new Cat();
       cat2.age = 4;
       cat2.color = "white";
       cat2.breed = "BCD";
       cat2.showDetailsOfCat();

        System.out.println(cat2.sound);
        System.out.println(Cat.sound);



    }
}

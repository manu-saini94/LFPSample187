package com.bridgelabz.oops;

public class Dog {

    String color;
    String breed;
    int age;

   public Dog(){

    }

    public Dog(String breed,String color,int age){
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    void eat(){
        System.out.println("eat()");
    }

    void sleep(){
        System.out.println("sleep");
    }

    void run(){
        System.out.println("run");
    }




}

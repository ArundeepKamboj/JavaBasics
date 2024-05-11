package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //static block
    // static block runs when class is getting loaded. even before main method.
    static{
        System.out.println("This is a static block.");
    }

    static{
        System.out.println("This is a static block 2.");
    }
}
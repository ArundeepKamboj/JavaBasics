package org.staticblock;

public class StaticBlock {
    public static void main(String[] args){
        System.out.println("Inside StaticBlock main");
        StaticMethods.method1();
        System.out.println(StaticMethods.num);

    }

    // Static block
    // static block runs when class is getting loaded. even before main method.
    static{
        System.out.println("This is first static block.");
        StaticMethods.method1();
        StaticMethods.num = 3; //we can overrite the static variables of a class from another class.
    }

    static{
        System.out.println("This is the second static block.");
    }
}
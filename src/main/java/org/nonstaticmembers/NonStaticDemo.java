package org.nonstaticmembers;

public class NonStaticDemo {
    int num;
    static NonStaticDemo ndm;

    NonStaticDemo(){
        System.out.println("Inside constructor of NonStatiicDemo!");
    }

    {
        System.out.println("Inside non static block");
    }

    static{
        System.out.println("Static block executing");
    }

    void doSomething(){
        System.out.println("Inside doSomething");
    }
}
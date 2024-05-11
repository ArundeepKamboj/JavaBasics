package org.nonstaticmembers;

public class NonStaticMembersMain {
    public static void main(String[] args){
        System.out.println("Inside main method of nonStaticMembers class");
        NonStaticDemo nsd = new NonStaticDemo();
        System.out.println("num value is : " + nsd.num);

        NonStaticDemo nsd1 = new NonStaticDemo();
        nsd1.num = 1;
        System.out.println("num value is : " + nsd.num);

        System.out.println(NonStaticDemo.ndm);
        NonStaticDemo.ndm = new NonStaticDemo();
        System.out.println(NonStaticDemo.ndm);

        nsd.doSomething();
    }
}

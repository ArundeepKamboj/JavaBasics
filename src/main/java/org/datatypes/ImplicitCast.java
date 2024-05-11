package org.datatypes;

public class ImplicitCast {
    public static void main(String[] args){
        byte b =100;
        int i = b;
        System.out.println(i);
        long l = i;
        System.out.println(i);
        float f = i;
        System.out.println(f);

        char ch = 'a';
        int x = ch;
        System.out.println(x);
    }
}

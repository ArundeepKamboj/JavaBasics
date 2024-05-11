package org.datatypes;

public class ExplicitCast {
    public static void main(String[] args){
        int i = 100;
        byte b = (byte) i;

        System.out.println(b);

        int x = 97;
        char ch = (char) x;
        System.out.println(ch);

        byte b1 = 100;
        byte b2 = 50;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);

        int i1 = 139;
        byte b4 = (byte)i1;
        System.out.println(b4);

        int m = 612;
        byte n = (byte) m;
        char o = (char) n;
        System.out.println(o);
    }
}

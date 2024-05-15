package org.wrapperclasses;

import java.util.Arrays;

public class PrimitiveAndObject {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x);
        Integer y = Integer.valueOf(x);
        System.out.println(y);
        int z = y.intValue();
        System.out.println(z);

        String s = "hello there!";
        byte b = 100;
        System.out.println(b);
        String b2 = Byte.toString(b);
        System.out.println(b2);
        byte b3 = Byte.parseByte(b2);
        System.out.println(b3);

        long l = 1000;
        System.out.println(l);
        Long l2 = Long.valueOf(l);
        System.out.println(l2);
        String l3 = l2.toString();
        System.out.println(l3);
        Long l4 = Long.valueOf(l3);
        System.out.println(l4);

        int i5 = 10000;
//        Integer l6 = new Integer(i5);  depricated since java 9
        String i6 = Integer.toString(i5);
        System.out.println(i6);

        int length = args.length;
        System.out.println(length);
        System.out.println(Arrays.toString(args));

    }
}

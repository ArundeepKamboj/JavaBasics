package org.wrapperclasses;

public class ProductOfNumbers {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int res = number2*number1;
        System.out.println("Product of Two numbers is : " + res);
    }
}

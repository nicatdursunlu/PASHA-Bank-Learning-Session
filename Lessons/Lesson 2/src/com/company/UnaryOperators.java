package com.company;

public class UnaryOperators {

    public static void main(String[] args) {
        int a = 12, b = 12;
        int result1, result2;

        // original value of a
        System.out.println("Value of a: " + a);

        // increment operator
        result1 = ++a; // a = 13, result1 = 13
        System.out.println("After increment: " + result1); // 13

        result1 = a++; // a = 14, result1 = 13
        System.out.println("After increment: " + result1); // 13
        System.out.println("After increment a: " + a); // 13


        // original value of b
        System.out.println("Value of b: " + b);

        // decrement operator
        result2 = --b; // a = 12, result2 = 12
        System.out.println("After decrement: " + result2); // 13

        result2 = b--; // a = 14, result1 = 13
        System.out.println("After decrement: " + result2); // 13
        System.out.println("After decrement b: " + b); // 13

    }
}

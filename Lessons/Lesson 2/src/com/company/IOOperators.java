package com.company;

import java.util.Scanner;

public class IOOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = scanner.nextInt();

        System.out.println("Enter second number ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Sum of numbers " + sum);
    }
}

package com.company;

import java.util.Scanner;

public class TernaryOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = scanner.nextInt();

        System.out.println("Enter second number ");
        int b = scanner.nextInt();

        int max = a > b ? a : b;

        System.out.println("Max of numbers a and b: " + max);

        scanner.close();
    }
}

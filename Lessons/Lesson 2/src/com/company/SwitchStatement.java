package com.company;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String size;

        // switch statement to check size
        switch (number) {
            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra large";
                break;

            default:
                size = "Unknown";
                break;
        }

        System.out.println("Size: " + size);
    }
}

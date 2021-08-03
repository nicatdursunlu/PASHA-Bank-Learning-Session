package az.pashabank.learning.session.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Please, enter the first number: ");
            int a = scanner.nextInt();

            System.out.println("Please, enter the second number: ");
            int b = scanner.nextInt();

            System.out.println(
                    "Please, choose the operation\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division");

            byte operation = scanner.nextByte();

            switch (operation) {
                case 1:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;

                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;

                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;

                case 4:
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;

                default:
            }
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input");
        } catch (ArithmeticException ae) {
            System.out.println("Invalid arithmetic operation " + ae);
        }
        System.out.println("Thanks for using my calculator!");
    }
}

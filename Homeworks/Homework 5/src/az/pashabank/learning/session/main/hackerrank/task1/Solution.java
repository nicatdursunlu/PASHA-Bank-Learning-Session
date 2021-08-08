package az.pashabank.learning.session.main.hackerrank.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException ime) {
            System.out.println(ime.getClass().getName());
        } catch (ArithmeticException ae) {
            System.out.println(ae.getClass().getName() + ": " + ae.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

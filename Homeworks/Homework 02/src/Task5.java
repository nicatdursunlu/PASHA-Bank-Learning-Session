import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first odd number: ");
        int a1 = input.nextInt();

        System.out.println("Please enter the first even number: ");
        int b1 = input.nextInt();

        System.out.println("Please enter the second odd number: ");
        int a2 = input.nextInt();

        System.out.println("Please enter the second even number: ");
        int b2 = input.nextInt();

        System.out.println("Please enter the n-th odd number: ");
        int an = input.nextInt();

        System.out.println("Please enter the n-th even number: ");
        int bn = input.nextInt();

        int d1 = a2-a1;
        int d2 = b2-b1;

        int n1 = (an - a1) / d1 + 1;
        int n2 = (bn - b1) / d2 + 1;

        int sum1 = (a1 + an) / 2 * n1;
        int sum2 = (b1 + bn) / 2 * n2;

        System.out.println("Sum of odds: " + sum1);
        System.out.println("Sum of evens: " + sum2);
        System.out.println("Sum of even and odd: " + (sum1 + sum2));

//        System.out.printf("Sum of odds: %d\n",sum1);
//        System.out.printf("Sum of evens: %d\n",sum2);
//        System.out.printf("Sum of even and odd: %d\n",sum2+sum1);
    }
}

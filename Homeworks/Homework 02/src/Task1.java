import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        float number1, number2, number3, max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        number1 = scanner.nextFloat();

        System.out.println("Enter 2nd number");
        number2 = scanner.nextFloat();

        System.out.println("Enter 3rd number");
        number3 = scanner.nextFloat();

        if(number1 > number2 && number2 > number3) {
            max = number1;
        }
        else if(number2 > number1 && number1 > number3) {
            max = number2;
        }
        else if(number3 > number2 && number2 > number1) {
            max = number3;
        }

        System.out.println("Maximum element of the 3 numbers: " + max);

        scanner.close();
    }
}

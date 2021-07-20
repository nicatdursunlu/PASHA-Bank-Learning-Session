import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        short number1, number2, number3, max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        number1 = scanner.nextShort();

        System.out.println("Enter 2nd number");
        number2 = scanner.nextShort();

        System.out.println("Enter 3rd number");
        number3 = scanner.nextShort();

       max = number1 > number2 ? number1 : number2 > number3 ? number2 : number3;

        System.out.println("Maximum element of the 3 numbers: " + max);
    }
}

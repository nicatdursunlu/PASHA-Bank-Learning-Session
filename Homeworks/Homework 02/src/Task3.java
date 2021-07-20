import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int number1, number2;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        number1 = scanner.nextInt();

        System.out.println("Enter 2nd number");
        number2 = scanner.nextInt();

        System.out.println("Enter operator");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Number1 + Number2 = " + (number1 + number2));
                break;
            case '-':
                System.out.println("Number1 - Number2 = " + (number1 - number2));
                break;
            case '*' :
                System.out.println("Number1 * Number2 = " + (number1 * number2));
                break;
            case '/':
                if(number2 == 0) {
                    System.out.println("We can not do operation Number1 / Number2");
                } else {
                    System.out.println("Number1 / Number2 = " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Your choice is incorrect");
        }

        scanner.close();
    }
}

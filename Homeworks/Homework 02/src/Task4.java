import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter symbol");
        symbol = scanner.next().charAt(0);

        if( (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
            System.out.println(symbol + " is an alphabet.");
            if(Character.isLowerCase(symbol)) {
                System.out.println("Uppercase " + symbol + ": " + Character.toUpperCase(symbol));
            }
            else  {
                System.out.println("Lowercase " + symbol + ": " +Character.toLowerCase(symbol));
            }
        }

        else {
            System.out.println(symbol + " is not an alphabet.");
        }

        scanner.close();
    }
}

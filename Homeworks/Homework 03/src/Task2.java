import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        int fibonacci[] = new int[n + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");

        int i = 2;
        while (i < n) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
            i++;
        }

        scanner.close();
    }
}

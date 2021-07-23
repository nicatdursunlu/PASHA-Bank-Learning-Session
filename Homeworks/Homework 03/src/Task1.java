import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print(i*i + " ");
        }

        scanner.close();
    }
}

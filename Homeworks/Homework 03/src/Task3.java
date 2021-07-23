import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start, end, flag;
        start = scanner.nextInt();
        end = scanner.nextInt();

        for (int i = start; i <= end; i++) {

            if (i == 0 || i == 1)
                continue;

            flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

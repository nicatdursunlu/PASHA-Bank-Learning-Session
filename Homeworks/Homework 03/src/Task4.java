import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int m, n;

        Scanner scanner = new Scanner(System.in);
         m = scanner.nextInt();
         n = scanner.nextInt();

         int[][] arr = new int[m][n];

         for(int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
             }
         }

        int min = arr[0][0], max = arr[0][0];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}

package az.pashabank.learning.session.hackerrank.task2;

import java.util.List;

public class Result {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max = arr.get(0), min = arr.get(0);

        for (int i = 1; i < 5; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        long sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr.get(i);
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}

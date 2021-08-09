package az.pashabank.learning.session.algorithm.task2;

public class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here

        int count = 0;

        for (int l = i; l <= j; l++) {
            int reverse = 0, value = l;
            while(value != 0) {
                int rest = value % 10;
                reverse = reverse * 10 + rest;
                value = value / 10;
            }

            if(Math.abs(l - reverse) % k == 0) {
                count++;
            }
        }

        return count;
    }

}

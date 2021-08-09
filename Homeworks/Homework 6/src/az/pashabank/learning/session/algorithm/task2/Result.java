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

        for (int l = i; l <= j; l++) {
            int reverse = 0;
            while(l != 0) {
                int rest = l % 10;
                reverse = reverse * 10 + rest;
                l = l / 10;

                System.out.println(reverse + "");
            }
//            System.out.println(reverse + "");
        }

//        System.out.println("reverse " + iReverse + jReverse);
        return 5;
    }

}

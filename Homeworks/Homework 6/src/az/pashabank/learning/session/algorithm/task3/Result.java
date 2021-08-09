package az.pashabank.learning.session.algorithm.task3;

import java.util.List;

public class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        int min = scores.get(0);
        int max = scores.get(0);
        int maxCount = 0, minCount = 0;

        for(int i = 0; i < scores.size(); i++) {
            if(scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
            }
            if(scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
            }
        }

        System.out.println("scores "+ scores);
        scores.clear();
//        scores.add(maxCount);
//        scores.add(minCount);
        System.out.println("scores2 "+ scores);
        return scores;
    }
}

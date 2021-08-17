package az.pashabank.learning.session.hackerrank.task2;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> list = new ArrayList<>();

        int m = 0, n = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                m++;
            } else if (a.get(i) < b.get(i)) {
                n++;
            }
            list.set(0, m);
            list.set(1, n);
        }
        return list;
    }
}

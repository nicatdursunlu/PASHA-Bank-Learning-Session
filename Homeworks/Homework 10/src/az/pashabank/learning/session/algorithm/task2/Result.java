package az.pashabank.learning.session.algorithm.task2;

import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                continue;
            } else if ((grades.get(i) / 5 + 1) * 5 - grades.get(i) < 3) {
                grades.set(i, (grades.get(i) / 5 + 1) * 5);
            }
        }

        return grades;
    }

}

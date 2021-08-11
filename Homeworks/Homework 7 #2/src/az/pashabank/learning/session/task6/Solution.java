package az.pashabank.learning.session.task6;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = Double.parseDouble(in.nextLine());

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator<Student> byCgpa = Comparator.comparing(Student::getCgpa);
        Comparator<Student> byFname = Comparator.comparing(Student::getFname);
        Comparator<Student> byId = Comparator.comparing(Student::getId);

//        Collections.sort(studentList, byCgpa.thenComparing(byFname).thenComparing(byId));
        Collections.sort(studentList,
                Collections.reverseOrder(byCgpa
                        .thenComparing(Collections.reverseOrder(byFname))
                        .thenComparing(byId)));

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

}

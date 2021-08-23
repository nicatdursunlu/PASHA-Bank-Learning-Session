package az.pashabank.learning.session.algorithm.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            grades.add(scanner.nextInt());
        }

        List<Integer> result = Result.gradingStudents(grades);
        System.out.println("result " + result);
    }
}

package az.pashabank.learning.session.algorithm.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> scores = new ArrayList<>();
        Integer[] arr= new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            scores.add(arr[i]);
        }

        List<Integer> result = Result.breakingRecords(scores);

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}

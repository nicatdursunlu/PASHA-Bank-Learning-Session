package az.pashabank.learning.session.algorithm.task3;

import az.pashabank.learning.session.algorithm.task1.Result;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> scores = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int scoresItem = Integer.parseInt(scoresTemp[i]);
//            scores.add(scoresItem);
//        }
//
//        List<Integer> result = Result.breakingRecords(scores);
//
//        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> scores = new ArrayList<>();
        int[] arr= new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            scores.add(arr[i]);
        }

//        List<Integer> result = Result.breakingRecords(scores);

        System.out.println(Result.breakingRecords(scores));
    }
}

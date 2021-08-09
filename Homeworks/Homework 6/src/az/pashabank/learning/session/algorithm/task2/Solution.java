package az.pashabank.learning.session.algorithm.task2;

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int i = Integer.parseInt(firstMultipleInput[0]);
//
//        int j = Integer.parseInt(firstMultipleInput[1]);
//
//        int k = Integer.parseInt(firstMultipleInput[2]);
//
//        int result = Result.beautifulDays(i, j, k);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        int result = Result.beautifulDays(i, j, k);
//        System.out.println("Result " + result);
    }
}

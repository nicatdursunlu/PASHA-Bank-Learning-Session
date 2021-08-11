package az.pashabank.learning.session;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<Integer>();
            while (d-- > 0) {
                line.add(scanner.nextInt());
            }
            list.add(line);
        }

        int m = scanner.nextInt();
        while (m-- > 0) {
            int line = scanner.nextInt() - 1;
            int position = scanner.nextInt() - 1;

            if(line >= list.size()) {
                System.out.println("ERROR!");
            } else if(position >= list.get(line).size()) {
                System.out.println("ERROR!");
            } else  {
                System.out.println(list.get(line).get(position));
            }

        }
    }
}

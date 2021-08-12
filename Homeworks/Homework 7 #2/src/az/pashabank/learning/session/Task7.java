package az.pashabank.learning.session;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque();
        HashSet<Long> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {
            long num = in.nextLong();
            deque.add(num);
            set.add(num);

            if (i >= m - 1) {
                if (set.size() > max) {
                    max = set.size();
                }
                Long removed = (Long) deque.removeFirst();
                set.remove(removed);
                set.add((Long) deque.peek());
            }
        }

        System.out.println(max);
    }
}

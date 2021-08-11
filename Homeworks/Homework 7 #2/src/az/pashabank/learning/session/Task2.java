package az.pashabank.learning.session;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Long> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLong());
        }

        int q = scanner.nextInt();
        String query;
        int x;
        Long y;
        for (int i = 0; i < q; i++) {
            query = scanner.next();

            if (query.equals("Insert")) {
                x = scanner.nextInt();
                y = scanner.nextLong();
                list.add(x, y);
            }
            else if (query.equals("Delete")) {
                x = scanner.nextInt();
                list.remove(x);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

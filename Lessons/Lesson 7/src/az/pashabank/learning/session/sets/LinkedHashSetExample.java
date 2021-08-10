package az.pashabank.learning.session.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(2);
        set.add(5);
        set.add(1);
        set.add(3);

        System.out.println(set); // [2, 5, 1, 3]
        System.out.println(set.contains(3)); // true

        set.remove(5);
        System.out.println(set); // [2, 1, 3]

        set.forEach(System.out::println); // 2 1 3

        set.clear();
        System.out.println(set); // []
    }
}

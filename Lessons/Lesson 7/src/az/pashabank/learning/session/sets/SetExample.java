package az.pashabank.learning.session.sets;

import java.util.*;

public class SetExample {

    public static void hshSetExample() {
        HashSet<Integer> set;

        List<Integer> list = Arrays.asList(1, 2, 2, 4);
        set = new HashSet<>(list);

        System.out.println(set);  // [1, 2, 4]
    }

    public static void treeSetExample() {
        Set<String> sorter = new TreeSet<>();

        sorter.add("Bob");
        sorter.add("Alexa");
        sorter.add("Alan");

        for (String s: sorter) {
            System.out.println(s); // Alan, Alexa, Bob
        }
    }

    public static void main(String[] args) {
//        hshSetExample();
        treeSetExample();
    }
}

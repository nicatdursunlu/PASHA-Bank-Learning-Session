package az.pashabank.learning.session.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(13);
        list.add(14);
        list.add(20);
        list.add(21);
        list.add(15);
        list.add(17);
        list.add(22);
        list.add(23);

        String str = list.stream().map(n -> n%2==0 ? "e" + n : "o" + n).collect(Collectors.joining(","));
        System.out.println(str);
    }
}

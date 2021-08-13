package az.pashabank.learning.session.main;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<String> list = List.of("set", "song", "say", "hello", "select", "socket", "safari", "solid", "age", "name", "school");
        List<String> result = list.stream()
                .filter(s -> s.startsWith("s"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
        System.out.println(result); // [set, say]
    }
}

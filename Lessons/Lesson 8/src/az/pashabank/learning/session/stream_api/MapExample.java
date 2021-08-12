package az.pashabank.learning.session.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> square = numbers.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println("Numbers " + numbers); // Numbers [1, 2, 3, 4, 5, 6]
        System.out.println("Square of these numbers " + square); // Square of these numbers [1, 4, 9, 16, 25, 36]
    }
}

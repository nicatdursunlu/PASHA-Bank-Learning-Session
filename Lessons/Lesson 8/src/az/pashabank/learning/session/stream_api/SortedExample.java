package az.pashabank.learning.session.stream_api;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

    public static void main(String[] args) {

        List<String> cars = List.of("Toyota", "Mercedes", "Opel", "Honda", "BMW");
        List<String> sorted = cars.stream().sorted().collect(Collectors.toList());
        List<String> reverseOrder = cars.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println("Sorted " + sorted); // Sorted [BMW, Honda, Mercedes, Opel, Toyota]
        System.out.println("Reverse order " + reverseOrder); // Reverse order [Toyota, Opel, Mercedes, Honda, BMW]
    }
}

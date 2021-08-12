package az.pashabank.learning.session.stream_api_1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("My list " + myList); // My list [7, 18, 10, 24, 17, 5]

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        System.out.println(minVal.get()); // 5

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        maxVal.ifPresent(i -> System.out.println("Max value " + i)); // Max value 24

        Stream<Integer> mySortedList = myList.stream().sorted();
        mySortedList.forEach(n -> System.out.print(n + " ")); // 5 7 10 17 18 24
        System.out.println();

        Stream<Integer> oddValues = myList.stream()
                .filter(e -> e % 2 == 0)
                .filter(e -> e > 6);
        oddValues.forEach(n -> System.out.print(n + " ")); // 18 10 24
    }
}

package az.pashabank.learning.session.stream_api_1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceOperationsDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(10);

        Stream<Integer> myStream = myList.stream().map(n -> n * 10); // 20, 30, 100
        Optional<Integer> result = myStream.reduce((n, m) -> n * m); // 20 * 30 * 100 = 60000
        System.out.println("Result = " + result.get()); // Result = 60000

        myStream = myList.stream();
        int result2 = myStream.reduce(2, (n, m) -> n * m); // 2 * n * m = 2 * 2 * 3 * 10 = 120
        System.out.println("Result 2 = " + result2); // Result 2 = 120
    }
}

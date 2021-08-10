package az.pashabank.learning.session.queques;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void simpleExample() {
        Queue<Integer> priorityIntegerQueue = new PriorityQueue<>();

        priorityIntegerQueue.add(5);
        priorityIntegerQueue.add(7);
        priorityIntegerQueue.add(1);
        priorityIntegerQueue.add(10);

        System.out.println(priorityIntegerQueue); // [1, 7, 5, 10]

        priorityIntegerQueue.remove();
        System.out.println(priorityIntegerQueue); // [5, 7, 10]

        priorityIntegerQueue.poll();
        System.out.println(priorityIntegerQueue); // [7, 10]

        System.out.println(priorityIntegerQueue.peek()); // 7

        System.out.println(priorityIntegerQueue); // [7, 10]
    }

    public static void main(String[] args) {
        simpleExample();
    }
}

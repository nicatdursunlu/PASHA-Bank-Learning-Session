package az.pashabank.learning.session.lists;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(7);
        System.out.println(list); // [5, 2, 7, 8, 7]
        System.out.println("********************");

        // remove first element
        list.remove();
        System.out.println(list); // [2, 7, 8, 7]
        System.out.println("********************");

        list.removeFirstOccurrence(7);
        System.out.println(list); // [2, 8, 7]
        System.out.println("********************");

        list.add(11);
        System.out.println(list); // [2, 8, 7, 11]
        System.out.println("********************");

        list.addFirst(88);
        System.out.println(list); // [88, 2, 8, 7, 11]
        System.out.println("********************");

        list.offerFirst(22);
        System.out.println(list); // [22, 88, 2, 8, 7, 11]
        System.out.println("********************");

        Integer integer = list.get(3);
        System.out.println(integer); // 8
        System.out.println("********************");

        System.out.println(list.indexOf(11)); // 5
        System.out.println("********************");

        list.add(11);
        System.out.println(list.lastIndexOf(11)); // 6
        System.out.println("********************");

        // remove first element
        System.out.println(list); // [22, 88, 2, 8, 7, 11, 11]
        list.pollFirst();
        System.out.println(list); // [88, 2, 8, 7, 11, 11]
        System.out.println("********************");

        System.out.println(list.peekFirst()); // 88
        System.out.println("********************");
    }
}

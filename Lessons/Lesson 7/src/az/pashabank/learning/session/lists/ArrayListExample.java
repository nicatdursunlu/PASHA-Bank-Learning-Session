package az.pashabank.learning.session.lists;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Checking if the list is empty
        boolean empty = list.isEmpty();
        System.out.println(empty); // true
        System.out.println("********************");


        // Add
        list.add(6);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list); // [6, 5, 6, 7, 8]
        System.out.println("********************");

        // Adding a collection to a specific location
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(0, list1);
        System.out.println(list); // [1, 2, 3, 6, 5, 6, 7, 8]
        System.out.println("********************");

        // Delete by index
        list.remove(0);
        System.out.println(list); // [2, 3, 6, 5, 6, 7, 8]
        System.out.println("********************");

        // Delete by value: only the first element found will be deleted
        list.remove(Integer.valueOf(8));
        System.out.println(list.size()); // 6
        System.out.println(list); // [2, 3, 6, 5, 6, 7]
        System.out.println("********************");

        // Adding to the middle of an array
        list.add(2, 10);
        System.out.println(list); // [2, 3, 10, 6, 5, 6, 7]
        System.out.println("********************");

        /*
        * Find by index
        * Returns the position of the first occurrence of the searched element in the list, or -1 if the seacrhed
        * item not found
        * */
        int first = list.indexOf(3);
        System.out.println(first); // 1
        System.out.println("********************");

        /*
         * Find by index
         * Returns the position of the last occurrence of the searched element in the list, or -1 if the seacrhed
         * item not found
         * */
        int last = list.lastIndexOf(6);
        System.out.println(last); // 5
        System.out.println("********************");

        // Maximum value in collection
        Integer max = Collections.max(list);
        System.out.println(max); // 10
    }
}

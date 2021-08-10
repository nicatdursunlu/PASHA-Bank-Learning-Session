package az.pashabank.learning.session.iterable;

import java.util.*;

public class Iterators {

    public static void iteratorExample() {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element); // A B C
        }
    }

    public static void removeIterator() {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();
        iterator.next();
        iterator.remove();

        System.out.println(collection); // [B, C]
    }

    public static void iteratorExceptions() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");

        ListIterator<String> iterator1 = list.listIterator();
        ListIterator<String> iterator2 = list.listIterator();

        iterator1.next();
        iterator1.remove();
        iterator2.next();
    }

    public static void iterableExample() {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        for (String element : collection) {
            System.out.println(element); // A B C
        }
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if(Objects.equals(scanner.next(), "404")) {
                break;
            }
            System.out.println(scanner.next());
        }
    }

    public static void main(String[] args) {
        iteratorExample();
//        removeIterator();
//        iterableExample();
//        iteratorExceptions();
//        scannerExample();
    }
}

package az.pashabank.learning.session.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10, "John");
        hashMap.put(2, "John");

        hashMap.putIfAbsent(1, "John");

        String s = hashMap.get(10);
        String s1 = hashMap.getOrDefault(3, "ERROR");
        System.out.println(s); // John
        System.out.println(s1); // ERROR
        System.out.println("********************");

        Set<Integer> keySet = hashMap.keySet();
        System.out.println(keySet); // [1, 2, 10]
        System.out.println("********************");

        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key); // 1 2 10
            System.out.println(value); // John John John
        }
        System.out.println("********************");

        System.out.println(hashMap); // {1=John, 2=John, 10=John}
        System.out.println(hashMap.containsKey(2)); // true
        System.out.println(hashMap.containsValue("John")); // true
        System.out.println("********************");

        treeExample();
    }

    public static void treeExample() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "John1");
        treeMap.put(3, "John3");
        treeMap.put(2, "John2");

        System.out.println(treeMap.containsValue("John1")); // true
        System.out.println(treeMap.firstEntry()); //  1=John1

        System.out.println(treeMap); // {1=John1, 2=John2, 3=John3}
    }
}

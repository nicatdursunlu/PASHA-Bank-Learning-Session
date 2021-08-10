package az.pashabank.learning.session.maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Ilkin");
        linkedHashMap.put(3, "Sabina");
        linkedHashMap.put(2, "Gunay");

        System.out.println(linkedHashMap.get(2)); // Gunay
        linkedHashMap.replace(2, "Nailya");
        System.out.println(linkedHashMap.get(2)); // Nailya

        System.out.println(linkedHashMap.values()); // [Ilkin, Sabina, Nailya]

        linkedHashMap.put(5, "Emin");
        linkedHashMap.computeIfAbsent(5, key -> key + ", " + "Emin");
        System.out.println(linkedHashMap.get(5)); // Emin

        linkedHashMap.computeIfAbsent(8, key -> key + ", " + "Elshan");
        System.out.println(linkedHashMap.get(8)); // 8, Elshan

        linkedHashMap.put(10, "John");
        linkedHashMap.merge(10, "Snow", (oldVal, newVal) -> oldVal + " " + newVal);
        System.out.println(linkedHashMap.get(10)); // John Snow

        linkedHashMap.merge(22, "Snow", (oldVal, newVal) -> oldVal + newVal);
        System.out.println(linkedHashMap.get(22)); // Snow

        System.out.println(linkedHashMap); //{1=Ilkin, 3=Sabina, 2=Nailya, 5=Emin, 8=8, Elshan, 10=John Snow, 22=Snow}
    }
}

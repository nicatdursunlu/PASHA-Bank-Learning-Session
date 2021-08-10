package az.pashabank.learning.session.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();

        hashMap.put("a", "a");
        hashMap.put(new String("a"), "a"); // not added

        identityHashMap.put("a", "a");
        identityHashMap.put(new String("a"), "a"); // added
        identityHashMap.put(new String("a"), "a"); // added again

        System.out.println(hashMap); // {a=a}
        System.out.println(identityHashMap); // {a=a, a=a, a=a}

    }
}

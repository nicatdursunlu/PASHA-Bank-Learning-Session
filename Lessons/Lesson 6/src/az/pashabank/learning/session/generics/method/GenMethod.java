package az.pashabank.learning.session.generics.method;

public class GenMethod {

    static <T extends Comparable<T>, V extends T> boolean isIn(T t, V[] v) {
        for (int i = 0; i < v.length; i++) {
            if (t.equals(v[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Use isIn() on Integers
        Integer nums[] = {1, 2, 3, 4, 5};

        if (isIn(2, nums))
            System.out.println("2 is nums");

        if (!isIn(7, nums))
            System.out.println("7 is not in nums");

        System.out.println();


        // Use isIn() on Integers
        String strs[] = {"one", "two", "three", "four", "five"};

        if (isIn("two", strs))
            System.out.println("two is nums");

        if (!isIn("seven", strs))
            System.out.println("seven is not in nums");

    }
}

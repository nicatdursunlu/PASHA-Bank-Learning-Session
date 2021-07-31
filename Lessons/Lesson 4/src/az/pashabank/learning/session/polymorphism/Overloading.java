package az.pashabank.learning.session.polymorphism;

class Math {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(double a, int b) {
        return (int) a + b;
    }
}

public class Overloading {

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println("Sum of 4 and 5 is " + math.add(4, 5));
        System.out.println("Sum of 4.6 and 5 is " + math.add(4, 6, 5));
        System.out.println("Sum of 6.2 and 5 is " + math.add(6.2, 3));
    }
}

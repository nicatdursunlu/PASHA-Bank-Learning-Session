package az.pashabank.learning.session.generics.stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Object> doubleStack = new Stack(20);

        doubleStack.push(100);
        doubleStack.push("S");
        doubleStack.push(50.01);

        System.out.println(doubleStack.pop());
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack.pop());
    }
}

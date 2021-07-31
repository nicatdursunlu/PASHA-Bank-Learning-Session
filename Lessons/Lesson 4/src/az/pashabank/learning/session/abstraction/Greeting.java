package az.pashabank.learning.session.abstraction;

public interface Greeting {

    final String message = "Hi";

    void sayGreeting();

    default void printMessage() {
        System.out.println(message);
    }
}

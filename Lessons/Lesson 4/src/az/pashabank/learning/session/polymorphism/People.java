package az.pashabank.learning.session.polymorphism;

public interface People extends Greeting {
    void calculateAge();

    void printEyeColor();

    // static method
    static boolean isTeenager(Integer age) {
        return age <= 16;
    }

    // default method
    default void welcome() {
        System.out.println("Welcome!!!");
    }
}

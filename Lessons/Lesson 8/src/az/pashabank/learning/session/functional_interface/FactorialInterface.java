package az.pashabank.learning.session.functional_interface;

@FunctionalInterface
public interface FactorialInterface {

    int factorial(int a);

    default String getName() {
        return "";
    }

    default String getSurname() {
        return "";
    }
}

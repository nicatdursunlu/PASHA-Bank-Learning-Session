package az.pashabank.learning.session.exceptions;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Example1 {

    public static void main(String[] args) {

    }

    static void aMethodThatThrowsCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("Wow! Checked exception occurred!");
    }
}

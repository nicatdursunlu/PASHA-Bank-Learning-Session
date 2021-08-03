package az.pashabank.learning.session.exceptions;

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class Example2 {

    public static void main(String[] args) {
        aMethodThatThrowsUncheckedException();
    }

    static void aMethodThatThrowsUncheckedException() throws CustomUncheckedException {
        throw new CustomUncheckedException("Wow! Unchecked exception occurred!");
    }
}

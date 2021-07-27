package az.pashabank.learning.session.task1;

public class HelloWorld {

    public HelloWorld() {}

    public HelloWorld(String message) {
        System.out.println(message);
    }
}

class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("Hello World message");
    }
}

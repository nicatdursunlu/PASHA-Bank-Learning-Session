package az.pashabank.learning.session.tasks.task2;

public class Main {

    public static void main(String[] args) {

        Samsung samsung = new Samsung("blue");
        samsung.takePicture();
        samsung.printColor();

        Iphone iphone = new Iphone("red");
        iphone.takePicture();
        iphone.printColor();
    }
}

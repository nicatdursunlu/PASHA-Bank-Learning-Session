package az.pashabank.learning.session.tasks.task2;

public class Iphone implements Phone {

    private String color;

    public Iphone(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void takePicture() {
        System.out.println("Take picture from Iphone");
    }

    @Override
    public void printColor() {
        System.out.println("Color is " + color);
    }
}

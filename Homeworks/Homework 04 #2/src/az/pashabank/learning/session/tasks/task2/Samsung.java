package az.pashabank.learning.session.tasks.task2;

public class Samsung implements Phone {

    private String color;

    public Samsung() {}

    public Samsung(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void takePicture() {
        System.out.println("Take picture from Samsung");
    }

    @Override
    public void printColor() {
        System.out.println("Color is " + color);
    }
}

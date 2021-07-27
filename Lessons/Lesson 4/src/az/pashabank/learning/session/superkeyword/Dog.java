package az.pashabank.learning.session.superkeyword;

public class Dog extends Animal {

    String color;

    public Dog() {}

    public Dog(String color) {
        super(color);
        this.color = color;
    }

    void printColor() {
        System.out.println("Dog's color is " + color);
        System.out.println("Animal's color is " + super.color);
    }

    void eat() {
        super.eat();
        System.out.println("Dog's food is meat");
    }
}

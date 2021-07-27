package az.pashabank.learning.session.inheritance;

public class Dog extends Animal {

    String color = "Blue";

    @Override
    public String toString(){
        return "Dog's color is " + color;
    }

    void speak() {
        System.out.println("Dog barking...");
    }
}

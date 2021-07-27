package az.pashabank.learning.session.superkeyword;

public class Animal {

    String color = "Red";

    public Animal() {
        System.out.println("Parent class constructor");
    }

    public Animal(String color) {
        this.color = color;
    }

    void eat() {
        System.out.println("Animal eating...");
    }
}

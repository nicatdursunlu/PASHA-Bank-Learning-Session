package az.pashabank.learning.session.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.speak();
        String colorRepresentation = dog.toString();
        System.out.println(colorRepresentation);

        Cat cat = new Cat();
        cat.eat();
        cat.speak();
        System.out.println("Cat's color is " + cat.color);
    }
}

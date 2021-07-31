package az.pashabank.learning.session.tasks.task1;

public class Circle extends Shape {
    private double pi = 3.14;

    public double calculatePerimeter(double radius) {
        return 2 * pi * radius;
    }

    public double calculateArea(double radius) {
        return pi * radius * radius;
    }
}

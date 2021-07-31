package az.pashabank.learning.session.tasks.task1;

public class Triangle extends Shape {

    public double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double calculateArea(double a, double b, double c) {
        return a * b / 2;
    }
}

package az.pashabank.learning.session.tasks.task1;

public class Shape {

    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Area of the circle " + circle.calculateArea(5));
        System.out.println("Perimeter of the circle " + circle.calculatePerimeter(5));

        Triangle triangle = new Triangle();
        System.out.println("Area of the triangle " +  triangle.calculateArea(3, 4, 5));
        System.out.println("Perimeter of the triangle " + triangle.calculatePerimeter(3, 4, 5));

        Square square = new Square();
        System.out.println("Area of the square " +  square.calculateArea(3, 4));
        System.out.println("Perimeter of the square " +  square.calculatePerimeter(3, 4));
    }
}

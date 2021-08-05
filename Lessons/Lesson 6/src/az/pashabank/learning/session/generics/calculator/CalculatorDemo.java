package az.pashabank.learning.session.generics.calculator;

class Calculator<N extends Number> {
    private N num1;
    private N num2;

    public Calculator(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        return num1.doubleValue() / num2.doubleValue();
    }

}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator<Double> doubleCalculator = new Calculator(5, 3.3);
        System.out.println(doubleCalculator.add());
        System.out.println(doubleCalculator.subtract());
        System.out.println(doubleCalculator.multiply());
        System.out.println(doubleCalculator.divide());

    }
}

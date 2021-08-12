package az.pashabank.learning.session.lambda_expression;

interface TestInterface {
    boolean check(int n);
}

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        TestInterface isEven;
        isEven = n -> n % 2 == 0;
        int input = 11;
        System.out.println("Is " + input + " an even number?");
        System.out.println(isEven.check(input));

        TestInterface isNeg;
        isNeg = q -> q < 0;
        int input2 = -90;
        System.out.println("Is " + input2 + " a negative number?");
        System.out.println(isNeg.check(input2));
    }
}

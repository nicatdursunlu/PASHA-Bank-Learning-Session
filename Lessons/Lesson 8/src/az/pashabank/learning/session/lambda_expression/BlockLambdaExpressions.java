package az.pashabank.learning.session.lambda_expression;

interface NumericFunction {
    int func(int number);
}

interface StringFunction {
    String func(String word);
}

public class BlockLambdaExpressions {

    public static void main(String[] args) {

        NumericFunction numericFunction;
        numericFunction = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("The factorial of 5 is " + numericFunction.func(5));
        System.out.println("The factorial of 3 is " + numericFunction.func(3));
        System.out.println("********************");

        StringFunction stringFunction;
        stringFunction = word -> {
            String result = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                result+=word.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda reversed is " + stringFunction.func("Lambda"));
        System.out.println("Expression reversed is " + stringFunction.func("Expression"));
    }
}

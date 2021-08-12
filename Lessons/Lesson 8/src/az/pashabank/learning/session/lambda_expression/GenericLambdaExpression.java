package az.pashabank.learning.session.lambda_expression;

interface FuncInterface<T> {
    T func(T t);
}

public class GenericLambdaExpression {

    public static void main(String[] args) {

        FuncInterface<String> t;
        t = word -> word + " #8";
        System.out.println(t.func("Session"));
    }
}

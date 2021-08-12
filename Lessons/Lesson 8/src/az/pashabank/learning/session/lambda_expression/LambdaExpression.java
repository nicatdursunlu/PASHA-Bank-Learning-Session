package az.pashabank.learning.session.lambda_expression;

import az.pashabank.learning.session.functional_interface.*;

public class LambdaExpression {

    public static void main(String[] args) {

        SimpleInterface s = () -> "Hi there";
        NumberInterface a = n -> 10 * n;
        NameInterface n = ((firstName, lastName) -> firstName + " " + lastName);

        System.out.println(s.say());
        System.out.println(a.getNumber(9));
        System.out.println(n.getFullNAme("Nijat", "Dursunlu"));
    }
}

package az.pashabank.learning.session.generics.constructor;

class GenConstructor {

    private double val;

    public <T extends Number> GenConstructor(T args) {
        this.val = args.doubleValue();
    }

    public void showValue() {
        System.out.println("Value: " + val);
    }
}

public class GenConstructorDemo {

    public static void main(String[] args) {

        GenConstructor genConstructor1 = new GenConstructor(55);
        GenConstructor genConstructor2 = new GenConstructor(25.12);

        genConstructor1.showValue();
        genConstructor2.showValue();

    }
}

package az.pashabank.learning.session.wildcards;

class Gen<T> {

    private T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showObType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class WildcardDemo {

    public static void main(String[] args) {

        Gen<?> unbounded = new Gen(3);
        unbounded.showObType();

        Gen<? extends Number> bounded = new Gen(5.5);
        bounded.showObType();
    }
}

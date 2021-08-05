package az.pashabank.learning.session.generics.classes;

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

public class GenDemo {

    public static void main(String[] args) {

        // Integer
        Gen<Integer> genInt = new Gen(4);

        // Return value of ob
        int value = genInt.getOb();
        System.out.println("Value: " + value);

        // Show value of ob
        genInt.showObType();


        Gen<String> genStr = new Gen("Hello World!");

        // Return value of ob
        String s = genStr.getOb();
        System.out.println("Value: " + s);

        // Show value of ob
        genStr.showObType();
    }
}

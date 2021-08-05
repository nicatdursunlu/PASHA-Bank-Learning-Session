package az.pashabank.learning.session.generics.interfaces;

public class GenInterfaceDemo {

    public static void main(String[] args) {

        GenInterface<Integer> lifo = new GenInterfaceImpl1(3);
        lifo.add(5);
        lifo.add(15);
        lifo.add(25);

        System.out.println(lifo.get());
        System.out.println(lifo.get());
        System.out.println(lifo.get());

        GenInterface<Integer> fifo = new GenInterfaceImpl2(3);

        fifo.add(5);
        fifo.add(15);
        fifo.add(25);

        System.out.println(fifo.get());
        System.out.println(fifo.get());
        System.out.println(fifo.get());
    }
}

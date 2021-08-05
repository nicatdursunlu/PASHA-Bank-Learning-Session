package az.pashabank.learning.session.generics.interfaces;

public class GenInterfaceImpl2<T> implements GenInterface<T> {

    private T arr[];
    private int indexIn = 0;
    private int indexOut = 0;

    public GenInterfaceImpl2(int size) {
        arr = (T[]) new Object[size];
    }

    @Override
    public void add(T t) {
        arr[indexIn++] = t;
    }

    @Override
    public T get() {
        return arr[indexOut++];
    }
}

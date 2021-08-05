package az.pashabank.learning.session.generics.interfaces;

public class GenInterfaceImpl1<T> implements GenInterface<T> {

    private T[] arr;
    private int index = 0;

    public GenInterfaceImpl1(int size) {
        arr = (T[]) new Object[size];
    }

    @Override
    public void add(T t) {
        arr[index++] = t;
    }

    @Override
    public T get() {
        return arr[--index];
    }
}

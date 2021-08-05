package az.pashabank.learning.session.generics.stack;

public class Stack<T> {

    private int count = 0;
    private T arr[];

    public Stack(int size) {
        arr = (T[]) new Object[size];
    }

    public void push(T t) {
        arr[++count] = t;
    }

    public T pop() {
        return arr[count--];
    }
}

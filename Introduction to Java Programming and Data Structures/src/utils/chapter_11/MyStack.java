package utils.chapter_11;

import java.util.ArrayList;
import java.util.Collection;

public class MyStack<T> extends ArrayList<T> {

    public MyStack(int initialCapacity) {
        super(initialCapacity);
    }

    public MyStack() {
    }

    /**
     * Preform a deep copy of the passed collection
     * @param c collection to copy
     */
    public MyStack(Collection<? extends T> c) {
        super(new ArrayList<>(c));
    }

    public T peek() {
        return get(size() - 1);
    }

    public T pop() {
        return remove(size() - 1);
    }

    public void push(T o) {
        add(size(), o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}

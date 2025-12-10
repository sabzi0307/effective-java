package edu.sabzi.sample.item7;

import java.util.Arrays;

public class ProperStack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public ProperStack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) throw new IllegalStateException("Empty stack");

        Object result = elements[--size];
        elements[size] = null; // ✔️ Clear obsolete reference
        return result;
    }

    private void ensureCapacity() {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}

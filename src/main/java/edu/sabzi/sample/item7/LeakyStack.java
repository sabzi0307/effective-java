package edu.sabzi.sample.item7;

import java.util.Arrays;

public class LeakyStack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public LeakyStack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;  // Store elements
    }

    public Object pop() {
        if (size == 0) throw new IllegalStateException("Empty stack");

        // ❌ Memory leak: reference still held in the array
        return elements[--size];
    }

    private void ensureCapacity() {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}

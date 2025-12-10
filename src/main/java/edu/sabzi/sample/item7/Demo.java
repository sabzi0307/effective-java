package edu.sabzi.sample.item7;

public class Demo {

    public static void main(String[] args) {

        // Demo: pushing and popping with leak
        LeakyStack badStack = new LeakyStack();
        ProperStack goodStack = new ProperStack();

        for (int i = 0; i < 3; i++) {
            badStack.push("item" + i);
            goodStack.push("item" + i);
        }

        // Pop elements
        badStack.pop();
        goodStack.pop();

        System.out.println("Leaky stack still holds references (memory leak).");
        System.out.println("Proper stack cleared references (no leak).");

        System.out.println("Demo complete.");
    }
}

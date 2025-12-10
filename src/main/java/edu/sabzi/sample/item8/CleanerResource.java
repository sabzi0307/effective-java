package edu.sabzi.sample.item8;

import java.lang.ref.Cleaner;

public class CleanerResource {

    private static final Cleaner CLEANER = Cleaner.create();

    // State that needs cleaning
    static class State implements Runnable {
        @Override
        public void run() {
            System.out.println("Cleaning non-critical resource");
        }
    }

    private final State state;
    private final Cleaner.Cleanable cleanable;

    public CleanerResource() {
        this.state = new State();
        this.cleanable = CLEANER.register(this, state);
    }

    public void doSomething() {
        System.out.println("Doing optional work...");
    }
}

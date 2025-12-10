package edu.sabzi.sample.item8;

public class FinalizerExample {

    //bad example
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizer running... (DO NOT USE)");
    }
}

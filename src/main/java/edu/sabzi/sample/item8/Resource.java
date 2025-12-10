package edu.sabzi.sample.item8;

public class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Resource opened");
    }

    public void doWork() {
        System.out.println("Doing important work...");
    }

    @Override
    public void close() {
        System.out.println("Resource closed deterministically");
    }
}

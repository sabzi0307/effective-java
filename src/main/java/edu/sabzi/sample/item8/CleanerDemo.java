package edu.sabzi.sample.item8;

public class CleanerDemo {

    public static void main(String[] args) {

        CleanerResource resource = new CleanerResource();
        resource.doSomething();

        // Remove reference so GC can run Cleaner
        resource = null;

        System.gc();
        System.runFinalization();

        System.out.println("Cleaner may run asynchronously...");
    }
}

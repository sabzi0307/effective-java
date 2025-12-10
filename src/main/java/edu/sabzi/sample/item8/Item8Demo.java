package edu.sabzi.sample.item8;

public class Item8Demo {

    public static void main(String[] args) {

        // Safe and deterministic
        try (Resource r = new Resource()) {
            r.doWork();
        }

        System.out.println("Continuing program...");
    }
}

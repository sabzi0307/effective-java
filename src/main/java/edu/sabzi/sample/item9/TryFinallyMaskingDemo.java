package edu.sabzi.sample.item9;

public class TryFinallyMaskingDemo {

    static class BadResource {
        void use() {
            System.out.println("Using resource...");
            throw new RuntimeException("Main Exception");
        }

        void cleanup() {
            System.out.println("Cleaning up resource...");
            throw new RuntimeException("Cleanup Exception");
        }
    }

    public static void main(String[] args) {
        try {
            BadResource r = new BadResource();
            r.use();
        } finally {
            BadResource r = new BadResource();
            r.cleanup();
        }
    }
}

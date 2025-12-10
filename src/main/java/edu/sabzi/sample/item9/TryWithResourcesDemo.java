package edu.sabzi.sample.item9;

public class TryWithResourcesDemo {

    static class GoodResource implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("Closing resource...");
            throw new RuntimeException("Cleanup Exception");
        }

        void use() {
            System.out.println("Using resource...");
            throw new RuntimeException("Main Exception");
        }
    }

    public static void main(String[] args) {
        try (GoodResource r = new GoodResource()) {
            r.use();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());

            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed: " + suppressed.getMessage());
            }
        }
    }
}

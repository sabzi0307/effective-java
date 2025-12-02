package edu.sabzi.sample.item3;

/**
 * Thread-safe, lazy-loaded Singleton using the Initialization-on-demand holder.
 *
 * Advantages:
 * - Lazy initialization
 * - Thread-safe without synchronization
 * - Small and fast
 *
 * Pitfalls:
 * - Still vulnerable to reflection unless guarded
 * - Must handle serialization manually
 */
public final class SingletonClassic {

    // Private constructor prevents external instantiation
    private SingletonClassic() {
        // Guard against reflection attacks
        if (Holder.INSTANCE != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    // Lazy-loaded static holder
    private static class Holder {
        private static final SingletonClassic INSTANCE = new SingletonClassic();
    }

    public static SingletonClassic getInstance() {
        return Holder.INSTANCE;
    }

    public void log(String message) {
        System.out.println("[CLASSIC] " + message);
    }

    // Protect against serialization attack
    private Object readResolve() {
        return getInstance();
    }
}

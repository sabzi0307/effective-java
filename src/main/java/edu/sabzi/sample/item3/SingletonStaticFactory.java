package edu.sabzi.sample.item3;

/**
 * Singleton created through a static factory method.
 *
 * Advantages:
 * - Allows returning subclasses or mocks (useful for testing)
 * - You can change implementation later
 * - Cleaner API: getInstance() is expressive
 */
public final class SingletonStaticFactory {

    private static final SingletonStaticFactory INSTANCE = new SingletonStaticFactory();

    private SingletonStaticFactory() { }

    public static SingletonStaticFactory getInstance() {
        return INSTANCE;
    }

    public void log(String message) {
        System.out.println("[FACTORY] " + message);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}

package edu.sabzi.sample.item4;

/**
 * A utility class that should not be instantiated.
 * All members are static.
 */
public final class UtilityClass {

    // Private constructor to prevent instantiation
    private UtilityClass() {
        throw new AssertionError("UtilityClass should not be instantiated");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String repeat(String s, int count) {
        return s.repeat(count);
    }
}

package edu.sabzi.sample.item1;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Immutable Email value object.
 * Demonstrates static factory validation and naming benefits.
 */
public final class Email {

    private static final Pattern VALID_EMAIL =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private final String value;

    private Email(String value) {
        this.value = value;
    }

    /**
     * Static factory method with validation and meaningful naming.
     */
    public static Email of(String value) {
        Objects.requireNonNull(value, "email cannot be null");

        if (!VALID_EMAIL.matcher(value).matches()) {
            throw new IllegalArgumentException("Invalid email format: " + value);
        }

        return new Email(value);
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}

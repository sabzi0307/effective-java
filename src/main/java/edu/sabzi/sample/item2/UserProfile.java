package edu.sabzi.sample.item2;

import java.util.Objects;

/**
 * Real-world example of Builder usage for domain model objects.
 * Demonstrates:
 * - Required parameters
 * - Optional parameters
 * - Validation for domain rules
 */
public final class UserProfile {

    private final String username;
    private final String email;
    private final int age;
    private final String bio;
    private final boolean newsletter;

    private UserProfile(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
        this.bio = builder.bio;
        this.newsletter = builder.newsletter;
    }

    public static class Builder {

        private final String username;
        private final String email;

        private int age = 0;
        private String bio = "";
        private boolean newsletter = false;

        public Builder(String username, String email) {
            this.username = Objects.requireNonNull(username);
            this.email = Objects.requireNonNull(email);

            if (!email.contains("@")) {
                throw new IllegalArgumentException("Invalid email");
            }
        }

        public Builder age(int age) {
            if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
            this.age = age;
            return this;
        }

        public Builder bio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder newsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }

    @Override
    public String toString() {
        return username + " <" + email + "> age=" + age + ", bio='" + bio + "'";
    }
}


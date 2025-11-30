package edu.sabzi.sample.item1;


import java.util.Objects;

/**
 * Demonstrates named static factories instead of overloaded constructors.
 */
public class User {

    private final String username;
    private final Email email;
    private final boolean isAdmin;

    private User(String username, Email email, boolean isAdmin) {
        this.username = username;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    public static User regular(String username, Email email) {
        return new User(username, email, false);
    }

    public static User admin(String username, Email email) {
        return new User(username, email, true);
    }

    @Override
    public String toString() {
        return (isAdmin ? "[ADMIN] " : "") + username + " <" + email + ">";
    }
}


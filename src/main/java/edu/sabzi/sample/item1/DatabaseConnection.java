package edu.sabzi.sample.item1;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates caching using static factory methods.
 * Avoids unnecessary object creation (similar to Flyweight).
 */
public class DatabaseConnection {

    private static final Map<String, DatabaseConnection> CACHE = new HashMap<>();

    private final String url;

    private DatabaseConnection(String url) {
        this.url = url;
    }

    public static DatabaseConnection get(String url) {
        return CACHE.computeIfAbsent(url, DatabaseConnection::new);
    }

    @Override
    public String toString() {
        return "Connection{" + url + "}";
    }
}


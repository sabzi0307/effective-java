package edu.sabzi.sample.item3;

/**
 * Represents a logical class that should have only one instance.
 * The Enum Singleton ensures only one DatabaseConnection ever exists.
 */
public class DatabaseConnection {

    public DatabaseConnection() {
        // Simulate expensive setup
        System.out.println("Initializing DatabaseConnection...");
    }

    public void query(String sql) {
        System.out.println("Executing SQL: " + sql);
    }
}

package edu.sabzi.sample.item3;

/**
 * Best Singleton pattern recommended by Effective Java.
 *
 * Benefits:
 * - Guaranteed single instance by JVM
 * - Immune to reflection attacks
 * - Serialization-safe automatically
 * - Easiest to read and maintain
 */
public enum Database {

    INSTANCE; // The only instance the JVM will create

    private final DatabaseConnection connection;

    Database() {
        // Construct the real singleton dependency
        this.connection = new DatabaseConnection();
    }

    public DatabaseConnection getConnection() {
        return connection;
    }
}

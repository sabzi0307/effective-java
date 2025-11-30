package edu.sabzi.sample.item1;

public class Demo {

    public static void main(String[] args) {

        // Value object creation
        Email email = Email.of("user@example.com");

        // Named factories improve readability
        User user = User.regular("john_doe", email);
        User admin = User.admin("root", email);

        System.out.println(user);
        System.out.println(admin);

        // Caching example
        DatabaseConnection c1 = DatabaseConnection.get("jdbc:mysql://localhost");
        DatabaseConnection c2 = DatabaseConnection.get("jdbc:mysql://localhost");

        System.out.println("Same instance? " + (c1 == c2)); // true
    }
}

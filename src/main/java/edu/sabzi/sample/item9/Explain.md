## Item 9: Prefer try-with-resources to try-finally

📝 Item 9 – Brief Explanation

Item 9 states:

Use try-with-resources instead of try-finally for closing resources.

Why?

### ❌ Problems with try-finally

    Verbose

    Easy to forget closing resources

    Exceptions in finally can hide the original exception

    Does not support multiple resources cleanly

### ✔️ Advantages of try-with-resources

    Automatically closes resources

    Cleaner, safer, shorter

    Preserves original exceptions

    Supports multiple resources naturally

    Works with any class implementing AutoCloseable

## 🧠 Key Takeaways for README.md

    ✔ try-with-resources automatically closes resources
    ✔ Works with any class implementing AutoCloseable
    ✔ Produces safer code than try-finally
    ✔ Prevents exception masking
    ✔ Supports multiple resources cleanly

### Use try-with-resources for:

    Files
    Sockets
    Streams
    JDBC connections
    Network clients
    Any closeable resource






### Exception Masking vs Suppressed Exceptions (Item 9 – Effective Java)

Problem:
Using try-finally can cause exception masking, where a cleanup exception hides the original failure.

Solution:
Use try-with-resources, which automatically suppresses cleanup exceptions and preserves the main exception.

Key Takeaways
Pattern	Behavior
try-finally	❌ Masks original exception
try-with-resources	✔ Preserves main exception, adds suppressed
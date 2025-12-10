## Item 8: Avoid Finalizers and Cleaners

Avoid using finalize() and Cleaner for resource management.
They are unpredictable, slow, and unsafe.


Why avoid them?
❌ Problems with finalize():

Unpredictable: You don't know when it runs (if ever!)

Dangerous: Can resurrect objects (bring them back to life)

Slow: Finalizer threads slow down GC

Deprecated: Removed in modern Java versions

❌ Problems with Cleaner:

Better than finalizers but still non-deterministic

Should only be used as a safety net, not main resource management

✔️ Preferred solution:

Use try-with-resources and AutoCloseable for deterministic cleanup.

## 🧠 Key Takeaways for README.md

Never use finalize() — unpredictable & harmful

Avoid Cleaner except as a backup

Always use try-with-resources and AutoCloseable for:

    Files
    Sockets
    Database connections
    Streams

Deterministic cleanup is essential for safe and correct resource handling
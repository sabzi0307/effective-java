## Item 11 — Always Override hashCode When You Override equals
Why this matters

If equals says two objects are equal, then hashCode() must return the same value.
Violating this rule breaks:

    HashMap

    HashSet

    HashTable

    ConcurrentHashMap

    Caching systems

    Collections-based logic

### Bad consequences

    Duplicate keys in a HashSet

    Map lookups fail

    Objects appear “lost”

    Performance degrades to O(n)

    Bugs become extremely hard to debug

### Rules for a good hashCode implementation

    ✔ Use immutable fields
    ✔ Use Objects.hash(...) or the canonical formula
    ✔ Ensure consistent results across process lifetime
    ✔ Always override hashCode when overriding equals

Never do:

    ❌ Returning a constant
    ❌ Using random values
    ❌ Using mutable fields
    ❌ Using transient fields that change logic
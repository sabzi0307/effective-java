## Item 10 — “Obey the General Contract When Overriding equals”
If you override equals(), you must strictly follow its contract:

    Reflexive – x.equals(x) is always true

    Symmetric – x.equals(y) == y.equals(x)

    Transitive – if x==y and y==z then x==z

    Consistent – repeated checks return same result

    Non-null – x.equals(null) returns false

If you violate any of these points → HashSet / HashMap / sorting / code logic can break.

Item 10 — Obey the General Contract When Overriding equals

Overriding equals incorrectly causes subtle and dangerous bugs in:

    HashMap, HashSet, HashTable

    caching

    deduplication logic

    sorting

    persistence frameworks

    distributed systems

### Equals contract

    Reflexive — x.equals(x)

    Symmetric — x.equals(y) == y.equals(x)

    Transitive

    Consistent

    Non-null

### Fix: Always follow these rules

    ✔ Use instanceof
    ✔ Compare significant fields
    ✔ Use composition rather than subclassing
    ✔ Override hashCode whenever equals is overridden
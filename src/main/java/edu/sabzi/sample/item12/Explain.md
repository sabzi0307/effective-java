## Item 12 — Always Override toString

Core Idea

toString() should provide useful, human-readable information about the object.

Joshua Bloch emphasizes:

The default Object.toString() is useless:
com.example.MyClass@6bc7c054

### A good toString():
    ✔ helps debugging
    ✔ improves logging / monitoring
    ✔ makes stack traces understandable
    ✔ simplifies testing
    ✔ helps API consumers

In large systems (microservices, event logs, Kafka messages), a clear toString() is mandatory.

##### Bad Example — Sensitive Information Leakage

Be careful not to include:

    ❌ passwords
    ❌ tokens
    ❌ secrets
    ❌ JWTs
    ❌ PII

##### Bad Example — Too Much Data

    Don’t print collections with thousands of elements.


#### Recommended Pattern (Effective Java Style)

    1. Print all key fields
    2. Keep it compact
    3. Don’t throw exceptions
    4. Never rely on toString() for program logic


The default toString() reveals the object's type and hash—nothing more.

com.example.MyClass@4e50df2e


### This is useless for:

    debugging

    logging

    monitoring

    Kafka / Redis / REST payload tracing

    exception messages

### Good toString():

    Clearly expresses the object's state

    Avoids sensitive information

    Makes logs meaningful

    Helps diagnose failures

    Improves maintainability

### Best Practices

    ✔ Include all identity-defining fields
    ✔ Use human-readable formatting
    ✔ Avoid logging secrets (passwords, tokens, PII)
    ✔ Avoid enormous structures (limit collectio
# Item 03 — Enforce the Singleton Property with a Private Constructor or an Enum
**Source:** Effective Java — Joshua Bloch

Singletons ensure a class has exactly *one* instance.  
This item teaches *how to do it safely*.

---

## 🚀 Why Singletons Matter
- They model unique system resources
- Frequently used in frameworks, config, logging, caches
- Must resist:
    - reflection attacks
    - serialization attacks
    - multi-threading issues

---

## ✔ Included Implementations

### 1️⃣ Classic Singleton (Lazy / Thread-Safe)
- Uses Holder idiom
- Guards against reflection
- Requires `readResolve()`

### 2️⃣ Static Factory Singleton
- More flexible
- Allows swapping implementation in tests
- Still needs serialization protection

### 3️⃣ Enum Singleton (Recommended)
- Best protection
- Simplest
- Serialization-proof
- Reflection-proof

  #### Enum Singleton advantages:

- Absolutely single instance (JVM-enforced)

- Serialization proof

- Reflection proof

- Thread-safe for free

⚠️ Pitfalls of Static-Factory-Based Singleton (Even With Reflection Guard)
1️⃣ Reflection Guard Can Still Be Bypassed

Even with:

if (INSTANCE != null) throw new IllegalStateException(...);


An attacker can still instantiate a new object:

✔ Using Unsafe
SingletonStaticFactory hacked = (SingletonStaticFactory)
sun.misc.Unsafe.getUnsafe().allocateInstance(SingletonStaticFactory.class);


This creates an instance without calling the constructor, bypassing your guard completely.

✔ Using Serialization Attack

Deserializing this object:

ObjectInputStream ois = new ObjectInputStream(fileInput);
SingletonStaticFactory hacked = (SingletonStaticFactory) ois.readObject();


Will produce a new copy, unless you implement readResolve().

This creates a second instance even if your constructor is protected.

✔ Using Multiple Classloaders

Two different classloaders loading the same class = two completely separate singletons.

This is a real-world production bug in app servers and plugin systems.

2️⃣ It Forces Global State (Bad for Testing)

Static-factory singletons behave like hidden global dependencies.

Problems:

Hard to mock

Hard to reset between tests

Behavior leaks across unit tests

Encourages procedural, non-clean-architecture code

Clean Architecture prefers dependency injection over static global instances.

3️⃣ Not Lazy If You Don’t Use Holder Idiom

Example:

private static final SingletonStaticFactory INSTANCE = new SingletonStaticFactory();


This initializes at class load time — not lazy.

If the singleton is:

heavy

I/O-based

requires configuration

depends on environment variables

This becomes a startup performance issue.

4️⃣ Cannot Support Subclassing or Polymorphism

Static factories look flexible, but a singleton cannot support:

polymorphism

environment-based replacement

runtime replacement

test doubles

You are stuck with one concrete implementation.

DI frameworks like Spring avoid this.

5️⃣ Unclear Lifecycle (Clean Architecture Violation)

Static singletons bypass:

dependency inversion

dependency injection

boundaries

testability principles

They make it extremely hard to reason about object lifecycle.

Enums are better, dependency-injected singletons (via Spring) are best.

6️⃣ Hard to Control Initialization Order

If your singleton depends on another singleton, the JVM may load classes in unexpected order.

Boot issues may occur when:

configuration is not loaded

environment is not ready

dependent services are not initialized

7️⃣ Require More Code to Protect Correctness

You need to manually handle:

Serialization (readResolve)

Reflection guard

Multi-threading with Holder idiom

Prevent cloning (clone() attack)

Prevent multiple instances via deserialization

Enums do all of this automatically with 0 lines of extra code.

🚀 Why Enum Singleton Wins

Enum singletons are:

✔ Serialization-safe
✔ Reflection-proof
✔ Thread-safe
✔ Classloader-safe
✔ Clean, small, and easy to read
✔ No constructor hacks
✔ No complex lifecycle issues
✔ No test pollution
✔ Recommended by Joshua Bloch in Effective Java Item 3

Simple, concise, maintainable
---

## 🧠 Senior-Level Notes
- Avoid double-checked locking — outdated and error-prone
- Enum singleton is preferred unless:
    - your class must extend another class
    - or must be created using DI

---

## ▶️ Run the Demo

```bash
./gradlew run

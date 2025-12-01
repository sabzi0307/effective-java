# Item 02 — Consider a Builder When Faced with Many Constructor Parameters
**Source:** Effective Java (Joshua Bloch)

## 🚀 Why the Builder Pattern?
Use a Builder when:
- a class has **many optional parameters**
- telescoping constructors become unreadable
- you want an **immutable**, well-designed object
- readability & validation matter

This is the foundation of:
- Clean Architecture DTOs
- Domain-Driven Design Aggregates
- Complex configuration objects
- Fluent APIs

---

## 📘 Examples Included
### ✔ `NutritionFacts`
- Classic Effective Java example
- Shows builder pattern for immutable objects

### ✔ `UserProfile`
- Domain model with validation rules

### ✔ `HttpRequest`
- Senior-level fluent API design
- Readable and immutable request object

---

## 🧠 Senior-Level Takeaways
- Builders prevent invalid objects
- Builders allow **fluid, readable object creation**
- Enforce domain invariants at construction time
- Aligns with Clean Code & OO best practices
- Used heavily in Spring, Lombok, and modern Java libraries

---

## ▶️ Run the Example
```bash
./gradlew run

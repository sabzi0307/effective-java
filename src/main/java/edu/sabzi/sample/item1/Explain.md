
# Item 01 — Consider Static Factory Methods Instead of Constructors
**Source:** Effective Java (Joshua Bloch)

## 🚀 Why Static Factory Methods?
Static factory methods provide:
- Meaningful naming (`User.admin()` vs `new User(..., true)`)
- Validation before object creation
- Ability to return existing cached instances
- Returning subtypes and hiding implementation details
- Improved readability and API expressiveness

---

## 📘 Examples Included
### ✔ `Email.of("user@example.com")`
- Validates email format
- Ensures immutability
- Prevents messy constructor logic

### ✔ `User.admin()` / `User.regular()`
- Eliminates ambiguous overloaded constructors

### ✔ `DatabaseConnection.get(url)`
- Demonstrates instance caching using `computeIfAbsent`

---

## 🧠 Senior-Level Takeaways
- Static factories are essential to **Domain-Driven Design value objects**
- Popular Java libraries use them: `Optional.of`, `Enum.valueOf`, `LocalDate.of`
- Improves **Clean Architecture** by enforcing object creation rules
- Makes APIs **self-documenting** and harder to misuse

---

## ▶️ Run the Example
```bash
./gradlew run

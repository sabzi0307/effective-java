Item 5: Prefer Dependency Injection to Hardwiring Resources

This item’s goal:
❌ Don’t hardcode dependencies inside classes
✔️ Inject dependencies (constructor injection is preferred)



## 1
📄 BadSpellChecker.java

❌ Hardwired dependency – violates Item 5
Why it’s bad?

You cannot switch to another dictionary (French, German, Mock, etc.)

Hard to test

Violates Single Responsibility Principle


## 2
📄 GoodSpellChecker.java

✔️ Correct — dependency injection
Benefits:

Easily testable

Reusable

Any dictionary can be provided
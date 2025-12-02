## Item 6: Avoid Creating Unnecessary Objects,

Don’t create objects you don’t need — reuse when possible.

#### Why?

- Avoids Garbage Collection pressure

- Improves performance

- Makes code cleaner and more intentional

#### Common examples of unnecessary object creation:

- Creating a new String instead of using a literal

- Creating Boolean, Integer via constructor instead of valueOf()

- Creating expensive objects (like Regex Pattern) repeatedly

- Using new when a static factory or cached object works better



🚫 Bad Example – Creates Unnecessary Objects
##### BadRomanNumeralChecker

❌ Why bad?

String.matches() compiles the regex each call, producing a new Pattern.
For repeated usage, this is a waste.


✔️ Good Example – Reuse a Static Pattern
##### GoodRomanNumeralChecker 
✔️ Benefits

- Only one Pattern object is created

- Reused across calls

- Faster & memory efficient
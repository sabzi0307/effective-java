package edu.sabzi.sample.item5;

public class Demo {

    public static void main(String[] args) {

        // Hardwired example
        BadSpellChecker bad = new BadSpellChecker();
        System.out.println("Bad (hardwired): 'apple' -> " + bad.isValid("apple"));
        System.out.println("Bad (hardwired): 'salam' -> " + bad.isValid("salam"));

        // DI example with English Dictionary
        GoodSpellChecker english = new GoodSpellChecker(new EnglishDictionary());
        System.out.println("Good (English DI): 'developer' -> " + english.isValid("developer"));

        // DI example with a test dictionary (for unit tests)
        GoodSpellChecker testChecker = new GoodSpellChecker(new TestDictionary());
        System.out.println("Good (Test DI): 'testpass' -> " + testChecker.isValid("testpass"));
        System.out.println("Good (Test DI): 'apple' -> " + testChecker.isValid("apple"));
    }
}

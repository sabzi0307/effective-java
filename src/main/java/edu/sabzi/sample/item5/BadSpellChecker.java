package edu.sabzi.sample.item5;

public class BadSpellChecker {

    // Hardwired dependency — cannot be replaced or tested easily
    private final EnglishDictionary dictionary = new EnglishDictionary();

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }
}

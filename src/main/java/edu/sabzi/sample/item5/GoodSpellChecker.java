package edu.sabzi.sample.item5;

public class GoodSpellChecker {

    private final Dictionary dictionary;

    // Dependency is injected, not created internally
    public GoodSpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }
}

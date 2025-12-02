package edu.sabzi.sample.item5;

import java.util.Set;

public class EnglishDictionary implements Dictionary {

    private static final Set<String> WORDS = Set.of("apple", "banana", "car", "developer");

    @Override
    public boolean contains(String word) {
        return WORDS.contains(word.toLowerCase());
    }
}

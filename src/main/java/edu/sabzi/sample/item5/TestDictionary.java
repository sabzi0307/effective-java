package edu.sabzi.sample.item5;

public class TestDictionary implements Dictionary {

    @Override
    public boolean contains(String word) {
        return word.equalsIgnoreCase("testpass");
    }
}

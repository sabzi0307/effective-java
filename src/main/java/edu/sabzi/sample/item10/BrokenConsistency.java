package edu.sabzi.sample.item10;

public class BrokenConsistency {

    private int value;

    public BrokenConsistency(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        // Randomized behavior breaks consistency
        return Math.random() > 0.5;
    }
}

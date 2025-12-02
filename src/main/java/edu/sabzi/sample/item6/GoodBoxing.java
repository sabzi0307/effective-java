package edu.sabzi.sample.item6;

public class GoodBoxing {

    public static long sum() {
        long result = 0L;     // primitive, no extra objects
        for (long i = 0; i < 1_000_000; i++) {
            result += i;
        }
        return result;
    }
}

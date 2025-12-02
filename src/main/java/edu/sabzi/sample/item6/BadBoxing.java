package edu.sabzi.sample.item6;

public class BadBoxing {

    public static Long sum() {
        Long result = 0L;     // unnecessary Long boxing
        for (long i = 0; i < 1_000_000; i++) {
            result += i;      // creates many Long objects internally
        }
        return result;
    }
}

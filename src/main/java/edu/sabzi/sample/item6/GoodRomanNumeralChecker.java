package edu.sabzi.sample.item6;

import java.util.regex.Pattern;

public class GoodRomanNumeralChecker {

    // Compile regex once and reuse
    private static final Pattern ROMAN =
            Pattern.compile("^(?i)M{0,4}(CM|CD|D?C{0,3})"
                    + "(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    public static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}

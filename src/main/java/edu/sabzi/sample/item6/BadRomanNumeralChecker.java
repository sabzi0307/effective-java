package edu.sabzi.sample.item6;

public class BadRomanNumeralChecker {

    // This regex Pattern is compiled *every time* method is called — expensive!
    public static boolean isRomanNumeral(String s) {
        return s.matches("^(?i)M{0,4}(CM|CD|D?C{0,3})"
                + "(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }
}

package edu.sabzi.sample.item6;

public class Demo {

    public static void main(String[] args) {

        // Compare regex approaches
        String roman = "MCMLXXXVIII"; // 1988

        System.out.println("Bad (matches):   " +
                BadRomanNumeralChecker.isRomanNumeral(roman));

        System.out.println("Good (cached):   " +
                GoodRomanNumeralChecker.isRomanNumeral(roman));


        // Compare boxing approaches
        long startBad = System.currentTimeMillis();
        BadBoxing.sum();
        long endBad = System.currentTimeMillis();

        long startGood = System.currentTimeMillis();
        GoodBoxing.sum();
        long endGood = System.currentTimeMillis();

        System.out.println("Bad boxing time:   " + (endBad - startBad) + " ms");
        System.out.println("Good boxing time:  " + (endGood - startGood) + " ms");
    }
}

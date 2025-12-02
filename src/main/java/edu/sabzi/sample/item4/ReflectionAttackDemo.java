package edu.sabzi.sample.item4;

import java.lang.reflect.Constructor;

public class ReflectionAttackDemo {

    public static void main(String[] args) throws Exception {
        Constructor<UtilityClass> constructor =
                UtilityClass.class.getDeclaredConstructor();
        constructor.setAccessible(true); // breaks encapsulation

        try {
            UtilityClass instance = constructor.newInstance();
            System.out.println("Reflection created instance: " + instance);
        } catch (Exception ex) {
            System.out.println("Reflection instantiation failed: " + ex);
        }

        System.out.println("Static method still works: " + UtilityClass.add(3, 4));
    }
}

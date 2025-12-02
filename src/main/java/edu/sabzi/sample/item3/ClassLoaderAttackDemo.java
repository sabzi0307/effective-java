package edu.sabzi.sample.item3;

import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderAttackDemo {

    public static void main(String[] args) throws Exception {

        // Normal singleton instance
        SingletonStaticFactory instance1 = SingletonStaticFactory.getInstance();
        System.out.println("Original instance hash: " + instance1.hashCode());

        // Load the same class using a separate classloader
        URL classUrl = SingletonStaticFactory.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation();

        URLClassLoader classLoader = new URLClassLoader(
                new URL[]{classUrl},
                null // null = no parent loader, forces fresh loading
        );

        Class<?> loadedClass =
                Class.forName(
                        "edu.sabzi.sample.item3.SingletonStaticFactory",
                        true,
                        classLoader
                );

        Object instance2 = loadedClass
                .getMethod("getInstance")
                .invoke(null);

        System.out.println("Loaded via new classloader hash: " + instance2.hashCode());
        System.out.println("instance1 == instance2 ? " + (instance1 == instance2));
    }
}

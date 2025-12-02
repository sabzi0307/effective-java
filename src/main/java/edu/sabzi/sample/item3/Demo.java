package edu.sabzi.sample.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Demonstrates usage of all 3 Singleton patterns.
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("------------------------------Classic---------------------------------------");
        SingletonClassic classic = SingletonClassic.getInstance();
        classic.log("Classic Singleton working");

        System.out.println("------------------------------FACTORY---------------------------------------");
        SingletonStaticFactory factory = SingletonStaticFactory.getInstance();
        factory.log("Factory Singleton working");


        System.out.println("--------------------------------ENUM-------------------------------------");
        DatabaseConnection conn1 = Database.INSTANCE.getConnection();
        DatabaseConnection conn2 = Database.INSTANCE.getConnection();

        conn1.query("SELECT * FROM USERS");

        System.out.println("conn1 == conn2 ? " + (conn1 == conn2));
        System.out.println("conn1 hash: " + conn1.hashCode());
        System.out.println("conn2 hash: " + conn2.hashCode());

        System.out.println("All singletons executed successfully");



        System.out.println("-------------------------------REFLECTION ATTACK--------------------------------------");
        SingletonStaticFactory original = SingletonStaticFactory.getInstance();

        System.out.println("Original instance hash: " + original.hashCode());

        // -------------------------------
        // REFLECTION ATTACK
        // -------------------------------
        Constructor<SingletonStaticFactory> constructor =
                null;
        try {
            constructor = SingletonStaticFactory.class.getDeclaredConstructor();
            constructor.setAccessible(true); // bypass private constructor

            SingletonStaticFactory hacked = constructor.newInstance();

            System.out.println("Hacked instance hash:   " + hacked.hashCode());

            // Compare
            System.out.println("original == hacked ? " + (original == hacked));
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}

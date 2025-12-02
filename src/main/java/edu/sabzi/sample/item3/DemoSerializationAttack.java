package edu.sabzi.sample.item3;

import java.io.*;

public class DemoSerializationAttack {

    public static void main(String[] args) throws Exception {

        SingletonStaticFactory original = SingletonStaticFactory.getInstance();
        System.out.println("Original instance hash: " + original.hashCode());

        // -------------------------
        // SERIALIZE the original
        // -------------------------
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("singleton.obj"))) {
            oos.writeObject(original);
        }

        // -------------------------
        // DESERIALIZE into new object
        // -------------------------
        SingletonStaticFactory deserialized;
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("singleton.obj"))) {
            deserialized = (SingletonStaticFactory) ois.readObject();
        }

        System.out.println("Deserialized instance hash: " + deserialized.hashCode());

        System.out.println("original == deserialized ? " + (original == deserialized));
    }
}

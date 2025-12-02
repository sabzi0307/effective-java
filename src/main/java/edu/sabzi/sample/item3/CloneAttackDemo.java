package edu.sabzi.sample.item3;

public class CloneAttackDemo {

    public static void main(String[] args) throws Exception {

        SingletonCloneable original = SingletonCloneable.getInstance();
        System.out.println("Original instance hash: " + original.hashCode());

        // Clone attack
        SingletonCloneable cloned = (SingletonCloneable) original.clone();
        System.out.println("Cloned instance hash:   " + cloned.hashCode());

        System.out.println("original == cloned ? " + (original == cloned));
    }
}

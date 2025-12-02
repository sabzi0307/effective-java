package edu.sabzi.sample.item3;

public class SingletonCloneable implements Cloneable {

    private static final SingletonCloneable INSTANCE = new SingletonCloneable();

    private SingletonCloneable() {}

    public static SingletonCloneable getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Vulnerable: this allows clone attack
        return super.clone();
    }
}

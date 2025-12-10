package edu.sabzi.sample.item12;

import java.util.Objects;

public final class Order {

    private final long id;
    private final String product;
    private final int amount;

    public Order(long id, String product, int amount) {
        this.id = id;
        this.product = Objects.requireNonNull(product);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", amount=" + amount +
                '}';
    }
}

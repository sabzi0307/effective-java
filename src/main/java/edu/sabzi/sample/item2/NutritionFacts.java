package edu.sabzi.sample.item2;


/**
 * Immutable object using the Builder pattern.
 * Demonstrates how to handle many optional parameters safely.
 *
 * Clean Code alignment:
 * - Avoids telescoping constructors
 * - Avoids JavaBean mutable pattern
 * - Enforces invariants via builder validation
 */
public class NutritionFacts {

    private final int servingSize;     // required
    private final int servings;        // required
    private final int calories;        // optional
    private final int fat;             // optional
    private final int sodium;          // optional
    private final int carbohydrate;    // optional

    public static class Builder {
        // required fields
        private final int servingSize;
        private final int servings;

        // optional fields initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            if (servingSize <= 0 || servings <= 0) {
                throw new IllegalArgumentException("Serving size and servings must be positive");
            }
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) { this.calories = val; return this; }
        public Builder fat(int val) { this.fat = val; return this; }
        public Builder sodium(int val) { this.sodium = val; return this; }
        public Builder carbohydrate(int val) { this.carbohydrate = val; return this; }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}


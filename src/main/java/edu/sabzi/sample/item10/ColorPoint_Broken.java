package edu.sabzi.sample.item10;

import java.util.Objects;

public class ColorPoint_Broken extends Point {

    private final String color;

    public ColorPoint_Broken(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof ColorPoint_Broken))
            return false;

        ColorPoint_Broken cp = (ColorPoint_Broken) o;
        return super.equals(o) && Objects.equals(color, cp.color);
    }
}

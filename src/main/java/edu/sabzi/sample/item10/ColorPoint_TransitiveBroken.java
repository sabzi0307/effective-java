package edu.sabzi.sample.item10;

public class ColorPoint_TransitiveBroken extends Point {

    private final String color;

    public ColorPoint_TransitiveBroken(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;

        if (!(o instanceof ColorPoint_TransitiveBroken))
            return o.equals(this); // breaks transitivity

        ColorPoint_TransitiveBroken cp = (ColorPoint_TransitiveBroken) o;
        return super.equals(o) && color.equals(cp.color);
    }
}

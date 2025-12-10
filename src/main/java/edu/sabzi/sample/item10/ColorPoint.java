package edu.sabzi.sample.item10;

import java.util.Objects;
// good example
public final class ColorPoint {

    private final Point point;
    private final String color;

    public ColorPoint(int x, int y, String color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() { return point; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;

        ColorPoint cp = (ColorPoint) o;
        return point.equals(cp.point) &&
                Objects.equals(color, cp.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, color);
    }
}

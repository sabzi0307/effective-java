package edu.sabzi.sample.item11;

import java.util.Objects;

public class MutablePoint {

    private int x;
    private int y;

    public MutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MutablePoint)) return false;

        MutablePoint p = (MutablePoint) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

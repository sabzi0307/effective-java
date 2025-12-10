package edu.sabzi.sample.item11;

public final class Point_BadHash {

    private final int x;
    private final int y;

    public Point_BadHash(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point_BadHash)) return false;

        Point_BadHash p = (Point_BadHash) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return 1; // TERRIBLE!
    }
}
